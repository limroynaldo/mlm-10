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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for RDO_TradingAccountBalance
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_RDO_TradingAccountBalance extends PO implements I_RDO_TradingAccountBalance, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230318L;

    /** Standard Constructor */
    public X_RDO_TradingAccountBalance (Properties ctx, int RDO_TradingAccountBalance_ID, String trxName)
    {
      super (ctx, RDO_TradingAccountBalance_ID, trxName);
      /** if (RDO_TradingAccountBalance_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_RDO_TradingAccountBalance (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_RDO_TradingAccountBalance[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount)
	{
		set_ValueNoCheck (COLUMNNAME_Amount, Amount);
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

	/** Set Transaction Date.
		@param DateTrx 
		Transaction Date
	  */
	public void setDateTrx (Timestamp DateTrx)
	{
		set_ValueNoCheck (COLUMNNAME_DateTrx, DateTrx);
	}

	/** Get Transaction Date.
		@return Transaction Date
	  */
	public Timestamp getDateTrx () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTrx);
	}

	/** Set Trading Account Balance (ID).
		@param RDO_TradingAccountBalance_ID Trading Account Balance (ID)	  */
	public void setRDO_TradingAccountBalance_ID (int RDO_TradingAccountBalance_ID)
	{
		if (RDO_TradingAccountBalance_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_TradingAccountBalance_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_TradingAccountBalance_ID, Integer.valueOf(RDO_TradingAccountBalance_ID));
	}

	/** Get Trading Account Balance (ID).
		@return Trading Account Balance (ID)	  */
	public int getRDO_TradingAccountBalance_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_TradingAccountBalance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_TradingAccountBalance_UU.
		@param RDO_TradingAccountBalance_UU RDO_TradingAccountBalance_UU	  */
	public void setRDO_TradingAccountBalance_UU (String RDO_TradingAccountBalance_UU)
	{
		set_ValueNoCheck (COLUMNNAME_RDO_TradingAccountBalance_UU, RDO_TradingAccountBalance_UU);
	}

	/** Get RDO_TradingAccountBalance_UU.
		@return RDO_TradingAccountBalance_UU	  */
	public String getRDO_TradingAccountBalance_UU () 
	{
		return (String)get_Value(COLUMNNAME_RDO_TradingAccountBalance_UU);
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