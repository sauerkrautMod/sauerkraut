package io.github.sauerkraut.common.init;

import io.github.sauerkraut.common.SauerkrautMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(SauerkrautMod.MODID)
public class ModBlocks {
    public static final Block COPPER_ORE = null;

    @Mod.EventBusSubscriber(modid = SauerkrautMod.MODID, bus = Bus.MOD)
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            SauerkrautMod.LOGGER.info("penis");

            final IForgeRegistry<Block> registry = event.getRegistry();

            final Block.Properties testProps = Block.Properties.create(Material.ROCK);
            final Block testBlock = new Block(testProps).setRegistryName(SauerkrautMod.MODID, "copper_ore");

            registry.register(testBlock);
        }
    }
}
