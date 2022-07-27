package com.sajeyson.witherproofed.client;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModTooltips {
    public static boolean buildTooltip(List<Component> list, String tooltip, Style color) {
        list.add(Component.translatable("tooltip.witherproofed." + tooltip).withStyle(color));
        return false;
    }

    public static boolean buildTooltip(List<Component> list, String tooltip, ChatFormatting color) {
        list.add(Component.translatable("tooltip.witherproofed." + tooltip).withStyle(color));
        return false;
    }

    public static boolean buildShiftTooltip(List<Component> list, String tooltip, Style color) {
        if (Screen.hasShiftDown()) list.add(Component.translatable("tooltip.witherproofed." + tooltip + ".shift").withStyle(color));
        else list.add(Component.translatable("tooltip.witherproofed.shift").withStyle(ChatFormatting.DARK_GRAY));
        return false;
    }

    public static boolean buildShiftTooltip(List<Component> list, String tooltip, int count, Style color) {
        if (Screen.hasShiftDown()) for (int index = 0; index < count; index++) list.add(Component.translatable("tooltip.witherproofed." + tooltip + ".shift_" + index).withStyle(color));
        else list.add(Component.translatable("tooltip.witherproofed.shift").withStyle(ChatFormatting.DARK_GRAY));
        return false;
    }

    public static boolean buildSetBonusTooltip(List<Component> list, String tooltip, int count, Style color) {
        list.add(Component.translatable("tooltip.witherproofed.fullset").withStyle(ModFormatting.ACTUAL_GREEN).withStyle(ChatFormatting.UNDERLINE));
        for (int index = 0; index < count; index++) { 
            list.add(Component.translatable("tooltip.witherproofed.fullset_" + tooltip + "_" + index).withStyle(color));
        }
        list.add(Component.literal(""));
        return false;
    }
}
