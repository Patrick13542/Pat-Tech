package com.pattech.blocks;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RubberWood extends Block {

public static final String name = "RubberWood" ;	
	
	public RubberWood() {
		super(Material.wood);
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;
		this.setHarvestLevel("axe", 1);
		this.setHardness(3F);

	}

}
