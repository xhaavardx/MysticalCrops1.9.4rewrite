package com.mysticalcrops.items;

import com.mysticalcrops.blocks.CropBlocks;
import com.mysticalcrops.blocks.MysticalCropBlock;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

/**
 * Created by Sword_Korn on 6/13/2016.
 */
public class CropItems {
    public static Item[] MCSeeds;

    public static HashMap<MysticalCropBlock, Item> seedsMap = new HashMap<MysticalCropBlock, Item>();
    public static HashMap<MysticalCropBlock, Item> havestedItemMap = new HashMap<MysticalCropBlock, Item>();

    public static Item redstoneSeedItem = new MysticalCropSeed("redstoneCropSeed");

    public static Item regItem(Item item, String regName) {
        item.setRegistryName(regName);
        item.setUnlocalizedName(regName);

        return GameRegistry.register(item);
    }

    public static Item regSeeds(String regName, Block crop) {
        Item item = new ItemSeeds(crop, Blocks.FARMLAND);

        seedsMap.put((MysticalCropBlock) crop, item);

        return regItem(item, regName);
    }

    public static Item regDrops(String regName, Block crop) {
        Item item = new Item();
        havestedItemMap.put((MysticalCropBlock) crop, item);
        return regItem(item, regName);
    }

    public static void loadItemRegistry() {
        MCSeeds = new Item[] { redstoneSeedItem };
        regItem(redstoneSeedItem, "redstoneCropSeed");
    }
}
