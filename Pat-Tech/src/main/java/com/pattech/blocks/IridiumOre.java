package com.pattech.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.jcraft.jorbis.DspState;
import com.pattech.core.PatTechCore;
import com.pattech.lib.Reference;

public class IridiumOre extends Block {

	public IridiumOre(Material vd) {
		super(vd);
		
		setCreativeTab(PatTechCore.PatTechTabCore);
		setBlockTextureName(Reference.MODID + ":");
		setHarvestLevel("pickaxe", 3);
		setBlockName("oreIridium");
		setHardness(5F);

	}

}
