package com.sajeyson.witherproofed.common.items;

import java.util.List;

import javax.annotation.Nullable;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.client.ModFormatting;
import com.sajeyson.witherproofed.client.ModTooltips;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class GhostlyEssence extends Item {
    public GhostlyEssence() {
        super(new Item.Properties().tab(ModCreativeTab.MOD_CREATIVETAB));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        ModTooltips.buildShiftTooltip(tooltip,"essence", ModFormatting.ACTUAL_GREEN);
    }
}
