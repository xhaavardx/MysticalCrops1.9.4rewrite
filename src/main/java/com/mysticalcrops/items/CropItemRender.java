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
        reg(CropItems.prismShardCropSeed);
        reg(CropItems.prismCrystalCropSeed);
        reg(CropItems.glowCropSeed);

        if(Loader.isModLoaded("IC2") || Loader.isModLoaded("FunOres")) {
            reg(CropItems.copperCropSeed);
            reg(CropItems.tinCropSeed);
            reg(CropItems.leadCropSeed);
            reg(CropItems.silverCropSeed);
        }

        if(Loader.isModLoaded("FunOres")) {
            reg(CropItems.nickelCropSeed);
            reg(CropItems.platinumCropSeed);
            reg(CropItems.aluminiumCropSeed);
            reg(CropItems.zincCropSeed);
            reg(CropItems.titaniumCropSeed);
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
        reg(CropItems.prismShardEssence);
        reg(CropItems.prismCrystalEssence);
        reg(CropItems.glowEssence);

        if(Loader.isModLoaded("IC2") || Loader.isModLoaded("FunOres")) {
            reg(CropItems.copperEssence);
            reg(CropItems.tinEssence);
            reg(CropItems.leadEssence);
            reg(CropItems.silverEssence);
        }

        if(Loader.isModLoaded("FunOres")) {
            reg(CropItems.nickelEssence);
            reg(CropItems.platinumEssence);
            reg(CropItems.aluminiumEssence);
            reg(CropItems.zincEssence);
            reg(CropItems.titaniumEssence);
        }

        reg(CropItems.uraniumEssence);
        reg(CropItems.plutoniumEssence);

        //Misc renderers
        if(Loader.isModLoaded("IC2") || Loader.isModLoaded("FunOres")) {
            reg(CropItems.ingotCopper);
            reg(CropItems.ingotTin);
            reg(CropItems.ingotLead);
            reg(CropItems.ingotSilver);
        }

        if(Loader.isModLoaded("FunOres")) {
            reg(CropItems.ingotNickel);
            reg(CropItems.ingotPlatinum);
            reg(CropItems.ingotAluminum);
            reg(CropItems.ingotZinc);
            reg(CropItems.ingotTitanium);
        }

        reg(CropItems.ingotUranium);
        reg(CropItems.ingotPlutonium);
    }

    public static void reg(Item item) {
        ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");

        ModelLoader.setCustomModelResourceLocation(item, 0, res);
    }
}
