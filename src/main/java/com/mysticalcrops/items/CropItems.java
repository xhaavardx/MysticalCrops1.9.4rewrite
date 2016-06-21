package com.mysticalcrops.items;

import com.mysticalcrops.blocks.CropBlocks;
import com.mysticalcrops.blocks.MysticalCropBlock;
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

    public static Item redstoneSeedItem = new MysticalCropSeed(CropBlocks.redstoneCrop, Blocks.FARMLAND, "redstoneCropSeed");

    public static Item regItem(Item item, String regName) {
        item.setRegistryName(regName);
        item.setUnlocalizedName(regName);

        return GameRegistry.register(item);
    }

    public static void loadItemRegistry() {
        regItem(redstoneSeedItem, "redstoneCropSeed");

        MCSeeds = new Item[] {redstoneSeedItem};
        MCDrops = new Item[] {Items.REDSTONE};
    }
}
