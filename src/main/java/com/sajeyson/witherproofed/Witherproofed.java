package com.sajeyson.witherproofed;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.sajeyson.witherproofed.client.ModRenderTypes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Witherproofed.MOD_ID)
public class Witherproofed {
    public static final String MOD_ID = "witherproofed";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Witherproofed() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModRegistry.ITEMS.register(modEventBus);
        ModRegistry.BLOCKS.register(modEventBus);
        FMLJavaModLoadingContext.get().getModEventBus().register(ModRenderTypes.class);

        if(ModList.get().isLoaded("ctm")) LOGGER.info("CTM Detected!");
    }
}