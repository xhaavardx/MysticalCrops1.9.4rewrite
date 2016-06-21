package com.mysticalcrops.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Sword_Korn on 6/21/2016.
 */
public class CropItemRender {

    public static void regItemRender() {
        reg(CropItems.redstoneCropSeed);
    }

    public static void reg(final Item item) {
        final String resName = item.getRegistryName().toString();

        final ModelResourceLocation res = new ModelResourceLocation(resName, "inventory");

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, res);
    }
}
