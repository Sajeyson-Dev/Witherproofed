package com.sajeyson.witherproofed;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup MOD_ITEMGROUP = new ItemGroup("witherproofedItemGroup") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GHOSTLY_ESSENCE.get());
        }
    };
}
