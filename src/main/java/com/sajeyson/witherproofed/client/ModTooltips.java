package com.sajeyson.witherproofed.client;



import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModTooltips {
    static TranslatableComponent buildText(String tooltip, ChatFormatting color) {
        return (TranslatableComponent) new TranslatableComponent("tooltip.witherproofed." + tooltip).withStyle(color);
    }

    public static boolean buildTooltip(List<Component> list, String tooltip, Style color) {
        return list.add(new TranslatableComponent("tooltip.witherproofed." + tooltip).withStyle(color));
    }

    public static boolean buildTooltip(List<Component> list, String tooltip, ChatFormatting color) {
        return list.add(new TranslatableComponent("tooltip.witherproofed." + tooltip).withStyle(color));
    }

    public static boolean buildShiftTooltip(List<Component> list, String tooltip, Style color) {
        if (Screen.hasShiftDown()) {
            return list.add(new TranslatableComponent("tooltip.witherproofed." + tooltip + ".shift").withStyle(color));
        } else {
            return list.add(new TranslatableComponent("tooltip.witherproofed.shift").withStyle(ChatFormatting.DARK_GRAY));
        }
    }

    public static boolean buildShiftTooltip(List<Component> list, String line_1, String line_2, Style color) {
        if (Screen.hasShiftDown()) {
            return list.add(new TranslatableComponent("tooltip.witherproofed." + line_1 + ".shift").withStyle(color))
            && list.add(new TranslatableComponent("tooltip.witherproofed." + line_2 + ".shift").withStyle(color));
        } else {
            return list.add(new TranslatableComponent("tooltip.witherproofed.shift").withStyle(ChatFormatting.DARK_GRAY));
        }
    }
}
