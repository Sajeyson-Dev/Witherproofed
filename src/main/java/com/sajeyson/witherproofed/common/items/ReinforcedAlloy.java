package com.sajeyson.witherproofed.common.items;

import java.util.List;

import javax.annotation.Nullable;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.ModRegistry;
import com.sajeyson.witherproofed.client.ModFormatting;
import com.sajeyson.witherproofed.client.ModTooltips;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class ReinforcedAlloy extends Item {

    public ReinforcedAlloy() {
        super(new Item.Properties().tab(ModCreativeTab.MOD_CREATIVETAB).fireResistant());
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        ModTooltips.buildTooltip(tooltip, "alloy", ModFormatting.LIGHT_PURPLE);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        var stack = player.getItemInHand(hand);
        var inv = player.getInventory();
        var xp = player.experienceLevel;
        var block = player.getLevel().getBlockState(player.getOnPos().above()).getBlock();
        if (block == Blocks.SOUL_FIRE && xp > 39 && player.displayFireAnimation() && inv.getFreeSlot() != -1 | inv.getSlotWithRemainingSpace(new ItemStack(ModRegistry.SOUL_SCORCHED_METAL.get())) != -1) {
            if (!player.isCreative()) { 
                stack.shrink(1); 
                player.hurt(new DamageSource("soul_scorched.player").bypassArmor().bypassInvul(), 5.0f);
                player.experienceLevel = xp - 40;
            }
            inv.add(new ItemStack(ModRegistry.SOUL_SCORCHED_METAL.get(), 1));
            level.playSound(player, player.getOnPos(), SoundEvents.AXE_SCRAPE, SoundSource.PLAYERS, 10, 2.0f);
            player.getCooldowns().addCooldown(this, 32);
            
        } else { return InteractionResultHolder.fail(stack); }
        return InteractionResultHolder.success(stack);
    }
}
