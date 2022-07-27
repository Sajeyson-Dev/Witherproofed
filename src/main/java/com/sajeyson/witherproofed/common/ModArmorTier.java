package com.sajeyson.witherproofed.common;

import com.sajeyson.witherproofed.ModRegistry;
import com.sajeyson.witherproofed.Witherproofed;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorTier {
    public static final String TEXTURE_1 = Witherproofed.MOD_ID + ":textures/models/armor/sculk_metal_layer_1.png";
    public static final String TEXTURE_2 = Witherproofed.MOD_ID + ":textures/models/armor/sculk_metal_layer_2.png";
    public static final ArmorMaterial SCULK = new ArmorMaterial() {

        @Override
        public int getDurabilityForSlot(EquipmentSlot slot) {
            if (slot == EquipmentSlot.HEAD) return 956;
            if (slot == EquipmentSlot.CHEST) return 1100;
            if (slot == EquipmentSlot.LEGS) return 1036;
            if (slot == EquipmentSlot.FEET) return 985;
            return 0;
        }

        @Override
        public int getDefenseForSlot(EquipmentSlot slot) {
            if (slot == EquipmentSlot.HEAD) return 6;
            if (slot == EquipmentSlot.CHEST) return 10;
            if (slot == EquipmentSlot.LEGS) return 8;
            if (slot == EquipmentSlot.FEET) return 5;
            return 0;
        }

        @Override
        public int getEnchantmentValue() {
            return 16;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.NETHERITE_BLOCK_HIT;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ModRegistry.SOUL_SCORCHED_METAL.get());
        }

        @Override
        public String getName() {
            return "sculk_metal";
        }

        @Override
        public float getToughness() {
            return 5.0f;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.3f;
        }
    };
}
