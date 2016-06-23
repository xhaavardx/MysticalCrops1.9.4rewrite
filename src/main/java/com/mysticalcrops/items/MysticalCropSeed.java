package com.mysticalcrops.items;

import com.mysticalcrops.MysticalCrops;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

/**
 * Created by Sword_Korn on 6/18/2016.
 */
public class MysticalCropSeed extends ItemSeeds {

    public MysticalCropSeed(Block crops, Block soil, String regName) {
        super(crops, soil);
        this.setUnlocalizedName(regName);
        this.setCreativeTab(MysticalCrops.cropsTab);
    }
}
