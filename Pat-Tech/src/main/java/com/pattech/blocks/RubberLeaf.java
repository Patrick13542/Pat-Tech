package com.pattech.blocks;

import com.pattech.main.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RubberLeaf extends Block {

	public RubberLeaf(Material arg0) {
		super(arg0);
		
		setCreativeTab(Main.PatTechBlocks);
		setBlockName("rubberLeaves");
		setHarvestLevel("fist", 0);
		setStepSound(soundTypeGrass);
		setHardness(0.1F);
	}

}
