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

/** Generated Model for I_AccountProfit
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_I_AccountProfit extends PO implements I_I_AccountProfit, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200829L;

    /** Standard Constructor */
    public X_I_AccountProfit (Properties ctx, int I_AccountProfit_ID, String trxName)
    {
      super (ctx, I_AccountProfit_ID, trxName);
      /** if (I_AccountProfit_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_I_AccountProfit (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_I_AccountProfit[")
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

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Import Account Profit (ID).
		@param I_AccountProfit_ID Import Account Profit (ID)	  */
	public void setI_AccountProfit_ID (int I_AccountProfit_ID)
	{
		if (I_AccountProfit_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_I_AccountProfit_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_I_AccountProfit_ID, Integer.valueOf(I_AccountProfit_ID));
	}

	/** Get Import Account Profit (ID).
		@return Import Account Profit (ID)	  */
	public int getI_AccountProfit_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_I_AccountProfit_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set I_AccountProfit_UU.
		@param I_AccountProfit_UU I_AccountProfit_UU	  */
	public void setI_AccountProfit_UU (String I_AccountProfit_UU)
	{
		set_ValueNoCheck (COLUMNNAME_I_AccountProfit_UU, I_AccountProfit_UU);
	}

	/** Get I_AccountProfit_UU.
		@return I_AccountProfit_UU	  */
	public String getI_AccountProfit_UU () 
	{
		return (String)get_Value(COLUMNNAME_I_AccountProfit_UU);
	}

	/** Set Import Error Message.
		@param I_ErrorMsg 
		Messages generated from import process
	  */
	public void setI_ErrorMsg (String I_ErrorMsg)
	{
		set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
	}

	/** Get Import Error Message.
		@return Messages generated from import process
	  */
	public String getI_ErrorMsg () 
	{
		return (String)get_Value(COLUMNNAME_I_ErrorMsg);
	}

	/** Set Imported.
		@param I_IsImported 
		Has this import been processed
	  */
	public void setI_IsImported (boolean I_IsImported)
	{
		set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
	}

	/** Get Imported.
		@return Has this import been processed
	  */
	public boolean isI_IsImported () 
	{
		Object oo = get_Value(COLUMNNAME_I_IsImported);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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
}