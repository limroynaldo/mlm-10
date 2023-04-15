package org.rdo.component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.I_C_BPartner;
import org.compiere.model.I_C_Order;
import org.compiere.model.I_C_OrderLine;
import org.compiere.model.MBPartner;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPriceList;
import org.compiere.model.MProduct;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.X_AD_SysConfig;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.osgi.service.event.Event;
import org.rdo.model.I_RDO_TradingAccount;
import org.rdo.model.X_RDO_TradingAccount;

public class RDOMLMValidatorFactory extends AbstractEventHandler {

	private CLogger log = CLogger.getCLogger(RDOMLMValidatorFactory.class);
	
	private void logEvent (Event event, PO po, String msg) {
		log.fine("EVENT MANAGER // "+event.getTopic()+" po="+po+" MESSAGE ="+msg);
		throw new AdempiereException(msg);
	}	
	
	@Override
	protected void initialize() {
		registerEvent(IEventTopics.AFTER_LOGIN);
		
		registerTableEvent(IEventTopics.DOC_AFTER_COMPLETE, I_C_Order.Table_Name);
		registerTableEvent(IEventTopics.DOC_AFTER_VOID, I_C_Order.Table_Name);
		registerTableEvent(IEventTopics.DOC_AFTER_REACTIVATE, I_C_Order.Table_Name);
		
		registerTableEvent(IEventTopics.PO_BEFORE_NEW, I_C_BPartner.Table_Name);
		
		registerTableEvent(IEventTopics.PO_BEFORE_NEW, I_RDO_TradingAccount.Table_Name);
		
		log.info("UNICORN EVENT MANAGER // INITIALIZED");
	}

	@Override
	protected void doHandleEvent(Event event) {
		String msg = "";

		if (!event.getTopic().equals(IEventTopics.AFTER_LOGIN)) {
			PO po = getPO(event);			
			log.info(" topic="+event.getTopic()+" po="+po);
			
			if (getPO(event).get_TableName().equals(I_C_Order.Table_Name))
				msg = executeOrderEvent(event);
			else if (getPO(event).get_TableName().equals(I_C_BPartner.Table_Name))
				msg = executeBPEvent(event);
			else if (getPO(event).get_TableName().equals(I_RDO_TradingAccount.Table_Name))
				msg = executeTradingAccountEvent(event);
		}
		
		if (msg!=null && msg.length() > 0)
			logEvent(event, getPO(event), msg);		
	}

