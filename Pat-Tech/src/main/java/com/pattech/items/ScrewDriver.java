package com.pattech.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

public class ScrewDriver extends Item {

public static final String name = "ScrewDriver" ;
	
	public ScrewDriver() {
		super();
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;

	}

	@Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn,
            World worldIn, BlockPos pos, EnumFacing side, float hitX,
            float hitY, float hitZ) {
		
		//worldIn.(Event)
		
		return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
	}
}