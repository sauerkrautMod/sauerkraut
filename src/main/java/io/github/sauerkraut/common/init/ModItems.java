package io.github.sauerkraut.common.init;

import io.github.sauerkraut.common.SauerkrautMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SauerkrautMod.MODID);

    public static final RegistryObject<Item> ITEM_SAUERKRAUT = ITEMS.register("sauerkraut",() -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> ITEM_POINTY_CABBAGE = ITEMS.register("pointy_cabbage",() -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

}