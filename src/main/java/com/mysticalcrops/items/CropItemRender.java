package com.mysticalcrops.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;

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
        reg(CropItems.emeraldCropSeed);
        reg(CropItems.blazeCropSeed);
        reg(CropItems.enderCropSeed);

        if(Loader.isModLoaded("IC2")) {
            reg(CropItems.copperCropSeed);
            reg(CropItems.tinCropSeed);
            reg(CropItems.leadCropSeed);
            reg(CropItems.silverCropSeed);
        }

        reg(CropItems.uraniumCropSeed);
        reg(CropItems.plutoniumCropSeed);

        //Drop renderers
        reg(CropItems.redstoneEssence);
        reg(CropItems.ironEssence);
        reg(CropItems.goldEssence);
        reg(CropItems.lapisEssence);
        reg(CropItems.diamondEssence);
        reg(CropItems.coalEssence);
        reg(CropItems.emeraldEssence);
        reg(CropItems.blazeEssence);
        reg(CropItems.enderEssence);

        if(Loader.isModLoaded("IC2")) {
            reg(CropItems.copperEssence);
            reg(CropItems.tinEssence);
            reg(CropItems.leadEssence);
            reg(CropItems.silverEssence);
        }

        reg(CropItems.uraniumEssence);
        reg(CropItems.plutoniumEssence);

        //Misc renderers
        if(Loader.isModLoaded("IC2")) {
            reg(CropItems.ingotCopper);
            reg(CropItems.ingotTin);
            reg(CropItems.ingotLead);
            reg(CropItems.ingotSilver);
        }

        reg(CropItems.ingotUranium);
        reg(CropItems.ingotPlutonium);
    }

    public static void reg(Item item) {
        ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");

        ModelLoader.setCustomModelResourceLocation(item, 0, res);
    }
}
