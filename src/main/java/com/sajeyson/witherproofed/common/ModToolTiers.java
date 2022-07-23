package com.sajeyson.witherproofed.common;

import com.sajeyson.witherproofed.ModRegistry;
import com.sajeyson.witherproofed.client.ModFormatting;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ModToolTiers {

    public static final Rarity UNIQUE = Rarity.create("unique", style -> style.applyTo(ModFormatting.SKU_BLUE));
    public static final Tier SOUL_SCORCHED = new Tier() {

        @Override
        public int getUses() {
            return 2500;
        }

        @Override
        public float getSpeed() {
            return 20.0f;
        }

        @Override
        public float getAttackDamageBonus() {
            return 0;
        }

        @Override
        public int getLevel() {
            return 5;
        }

        @Override
        public int getEnchantmentValue() {
            return 16;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ModRegistry.SOUL_SCORCHED_METAL.get());
        }
    };
}
