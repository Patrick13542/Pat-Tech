package com.pattech.blocks;

import com.pattech.core.PatTechCore;
import com.pattech.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverOre extends Block {

	public SilverOre(Material arg0) {
		super(arg0);

		setCreativeTab(PatTechCore.PatTechTabCore);
		setBlockTextureName(Reference.MODID + ":oreSilver");
		setHarvestLevel("pickaxe", 2);
		setBlockName("oreSilver");
		setHardness(5F);
	
	}

}
