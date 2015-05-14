package com.pattech.blocks;

import com.pattech.core.PatTechCore;
import com.pattech.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TinOre extends Block {

	public TinOre(Material arg0) {
		super(arg0);
		
		setCreativeTab(PatTechCore.PatTechTabCore);
		setBlockTextureName(Reference.MODID + ":oreTin");
		setHarvestLevel("pickaxe", 1);
		setBlockName("oreTin");
		setHardness(5F);
	}

}
