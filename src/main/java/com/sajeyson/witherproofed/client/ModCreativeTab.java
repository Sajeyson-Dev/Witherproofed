package com.sajeyson.witherproofed.client;

import com.sajeyson.witherproofed.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {

    public static final CreativeModeTab witherproofedCreativeTab = new CreativeModeTab("witherproofedCreativeTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REINFORCED_ALLOY.get());
        }
    };
}
