package com.sajeyson.witherproofed.client;

import com.sajeyson.witherproofed.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ModRenderTypes {

    @SubscribeEvent
    public static void RenderTypes(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.HEAVY_REINFORCED_GLASS.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.HEAVY_REINFORCED_TRANSLUCENT_GLASS.get(), RenderType.translucent());
    }
}