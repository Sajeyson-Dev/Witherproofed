package com.sajeyson.witherproofed.common.items;

import java.util.List;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.client.ModFormatting;
import com.sajeyson.witherproofed.client.ModTooltips;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class WitheredPowder extends Item {
    public WitheredPowder() {
        super(new Item.Properties().tab(ModCreativeTab.MOD_CREATIVETAB));
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
        ModTooltips.buildShiftTooltip(tooltip, "withered_powder", ModFormatting.ACTUAL_GREEN);
    }
}
