package com.sajeyson.witherproofed;

import com.sajeyson.witherproofed.common.items.ReinforcedAlloy;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Witherproofed.MOD_ID);

    public static final RegistryObject<Item> REINFORCED_ALLOY = ITEMS.register("reinforced_alloy", ReinforcedAlloy::new);
}