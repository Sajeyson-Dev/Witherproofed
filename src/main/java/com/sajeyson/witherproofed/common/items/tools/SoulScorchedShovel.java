package com.sajeyson.witherproofed.common.items.tools;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.common.ModToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;

public class SoulScorchedShovel extends ShovelItem {

    public SoulScorchedShovel() {
        super(ModToolTiers.SOUL_SCORCHED, 5.5f, -3.1f, (new Item.Properties()
                .tab(ModCreativeTab.MOD_CREATIVETAB)
                .fireResistant()
                .rarity(ModToolTiers.UNIQUE)));
    }
}
