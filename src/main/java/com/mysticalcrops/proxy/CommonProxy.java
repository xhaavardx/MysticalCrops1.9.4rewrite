package com.mysticalcrops.proxy;

import com.mysticalcrops.blocks.CropBlocks;
import com.mysticalcrops.items.CropItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Sword_Korn on 6/13/2016.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        CropItems.loadItemRegistry();
    }

    public void init(FMLInitializationEvent e) {
        CropBlocks.loadCropBlocks();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
