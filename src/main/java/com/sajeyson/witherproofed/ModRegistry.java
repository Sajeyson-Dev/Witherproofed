package com.sajeyson.witherproofed;

import java.util.function.Supplier;

import com.sajeyson.witherproofed.common.blocks.HeavyReinforcedGhostlyGlass;
import com.sajeyson.witherproofed.common.blocks.HeavyReinforcedGhostlyTintedGlass;
import com.sajeyson.witherproofed.common.blocks.HeavyReinforcedGlass;
import com.sajeyson.witherproofed.common.blocks.HeavyReinforcedObsidian;
import com.sajeyson.witherproofed.common.blocks.HeavyReinforcedTintedGlass;
import com.sajeyson.witherproofed.common.items.GhostlyEssence;
import com.sajeyson.witherproofed.common.items.ReinforcedAlloy;
import com.sajeyson.witherproofed.common.items.ReinforcedCompound;
import com.sajeyson.witherproofed.common.items.SoulScorchedMetal;
import com.sajeyson.witherproofed.common.items.WitheredPowder;
import com.sajeyson.witherproofed.common.items.tools.SoulScorchedAxe;
import com.sajeyson.witherproofed.common.items.tools.SoulScorchedHoe;
import com.sajeyson.witherproofed.common.items.tools.SoulScorchedPickaxe;
import com.sajeyson.witherproofed.common.items.tools.SoulScorchedShovel;
import com.sajeyson.witherproofed.common.items.tools.SoulScorchedSword;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Witherproofed.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Witherproofed.MOD_ID);

    public static RegistryObject<Block> blockItemRegister(String block, Supplier<Block> blockSupplier) {
        RegistryObject<Block> blockRegistryObject = BLOCKS.register(block, blockSupplier);
        ITEMS.register(block, ()-> new BlockItem(blockRegistryObject.get(), new Item.Properties().tab(ModCreativeTab.MOD_CREATIVETAB).fireResistant()));
        return blockRegistryObject;
    }

    /* 
     * Items
     */
    
    public static final RegistryObject<Item> REINFORCED_ALLOY = ITEMS.register("reinforced_alloy", ReinforcedAlloy::new);
    public static final RegistryObject<Item> GHOSTLY_ESSENCE = ITEMS.register("ghostly_essence", GhostlyEssence::new);
    public static final RegistryObject<Item> REINFORCED_COMPOUND = ITEMS.register("reinforced_compound", ReinforcedCompound::new);
    public static final RegistryObject<Item> SOUL_SCORCHED_METAL = ITEMS.register("soul_scorched_metal", SoulScorchedMetal::new);
    public static final RegistryObject<Item> WITHERED_POWDER = ITEMS.register("withered_powder", WitheredPowder::new);

    public static final RegistryObject<Item> SOUL_SCORCHED_SWORD = ITEMS.register("soul_scorched_sword", SoulScorchedSword::new);
    public static final RegistryObject<Item> SOUL_SCORCHED_PICK = ITEMS.register("soul_scorched_pickaxe", SoulScorchedPickaxe::new);
    public static final RegistryObject<Item> SOUL_SCORCHED_AXE = ITEMS.register("soul_scorched_axe", SoulScorchedAxe::new);
    public static final RegistryObject<Item> SOUL_SCORCHED_SHOVEL = ITEMS.register("soul_scorched_shovel", SoulScorchedShovel::new);
    public static final RegistryObject<Item> SOUL_SCORCHED_HOE = ITEMS.register("soul_scorched_hoe", SoulScorchedHoe::new);

    /* 
     * Blocks
     */

    public static final RegistryObject<Block> HEAVY_REINFORCED_OBSIDIAN = blockItemRegister("heavy_reinforced_obsidian", HeavyReinforcedObsidian::new);
    public static final RegistryObject<Block> HEAVY_REINFORCED_GLASS = blockItemRegister("heavy_reinforced_glass", HeavyReinforcedGlass::new);
    public static final RegistryObject<Block> HEAVY_REINFORCED_TINTED_GLASS = blockItemRegister("heavy_reinforced_translucent_glass", HeavyReinforcedTintedGlass::new);
    public static final RegistryObject<Block> HEAVY_REINFORCED_GHOSTLY_GLASS = blockItemRegister("heavy_reinforced_ghostly_glass", HeavyReinforcedGhostlyGlass::new);
    public static final RegistryObject<Block> HEAVY_REINFORCED_GHOSTLY_TINTED_GLASS = blockItemRegister("heavy_reinforced_ghostly_translucent_glass", HeavyReinforcedGhostlyTintedGlass::new);
}