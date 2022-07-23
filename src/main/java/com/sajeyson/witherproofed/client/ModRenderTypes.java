package com.sajeyson.witherproofed.client;

import com.sajeyson.witherproofed.ModRegistry;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ModRenderTypes {

    @SubscribeEvent
    public static void RenderTypes(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModRegistry.HEAVY_REINFORCED_GLASS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModRegistry.HEAVY_REINFORCED_TINTED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModRegistry.HEAVY_REINFORCED_GHOSTLY_GLASS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModRegistry.HEAVY_REINFORCED_GHOSTLY_TINTED_GLASS.get(), RenderType.translucent());
    }
}
