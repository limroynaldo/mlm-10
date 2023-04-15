package org.rdo.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.model.MBPartner;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class RDOGenerateRefNo extends SvrProcess {
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
		
		String url = DB.getSQLValueString(get_TrxName(), "select Value from AD_SysConfig where Name=?", "RDO_SIGNUP_URL");
		
		StringBuffer sql = new StringBuffer();
		sql.append("select cbp.C_BPartner_ID, cbp.Value, cbp.Name, cbp.ReferenceNo, cbp.URL ")
			.append("from C_BPartner cbp ")
			.append("where cbp.AD_Client_ID=? ")
			.append("and cbp.AD_Org_ID=? ")
			.append("and cbp.IsActive='Y' ")
			.append("and cbp.C_BP_Group_ID in (1000002, 1000003) ") 
			//.append("and cbp.ReferenceNo is null ")
			.append("order by cbp.C_BP_Group_ID, cbp.Value")
			;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			pstmt.setInt(1, m_AD_Client_ID);
			pstmt.setInt(2, m_AD_Org_ID);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MBPartner bp = new MBPartner(getCtx(), rs.getInt("C_BPartner_ID"), get_TrxName());
				String refNo = generateBPURL(12);
				bp.setReferenceNo(refNo);
				if (url.length()>0) {
					bp.setURL(url + "/?ref=" + refNo);
				}
				bp.saveEx(get_TrxName());
			}
		} catch (Exception e) {
			return "Failed to Generate Reference No";
		} finally {
			DB.close(rs, pstmt);
			pstmt = null;
			rs = null;
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
}
