package com.sajeyson.witherproofed.common.items;

import java.util.List;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.client.ModFormatting;
import com.sajeyson.witherproofed.client.ModTooltips;
import com.sajeyson.witherproofed.common.ModItemRarity;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class SculkMetal extends Item {

    public SculkMetal() {
        super(new Item.Properties()
        .tab(ModCreativeTab.MOD_CREATIVETAB)
        .fireResistant()
        .rarity(ModItemRarity.SCULK_METAL));
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> list, TooltipFlag flag) {
        ModTooltips.buildShiftTooltip(list, "sculk_metal", ModFormatting.ACTUAL_GREEN);
    }
}
