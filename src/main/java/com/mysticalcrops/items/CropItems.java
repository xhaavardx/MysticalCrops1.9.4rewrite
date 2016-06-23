package com.mysticalcrops.items;

import com.mysticalcrops.MysticalCrops;
import com.mysticalcrops.blocks.CropBlocks;
import com.mysticalcrops.blocks.MysticalCropBlock;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

/**
 * Created by Sword_Korn on 6/13/2016.
 */
public class CropItems {
    public static Item[] MCSeeds;
    public static Item[] MCDrops;
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

    //Drops
    public static Item redstoneEssence;
    public static Item ironEssence;
    public static Item goldEssence;
    public static Item lapisEssence;
    public static Item diamondEssence;
    public static Item coalEssence;
    public static Item emeraldEssence;

    public static Item regItem(MysticalCropSeed item, String regName) {
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

    public static void loadCropItems() {
        //Register seeds
        redstoneCropSeed = regSeeds("redstoneCropSeed", CropBlocks.redstoneCrop, true);
        ironCropSeed = regSeeds("ironCropSeed", CropBlocks.ironCrop, true);
        goldCropSeed = regSeeds("goldCropSeed", CropBlocks.goldCrop, true);
        lapisCropSeed = regSeeds("lapisCropSeed", CropBlocks.lapisCrop, true);
        diamondCropSeed = regSeeds("diamondCropSeed", CropBlocks.diamondCrop, true);
        coalCropSeed = regSeeds("coalCropSeed", CropBlocks.coalCrop, true);
        emeraldCropSeed = regSeeds("emeraldCropSeed", CropBlocks.emeraldCrop, true);

        //Register plant drops
        redstoneEssence = regSeeds("redstoneEssence", CropBlocks.redstoneCrop, false);
        ironEssence = regSeeds("ironEssence", CropBlocks.ironCrop, false);
        goldEssence = regSeeds("goldEssence", CropBlocks.goldCrop, false);
        lapisEssence = regSeeds("lapisEssence", CropBlocks.lapisCrop, false);
        diamondEssence = regSeeds("diamondEssence", CropBlocks.diamondCrop, false);
        coalEssence = regSeeds("coalEssence", CropBlocks.coalCrop, false);
        emeraldEssence = regSeeds("emeraldEssence", CropBlocks.emeraldCrop, false);

        MCSeeds = new Item[] {coalCropSeed, ironCropSeed, goldCropSeed, redstoneCropSeed, lapisCropSeed, diamondCropSeed, emeraldCropSeed};
        MCDrops = new Item[] {coalEssence, ironEssence, goldEssence, redstoneEssence, lapisEssence, diamondEssence, emeraldEssence};
    }
}
