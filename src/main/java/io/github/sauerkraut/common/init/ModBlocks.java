package io.github.sauerkraut.common.init;

import io.github.sauerkraut.common.SauerkrautMod;
import io.github.sauerkraut.common.block.ModConveyorStraightBlock;
import io.github.sauerkraut.common.block.ModCropsBlock;
import io.github.sauerkraut.common.block.ModOreBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SauerkrautMod.MODID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SauerkrautMod.MODID);

    // Ore Blocks
    private static final Block.Properties PROPS_BLOCK_ORE = Block.Properties.create(Material.ROCK).hardnessAndResistance(3).harvestTool(ToolType.PICKAXE).harvestLevel(2);
    public static final RegistryObject<Block> BLOCK_COPPER_ORE = BLOCKS.register("copper_ore", () -> new ModOreBlock(PROPS_BLOCK_ORE, 0, 0));

    // Plant Blocks
    private static final Block.Properties PROPS_BLOCK_PLANT = Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.CROP);
    public static final RegistryObject<Block> BLOCK_POINTY_CABBAGE = BLOCKS.register( "pointy_cabbage", () -> new ModCropsBlock(PROPS_BLOCK_PLANT));

    // Machine Blocks
    private static final Block.Properties PROPS_BLOCK_MACHINE = Block.Properties.create(Material.IRON);
    public static final RegistryObject<Block> BLOCK_CONVEYOR_STRAIGHT = BLOCKS.register("conveyor_straight", () -> new ModConveyorStraightBlock(PROPS_BLOCK_MACHINE));

    private static final Item.Properties PROPS_ITEM_DEFAULT = new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP);

    // Ore BlockItems
    public static final RegistryObject<Item> ITEM_COPPER_ORE = ITEMS.register("copper_ore", BLOCK_COPPER_ORE.lazyMap(block -> new BlockItem(block, PROPS_ITEM_DEFAULT)));

    // Plant BlockItems
    public static final RegistryObject<Item> ITEM_POINTY_CABBAGE_BLOCK = ITEMS.register("pointy_cabbage_block", BLOCK_POINTY_CABBAGE.lazyMap(block -> new BlockItem(block, PROPS_ITEM_DEFAULT)));
}
