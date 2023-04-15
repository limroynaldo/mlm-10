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

/** Generated Model for RDO_CommissionAmt
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_RDO_CommissionAmt extends PO implements I_RDO_CommissionAmt, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200324L;

    /** Standard Constructor */
    public X_RDO_CommissionAmt (Properties ctx, int RDO_CommissionAmt_ID, String trxName)
    {
      super (ctx, RDO_CommissionAmt_ID, trxName);
      /** if (RDO_CommissionAmt_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_RDO_CommissionAmt (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_RDO_CommissionAmt[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Line Amount.
		@param LineNetAmt 
		Line Extended Amount (Quantity * Actual Price) without Freight and Charges
	  */
	public void setLineNetAmt (BigDecimal LineNetAmt)
	{
		set_ValueNoCheck (COLUMNNAME_LineNetAmt, LineNetAmt);
	}

	/** Get Line Amount.
		@return Line Extended Amount (Quantity * Actual Price) without Freight and Charges
	  */
	public BigDecimal getLineNetAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineNetAmt);
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

	public I_RDO_Commission getRDO_Commission() throws RuntimeException
    {
		return (I_RDO_Commission)MTable.get(getCtx(), I_RDO_Commission.Table_Name)
			.getPO(getRDO_Commission_ID(), get_TrxName());	}

	/** Set Commission (ID).
		@param RDO_Commission_ID Commission (ID)	  */
	public void setRDO_Commission_ID (int RDO_Commission_ID)
	{
		if (RDO_Commission_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_Commission_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_Commission_ID, Integer.valueOf(RDO_Commission_ID));
	}

	/** Get Commission (ID).
		@return Commission (ID)	  */
	public int getRDO_Commission_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_Commission_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

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

	/** Set RDO_CommissionAmt_UU.
		@param RDO_CommissionAmt_UU RDO_CommissionAmt_UU	  */
	public void setRDO_CommissionAmt_UU (String RDO_CommissionAmt_UU)
	{
		set_ValueNoCheck (COLUMNNAME_RDO_CommissionAmt_UU, RDO_CommissionAmt_UU);
	}

	/** Get RDO_CommissionAmt_UU.
		@return RDO_CommissionAmt_UU	  */
	public String getRDO_CommissionAmt_UU () 
	{
		return (String)get_Value(COLUMNNAME_RDO_CommissionAmt_UU);
	}
}