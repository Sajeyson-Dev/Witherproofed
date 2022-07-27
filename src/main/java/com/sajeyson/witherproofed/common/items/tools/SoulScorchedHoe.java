package com.sajeyson.witherproofed.common.items.tools;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.common.ModItemRarity;
import com.sajeyson.witherproofed.common.ModToolTiers;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

public class SoulScorchedHoe extends HoeItem {

    public SoulScorchedHoe() {
        super(ModToolTiers.SOUL_SCORCHED, 0, 0.0f, (new Item.Properties()
                .tab(ModCreativeTab.MOD_CREATIVETAB)
                .fireResistant()
                .rarity(ModItemRarity.SOUL_SCORCHED_METAL)));
    }
}
