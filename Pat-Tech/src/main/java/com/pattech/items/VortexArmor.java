package com.pattech.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

public class VortexArmor extends ItemArmor {
	

	public String name;
	
	public VortexArmor(ArmorMaterial material, int renderIndex, int armorType, String name) {
		super(material, renderIndex, armorType); 
		
		this.name = name;
		this.setUnlocalizedName(Reference.MODID + "_" + name);
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;
        
						
	
	}	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player,
			ItemStack itemStack) {
		if(player.inventory.armorItemInSlot(3)!=null)
			player.addPotionEffect(new PotionEffect(16,1));
			if(player.inventory.armorItemInSlot(2)!=null)
				player.addPotionEffect(new PotionEffect(23,1,20));
			if(player.inventory.armorItemInSlot(2)!=null){
				player.addPotionEffect(new PotionEffect(10,1));
				player.capabilities.allowFlying = true;
			}
			if(player.inventory.armorItemInSlot(3)!=null)
				player.addPotionEffect(new PotionEffect(13, 1, 20));
			if(player.inventory.armorItemInSlot(1) !=null)	
				player.addPotionEffect(new PotionEffect (8, 1, 20));				
			if(player.inventory.armorItemInSlot(0) !=null)	
				player.addPotionEffect(new PotionEffect (1, 1, 20));
			
			
		super.onArmorTick(world, player, itemStack);
		
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(slot == 2) {
			return "pattech:textures/models/armor/vortex_2.png";
		}
		
		return "pattech:textures/models/armor/vortex_1.png";
	}

}
