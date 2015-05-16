package com.pattech.tabs;

import com.pattech.core.PatTechCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PatTechTabCore extends CreativeTabs{

	public PatTechTabCore(int id, String unlocalizedName) {
		super(id, unlocalizedName); }
		
		@SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
			return PatTechCore.ThoriumDust;
	}

}