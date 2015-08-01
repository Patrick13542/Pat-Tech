package com.pattech.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import com.pattech.PatTechCore;
import com.pattech.lib.Reference;

public class Chainsaw extends ItemAxe {

	public static final String name = "Chainsaw" ;
	
	protected Chainsaw(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName(Reference.MODID + "_" + this.name) ;
		this.setCreativeTab(PatTechCore.PatTechTabCore) ;

	}

	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
		
		entityLiving.getEntityWorld().playSoundAtEntity(entityLiving, "pattech:sound1", 1.0f, 1.0f);
		
		return super.onEntitySwing(entityLiving, stack);
	}

}

