package com.sajeyson.witherproofed.client;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModTooltips {

    public static final StringTextComponent DEFAULT_BLOCK_TOOLTIP = (StringTextComponent)
            new StringTextComponent("Wither cannot destroy this block").withStyle(TextFormatting.AQUA);

    public static final StringTextComponent HAS_CTM_TOOLTIP = (StringTextComponent)
            new StringTextComponent("Has connected texture").withStyle(TextFormatting.GRAY);
}