package io.github.sauerkraut.common.init;

import io.github.sauerkraut.common.SauerkrautMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SauerkrautMod.MODID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SauerkrautMod.MODID);

    public static final RegistryObject<Block> BLOCK_COPPER_ORE = BLOCKS.register("copper_ore", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Item> ITEM_COPPER_ORE = ITEMS.register("copper_ore", BLOCK_COPPER_ORE.lazyMap(block -> new BlockItem(block, new Item.Properties())));
}
