package com.pattech.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

public class NeutroniumIngot extends Item {
	
public static final String name = "NeutroniumIngot" ;
	
	public NeutroniumIngot() {
		super();
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;

	}
}

