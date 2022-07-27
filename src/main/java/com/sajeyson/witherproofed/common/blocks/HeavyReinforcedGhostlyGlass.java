package com.sajeyson.witherproofed.common.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.sajeyson.witherproofed.client.ModFormatting;
import com.sajeyson.witherproofed.client.ModTooltips;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.fml.ModList;

public class HeavyReinforcedGhostlyGlass extends GlassBlock {
    public HeavyReinforcedGhostlyGlass() {
        super(Properties.of(Material.GLASS)
                .noOcclusion()
                .strength(50.0f, 100000.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.GLASS)
                .isViewBlocking(HeavyReinforcedGhostlyGlass::never)
                .isValidSpawn(HeavyReinforcedGhostlyGlass::never)
                .isSuffocating(HeavyReinforcedGhostlyGlass::never));
    }

    private static Boolean never(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return false;
    }

    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        if (context instanceof EntityCollisionContext) {
            EntityCollisionContext collisionContext = (EntityCollisionContext) context;
            return (collisionContext.getEntity() instanceof Player) == isAir(state)? state.getShape(getter, pos) : Shapes.empty();
        }
        return null;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> list, TooltipFlag flag) {
        ModTooltips.buildTooltip(list, "wither_immune", ModFormatting.LIGHT_PURPLE);
        ModTooltips.buildTooltip(list, "player_pass", ModFormatting.ACTUAL_GREEN);
        if (ModList.get().isLoaded("ctm")) ModTooltips.buildTooltip(list, "connected_texture", ChatFormatting.DARK_GRAY);
    }
}
