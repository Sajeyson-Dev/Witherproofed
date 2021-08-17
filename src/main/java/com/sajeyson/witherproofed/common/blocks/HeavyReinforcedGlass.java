package com.sajeyson.witherproofed.common.blocks;

import com.sajeyson.witherproofed.client.ModTooltips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import javax.annotation.Nullable;
import java.util.List;

public class HeavyReinforcedGlass extends GlassBlock {
    public HeavyReinforcedGlass() {
        super(Properties.copy(new Block(Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)
                .noOcclusion()
                .strength(50.0f, 5000.0f)
                .explosionResistance(100000.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.GLASS))));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable BlockGetter blockGetter, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(ModTooltips.DEFAULT_BLOCK_TOOLTIP);
    }
}
