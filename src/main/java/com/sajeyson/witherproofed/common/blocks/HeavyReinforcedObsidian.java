package com.sajeyson.witherproofed.common.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.sajeyson.witherproofed.client.ModFormatting;
import com.sajeyson.witherproofed.client.ModTooltips;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class HeavyReinforcedObsidian extends Block {
    public HeavyReinforcedObsidian() {
        super(Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_BLACK)
                .strength(50.0f, 100000.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.NETHERITE_BLOCK));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> tooltip, TooltipFlag flag) {
        ModTooltips.buildTooltip(tooltip, "wither_immune", ModFormatting.LIGHT_PURPLE);
    }
}
