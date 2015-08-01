package com.pattech.blocks;


import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class IridiumOre extends Block {

public static final String name = "IridiumOre" ;	
	
	public IridiumOre() {
		super(Material.rock);
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;
	}

}


