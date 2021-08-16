package com.sajeyson.witherproofed.common.items;

import com.sajeyson.witherproofed.client.ModCreativeTab;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ReinforcedAlloy extends Item {

    public ReinforcedAlloy() {
        super(new Item.Properties().tab(ModCreativeTab.witherproofedCreativeTab).fireResistant());
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level p_41422_, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(new TextComponent("So tough...").withStyle(ChatFormatting.AQUA));
    }
}