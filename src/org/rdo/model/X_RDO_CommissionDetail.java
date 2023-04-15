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

/** Generated Model for RDO_CommissionDetail
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_RDO_CommissionDetail extends PO implements I_RDO_CommissionDetail, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200324L;

    /** Standard Constructor */
    public X_RDO_CommissionDetail (Properties ctx, int RDO_CommissionDetail_ID, String trxName)
    {
      super (ctx, RDO_CommissionDetail_ID, trxName);
      /** if (RDO_CommissionDetail_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_RDO_CommissionDetail (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_RDO_CommissionDetail[")
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

	public org.compiere.model.I_C_Order getC_Order() throws RuntimeException
    {
		return (org.compiere.model.I_C_Order)MTable.get(getCtx(), org.compiere.model.I_C_Order.Table_Name)
			.getPO(getC_Order_ID(), get_TrxName());	}

	/** Set Order.
		@param C_Order_ID 
		Order
	  */
	public void setC_Order_ID (int C_Order_ID)
	{
		if (C_Order_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Order_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
	}

	/** Get Order.
		@return Order
	  */
	public int getC_Order_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_OrderLine getC_OrderLine() throws RuntimeException
    {
		return (org.compiere.model.I_C_OrderLine)MTable.get(getCtx(), org.compiere.model.I_C_OrderLine.Table_Name)
			.getPO(getC_OrderLine_ID(), get_TrxName());	}

	/** Set Sales Order Line.
		@param C_OrderLine_ID 
		Sales Order Line
	  */
	public void setC_OrderLine_ID (int C_OrderLine_ID)
	{
		if (C_OrderLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
	}

	/** Get Sales Order Line.
		@return Sales Order Line
	  */
	public int getC_OrderLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LevelPercentage.
		@param LevelPercentage LevelPercentage	  */
	public void setLevelPercentage (BigDecimal LevelPercentage)
	{
		set_Value (COLUMNNAME_LevelPercentage, LevelPercentage);
	}

	/** Get LevelPercentage.
		@return LevelPercentage	  */
	public BigDecimal getLevelPercentage () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LevelPercentage);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	public I_RDO_CommissionAmt getRDO_CommissionAmt() throws RuntimeException
    {
		return (I_RDO_CommissionAmt)MTable.get(getCtx(), I_RDO_CommissionAmt.Table_Name)
			.getPO(getRDO_CommissionAmt_ID(), get_TrxName());	}

	/** Set Commission Amount (ID).
		@param RDO_CommissionAmt_ID Commission Amount (ID)	  */
	public void setRDO_CommissionAmt_ID (int RDO_CommissionAmt_ID)
	{
		if (RDO_CommissionAmt_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_CommissionAmt_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_CommissionAmt_ID, Integer.valueOf(RDO_CommissionAmt_ID));
	}

	/** Get Commission Amount (ID).
		@return Commission Amount (ID)	  */
	public int getRDO_CommissionAmt_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_CommissionAmt_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Commission Detail (ID).
		@param RDO_CommissionDetail_ID Commission Detail (ID)	  */
	public void setRDO_CommissionDetail_ID (int RDO_CommissionDetail_ID)
	{
		if (RDO_CommissionDetail_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_CommissionDetail_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_CommissionDetail_ID, Integer.valueOf(RDO_CommissionDetail_ID));
	}

	/** Get Commission Detail (ID).
		@return Commission Detail (ID)	  */
	public int getRDO_CommissionDetail_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_CommissionDetail_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_CommissionDetail_UU.
		@param RDO_CommissionDetail_UU RDO_CommissionDetail_UU	  */
	public void setRDO_CommissionDetail_UU (String RDO_CommissionDetail_UU)
	{
		set_ValueNoCheck (COLUMNNAME_RDO_CommissionDetail_UU, RDO_CommissionDetail_UU);
	}

	/** Get RDO_CommissionDetail_UU.
		@return RDO_CommissionDetail_UU	  */
	public String getRDO_CommissionDetail_UU () 
	{
		return (String)get_Value(COLUMNNAME_RDO_CommissionDetail_UU);
	}

	public I_RDO_MLM_Level getRDO_MLM_Level() throws RuntimeException
    {
		return (I_RDO_MLM_Level)MTable.get(getCtx(), I_RDO_MLM_Level.Table_Name)
			.getPO(getRDO_MLM_Level_ID(), get_TrxName());	}

	/** Set MLM Level (ID).
		@param RDO_MLM_Level_ID MLM Level (ID)	  */
	public void setRDO_MLM_Level_ID (int RDO_MLM_Level_ID)
	{
		if (RDO_MLM_Level_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_MLM_Level_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_MLM_Level_ID, Integer.valueOf(RDO_MLM_Level_ID));
	}

	/** Get MLM Level (ID).
		@return MLM Level (ID)	  */
	public int getRDO_MLM_Level_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_MLM_Level_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}