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

/** Generated Model for RDO_MLM_ProfitLevel
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_RDO_MLM_ProfitLevel extends PO implements I_RDO_MLM_ProfitLevel, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230317L;

    /** Standard Constructor */
    public X_RDO_MLM_ProfitLevel (Properties ctx, int RDO_MLM_ProfitLevel_ID, String trxName)
    {
      super (ctx, RDO_MLM_ProfitLevel_ID, trxName);
      /** if (RDO_MLM_ProfitLevel_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_RDO_MLM_ProfitLevel (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_RDO_MLM_ProfitLevel[")
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

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
    {
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Percentage From.
		@param PercentageFrom Percentage From	  */
	public void setPercentageFrom (BigDecimal PercentageFrom)
	{
		set_Value (COLUMNNAME_PercentageFrom, PercentageFrom);
	}

	/** Get Percentage From.
		@return Percentage From	  */
	public BigDecimal getPercentageFrom () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PercentageFrom);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Percentage To.
		@param PercentageTo Percentage To	  */
	public void setPercentageTo (BigDecimal PercentageTo)
	{
		set_Value (COLUMNNAME_PercentageTo, PercentageTo);
	}

	/** Get Percentage To.
		@return Percentage To	  */
	public BigDecimal getPercentageTo () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PercentageTo);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MLM Profit Level (ID).
		@param RDO_MLM_ProfitLevel_ID MLM Profit Level (ID)	  */
	public void setRDO_MLM_ProfitLevel_ID (int RDO_MLM_ProfitLevel_ID)
	{
		if (RDO_MLM_ProfitLevel_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_MLM_ProfitLevel_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_MLM_ProfitLevel_ID, Integer.valueOf(RDO_MLM_ProfitLevel_ID));
	}

	/** Get MLM Profit Level (ID).
		@return MLM Profit Level (ID)	  */
	public int getRDO_MLM_ProfitLevel_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_MLM_ProfitLevel_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_MLM_ProfitLevel_UU.
		@param RDO_MLM_ProfitLevel_UU RDO_MLM_ProfitLevel_UU	  */
	public void setRDO_MLM_ProfitLevel_UU (String RDO_MLM_ProfitLevel_UU)
	{
		set_ValueNoCheck (COLUMNNAME_RDO_MLM_ProfitLevel_UU, RDO_MLM_ProfitLevel_UU);
	}

	/** Get RDO_MLM_ProfitLevel_UU.
		@return RDO_MLM_ProfitLevel_UU	  */
	public String getRDO_MLM_ProfitLevel_UU () 
	{
		return (String)get_Value(COLUMNNAME_RDO_MLM_ProfitLevel_UU);
	}
}