package com.pattech.core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.pattech.blocks.CopperOre;
import com.pattech.blocks.PitchBlend;
import com.pattech.blocks.SilverOre;
import com.pattech.blocks.TinOre;
import com.pattech.generation.PatTechOreGenerator;
import com.pattech.items.CopperIngot;
import com.pattech.items.RadiumDust;
import com.pattech.items.SilverIngot;
import com.pattech.items.ThoriumDust;
import com.pattech.items.TinIngot;
import com.pattech.items.UraniumDust;
import com.pattech.lib.Reference;
import com.pattech.proxy.CommonProxy;
import com.pattech.tabs.PatTechTabCore;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class PatTechCore {
	
@SidedProxy(clientSide="com.pattech.proxy.ClientProxy", serverSide="com.pattech.proxy.CommonProxy")
public static CommonProxy proxy;

//Creative Tabs
public static CreativeTabs PatTechTabCore = new PatTechTabCore(CreativeTabs.getNextID(), "ptCore");

	//Blocks	
	public static Block CopperOre = new CopperOre(Material.rock);
	public static Block PitchBlend = new PitchBlend(Material.rock);
	public static Block TinOre = new TinOre(Material.rock);
	public static Block SilverOre = new SilverOre(Material.rock);
	
	//Items
	public static Item CopperIngot = new CopperIngot().setCreativeTab(PatTechCore.PatTechTabCore).setUnlocalizedName("ingotCopper").setTextureName(Reference.MODID + ":ingotCopper");
	public static Item TinIngot = new TinIngot().setCreativeTab(PatTechCore.PatTechTabCore).setUnlocalizedName("ingotTin").setTextureName(Reference.MODID + ":ingotTin");
	public static Item SilverIngot = new SilverIngot().setCreativeTab(PatTechCore.PatTechTabCore).setUnlocalizedName("ingotSilver").setTextureName(Reference.MODID + ":ingotSilver");
	public static Item RadiumDust = new RadiumDust().setCreativeTab(PatTechCore.PatTechTabCore).setUnlocalizedName("dustRadium").setTextureName(Reference.MODID + ":itemRadiumDust");
	public static Item UraniumDust = new UraniumDust().setCreativeTab(PatTechCore.PatTechTabCore).setUnlocalizedName("dustUranium").setTextureName(Reference.MODID + ":itemUraniumDust");
	public static Item ThoriumDust = new ThoriumDust().setCreativeTab(PatTechCore.PatTechTabCore).setUnlocalizedName("dustThorium").setTextureName(Reference.MODID + ":itemThoriumDust");
	
	//Ore Generator
	public static PatTechOreGenerator OreGenerator = new PatTechOreGenerator();
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	//Register Blocks
    	GameRegistry.registerBlock(CopperOre, "oreCopper");
    	GameRegistry.registerBlock(PitchBlend, "orePitchblend");
    	GameRegistry.registerBlock(TinOre, "oreTin");
    	GameRegistry.registerBlock(SilverOre, "oreSilver");
    	
    	//Register Items
    	GameRegistry.registerItem(CopperIngot, "ingotCopper");
    	GameRegistry.registerItem(TinIngot, "ingotTin");
    	GameRegistry.registerItem(SilverIngot, "ingotSilver");
    	GameRegistry.registerItem(RadiumDust, "dustRadium");
    	GameRegistry.registerItem(UraniumDust, "dustUranium");
    	GameRegistry.registerItem(ThoriumDust, "dustThorium");
    	
    	//Register World Generator
    	GameRegistry.registerWorldGenerator(OreGenerator, 1);
    	
    	//Smelting Recipes
    	GameRegistry.addSmelting(PatTechCore.CopperOre, new ItemStack(PatTechCore.CopperIngot), 1F);
    	GameRegistry.addSmelting(PatTechCore.TinOre, new ItemStack(PatTechCore.TinIngot), 1F);
    	GameRegistry.addSmelting(PatTechCore.SilverOre, new ItemStack(PatTechCore.SilverIngot), 2F);
    }
    
    
    @EventHandler
    public void Init(FMLInitializationEvent event) {
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}