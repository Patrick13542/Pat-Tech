package com.pattech.entity;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.pattech.items.ItemManager;

public class SubatomicBlaze extends EntityBlaze {

	 public SubatomicBlaze(World worldIn)
	    {
	        super(worldIn);
	        this.isImmuneToFire = true;
	        this.experienceValue = 10;
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0d);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4d);
	       this.tasks.addTask(4, new SubatomicBlaze.AIFireballAttack());
	        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	    }
	
//	protected void applyEntityAttributes() {
//        super.applyEntityAttributes();
//        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0d);
//        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5d);
//        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
//        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
//	}
	 class AIFireballAttack extends EntityAIBase
	    {
	        private SubatomicBlaze field_179469_a = SubatomicBlaze.this;
	        private int field_179467_b;
	        private int field_179468_c;
	        private static final String __OBFID = "CL_00002225";

	        public AIFireballAttack()
	        {
	            this.setMutexBits(3);
	        }

	        /**
	         * Returns whether the EntityAIBase should begin execution.
	         */
	        public boolean shouldExecute()
	        {
	            EntityLivingBase entitylivingbase = this.field_179469_a.getAttackTarget();
	            return entitylivingbase != null && entitylivingbase.isEntityAlive();
	        }

	        /**
	         * Execute a one shot task or start executing a continuous task
	         */
	        public void startExecuting()
	        {
	            this.field_179467_b = 0;
	        }

	        /**
	         * Resets the task
	         */
	        public void resetTask()
	        {
	            this.field_179469_a.func_70844_e(false);
	        }

	        /**
	         * Updates the task
	         */
	        public void updateTask()
	        {
	            --this.field_179468_c;
	            EntityLivingBase entitylivingbase = this.field_179469_a.getAttackTarget();
	            double d0 = this.field_179469_a.getDistanceSqToEntity(entitylivingbase);

	            if (d0 < 4.0D)
	            {
	                if (this.field_179468_c <= 0)
	                {
	                    this.field_179468_c = 20;
	                    this.field_179469_a.attackEntityAsMob(entitylivingbase);
	                }

	                this.field_179469_a.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
	            }
	            else if (d0 < 256.0D)
	            {
	                double d1 = entitylivingbase.posX - this.field_179469_a.posX;
	                double d2 = entitylivingbase.getEntityBoundingBox().minY + (double)(entitylivingbase.height / 2.0F) - (this.field_179469_a.posY + (double)(this.field_179469_a.height / 2.0F));
	                double d3 = entitylivingbase.posZ - this.field_179469_a.posZ;

	                if (this.field_179468_c <= 0)
	                {
	                    ++this.field_179467_b;

	                    if (this.field_179467_b == 1)
	                    {
	                        this.field_179468_c = 60;
	                        this.field_179469_a.func_70844_e(true);
	                    }
	                    else if (this.field_179467_b <= 4)
	                    {
	                        this.field_179468_c = 6;
	                    }
	                    else
	                    {
	                        this.field_179468_c = 100;
	                        this.field_179467_b = 0;
	                        this.field_179469_a.func_70844_e(false);
	                    }

	                    if (this.field_179467_b > 1)
	                    {
	                        float f = MathHelper.sqrt_float(MathHelper.sqrt_double(d0)) * 0.5F;
	                        this.field_179469_a.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1009, new BlockPos((int)this.field_179469_a.posX, (int)this.field_179469_a.posY, (int)this.field_179469_a.posZ), 0);

	                        for (int i = 0; i < 1; ++i)
	                        {
	                            EntitySmallFireball entitysmallfireball = new EntitySmallFireball(this.field_179469_a.worldObj, this.field_179469_a, d1 + this.field_179469_a.getRNG().nextGaussian() * (double)f, d2, d3 + this.field_179469_a.getRNG().nextGaussian() * (double)f);
	                            entitysmallfireball.posY = this.field_179469_a.posY + (double)(this.field_179469_a.height / 2.0F) + 0.5D;
	                            this.field_179469_a.worldObj.spawnEntityInWorld(entitysmallfireball);
	                        }
	                    }
	                }

	                this.field_179469_a.getLookHelper().setLookPositionWithEntity(entitylivingbase, 10.0F, 10.0F);
	            }
	            else
	            {
	                this.field_179469_a.getNavigator().clearPathEntity();
	                this.field_179469_a.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
	            }

	            super.updateTask();
	        }
	    }
	public boolean isAIEnabled() {
        return true;
        
	}
	 public void func_70844_e(boolean p_70844_1_)
	    {
	       // byte b0 = this.dataWatcher.getWatchableObjectByte(16);

	        if (p_70844_1_)
	        {
	          //  b0 = (byte)(b0 | 1);
	        }
	        else
	        {
	           // b0 &= -2;
	        }

	      //  this.dataWatcher.updateObject(16, Byte.valueOf(b0));
	    }

	 @Override
	 public void dropFewItems(boolean recentlyHit, int lootLevel) {
		 if(new Random().nextInt(10) == 1){
	  int quantity1 = new Random().nextInt(3);
	  this.dropItem(ItemManager.nIngot, quantity1);
		 }
		 if(new Random().nextInt(15) == 2){
	  int quantity2 = new Random().nextInt(2);
	  this.dropItem(ItemManager.pIngot, quantity2);
		 }
	  
	  
	 }
}