package com.sajeyson.witherproofed.client;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModTooltips {

    @OnlyIn(Dist.CLIENT)
    public static final TextComponent DEFAULT_BLOCK_TOOLTIP = (TextComponent)
            new TextComponent("Wither cannot destroy this block").withStyle(ChatFormatting.AQUA);
}