package com.sajeyson.witherproofed.common.items;

import java.util.List;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.ModRegistry;
import com.sajeyson.witherproofed.client.ModFormatting;
import com.sajeyson.witherproofed.client.ModTooltips;
import com.sajeyson.witherproofed.common.ModItemRarity;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class SoulScorchedMetal extends Item {

    public SoulScorchedMetal() {
        super(new Item.Properties()
        .tab(ModCreativeTab.MOD_CREATIVETAB)
        .fireResistant()
        .rarity(ModItemRarity.SOUL_SCORCHED_METAL));
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> list, TooltipFlag flag) {
        ModTooltips.buildShiftTooltip(list, "soul_scorched", 2, ModFormatting.ACTUAL_GREEN);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int i, boolean b) {
        if (entity.isAlive()) {
            var player = level.players().iterator().next();
            var inv = player.getInventory();
            var mainHand = player.getMainHandItem();
            var offHand = player.getOffhandItem();
            var ingot = stack.getItem();
            var shard = Items.ECHO_SHARD;
            var result = new ItemStack(ModRegistry.SCULK_METAL.get());
            if (entity == player) {
                if (player.hurtTime > 8 && player.getLastDamageSource().getMsgId() == "sonic_boom") {
                    if (mainHand.getItem() == ingot && offHand.getItem() == shard || mainHand.getItem() == shard && offHand.getItem() == ingot) {
                        if (inv.getFreeSlot() != -1 | inv.getSlotWithRemainingSpace(result) != -1) {
                            mainHand.shrink(1);
                            offHand.shrink(1);
                            inv.add(result);
                            level.playSound(null, player.getOnPos(), SoundEvents.END_PORTAL_SPAWN, SoundSource.PLAYERS, 10, 2.0f);
                        }
                    }
                }
            }
        }
    }
}
