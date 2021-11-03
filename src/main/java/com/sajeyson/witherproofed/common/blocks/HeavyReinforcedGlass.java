package com.sajeyson.witherproofed.common.blocks;

import com.sajeyson.witherproofed.client.ModTooltips;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.ModList;

import javax.annotation.Nullable;
import java.util.List;

public class HeavyReinforcedGlass extends GlassBlock {
    public HeavyReinforcedGlass() {
        super(AbstractBlock.Properties.of(Material.GLASS)
                .noOcclusion()
                .harvestLevel(3)
                .strength(32f)
                .harvestTool(ToolType.PICKAXE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.GLASS)
                .isViewBlocking(HeavyReinforcedGlass::never)
                .isSuffocating(HeavyReinforcedGlass::never)
                .isValidSpawn(HeavyReinforcedGlass::never));
    }

    private static Boolean never(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> type) {
        return false;
    }

    private static boolean never(BlockState state, IBlockReader reader, BlockPos pos) {
        return false;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public float getShadeBrightness(BlockState state, IBlockReader reader, BlockPos pos) {
        return 1.0f;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, @Nullable IBlockReader reader, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.add(ModTooltips.DEFAULT_BLOCK_TOOLTIP);
        if(ModList.get().isLoaded("ctm")) {
            tooltip.add(ModTooltips.HAS_CTM_TOOLTIP);
        }
    }
}