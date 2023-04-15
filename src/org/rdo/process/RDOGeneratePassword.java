package org.rdo.process;

import java.math.BigDecimal;

import org.compiere.model.MUser;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

public class RDOGeneratePassword extends SvrProcess {
	/**	Client to be imported to		*/
	private int				m_AD_Client_ID = 0;
	/**	Organization to be imported to		*/
	private int				m_AD_Org_ID = 0;
	
	private int				p_AD_User_ID = 0;

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
			else if (name.equals("AD_User_ID"))
				p_AD_User_ID = ((BigDecimal)para[i].getParameter()).intValue();
		}		
	}

	@Override
	protected String doIt() throws Exception {
		String msg = "";
		MUser user = new MUser(getCtx(), p_AD_User_ID, get_TrxName());
		user.setPassword(generateBPPassword(12));
		user.saveEx(get_TrxName());
		
		msg = "Password Successfully Changed";
		
		return msg;
	}
	
	private String generateBPPassword(int n) {
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
