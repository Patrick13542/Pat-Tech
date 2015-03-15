package com.pattech.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.pattech.blocks.CopperOre;
import com.pattech.blocks.PitchBlend;
import com.pattech.blocks.RubberLeaf;
import com.pattech.blocks.RubberSapling;
import com.pattech.blocks.RubberWood;
import com.pattech.blocks.SilverOre;
import com.pattech.blocks.TinOre;
import com.pattech.generation.PatTechWorldGenerator;
import com.pattech.items.CopperIngot;
import com.pattech.items.SilverIngot;
import com.pattech.items.TinIngot;
import com.pattech.lib.Reference;
import com.pattech.proxy.CommonProxy;
import com.pattech.tabs.PatTechBlocks;
import com.pattech.tabs.PatTechItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class Main {
	
@SidedProxy(clientSide="com.pattech.proxy.ClientProxy", serverSide="com.pattech.proxy.CommonProxy")
public static CommonProxy proxy;

//Creative Tabs
public static CreativeTabs PatTechBlocks = new PatTechBlocks(CreativeTabs.getNextID(), "ptBlocks");
public static CreativeTabs PatTechItems = new PatTechItems(CreativeTabs.getNextID(), "ptItems");

	//Blocks	
	public static Block CopperOre = new CopperOre(Material.rock);
	public static Block PitchBlend = new PitchBlend(Material.rock);
	public static Block TinOre = new TinOre(Material.rock);
	public static Block SilverOre = new SilverOre(Material.rock);
	
	public static Block RubberWood = new RubberWood(Material.wood);
	public static Block RubberLeaf = new RubberLeaf(Material.leaves);
	public static Block RubberSapling = new RubberSapling(Material.air);
	
	//Items
	public static Item CopperIngot = new CopperIngot().setCreativeTab(Main.PatTechItems).setUnlocalizedName("ingotCopper").setTextureName(Reference.MODID + ":ingotCopper");
	public static Item TinIngot = new TinIngot().setCreativeTab(Main.PatTechItems).setUnlocalizedName("ingotTin").setTextureName(Reference.MODID + ":ingotTin");
	public static Item SilverIngot = new SilverIngot().setCreativeTab(Main.PatTechItems).setUnlocalizedName("ingotSilver").setTextureName(Reference.MODID + ":ingotSilver");
	
	//Ore Generator
	public static PatTechWorldGenerator OreGenerator = new PatTechWorldGenerator();
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	//Register Blocks
    	GameRegistry.registerBlock(CopperOre, "oreCopper");
    	GameRegistry.registerBlock(PitchBlend, "orePitchblend");
    	GameRegistry.registerBlock(TinOre, "oreTin");
    	GameRegistry.registerBlock(SilverOre, "oreSilver");
    	
    	GameRegistry.registerBlock(RubberWood, "rubberWoodLog");
    	GameRegistry.registerBlock(RubberLeaf, "rubberLeaves");
    	GameRegistry.registerBlock(RubberSapling, "rubberSapling");
    	
    	//Register Items
    	GameRegistry.registerItem(CopperIngot, "ingotCopper");
    	GameRegistry.registerItem(TinIngot, "ingotTin");
    	GameRegistry.registerItem(SilverIngot, "ingotSilver");
    	
    	//Register World Generator
    	GameRegistry.registerWorldGenerator(OreGenerator, 1);
    	
    	//Smelting Recipes
    	GameRegistry.addSmelting(Main.CopperOre, new ItemStack(Main.CopperIngot), 1F);
    	GameRegistry.addSmelting(Main.TinOre, new ItemStack(Main.TinIngot), 1F);
    	GameRegistry.addSmelting(Main.SilverOre, new ItemStack(Main.SilverIngot), 2F);
    }
    
    
    @EventHandler
    public void Init(FMLInitializationEvent event) {
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}