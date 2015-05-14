package com.pattech.blocks;

import com.pattech.core.PatTechCore;
import com.pattech.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOre extends Block {

	public CopperOre(Material arg0) {
		super(arg0);
		
		setCreativeTab(PatTechCore.PatTechTabCore);
		setBlockTextureName(Reference.MODID + ":oreCopper");
		setHarvestLevel("pickaxe", 1);
		setBlockName("oreCopper");
		setHardness(5F);
	}
}
