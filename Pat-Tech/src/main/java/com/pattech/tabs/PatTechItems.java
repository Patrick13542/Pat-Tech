package com.pattech.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PatTechItems extends CreativeTabs{

	public PatTechItems(int id, String unlocalizedName) {
		super(id, unlocalizedName); }
		
		@SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
			return Items.ender_eye;
	}

}