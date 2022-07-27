package com.sajeyson.witherproofed.common.items.tools;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.common.ModItemRarity;
import com.sajeyson.witherproofed.common.ModToolTiers;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class SoulScorchedAxe extends AxeItem {

    public SoulScorchedAxe() {
        super(ModToolTiers.SOUL_SCORCHED, 14, -3.4f, (new Item.Properties()
                .tab(ModCreativeTab.MOD_CREATIVETAB)
                .fireResistant()
                .rarity(ModItemRarity.SOUL_SCORCHED_METAL)));
    }
}
