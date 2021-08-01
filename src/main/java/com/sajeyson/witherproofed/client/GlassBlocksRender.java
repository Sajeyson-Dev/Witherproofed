package com.sajeyson.witherproofed.client;

import com.sajeyson.witherproofed.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class GlassBlocksRender {

    @SubscribeEvent
    public static void GlassRender(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HEAVY_REINFORCED_GLASS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HEAVY_REINFORCED_TRANSLUCENT_GLASS.get(), RenderType.translucent());
    }
}
