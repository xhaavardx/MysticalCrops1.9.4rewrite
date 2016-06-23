package com.mysticalcrops.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Sword_Korn on 6/13/2016.
 */
public class CropBlocks {
    // Crops
    public static Block coalCrop;
    public static Block redstoneCrop;
    public static Block ironCrop;
    public static Block goldCrop;
    public static Block lapisCrop;
    public static Block diamondCrop;
    public static Block emeraldCrop;
    public static Block copperCrop;
    public static Block tinCrop;
    public static Block leadCrop;
    public static Block silverCrop;
    public static Block uraniumCrop;
    public static Block plutoniumCrop;

    public static void loadCropBlocks() {
        redstoneCrop = registerBlockCrop("redstoneCrop");
        ironCrop = registerBlockCrop("ironCrop");
        goldCrop = registerBlockCrop("goldCrop");
        lapisCrop = registerBlockCrop("lapisCrop");
        diamondCrop = registerBlockCrop("diamondCrop");
        coalCrop = registerBlockCrop("coalCrop");
        emeraldCrop = registerBlockCrop("emeraldCrop");
        copperCrop = registerBlockCrop("copperCrop");
        tinCrop = registerBlockCrop("tinCrop");
        leadCrop = registerBlockCrop("leadCrop");
        silverCrop = registerBlockCrop("silverCrop");
        uraniumCrop = registerBlockCrop("uraniumCrop");
        plutoniumCrop = registerBlockCrop("plutoniumCrop");
    }

    private static Block registerBlockCrop(String regName) {
        final Block MCCrop = new MysticalCropBlock(regName);
        final ItemBlock itemBlock = new ItemBlock(MCCrop);

        return registerBlock(regName, itemBlock, MCCrop);
    }

    private static Block registerBlock(String regName, ItemBlock itemBlock, Block block) {
        block.setRegistryName(regName);
        block.setUnlocalizedName(regName);

        GameRegistry.register(block);

        itemBlock.setRegistryName(regName);
        itemBlock.setUnlocalizedName(regName);
        GameRegistry.register(itemBlock);

        return block;
    }
}
