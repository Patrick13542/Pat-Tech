package com.pattech.blocks;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

import com.pattech.main.Main;

public class RubberWood extends BlockRotatedPillar {

	public RubberWood(Material arg0) {
		super(arg0);
		
		setCreativeTab(Main.PatTechBlocks);
		setBlockName("rubberWoodLog");
		setHarvestLevel("axe", 1);
		setStepSound(soundTypeWood);
		setHardness(2.5F);
	}

	@Override
	protected IIcon getSideIcon(int arg0) {
		return null;
	}
	
}