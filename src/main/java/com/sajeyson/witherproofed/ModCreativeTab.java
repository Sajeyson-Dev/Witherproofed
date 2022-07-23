package com.sajeyson.witherproofed;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {

    public static final CreativeModeTab MOD_CREATIVETAB = new CreativeModeTab(Witherproofed.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModRegistry.REINFORCED_ALLOY.get());
        }
    };
}
