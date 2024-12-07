package com.allstew.demomod.item;

import com.allstew.demomod.DemoMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTab {

    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(
        Registries.CREATIVE_MODE_TAB,
        DemoMod.MOD_ID
    );

    private static final String DEMO_MOD_TAB_KEY = "creativetab." + DemoMod.MOD_ID;

    private static final DeferredHolder<CreativeModeTab, CreativeModeTab> DEMO_MOD_TAB = CREATIVE_MODE_TABS.register(
        "demo_mod_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable(DEMO_MOD_TAB_KEY))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.RUBY_ITEM.get().getDefaultInstance()).displayItems((parameters, output) -> {
                output.accept(ModItems.RUBY_ITEM.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
