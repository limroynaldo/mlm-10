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

/** Generated Model for RDO_MLM_Level
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_RDO_MLM_Level extends PO implements I_RDO_MLM_Level, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200324L;

    /** Standard Constructor */
    public X_RDO_MLM_Level (Properties ctx, int RDO_MLM_Level_ID, String trxName)
    {
      super (ctx, RDO_MLM_Level_ID, trxName);
      /** if (RDO_MLM_Level_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_RDO_MLM_Level (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_RDO_MLM_Level[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (int Line)
	{
		set_ValueNoCheck (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_ProductPrice getM_ProductPrice() throws RuntimeException
    {
		return (org.compiere.model.I_M_ProductPrice)MTable.get(getCtx(), org.compiere.model.I_M_ProductPrice.Table_Name)
			.getPO(getM_ProductPrice_ID(), get_TrxName());	}

	/** Set Product Price.
		@param M_ProductPrice_ID 
		Intersection between a Product and a Price List Version
	  */
	public void setM_ProductPrice_ID (int M_ProductPrice_ID)
	{
		if (M_ProductPrice_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_ProductPrice_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_ProductPrice_ID, Integer.valueOf(M_ProductPrice_ID));
	}

	/** Get Product Price.
		@return Intersection between a Product and a Price List Version
	  */
	public int getM_ProductPrice_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductPrice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_MLM_Level_ID.
		@param RDO_MLM_Level_ID RDO_MLM_Level_ID	  */
	public void setRDO_MLM_Level_ID (int RDO_MLM_Level_ID)
	{
		if (RDO_MLM_Level_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_MLM_Level_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_MLM_Level_ID, Integer.valueOf(RDO_MLM_Level_ID));
	}

	/** Get RDO_MLM_Level_ID.
		@return RDO_MLM_Level_ID	  */
	public int getRDO_MLM_Level_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_MLM_Level_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_MLM_Level_UU.
		@param RDO_MLM_Level_UU RDO_MLM_Level_UU	  */
	public void setRDO_MLM_Level_UU (String RDO_MLM_Level_UU)
	{
		set_ValueNoCheck (COLUMNNAME_RDO_MLM_Level_UU, RDO_MLM_Level_UU);
	}

	/** Get RDO_MLM_Level_UU.
		@return RDO_MLM_Level_UU	  */
	public String getRDO_MLM_Level_UU () 
	{
		return (String)get_Value(COLUMNNAME_RDO_MLM_Level_UU);
	}
}