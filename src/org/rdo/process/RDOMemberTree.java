package org.rdo.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.rdo.model.X_RDO_MLM_Member;

public class RDOMemberTree extends SvrProcess {
	/**	Client to be imported to		*/
	private int				m_AD_Client_ID = 0;
	/**	Organization to be imported to		*/
	private int				m_AD_Org_ID = 0;
	/** Updated */
	private Timestamp 	p_Updated;
	/** BP Group */
	private int				p_C_BP_Group_ID = 0;

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
			else if (name.equals("Updated"))
				p_Updated = para[i].getParameterAsTimestamp();
			else if (name.equals("C_BP_Group_ID"))
				p_C_BP_Group_ID = para[i].getParameterAsInt();
		}
	}

	@Override
	protected String doIt() throws Exception {
		String msg = "";
		
		StringBuffer sqlDelete = new StringBuffer();
		sqlDelete.append("delete from RDO_MLM_Member where AD_Client_ID=? and AD_Org_ID=? ");
		int vcount = DB.executeUpdate(sqlDelete.toString(), new Object[] {m_AD_Client_ID, m_AD_Org_ID}, false, get_TrxName());
		log.warning("Deleted = " + vcount);
		
		StringBuffer sql = new StringBuffer();
		sql.append("select cbg.AD_Client_ID, cbg.AD_Org_ID, cbp.C_BP_Group_ID, cbg.Value as BPGroupValue, cbg.Name as BPGroupName, ")
			.append("cbp.C_BPartner_ID, cbp.Value, cbp.Name, cbp.Ref_BPartner_ID, ")
			.append("case ")
			.append("when cbg.C_BP_Group_ID=1000005 then 1 ")
			.append("when cbg.C_BP_Group_ID=1000002 then 2 ")
			.append("when cbg.C_BP_Group_ID=1000003 then 3 ")
			.append("end as idxSort, ")
			.append("case ")
			.append("when cbp.Ref_BPartner_ID is null then 1 ")
			.append("else 2 ")
			.append("end as idxSortRef, ")
			.append("cbp.Updated, cbp.ShareOfCustomer ")
			.append("from C_BPartner cbp join C_BP_Group cbg on (cbp.C_BP_Group_ID=cbg.C_BP_Group_ID) ")
			.append("where cbp.AD_Client_ID=? ")
			.append("and cbp.AD_Org_ID=? ")
			.append("and cbp.IsActive='Y' ")
			.append("and cbp.C_BP_Group_ID in (1000002, 1000003, 1000005) ");
		//sql.append("and cbp.C_BPartner_ID=1000105 ");
		if (p_Updated!=null)
			sql.append("and cbp.Updated>=? ");
		if (p_C_BP_Group_ID>0)
			sql.append("and cbp.C_BP_Group_ID=? ");
		sql.append("order by 10 asc, 11 asc, 9 asc, 6 asc");
		
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try {
			pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			int idx = 1;
			pstmt.setInt(idx++, m_AD_Client_ID);
			pstmt.setInt(idx++, m_AD_Org_ID);
			if (p_Updated!=null)
				pstmt.setTimestamp(idx++, p_Updated);
			if (p_C_BP_Group_ID>0)
				pstmt.setInt(idx++, p_C_BP_Group_ID);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int idxLevel = 1;
				addMember(rs.getInt("C_BPartner_ID"), rs.getInt("C_BPartner_ID"), rs.getInt("ShareOfCustomer"), idxLevel);
			}
		} catch (Exception e) {
			msg = "Failed to Generate Member Tree";
			return msg;
		} finally {
			DB.close(rs, pstmt);
			pstmt = null;
			rs = null;
		}
		
		msg = "Process Completed";
		
		return msg;
	}

	private void addMember(int Member_ID, int C_BPartner_ID, int ShareOfCustomer, int idxLevel) {
		StringBuffer sqlMember = new StringBuffer();
		sqlMember.append("select C_BPartner_ID, ShareOfCustomer ")
			.append("from C_BPartner ")
			.append("where Ref_BPartner_ID=?");
		
		PreparedStatement pstmt2 = null;
		ResultSet rs2 = null;
		try {
			pstmt2 = DB.prepareStatement(sqlMember.toString(), get_TrxName());
			pstmt2.setInt(1, C_BPartner_ID);
			rs2 = pstmt2.executeQuery();
			while (rs2.next()) {
				X_RDO_MLM_Member member = new X_RDO_MLM_Member(Env.getCtx(), 0, get_TrxName());
				member.setAD_Org_ID(m_AD_Org_ID);
				member.setLine(idxLevel);
				member.setC_BPartner_ID(Member_ID);
				member.setParent_ID(C_BPartner_ID);
				member.setParent_ShareOfCustomer(ShareOfCustomer);
				member.setRef_BPartner_ID(rs2.getInt("C_BPartner_ID"));
				member.setShareOfCustomer(rs2.getInt("ShareOfCustomer"));
				member.saveEx(get_TrxName());
				
				int bp_id = rs2.getInt("C_BPartner_ID");
				int share = rs2.getInt("ShareOfCustomer");
				addMember(Member_ID, bp_id, share, idxLevel + 1);
			}
		} catch (Exception e) {
			
		} finally {
			DB.close(rs2, pstmt2);
			pstmt2 = null;
			rs2 = null;
		}
	}
}
