package io.github.sauerkraut.common.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class ModItemGroups {
    public static final ItemGroup MOD_ITEM_GROUP = new ItemGroup("sauerkraut") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.ITEM_COPPER_ORE.get());
        }
    };
}
