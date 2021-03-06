package com.mysticalcrops.items;

import com.mysticalcrops.MysticalCrops;
import com.mysticalcrops.blocks.CropBlocks;
import com.mysticalcrops.blocks.MysticalCropBlock;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;

/**
 * Created by Sword_Korn on 6/13/2016.
 */
public class CropItems {
    public static Item[] MCSeeds;
    public static Item[] MCDrops;
    public static Item[] MCMisc;

    public static HashMap<MysticalCropBlock, Item> seedsMap = new HashMap<MysticalCropBlock, Item>();
    public static HashMap<MysticalCropBlock, Item> harvestedItemMap = new HashMap<MysticalCropBlock, Item>();

    //Seeds
    public static Item redstoneCropSeed;
    public static Item ironCropSeed;
    public static Item goldCropSeed;
    public static Item lapisCropSeed;
    public static Item diamondCropSeed;
    public static Item coalCropSeed;
    public static Item emeraldCropSeed;
    public static Item glowCropSeed;
    public static Item blazeCropSeed;
    public static Item enderCropSeed;
    public static Item prismShardCropSeed;
    public static Item prismCrystalCropSeed;
    public static Item copperCropSeed;
    public static Item tinCropSeed;
    public static Item leadCropSeed;
    public static Item silverCropSeed;
    public static Item nickelCropSeed;
    public static Item platinumCropSeed;
    public static Item aluminiumCropSeed;
    public static Item zincCropSeed;
    public static Item titaniumCropSeed;
    public static Item uraniumCropSeed;
    public static Item plutoniumCropSeed;

    //Drops
    public static Item redstoneEssence;
    public static Item ironEssence;
    public static Item goldEssence;
    public static Item lapisEssence;
    public static Item diamondEssence;
    public static Item coalEssence;
    public static Item emeraldEssence;
    public static Item glowEssence;
    public static Item blazeEssence;
    public static Item enderEssence;
    public static Item prismShardEssence;
    public static Item prismCrystalEssence;
    public static Item copperEssence;
    public static Item tinEssence;
    public static Item leadEssence;
    public static Item silverEssence;
    public static Item nickelEssence;
    public static Item platinumEssence;
    public static Item aluminiumEssence;
    public static Item zincEssence;
    public static Item titaniumEssence;
    public static Item uraniumEssence;
    public static Item plutoniumEssence;

    //Forge Registry items for mod support
    public static Item ingotCopper;
    public static Item ingotTin;
    public static Item ingotLead;
    public static Item ingotSilver;
    public static Item ingotNickel;
    public static Item ingotPlatinum;
    public static Item ingotAluminum;
    public static Item ingotZinc;
    public static Item ingotTitanium;
    public static Item ingotUranium;
    public static Item ingotPlutonium;

    public static Item regItem(Item item, String regName) {
        item.setRegistryName(regName);
        item.setCreativeTab(MysticalCrops.cropsTab);

        return GameRegistry.register(item);
    }

    public static Item regSeeds(String regName, Block crop, boolean isSeed) {
        MysticalCropSeed item = new MysticalCropSeed(crop, Blocks.FARMLAND, regName);

        if(isSeed) {
            seedsMap.put((MysticalCropBlock) crop, item);
        }else{
            harvestedItemMap.put((MysticalCropBlock) crop, item);
        }

        return regItem(item, regName);
    }

    public static Item regMiscItem(String regName) {
        MysticalCropItem item = new MysticalCropItem(regName);

        return regItem(item, regName);
    }

