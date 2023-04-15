/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.rdo.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for RDO_AccountProfitDetail
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_RDO_AccountProfitDetail extends PO implements I_RDO_AccountProfitDetail, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230317L;

    /** Standard Constructor */
    public X_RDO_AccountProfitDetail (Properties ctx, int RDO_AccountProfitDetail_ID, String trxName)
    {
      super (ctx, RDO_AccountProfitDetail_ID, trxName);
      /** if (RDO_AccountProfitDetail_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_RDO_AccountProfitDetail (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_RDO_AccountProfitDetail[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount)
	{
		set_Value (COLUMNNAME_Amount, Amount);
	}

	/** Get Amount.
		@return Amount in a defined currency
	  */
	public BigDecimal getAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Profit Detail (ID).
		@param RDO_AccountProfitDetail_ID Profit Detail (ID)	  */
	public void setRDO_AccountProfitDetail_ID (int RDO_AccountProfitDetail_ID)
	{
		if (RDO_AccountProfitDetail_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_AccountProfitDetail_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_AccountProfitDetail_ID, Integer.valueOf(RDO_AccountProfitDetail_ID));
	}

	/** Get Profit Detail (ID).
		@return Profit Detail (ID)	  */
	public int getRDO_AccountProfitDetail_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_AccountProfitDetail_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_AccountProfitDetail_UU.
		@param RDO_AccountProfitDetail_UU RDO_AccountProfitDetail_UU	  */
	public void setRDO_AccountProfitDetail_UU (String RDO_AccountProfitDetail_UU)
	{
		set_ValueNoCheck (COLUMNNAME_RDO_AccountProfitDetail_UU, RDO_AccountProfitDetail_UU);
	}

	/** Get RDO_AccountProfitDetail_UU.
		@return RDO_AccountProfitDetail_UU	  */
	public String getRDO_AccountProfitDetail_UU () 
	{
		return (String)get_Value(COLUMNNAME_RDO_AccountProfitDetail_UU);
	}

	public I_RDO_AccountProfit getRDO_AccountProfit() throws RuntimeException
    {
		return (I_RDO_AccountProfit)MTable.get(getCtx(), I_RDO_AccountProfit.Table_Name)
			.getPO(getRDO_AccountProfit_ID(), get_TrxName());	}

	/** Set Account Profit (ID).
		@param RDO_AccountProfit_ID Account Profit (ID)	  */
	public void setRDO_AccountProfit_ID (int RDO_AccountProfit_ID)
	{
		if (RDO_AccountProfit_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_AccountProfit_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_AccountProfit_ID, Integer.valueOf(RDO_AccountProfit_ID));
	}

	/** Get Account Profit (ID).
		@return Account Profit (ID)	  */
	public int getRDO_AccountProfit_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_AccountProfit_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_MT_Username.
		@param RDO_MT_Username RDO_MT_Username	  */
	public void setRDO_MT_Username (String RDO_MT_Username)
	{
		set_Value (COLUMNNAME_RDO_MT_Username, RDO_MT_Username);
	}

	/** Get RDO_MT_Username.
		@return RDO_MT_Username	  */
	public String getRDO_MT_Username () 
	{
		return (String)get_Value(COLUMNNAME_RDO_MT_Username);
	}

	public I_RDO_TradingAccount getRDO_TradingAccount() throws RuntimeException
    {
		return (I_RDO_TradingAccount)MTable.get(getCtx(), I_RDO_TradingAccount.Table_Name)
			.getPO(getRDO_TradingAccount_ID(), get_TrxName());	}

	/** Set Trading Account (ID).
		@param RDO_TradingAccount_ID Trading Account (ID)	  */
	public void setRDO_TradingAccount_ID (int RDO_TradingAccount_ID)
	{
		if (RDO_TradingAccount_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_TradingAccount_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_TradingAccount_ID, Integer.valueOf(RDO_TradingAccount_ID));
	}

	/** Get Trading Account (ID).
		@return Trading Account (ID)	  */
	public int getRDO_TradingAccount_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_TradingAccount_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}