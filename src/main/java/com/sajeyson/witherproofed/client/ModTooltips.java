package com.sajeyson.witherproofed.client;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModTooltips {
    public static final TextComponent DEFAULT_BLOCK_TOOLTIP = (TextComponent)
            new TextComponent("Wither cannot destroy this block").withStyle(ChatFormatting.AQUA);

    public static final TextComponent HAS_CTM_TOOLTIP = (TextComponent)
            new TextComponent("Has connected texture").withStyle(ChatFormatting.GRAY);
}