    public static void loadCropItems() {
        //Register seeds
        redstoneCropSeed = regSeeds("redstoneCropSeed", CropBlocks.redstoneCrop, true);
        ironCropSeed = regSeeds("ironCropSeed", CropBlocks.ironCrop, true);
        goldCropSeed = regSeeds("goldCropSeed", CropBlocks.goldCrop, true);
        lapisCropSeed = regSeeds("lapisCropSeed", CropBlocks.lapisCrop, true);
        diamondCropSeed = regSeeds("diamondCropSeed", CropBlocks.diamondCrop, true);
        coalCropSeed = regSeeds("coalCropSeed", CropBlocks.coalCrop, true);
        emeraldCropSeed = regSeeds("emeraldCropSeed", CropBlocks.emeraldCrop, true);
        glowCropSeed = regSeeds("glowCropSeed", CropBlocks.glowCrop, true);
        blazeCropSeed = regSeeds("blazeCropSeed", CropBlocks.blazeCrop, true);
        enderCropSeed = regSeeds("enderCropSeed", CropBlocks.enderCrop, true);
        prismShardCropSeed = regSeeds("prismShardCropSeed", CropBlocks.prismShardCrop, true);
        prismCrystalCropSeed = regSeeds("prismCrystalCropSeed", CropBlocks.prismCrystalCrop, true);

        if(Loader.isModLoaded("IC2") || Loader.isModLoaded("FunOres")) {
            copperCropSeed = regSeeds("copperCropSeed", CropBlocks.copperCrop, true);
            tinCropSeed = regSeeds("tinCropSeed", CropBlocks.tinCrop, true);
            leadCropSeed = regSeeds("leadCropSeed", CropBlocks.leadCrop, true);
            silverCropSeed = regSeeds("silverCropSeed", CropBlocks.silverCrop, true);
        }

        if(Loader.isModLoaded("FunOres")) {
            nickelCropSeed = regSeeds("nickelCropSeed", CropBlocks.nickelCrop, true);
            platinumCropSeed = regSeeds("platinumCropSeed", CropBlocks.platinumCrop, true);
            aluminiumCropSeed = regSeeds("aluminiumCropSeed", CropBlocks.aluminiumCrop, true);
            zincCropSeed = regSeeds("zincCropSeed", CropBlocks.zincCrop, true);
            titaniumCropSeed = regSeeds("titaniumCropSeed", CropBlocks.titaniumCrop, true);
        }

        uraniumCropSeed = regSeeds("uraniumCropSeed", CropBlocks.uraniumCrop, true);
        plutoniumCropSeed = regSeeds("plutoniumCropSeed", CropBlocks.plutoniumCrop, true);

        //Register plant drops
        redstoneEssence = regSeeds("redstoneEssence", CropBlocks.redstoneCrop, false);
        ironEssence = regSeeds("ironEssence", CropBlocks.ironCrop, false);
        goldEssence = regSeeds("goldEssence", CropBlocks.goldCrop, false);
        lapisEssence = regSeeds("lapisEssence", CropBlocks.lapisCrop, false);
        diamondEssence = regSeeds("diamondEssence", CropBlocks.diamondCrop, false);
        coalEssence = regSeeds("coalEssence", CropBlocks.coalCrop, false);
        emeraldEssence = regSeeds("emeraldEssence", CropBlocks.emeraldCrop, false);
        glowEssence = regSeeds("glowEssence", CropBlocks.glowCrop, false);
        blazeEssence = regSeeds("blazeEssence", CropBlocks.blazeCrop, false);
        enderEssence = regSeeds("enderEssence", CropBlocks.enderCrop, false);
        prismShardEssence = regSeeds("prismShardEssence", CropBlocks.prismShardCrop, false);
        prismCrystalEssence = regSeeds("prismCrystalEssence", CropBlocks.prismCrystalCrop, false);

        if(Loader.isModLoaded("IC2") || Loader.isModLoaded("FunOres")) {
            copperEssence = regSeeds("copperEssence", CropBlocks.copperCrop, false);
            tinEssence = regSeeds("tinEssence", CropBlocks.tinCrop, false);
            leadEssence = regSeeds("leadEssence", CropBlocks.leadCrop, false);
            silverEssence = regSeeds("silverEssence", CropBlocks.silverCrop, false);
        }

        if(Loader.isModLoaded("FunOres")) {
            nickelEssence = regSeeds("nickelEssence", CropBlocks.nickelCrop, false);
            platinumEssence = regSeeds("platinumEssence", CropBlocks.platinumCrop, false);
            aluminiumEssence = regSeeds("aluminiumEssence", CropBlocks.aluminiumCrop, false);
            zincEssence = regSeeds("zincEssence", CropBlocks.zincCrop, false);
            titaniumEssence = regSeeds("titaniumEssence", CropBlocks.titaniumCrop, false);
        }

        uraniumEssence = regSeeds("uraniumEssence", CropBlocks.uraniumCrop, false);
        plutoniumEssence = regSeeds("plutoniumEssence", CropBlocks.plutoniumCrop, false);

        //Register misc items
        if(Loader.isModLoaded("IC2") || Loader.isModLoaded("FunOres")) {
            ingotCopper = regMiscItem("ingotCopper");
            ingotTin = regMiscItem("ingotTin");
            ingotLead = regMiscItem("ingotLead");
            ingotSilver = regMiscItem("ingotSilver");
        }

        if(Loader.isModLoaded("FunOres")) {
            ingotNickel = regMiscItem("ingotNickel");
            ingotPlatinum = regMiscItem("ingotPlatinum");
            ingotAluminum = regMiscItem("ingotAluminum");
            ingotZinc = regMiscItem("ingotZinc");
            ingotTitanium = regMiscItem("ingotTitanium");
        }

        ingotUranium = regMiscItem("ingotUranium");
        ingotPlutonium = regMiscItem("ingotPlutonium");

        if(Loader.isModLoaded("IC2") || Loader.isModLoaded("FunOres")) {
            OreDictionary.registerOre("ingotCopper", ingotCopper);
            OreDictionary.registerOre("ingotTin", ingotTin);
            OreDictionary.registerOre("ingotLead", ingotLead);
            OreDictionary.registerOre("ingotSilver", ingotSilver);

            if(Loader.isModLoaded("FunOres")) {
                OreDictionary.registerOre("nuggetCopper", copperEssence);
                OreDictionary.registerOre("nuggetTin", tinEssence);
                OreDictionary.registerOre("nuggetLead", leadEssence);
                OreDictionary.registerOre("nuggetSilver", silverEssence);
                OreDictionary.registerOre("nuggetNickel", nickelEssence);
                OreDictionary.registerOre("nuggetPlatinum", platinumEssence);
                OreDictionary.registerOre("nuggetAluminum", aluminiumEssence);
                OreDictionary.registerOre("nuggetZinc", zincEssence);
                OreDictionary.registerOre("nuggetTitanium", titaniumEssence);
            }
        }

        if(Loader.isModLoaded("FunOres")) {
            OreDictionary.registerOre("ingotNickel", ingotNickel);
            OreDictionary.registerOre("ingotPlatinum", ingotPlatinum);
            OreDictionary.registerOre("ingotAluminum", ingotAluminum);
            OreDictionary.registerOre("ingotZinc", ingotZinc);
            OreDictionary.registerOre("ingotTitanium", ingotTitanium);
        }

        OreDictionary.registerOre("ingotUranium", ingotUranium);
        OreDictionary.registerOre("ingotPlutonium", ingotPlutonium);

        MCSeeds = new Item[] {coalCropSeed, copperCropSeed, tinCropSeed, ironCropSeed, leadCropSeed, nickelCropSeed, platinumCropSeed, aluminiumCropSeed, zincCropSeed, titaniumCropSeed, silverCropSeed, goldCropSeed, redstoneCropSeed, lapisCropSeed, uraniumCropSeed, plutoniumCropSeed, diamondCropSeed, glowCropSeed, emeraldCropSeed, blazeCropSeed, enderCropSeed, prismShardCropSeed, prismCrystalCropSeed};
        MCDrops = new Item[] {coalEssence, copperEssence, tinEssence, ironEssence, leadEssence, nickelEssence, platinumEssence, aluminiumEssence, zincEssence, titaniumEssence, silverEssence, goldEssence, redstoneEssence, lapisEssence, uraniumEssence, plutoniumEssence, diamondEssence, glowEssence, emeraldEssence, blazeEssence, enderEssence, prismShardEssence, prismCrystalEssence};
        MCMisc = new Item[] {ingotCopper, ingotTin, ingotLead, ingotSilver, ingotNickel, ingotPlatinum, ingotAluminum, ingotZinc, ingotTitanium, ingotUranium, ingotPlutonium};
    }
}
