package com.sajeyson.witherproofed.common.items.tools;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.common.ModToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class SoulScorchedSword extends SwordItem {

    public SoulScorchedSword() {
        super(ModToolTiers.SOUL_SCORCHED, 11, -2.5f, (new Item.Properties()
                .tab(ModCreativeTab.MOD_CREATIVETAB)
                .fireResistant()
                .rarity(ModToolTiers.UNIQUE)));
    }
}
