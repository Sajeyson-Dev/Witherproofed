package com.sajeyson.witherproofed.common.items.tools;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.common.ModToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;

public class SoulScorchedPickaxe extends PickaxeItem {

    public SoulScorchedPickaxe() {
        super(ModToolTiers.SOUL_SCORCHED, 5, -2.9f, (new Item.Properties()
                .tab(ModCreativeTab.MOD_CREATIVETAB)
                .fireResistant()
                .rarity(ModToolTiers.UNIQUE)));
    }
}
