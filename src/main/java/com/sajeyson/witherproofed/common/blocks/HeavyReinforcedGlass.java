package com.sajeyson.witherproofed.common.blocks;

import com.sajeyson.witherproofed.client.ModTooltips;
import net.minecraft.block.BreakableBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;

public class HeavyReinforcedGlass extends BreakableBlock {
    public HeavyReinforcedGlass() {
        super(Properties.copy(new BreakableBlock(Properties.of(Material.GLASS)
                .noOcclusion()
                .harvestLevel(3)
                .strength(32f)
                .harvestTool(ToolType.PICKAXE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.GLASS))));
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable IBlockReader iBlockReader, List<ITextComponent> tooltip, ITooltipFlag iTooltipFlag) {
        tooltip.add(ModTooltips.DEFAULT_BLOCK_TOOLTIP);
    }
}