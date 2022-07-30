package com.sajeyson.witherproofed.common.items;

import java.util.List;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.client.ModFormatting;
import com.sajeyson.witherproofed.client.ModTooltips;
import com.sajeyson.witherproofed.common.ModToolTiers;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class SoulScorchedMetal extends Item {

    public SoulScorchedMetal() {
        super(new Item.Properties().tab(ModCreativeTab.MOD_CREATIVETAB).rarity(ModToolTiers.UNIQUE).fireResistant());
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
        ModTooltips.buildShiftTooltip(tooltip, "soul_scorched", 2, ModFormatting.ACTUAL_GREEN);
    }
}
