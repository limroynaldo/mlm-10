package org.rdo.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.model.MOrder;
import org.compiere.model.X_C_Order;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class RDOCompleteSO extends SvrProcess {
	/**	Client to be imported to		*/
	private int				m_AD_Client_ID = 0;
	/**	Organization to be imported to		*/
	private int				m_AD_Org_ID = 0;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("AD_Org_ID"))
				m_AD_Org_ID = ((BigDecimal)para[i].getParameter()).intValue();
		}		
	}

	@Override
	protected String doIt() throws Exception {
		String msg = "";
		
		StringBuffer sql = new StringBuffer();
		sql.append("select co.C_Order_ID ")
			.append("from C_Order co ")
			.append("where co.AD_Client_ID=? ")
			.append("and co.AD_Org_ID=? ")
			.append("and co.DocStatus in ('DR', 'IP') ")
			.append("and co.IsSOTrx='Y' ");
		sql.append("and trunc(co.Created)=trunc(Now()) ");
		sql.append("order by co.C_Order_ID asc");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			pstmt.setInt(1, m_AD_Client_ID);
			pstmt.setInt(2, m_AD_Org_ID);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MOrder order = new MOrder(Env.getCtx(), rs.getInt("C_Order_ID"), get_TrxName());
				order.setDocAction(X_C_Order.DOCSTATUS_Completed);
				order.saveEx(get_TrxName());
				
				String processMsg = order.completeIt();
				if (!processMsg.equals(X_C_Order.DOCSTATUS_Completed)) {
					rollback();
					return "Complete Error on Document No " + order.getDocumentNo();
				} else {
					order.setDocStatus(X_C_Order.DOCSTATUS_Completed);
					order.setDocAction(X_C_Order.DOCACTION_Close);
					order.saveEx(get_TrxName());
				}
			}
		} catch (Exception e) {
			log.warning("Process Error - " + e.toString());
			return "Process Error";
		} finally {
			DB.close(rs, pstmt);
			pstmt = null;
			rs = null;
		}
		
		return msg;
	}

}
