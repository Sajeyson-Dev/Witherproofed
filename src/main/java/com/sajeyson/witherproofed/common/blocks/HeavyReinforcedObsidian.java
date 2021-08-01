package com.sajeyson.witherproofed.common.blocks;

import com.sajeyson.witherproofed.client.ModTooltips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;

public class HeavyReinforcedObsidian extends Block {

    public HeavyReinforcedObsidian() {
        super(Properties.copy(new Block(Properties.of(Material.HEAVY_METAL)
                .harvestLevel(3)
                .strength(32f)
                .harvestTool(ToolType.PICKAXE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.NETHERITE_BLOCK))));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable BlockGetter blockGetter, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(ModTooltips.DEFAULT_BLOCK_TOOLTIP);
    }
}
