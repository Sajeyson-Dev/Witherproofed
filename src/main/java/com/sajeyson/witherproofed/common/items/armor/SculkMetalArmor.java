package com.sajeyson.witherproofed.common.items.armor;


import java.util.List;

import javax.annotation.Nullable;

import com.sajeyson.witherproofed.ModCreativeTab;
import com.sajeyson.witherproofed.ModRegistry;
import com.sajeyson.witherproofed.client.ModFormatting;
import com.sajeyson.witherproofed.client.ModTooltips;
import com.sajeyson.witherproofed.common.ModArmorTier;
import com.sajeyson.witherproofed.common.ModItemRarity;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class SculkMetalArmor extends ArmorItem {
    public SculkMetalArmor(EquipmentSlot slot) {
        super(ModArmorTier.SCULK, slot, new Item.Properties()
        .tab(ModCreativeTab.MOD_CREATIVETAB)
        .fireResistant()
        .rarity(ModItemRarity.SCULK_METAL));
    }

    @Override
    public void appendHoverText(ItemStack ItemStack, Level level, List<Component> list, TooltipFlag flag) {
        ModTooltips.buildSetBonusTooltip(list, "sculk_armor", 2, ModFormatting.LIGHT_BLUE);
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if (slot == EquipmentSlot.HEAD) return ModArmorTier.TEXTURE_1;
        if (slot == EquipmentSlot.CHEST) return ModArmorTier.TEXTURE_1;
        if (slot == EquipmentSlot.LEGS) return ModArmorTier.TEXTURE_2;
        if (slot == EquipmentSlot.FEET) return ModArmorTier.TEXTURE_1;
        return null;
    }

    int tick = 1;
    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int i, boolean b) {
        if (entity.isAlive()) {
            var player = level.players().iterator().next();
            var slot = player.getInventory().armor;
            if (slot.get(3).getItem() == ModRegistry.SCULK_METAL_HELMET.get() &&
                slot.get(2).getItem() == ModRegistry.SCULK_METAL_CHEST.get() &&
                slot.get(1).getItem() == ModRegistry.SCULK_METAL_LEGS.get() &&
                slot.get(0).getItem() == ModRegistry.SCULK_METAL_BOOTS.get()) {
                player.clearFire();
                if (player.getFoodData().getFoodLevel() <= 6) {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 1, false, false), entity);
                }
            }
        }
    }
}
