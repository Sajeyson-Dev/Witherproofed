package com.sajeyson.witherproofed.common.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.sajeyson.witherproofed.client.ModFormatting;
import com.sajeyson.witherproofed.client.ModTooltips;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.ModList;

public class HeavyReinforcedGlass extends GlassBlock {
    public HeavyReinforcedGlass() {
        super(Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)
                .noOcclusion()
                .strength(50.0f, 100000.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.GLASS)
                .isViewBlocking(HeavyReinforcedGlass::never)
                .isValidSpawn(HeavyReinforcedGlass::never)
                .isSuffocating(HeavyReinforcedGlass::never));
    }

    private static Boolean never(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return false;
    }

    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> tooltip, TooltipFlag flag) {
        ModTooltips.buildTooltip(tooltip, "wither_immune", ModFormatting.LIGHT_PURPLE);
        if (ModList.get().isLoaded("ctm")) ModTooltips.buildTooltip(tooltip, "connected_texture", ChatFormatting.DARK_GRAY);
    }
}