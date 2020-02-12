package io.github.sauerkraut.common;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(SauerkrautMod.MODID)
@Mod.EventBusSubscriber(modid = SauerkrautMod.MODID, bus = Bus.MOD)
public class SauerkrautMod {
    public static final String MODID = "sauerkraut";

    public static final Logger LOGGER = LogManager.getLogger();

    public SauerkrautMod() {
        LOGGER.info("sauerkraut mod loading...");
    }

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("common setup");
    }
}
