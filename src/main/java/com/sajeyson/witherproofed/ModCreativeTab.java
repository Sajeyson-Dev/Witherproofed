package com.sajeyson.witherproofed;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {

    public static final CreativeModeTab MOD_CREATIVETAB = new CreativeModeTab("witherproofedCreativeTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GHOSTLY_ESSENCE.get());
        }
    };
}
