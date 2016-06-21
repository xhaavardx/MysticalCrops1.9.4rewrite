package com.mysticalcrops.items;

import com.mysticalcrops.MysticalCrops;
import com.mysticalcrops.blocks.CropBlocks;
import com.mysticalcrops.blocks.MysticalCropBlock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
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

    public static Item redstoneCropSeed;

    public static Item regItem(Item item, String regName) {
        item.setRegistryName(regName);
        item.setUnlocalizedName(regName);

        return GameRegistry.register(item);
    }

    public static Item regSeeds(String regName, Block crop) {
        Item item = new MysticalCropSeed(crop, Blocks.FARMLAND, regName);

        seedsMap.put((MysticalCropBlock) crop, item);

        return regItem(item, regName);
    }

    public static Item regDrops(Item item, Block crop) {
        return harvestedItemMap.put((MysticalCropBlock) crop, item);
    }

    public static void loadItemRegistry() {
        regSeeds("redstoneCropSeed", CropBlocks.redstoneCrop);
        regDrops(Items.REDSTONE, CropBlocks.redstoneCrop);

        MCSeeds = new Item[] {redstoneCropSeed};
        MCDrops = new Item[] {Items.REDSTONE};
    }
}
