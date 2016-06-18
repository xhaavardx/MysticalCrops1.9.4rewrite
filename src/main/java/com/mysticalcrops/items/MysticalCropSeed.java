package com.mysticalcrops.items;

import com.mysticalcrops.MysticalCrops;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by Sword_Korn on 6/18/2016.
 */
public class MysticalCropSeed extends Item {
    public final String regName;

    public MysticalCropSeed(String regName) {
        super();
        this.regName = regName;
        this.setCreativeTab(MysticalCrops.cropsTab);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
        return super.onItemRightClick(stack, world, player, hand);
    }
}
