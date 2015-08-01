package com.pattech.blocks;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PitchBlend extends Block {

public static final String name = "PitchBlend" ;	
	
	public PitchBlend() {
		super(Material.rock);
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;

	}


}


