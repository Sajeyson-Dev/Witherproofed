package com.sajeyson.witherproofed.client;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModTooltips {

    @OnlyIn(Dist.CLIENT)
    public static final StringTextComponent DEFAULT_BLOCK_TOOLTIP = (StringTextComponent)
            new StringTextComponent("Wither cannot destroy this block").withStyle(TextFormatting.AQUA);
}