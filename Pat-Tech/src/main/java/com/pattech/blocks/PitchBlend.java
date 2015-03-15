package com.pattech.blocks;

import com.pattech.lib.Reference;
import com.pattech.main.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PitchBlend extends Block {

	public PitchBlend(Material arg0) {
		super(arg0);
	
		setCreativeTab(Main.PatTechBlocks);
		setBlockTextureName(Reference.MODID + ":orePitchblend");
		setHarvestLevel("pickaxe", 2);
		setBlockName("orePitchblend");
		setHardness(8F);
		
	}

}
