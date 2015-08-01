package com.pattech.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

public class CopperOre extends Block {

public static final String name = "CopperOre" ;	
	
	public CopperOre() {
		super(Material.rock);
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;

	}

}