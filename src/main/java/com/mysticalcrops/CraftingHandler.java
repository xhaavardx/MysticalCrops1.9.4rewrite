package com.mysticalcrops;

import com.mysticalcrops.items.CropItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Sword_Korn on 6/22/2016.
 */
public class CraftingHandler {
    public static void registerRecipe(IRecipe recipe) {
        CraftingManager.getInstance().getRecipeList().add(recipe);
    }

    public static void getRecipes() {
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.coalEssence, 9, 0), Items.COAL));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.redstoneEssence, 9, 0), Items.REDSTONE));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.goldEssence, 9, 0), Blocks.GOLD_ORE));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.ironEssence, 9, 0), Blocks.IRON_ORE));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.lapisEssence, 9, 0), new ItemStack(Items.DYE, 1, 4)));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.diamondEssence, 9, 0), Items.DIAMOND));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.emeraldEssence, 9, 0), Items.EMERALD));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.blazeEssence, 9, 0), Items.BLAZE_ROD));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.enderEssence, 9, 0), Items.ENDER_PEARL));

        if(Loader.isModLoaded("IC2") || Loader.isModLoaded("FunOres")) {
            registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.copperEssence, 9, 0), "ingotCopper"));
            registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.tinEssence, 9, 0), "ingotTin"));
            registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.leadEssence, 9, 0), "ingotLead"));
            registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.silverEssence, 9, 0), "ingotSilver"));
        }

        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.uraniumEssence, 9, 0), "ingotUranium"));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.plutoniumEssence, 9, 0), "ingotPlutonium"));

        registerRecipe(new ShapedOreRecipe(new ItemStack(Items.COAL, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.coalEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Items.REDSTONE, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.redstoneEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Blocks.GOLD_ORE, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.goldEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Blocks.IRON_ORE, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.ironEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Items.DYE, 1, 4), "XXX", "XXX", "XXX", 'X', CropItems.lapisEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Items.DIAMOND, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.diamondEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Items.EMERALD, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.emeraldEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Items.BLAZE_ROD, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.blazeEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Items.ENDER_PEARL, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.enderEssence));

        if(Loader.isModLoaded("IC2") || Loader.isModLoaded("FunOres")) {
            registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.ingotCopper), "XXX", "XXX", "XXX", 'X', CropItems.copperEssence));
            registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.ingotTin), "XXX", "XXX", "XXX", 'X', CropItems.tinEssence));
            registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.ingotLead), "XXX", "XXX", "XXX", 'X', CropItems.leadEssence));
            registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.ingotSilver), "XXX", "XXX", "XXX", 'X', CropItems.silverEssence));
        }

        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.ingotUranium), "XXX", "XXX", "XXX", 'X', CropItems.uraniumEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.ingotPlutonium), "XXX", "XXX", "XXX", 'X', CropItems.plutoniumEssence));

        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.coalCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.coalEssence, 'Y', Items.WHEAT_SEEDS));
        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.redstoneCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.redstoneEssence, 'Y', Items.WHEAT_SEEDS));
        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.goldCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.goldEssence, 'Y', Items.WHEAT_SEEDS));
        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.ironCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.ironEssence, 'Y', Items.WHEAT_SEEDS));
        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.lapisCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.lapisEssence, 'Y', Items.WHEAT_SEEDS));
        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.diamondCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.diamondEssence, 'Y', Items.WHEAT_SEEDS));
        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.emeraldCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.emeraldEssence, 'Y', Items.WHEAT_SEEDS));
        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.blazeCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.blazeEssence, 'Y', Items.WHEAT_SEEDS));
        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.enderCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.enderEssence, 'Y', Items.WHEAT_SEEDS));

        if(Loader.isModLoaded("IC2") || Loader.isModLoaded("FunOres")) {
            registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.copperCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.copperEssence, 'Y', Items.WHEAT_SEEDS));
            registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.tinCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.tinEssence, 'Y', Items.WHEAT_SEEDS));
            registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.leadCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.leadEssence, 'Y', Items.WHEAT_SEEDS));
            registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.silverCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.silverEssence, 'Y', Items.WHEAT_SEEDS));
        }

        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.uraniumCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.uraniumEssence, 'Y', Items.WHEAT_SEEDS));
        registerRecipe(new ShapedOreRecipe(new ItemStack(CropItems.plutoniumCropSeed, 1, 0), " X ", "XYX", " X ", 'X', CropItems.plutoniumEssence, 'Y', Items.WHEAT_SEEDS));
    }
}
