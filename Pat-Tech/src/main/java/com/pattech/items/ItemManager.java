package com.pattech.items;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.pattech.PatTechCore;

public class ItemManager {
	
	public static DiamondDrill diamondDrill;
	public static ScrewDriver screwDriver;
	public static IronRod ironRod;
	public static VortexBlade vortexBlade;
	public static Chainsaw chainSaw;
	public static ElectricHoe electricHoe;
	public static VortexArmor vortexHelm;
	public static VortexArmor vortexChest;
	public static VortexArmor vortexLeggs;
	public static VortexArmor vortexBoots;
	public static NeutroniumIngot nIngot;
	public static ProtoniumIngot pIngot;
	public static Rubber rubber;
	
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}

	public static void initializeItem() {
		screwDriver = new ScrewDriver();
		ironRod = new IronRod();
		diamondDrill = new DiamondDrill(PatTechCore.DrillMaterial);
		vortexBlade = new VortexBlade(PatTechCore.VortexMaterial);
		chainSaw = new Chainsaw(PatTechCore.ChainsawMaterial);
		electricHoe = new ElectricHoe(PatTechCore.ElectricHoeMaterial);
		vortexHelm = new VortexArmor(PatTechCore.VortexArmorMaterial, 0, 0, "VortexHelmet");
		vortexChest = new VortexArmor(PatTechCore.VortexArmorMaterial, 0, 1, "VortexChestplate");
		vortexLeggs = new VortexArmor(PatTechCore.VortexArmorMaterial, 0, 2, "vortexLeggings");
		vortexBoots = new VortexArmor(PatTechCore.VortexArmorMaterial, 0, 3, "vortexBoots");
		nIngot = new NeutroniumIngot();
		pIngot = new ProtoniumIngot();
		rubber = new Rubber();
	}
		
	
	public static void registerItem() {
		GameRegistry.registerItem(screwDriver, screwDriver.name);
		GameRegistry.registerItem(ironRod, ironRod.name);
		GameRegistry.registerItem(diamondDrill, diamondDrill.name);
		GameRegistry.registerItem(vortexBlade, vortexBlade.name);
		GameRegistry.registerItem(chainSaw, chainSaw.name);
		GameRegistry.registerItem(electricHoe, electricHoe.name);
		GameRegistry.registerItem(vortexHelm, vortexHelm.name);
		GameRegistry.registerItem(vortexChest, vortexChest.name);
		GameRegistry.registerItem(vortexLeggs, vortexLeggs.name);
		GameRegistry.registerItem(vortexBoots, vortexBoots.name);
		GameRegistry.registerItem(nIngot, nIngot.name);
		GameRegistry.registerItem(pIngot, pIngot.name);
		GameRegistry.registerItem(rubber, rubber.name);
	}
}
