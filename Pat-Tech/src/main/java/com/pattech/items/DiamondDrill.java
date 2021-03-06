package com.pattech.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

public class DiamondDrill extends ItemPickaxe {
	
public static final String name = "DiamondDrill" ;
	
protected DiamondDrill(ToolMaterial material) {
    super(material);
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;


	}

@Override
public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn,
		EntityPlayer playerIn) {
	
	return super.onItemRightClick(itemStackIn, worldIn, playerIn);
}

@Override
public float getDigSpeed(ItemStack stack, IBlockState state) {
	return 15;

}

@Override
public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
	
	entityLiving.getEntityWorld().playSoundAtEntity(entityLiving, "pattech:sound2", 1.0f, 1.0f);
	
	return super.onEntitySwing(entityLiving, stack);
}

}


