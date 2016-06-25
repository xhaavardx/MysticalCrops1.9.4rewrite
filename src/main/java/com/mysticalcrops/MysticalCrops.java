package com.mysticalcrops;

import com.mysticalcrops.items.CropItems;
import com.mysticalcrops.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.net.Proxy;

/**
 * Created by Sword_Korn on 6/13/2016.
 */

@Mod(modid = MysticalCrops.MODID, name = MysticalCrops.NAME, version = MysticalCrops.VERSION, dependencies = "before: harvestcraft")
public class MysticalCrops {
    public static final String MODID = "mysticalcrops";
    public static final String NAME = MODID;
    public static final String VERSION = "2.0";

    public static CreativeTabs cropsTab = new CreativeTabs("Mystical Crops") {
        @Override
        public Item getTabIconItem() {
            return CropItems.diamondEssence;
        }
    };

    @SidedProxy(clientSide = "com.mysticalcrops.proxy.ClientProxy", serverSide = "com.mysticalcrops.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        this.proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        this.proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        this.proxy.postInit(e);
        if(Loader.isModLoaded("harvestcraft") == true) {
            System.out.println("Pam detected!!! Telling that bitch to fuck off!!!");
        }else{
            System.out.println("Yeah you better stay out of my mod Pam!!!");
        }
    }
}
