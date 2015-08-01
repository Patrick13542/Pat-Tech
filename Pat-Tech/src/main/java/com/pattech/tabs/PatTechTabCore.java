package com.pattech.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.pattech.items.ItemManager;

public class PatTechTabCore extends CreativeTabs {

	public PatTechTabCore(int index, String label) {
		super(index, label);
	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return ItemManager.chainSaw;
	}

}
