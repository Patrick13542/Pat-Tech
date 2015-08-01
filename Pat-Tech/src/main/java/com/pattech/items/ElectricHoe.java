package com.pattech.items;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ElectricHoe extends ItemHoe {

	public static final String name = "ElectricHoe" ;
	
	public ElectricHoe(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;

	}

}
