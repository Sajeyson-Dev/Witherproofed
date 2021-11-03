package com.sajeyson.witherproofed.client;

import com.sajeyson.witherproofed.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup witherproofedItemGroup = new ItemGroup("witherproofedItemGroup") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GHOSTLY_ESSENCE.get());
        }
    };
}
