package com.pattech.blocks;

import com.pattech.core.PatTechCore;
import com.pattech.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PitchBlend extends Block {

	public PitchBlend(Material arg0) {
		super(arg0);
	
		setCreativeTab(PatTechCore.PatTechTabCore);
		setBlockTextureName(Reference.MODID + ":orePitchblend");
		setHarvestLevel("pickaxe", 2);
		setBlockName("orePitchblend");
		setHardness(8F);
		
	}

}
