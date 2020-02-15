package io.github.sauerkraut.common;

import io.github.sauerkraut.common.init.ModBlocks;
import io.github.sauerkraut.common.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(SauerkrautMod.MODID)
public class SauerkrautMod {
    public static final String MODID = "sauerkraut";

    public static final Logger LOGGER = LogManager.getLogger();

    public SauerkrautMod() {
        LOGGER.info("sauerkraut mod loading...");
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modEventBus);
        ModBlocks.ITEMS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }
}
