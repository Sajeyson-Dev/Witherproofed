package com.sajeyson.witherproofed.common;

import com.sajeyson.witherproofed.client.ModFormatting;

import net.minecraft.world.item.Rarity;

public class ModItemRarity {
    public static final Rarity SOUL_SCORCHED_METAL = Rarity.create("unique", style -> style.applyTo(ModFormatting.SKU_BLUE));
    public static final Rarity SCULK_METAL = Rarity.create("sculk", style -> style.applyTo(ModFormatting.DESATURATED_TEAL));
}
