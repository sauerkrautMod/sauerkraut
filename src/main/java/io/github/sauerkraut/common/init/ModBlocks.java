package io.github.sauerkraut.common.init;

import io.github.sauerkraut.common.SauerkrautMod;
import io.github.sauerkraut.common.block.ModCropsBlock;
import io.github.sauerkraut.common.block.ModOreBlock;
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

    private static final Block.Properties BLOCK_PROPS_ORE = Block.Properties.create(Material.ROCK).hardnessAndResistance(3);
    public static final RegistryObject<Block> BLOCK_COPPER_ORE = BLOCKS.register("copper_ore", () -> new ModOreBlock(BLOCK_PROPS_ORE, 0, 0));
    public static final RegistryObject<Block> BLOCK_POINTY_CABBAGE = BLOCKS.register( "pointy_cabbage", () -> new ModCropsBlock(BLOCK_PROPS_ORE));

    private static final Item.Properties ITEM_PROPS_DEFAULT = new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP);
    public static final RegistryObject<Item> ITEM_COPPER_ORE = ITEMS.register("copper_ore", BLOCK_COPPER_ORE.lazyMap(block -> new BlockItem(block, ITEM_PROPS_DEFAULT)));
    public static final RegistryObject<Item> ITEM_POINTY_CABBAGE_BLOCK = ITEMS.register("pointy_cabbage_block", BLOCK_POINTY_CABBAGE.lazyMap(block -> new BlockItem(block, ITEM_PROPS_DEFAULT)));
}
