package com.sajeyson.witherproofed.client;

import com.sajeyson.witherproofed.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ModRenderTypes {

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void RenderTypes(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HEAVY_REINFORCED_GLASS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HEAVY_REINFORCED_TRANSLUCENT_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HEAVY_REINFORCED_GHOSTLY_GLASS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HEAVY_REINFORCED_GHOSTLY_TRANSLUCENT_GLASS.get(), RenderType.translucent());
    }
}
