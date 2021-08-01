package com.sajeyson.witherproofed;

import com.sajeyson.witherproofed.client.ModItemGroup;
import com.sajeyson.witherproofed.common.blocks.HeavyReinforcedGlass;
import com.sajeyson.witherproofed.common.blocks.HeavyReinforcedObsidian;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Witherproofed.MOD_ID);

    public static RegistryObject<Block> blockItemRegistryObject(String block, Supplier<Block> blockSupplier) {
        return BLOCKS.register(block, blockSupplier);
    }

    public static RegistryObject<Block> blockItemRegister(String block, Supplier<Block> blockSupplier) {
        RegistryObject<Block> blockRegistryObject = blockItemRegistryObject(block, blockSupplier);
        ModItems.ITEMS.register(block, ()->
                new BlockItem(blockRegistryObject.get(),
                        new Item.Properties().tab(ModItemGroup.witherproofedItemGroup).fireResistant()));
        return blockRegistryObject;
    }

    public static final RegistryObject<Block> HEAVY_REINFORCED_OBSIDIAN = blockItemRegister("heavy_reinforced_obsidian", HeavyReinforcedObsidian::new);
    public static final RegistryObject<Block> HEAVY_REINFORCED_GLASS = blockItemRegister("heavy_reinforced_glass", HeavyReinforcedGlass::new);
    public static final RegistryObject<Block> HEAVY_REINFORCED_TRANSLUCENT_GLASS = blockItemRegister("heavy_reinforced_translucent_glass", HeavyReinforcedGlass::new);
}