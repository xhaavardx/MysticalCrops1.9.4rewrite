package com.mysticalcrops.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Sword_Korn on 6/21/2016.
 */
public class CropItemRender {

    public static void regItemRender() {
        //Seed renderers
        reg(CropItems.redstoneCropSeed);
        reg(CropItems.ironCropSeed);
        reg(CropItems.goldCropSeed);
        reg(CropItems.lapisCropSeed);
        reg(CropItems.diamondCropSeed);
        reg(CropItems.coalCropSeed);

        //Drop renderers
        reg(CropItems.redstoneEssence);
        reg(CropItems.ironEssence);
        reg(CropItems.goldEssence);
        reg(CropItems.lapisEssence);
        reg(CropItems.diamondEssence);
        reg(CropItems.coalEssence);
    }

    public static void reg(Item item) {
        ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");

        ModelLoader.setCustomModelResourceLocation(item, 0, res);
    }
}
