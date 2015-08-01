package com.pattech.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBlaze;
import net.minecraft.client.renderer.entity.RenderBlaze;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.pattech.lib.Reference;

public class RenderSubatomicBlaze extends RenderBlaze {

	public RenderSubatomicBlaze(RenderManager p_i46191_1_) {
		super(p_i46191_1_); 
		
	}
	
		public RenderSubatomicBlaze(ModelBlaze model) {
	        super(Minecraft.getMinecraft().getRenderManager());
	    }
	 
	     
	 
	    @Override
	    protected ResourceLocation getEntityTexture(Entity var1) {
	    	return new ResourceLocation(Reference.MODID, "textures/entity/subAtomicBlaze.png");

	    }
	 
	}
		


