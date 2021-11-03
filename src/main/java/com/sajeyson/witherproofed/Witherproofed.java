package com.sajeyson.witherproofed;

import com.sajeyson.witherproofed.client.ModRenderTypes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Witherproofed.MOD_ID)
public class Witherproofed {
    public static final String MOD_ID = "witherproofed";
    public static final Logger LOGGER = LogManager.getLogger();

    public Witherproofed() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        FMLJavaModLoadingContext.get().getModEventBus().register(ModRenderTypes.class);
        LOGGER.info("So Heavy!");
        if(ModList.get().isLoaded("ctm")) {
            LOGGER.info("CTM Detected");
        }
    }
}