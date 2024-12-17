package com.allstew.demomod;

import com.allstew.demomod.block.ModBlocks;
import com.allstew.demomod.creativetab.ModCreativeTab;
import com.allstew.demomod.data.DataGenerator;
import com.allstew.demomod.item.ModItems;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(DemoMod.MOD_ID)
public class DemoMod {

    public static final String MOD_ID = "demo_mod";

    private static final Logger LOGGER = LogUtils.getLogger();

    public DemoMod(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTab.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(DataGenerator::onGatherData);
    }


    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Hello from DemoMod!");
    }

    @SubscribeEvent
    public void onServerStartingEvent(ServerStartingEvent event) {

    }

}
