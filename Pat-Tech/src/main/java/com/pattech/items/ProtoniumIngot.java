package com.pattech.items;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ProtoniumIngot extends Item {
	
public static final String name = "ProtoniumIngot" ;
	
	public ProtoniumIngot() {
		super();
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;
	}
}