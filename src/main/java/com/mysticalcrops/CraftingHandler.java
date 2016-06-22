package com.mysticalcrops;

import com.mysticalcrops.items.CropItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
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
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.redstoneEssence, 9, 0), Items.REDSTONE));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.goldEssence, 9, 0), Blocks.GOLD_ORE));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.ironEssence, 9, 0), Blocks.IRON_ORE));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.lapisEssence, 9, 0), new ItemStack(Items.DYE, 1, 4)));
        registerRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.diamondEssence, 9, 0), Items.DIAMOND));

        registerRecipe(new ShapedOreRecipe(new ItemStack(Items.REDSTONE, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.redstoneEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Blocks.GOLD_ORE, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.goldEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Blocks.IRON_ORE, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.ironEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Items.DYE, 1, 4), "XXX", "XXX", "XXX", 'X', CropItems.lapisEssence));
        registerRecipe(new ShapedOreRecipe(new ItemStack(Items.DIAMOND, 1, 0), "XXX", "XXX", "XXX", 'X', CropItems.diamondEssence));
    }
}
