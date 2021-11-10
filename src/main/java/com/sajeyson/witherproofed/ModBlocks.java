package com.sajeyson.witherproofed;

import com.sajeyson.witherproofed.client.ModCreativeTab;
import com.sajeyson.witherproofed.common.blocks.HeavyReinforcedGhostlyGlass;
import com.sajeyson.witherproofed.common.blocks.HeavyReinforcedGlass;
import com.sajeyson.witherproofed.common.blocks.HeavyReinforcedObsidian;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
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
                        new Item.Properties().tab(ModCreativeTab.witherproofedCreativeTab).fireResistant()));
        return blockRegistryObject;
    }

    public static final RegistryObject<Block> HEAVY_REINFORCED_OBSIDIAN = blockItemRegister("heavy_reinforced_obsidian", HeavyReinforcedObsidian::new);
    public static final RegistryObject<Block> HEAVY_REINFORCED_GLASS = blockItemRegister("heavy_reinforced_glass", HeavyReinforcedGlass::new);
    public static final RegistryObject<Block> HEAVY_REINFORCED_TRANSLUCENT_GLASS = blockItemRegister("heavy_reinforced_translucent_glass", HeavyReinforcedGlass::new);
    public static final RegistryObject<Block> HEAVY_REINFORCED_GHOSTLY_GLASS = blockItemRegister("heavy_reinforced_ghostly_glass", HeavyReinforcedGhostlyGlass::new);
    public static final RegistryObject<Block> HEAVY_REINFORCED_GHOSTLY_TRANSLUCENT_GLASS = blockItemRegister("heavy_reinforced_ghostly_translucent_glass", HeavyReinforcedGhostlyGlass::new);
}