package org.rdo.component;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.rdo.model.I_RDO_AccountProfit;
import org.rdo.model.I_RDO_AccountProfitDetail;
import org.rdo.model.I_RDO_Commission;
import org.rdo.model.I_RDO_CommissionAmt;
import org.rdo.model.I_RDO_CommissionDetail;
import org.rdo.model.I_RDO_MLM_Level;
import org.rdo.model.I_RDO_MLM_Member;
import org.rdo.model.I_RDO_MLM_ProfitLevel;
import org.rdo.model.I_RDO_TradingAccount;
import org.rdo.model.I_RDO_TradingAccountBalance;
import org.rdo.model.MRDOAccountProfit;
import org.rdo.model.X_RDO_AccountProfitDetail;
import org.rdo.model.X_RDO_Commission;
import org.rdo.model.X_RDO_CommissionAmt;
import org.rdo.model.X_RDO_CommissionDetail;
import org.rdo.model.X_RDO_MLM_Level;
import org.rdo.model.X_RDO_MLM_Member;
import org.rdo.model.X_RDO_MLM_ProfitLevel;
import org.rdo.model.X_RDO_TradingAccount;
import org.rdo.model.X_RDO_TradingAccountBalance;

public class RDOMLMModelFactory implements IModelFactory {
	CLogger log = CLogger.getCLogger(RDOMLMModelFactory.class);

	@Override
	public Class<?> getClass(String tableName) {
		if (tableName.equals(I_RDO_MLM_Level.Table_Name)) 
			return X_RDO_MLM_Level.class;
		else if (tableName.equals(I_RDO_Commission.Table_Name))
			return X_RDO_Commission.class;
		else if (tableName.equals(I_RDO_CommissionAmt.Table_Name))
			return X_RDO_CommissionAmt.class;
		else if (tableName.equals(I_RDO_CommissionDetail.Table_Name))
			return X_RDO_CommissionDetail.class;
		else if (tableName.equals(I_RDO_MLM_Member.Table_Name))
			return X_RDO_MLM_Member.class;
		else if (tableName.equals(I_RDO_AccountProfit.Table_Name))
			return MRDOAccountProfit.class;
		else if (tableName.equals(I_RDO_AccountProfitDetail.Table_Name))
			return X_RDO_AccountProfitDetail.class;
		else if (tableName.equals(I_RDO_MLM_ProfitLevel.Table_Name))
			return X_RDO_MLM_ProfitLevel.class;
		else if (tableName.equals(I_RDO_TradingAccountBalance.Table_Name))
			return X_RDO_TradingAccountBalance.class;
		
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		if (tableName.equals(I_RDO_MLM_Level.Table_Name))
			return new X_RDO_MLM_Level(Env.getCtx(), Record_ID, trxName);
		else if (tableName.equals(I_RDO_Commission.Table_Name))
			return new X_RDO_Commission(Env.getCtx(), Record_ID, trxName);
		else if (tableName.equals(I_RDO_CommissionAmt.Table_Name))
			return new X_RDO_CommissionAmt(Env.getCtx(), Record_ID, trxName);
		else if (tableName.equals(I_RDO_CommissionDetail.Table_Name))
			return new X_RDO_CommissionDetail(Env.getCtx(), Record_ID, trxName);
		else if (tableName.equals(I_RDO_MLM_Member.Table_Name))
			return new X_RDO_MLM_Member(Env.getCtx(), Record_ID, trxName);
		else if (tableName.equals(I_RDO_TradingAccount.Table_Name))
			return new X_RDO_TradingAccount(Env.getCtx(), Record_ID, trxName);
		else if (tableName.equals(I_RDO_AccountProfit.Table_Name))
			return new MRDOAccountProfit(Env.getCtx(), Record_ID, trxName);
		else if (tableName.equals(I_RDO_AccountProfitDetail.Table_Name))
			return new X_RDO_AccountProfitDetail(Env.getCtx(), Record_ID, trxName);
		else if (tableName.equals(I_RDO_MLM_ProfitLevel.Table_Name))
			return new X_RDO_MLM_ProfitLevel(Env.getCtx(), Record_ID, trxName);
		else if (tableName.equals(I_RDO_TradingAccountBalance.Table_Name))
			return new X_RDO_TradingAccountBalance(Env.getCtx(), Record_ID, trxName);
		
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		if (tableName.equals(I_RDO_MLM_Level.Table_Name))
			return new X_RDO_MLM_Level(Env.getCtx(), rs, trxName);
		else if (tableName.equals(I_RDO_Commission.Table_Name))
			return new X_RDO_Commission(Env.getCtx(), rs, trxName);
		else if (tableName.equals(I_RDO_CommissionAmt.Table_Name))
			return new X_RDO_CommissionAmt(Env.getCtx(), rs, trxName);
		else if (tableName.equals(I_RDO_CommissionDetail.Table_Name))
			return new X_RDO_CommissionDetail(Env.getCtx(), rs, trxName);
		else if (tableName.equals(I_RDO_CommissionDetail.Table_Name))
			return new X_RDO_MLM_Member(Env.getCtx(), rs, trxName);
		else if (tableName.contentEquals(I_RDO_TradingAccount.Table_Name))
			return new X_RDO_TradingAccount(Env.getCtx(), rs, trxName);
		else if (tableName.equals(I_RDO_AccountProfit.Table_Name))
			return new MRDOAccountProfit(Env.getCtx(), rs, trxName);
		else if (tableName.equals(I_RDO_AccountProfitDetail.Table_Name))
			return new X_RDO_AccountProfitDetail(Env.getCtx(), rs, trxName);
		else if (tableName.equals(I_RDO_MLM_ProfitLevel.Table_Name))
			return new X_RDO_MLM_ProfitLevel(Env.getCtx(), rs, trxName);
		else if (tableName.equals(I_RDO_TradingAccountBalance.Table_Name))
			return new X_RDO_TradingAccountBalance(Env.getCtx(), rs, trxName);
		
		return null;
	}

}
