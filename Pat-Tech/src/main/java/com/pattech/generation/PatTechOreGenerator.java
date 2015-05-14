package com.pattech.generation;

import java.util.Random;

import com.pattech.core.PatTechCore;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class PatTechOreGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider arg4, IChunkProvider arg5) {
		
		switch(world.provider.dimensionId) 
		{
		case -1:
		generateInNether(world, random, chunkX*16, chunkZ*16);
		break;
		case 0:
		generateInOverworld(world, random, chunkX*16, chunkZ*16);
		break;
		case 1:
		generateInEnd(world, random, chunkX*16, chunkZ*16);
		break;
		}
		
	}

	private void generateInEnd(World world, Random random, int x, int z) {
		
	}

	private void generateInOverworld(World world, Random random, int x, int z) {
		for (int i = 0; i < 25; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(256);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(PatTechCore.CopperOre, 10)).generate(world, random, chunkX, chunkY, chunkZ);
			(new WorldGenMinable(PatTechCore.PitchBlend, 5)).generate(world, random, chunkX, chunkY, chunkZ);
			(new WorldGenMinable(PatTechCore.TinOre, 10)).generate(world, random, chunkX, chunkY, chunkZ);
			(new WorldGenMinable(PatTechCore.SilverOre, 10)).generate(world, random, chunkX, chunkY, chunkZ);
		
		}
	}

	private void generateInNether(World world, Random random, int x, int z) {
		
	}

}


