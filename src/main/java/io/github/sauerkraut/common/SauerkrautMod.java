package io.github.sauerkraut.common;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("sauerkraut")
@Mod.EventBusSubscriber(modid = "sauerkraut", bus = Bus.MOD)
public class SauerkrautMod {
    private static final Logger LOGGER = LogManager.getLogger();

    public SauerkrautMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // MinecraftForge.EVENT_BUS.register(this);
    }

    public void setup(FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}
