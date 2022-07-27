package com.sajeyson.witherproofed.client;

import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;

public class ModFormatting {

    private static Style newColor(String color) {
        return Style.EMPTY.withColor(TextColor.parseColor(color));
    }

    public static final Style SKU_BLUE = newColor("#00bfff");
    public static final Style LIGHT_PURPLE = newColor("#9494b8");
    public static final Style ACTUAL_GREEN = newColor("#00b36b");
    public static final Style LIGHT_BLUE = newColor("#2f90d4");
    public static final Style DESATURATED_TEAL = newColor("#5c8685");
}
