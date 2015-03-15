package com.pattech.blocks;

import com.pattech.main.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RubberSapling extends Block {

	public RubberSapling(Material arg0) {
		super(arg0);
		
		setCreativeTab(Main.PatTechBlocks);
		setBlockName("rubberSapling");
		setHarvestLevel("fist", 0);
		setStepSound(soundTypeGrass);
		setHardness(0.0F);
	}

}