package com.pattech.items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

public class VortexBlade extends ItemSword {
	
	public static final String name = "VortexBlade" ;
	
	public VortexBlade(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;
		
		
	}


	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn,
			int itemSlot, boolean isSelected) {
		if(((EntityPlayer) entityIn).inventory.getCurrentItem()!=null && ((EntityPlayer) entityIn).inventory.getCurrentItem() == stack){
		((EntityPlayer) entityIn).addPotionEffect(new PotionEffect(Potion.digSlowdown.id,1,3));
		}
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
		
		
	}



		
		
		
		
		
	


	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn,
			EntityPlayer playerIn) {
		
		
		MovingObjectPosition position = playerIn.rayTrace(32, playerIn.eyeHeight);
		
			EntityLivingBase target;
		BlockPos pos = position.getBlockPos();
		 AxisAlignedBB axisalignedbb = AxisAlignedBB.fromBounds(pos.getX(), pos.getY(), pos.getZ(), pos.getX()+20, pos.getY()+10, pos.getZ()+20);
		 List<EntityLivingBase> list = worldIn.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
		 for(int i = 0; i < list.size(); i++){
		 target = list.get(i);
		 if(target instanceof EntityPlayer){
			 continue;
			 
				 
		 } else {
		 target.setVelocity((playerIn.posX - target.posX)/2, 1, (playerIn.posZ - target.posZ)/2); 
		 }
		 
		
		}
		
		return super.onItemRightClick(itemStackIn, worldIn, playerIn);
	}

}