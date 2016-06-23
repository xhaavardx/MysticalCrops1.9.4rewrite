package com.mysticalcrops.items;

import com.mysticalcrops.MysticalCrops;
import net.minecraft.item.Item;

/**
 * Created by Sword_Korn on 6/23/2016.
 */
public class MysticalCropItem extends Item {
    public MysticalCropItem(String regName) {
        super();
        this.setUnlocalizedName(regName);
        this.setCreativeTab(MysticalCrops.cropsTab);
    }
}