	private String executeOrderEvent(Event event) {
		String msg = "";
		
		MOrder order = (MOrder) getPO(event);
		MBPartner bp = new MBPartner(order.getCtx(), order.getC_BPartner_ID(), order.get_TrxName());
		boolean isSOTrx = order.isSOTrx();
		if (!isSOTrx)
			return "";

		int ShareOfCustomer = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("select col.C_OrderLine_ID ")
			.append("from C_OrderLine col join C_Order co on (col.C_Order_ID=co.C_Order_ID) ")
			.append("where co.IsSOTrx='Y' ")
			.append("and co.C_BPartner_ID=? ")
			.append("and co.IsCommission='Y' ")
			.append("and (co.DocStatus='CO' ")
			.append("or co.C_Order_ID=?) ")
			.append("and col.IsActive='Y' ")
			.append("order by col.C_OrderLine_ID asc");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DB.prepareStatement(sql.toString(), order.get_TrxName());
			pstmt.setInt(1, order.getC_BPartner_ID());
			pstmt.setInt(2, order.getC_Order_ID());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MOrderLine soline = new MOrderLine(order.getCtx(), rs.getInt("C_OrderLine_ID"), order.get_TrxName());
				MOrder so = new MOrder(order.getCtx(), soline.getC_Order_ID(), order.get_TrxName());			
				
				StringBuffer sql2 = new StringBuffer();
				sql2.append("select coalesce(mpp.ShareOfCustomer, 0) ")
					.append("from M_ProductPrice mpp join M_PriceList_Version plv on (mpp.M_PriceList_Version_ID=plv.M_PriceList_Version_ID and plv.M_PriceList_ID=?) ")
					.append("where mpp.M_Product_ID=? ")
					.append("and plv.ValidFrom<=? ")
					.append("order by plv.ValidFrom desc ");
				
				PreparedStatement pstmt2 = null;
				ResultSet rs2 = null;
				try {
					pstmt2 = DB.prepareStatement(sql2.toString(), order.get_TrxName());
					pstmt2.setInt(1, so.getM_PriceList_ID());
					pstmt2.setInt(2, soline.getM_Product_ID());
					pstmt2.setTimestamp(3, so.getDateOrdered());
					rs2 = pstmt2.executeQuery();
					if (rs2.next()) {
						if (ShareOfCustomer<rs2.getInt(1))
							ShareOfCustomer = rs2.getInt(1);
					}
				} catch (Exception e) {
					log.warning("Cannot Update Share Of Customer");
					
				} finally {
					DB.close(rs2, pstmt2);
					pstmt2 = null;
					rs2 = null;
				}
			}
		} catch (Exception e) {
			log.warning("Cannot Update Share Of Customer");
			return "Cannot Update Share Of Customer";
		} finally {
			DB.close(rs, pstmt);
			pstmt = null;
			rs = null;
		}
		
		bp.setShareOfCustomer(ShareOfCustomer);
		bp.saveEx(order.get_TrxName());
		
		return msg;
	}
	
	private String executeOrderLineEvent(Event event) {
		String msg = "";
		MOrderLine orderLine = (MOrderLine) getPO(event);
		MOrder order = new MOrder(orderLine.getCtx(), orderLine.getC_Order_ID(), orderLine.get_TrxName());
		MBPartner bp = new MBPartner(orderLine.getCtx(), order.getC_BPartner_ID(), orderLine.get_TrxName());
		boolean isSOTrx = order.isSOTrx();
		
		int ShareOfCustomer = 0;
		if (isSOTrx) {
			StringBuffer sql = new StringBuffer();
			sql.append("select col.C_OrderLine_ID ")
				.append("from C_OrderLine col join C_Order co on (col.C_Order_ID=co.C_Order_ID) ")
				.append("where co.IsSOTrx='Y' ")
				.append("and co.C_BPartner_ID=? ")
				.append("and co.IsCommission='Y' ")
				.append("and col.IsActive='Y' ")
				.append("order by col.C_OrderLine_ID asc");
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				pstmt = DB.prepareStatement(sql.toString(), orderLine.get_TrxName());
				pstmt.setInt(1, order.getC_BPartner_ID());
				rs = pstmt.executeQuery();
				while (rs.next()) {
					MOrderLine soline = new MOrderLine(orderLine.getCtx(), rs.getInt("C_OrderLine_ID"), orderLine.get_TrxName());
					MOrder so = new MOrder(orderLine.getCtx(), soline.getC_Order_ID(), orderLine.get_TrxName());			
					
					StringBuffer sql2 = new StringBuffer();
					sql2.append("select coalesce(mpp.ShareOfCustomer, 0) ")
						.append("from M_ProductPrice mpp join M_PriceList_Version plv on (mpp.M_PriceList_Version_ID=plv.M_PriceList_Version_ID and plv.M_PriceList_ID=?) ")
						.append("where mpp.M_Product_ID=? ")
						.append("and plv.ValidFrom<=? ")
						.append("order by plv.ValidFrom desc ");
					
					PreparedStatement pstmt2 = null;
					ResultSet rs2 = null;
					try {
						pstmt2 = DB.prepareStatement(sql2.toString(), orderLine.get_TrxName());
						pstmt2.setInt(1, so.getM_PriceList_ID());
						pstmt2.setInt(2, soline.getM_Product_ID());
						pstmt2.setTimestamp(3, so.getDateOrdered());
						rs2 = pstmt2.executeQuery();
						if (rs2.next()) {
							if (ShareOfCustomer<rs2.getInt(1))
								ShareOfCustomer = rs2.getInt(1);
						}
					} catch (Exception e) {
						log.warning("Cannot Update Share Of Customer");
						
					} finally {
						DB.close(rs2, pstmt2);
						pstmt2 = null;
						rs2 = null;
					}
				}
			} catch (Exception e) {
				log.warning("Cannot Update Share Of Customer");
				return "Cannot Update Share Of Customer";
			} finally {
				DB.close(rs, pstmt);
				pstmt = null;
				rs = null;
			}
			
			bp.setShareOfCustomer(ShareOfCustomer);
			bp.saveEx(orderLine.get_TrxName());
		}
		
		return msg;
	}
	
	private String executeBPEvent(Event event) {
		String msg = "";
		MBPartner bp = (MBPartner) getPO(event);
		int C_BP_Group_ID = bp.getC_BP_Group_ID();
		
		StringBuffer sql = new StringBuffer();
		sql.append("select coalesce(max(substring(cbp.Value, position(substring(cbg.Value,1,1)||'-' in cbp.Value)+2, 5)::integer),0) ")
			.append("from C_BPartner cbp join C_BP_Group cbg on (cbp.C_BP_Group_ID=cbg.C_BP_Group_ID) ")
			.append("where cbp.C_BP_Group_ID=? ")
			.append("and position(substring(cbg.Value,1,1)||'-' in cbp.Value)>0 ");
		int idxbp = DB.getSQLValue(bp.get_TrxName(), sql.toString(), C_BP_Group_ID);
		idxbp++;
		
		String strbp = String.valueOf(idxbp);
		for (int i=strbp.length(); i<5; i++) {
			strbp = "0" + strbp;
		}
		
		sql = new StringBuffer();
		sql.append( "select substring(cbg.Value,1,1)||'-' ")
			.append("from C_BP_Group cbg ")
			.append("where cbg.C_BP_Group_ID=?");
		String prefix = DB.getSQLValueString(bp.get_TrxName(), sql.toString(), C_BP_Group_ID);
		strbp = prefix + strbp;
		
		bp.setValue(strbp);
		
		String refNo = generateBPURL(12);
		bp.setReferenceNo(refNo);
		String url = DB.getSQLValueString(bp.get_TrxName(), "select Value from AD_SysConfig where Name=?", "RDO_SIGNUP_URL");
		if (url.length()>0) {
			url = url + "/?ref=" + refNo;
			bp.setURL(url);
		}
		
		return msg;
	}
	
	private String generateBPURL(int n) {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789"
				+ "abcdefghijklmnopqrstuvxyz";
		
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i<n; i++) {
			int index =  (int)(AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		String url = sb.toString();
		 
		return url;
	}
	
	private String executeTradingAccountEvent(Event event) {
		String msg = "";
		X_RDO_TradingAccount account = (X_RDO_TradingAccount) getPO(event);
		int LineNo = account.getLineNo();
		if (LineNo==0) {
			int maxLineNo = DB.getSQLValue(account.get_TrxName(), "select max(LineNo) from RDO_TradingAccount where C_BPartner_ID=?", account.getC_BPartner_ID());
			maxLineNo = new BigDecimal(maxLineNo).divide(new BigDecimal(10), RoundingMode.HALF_UP).setScale(0).intValue();
			account.setLineNo((maxLineNo+1)*10);
		}
		
		return msg;
	}
}
