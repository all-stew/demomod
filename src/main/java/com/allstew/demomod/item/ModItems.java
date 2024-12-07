package com.allstew.demomod.item;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.item.custom.RubyItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DemoMod.MOD_ID);
    public static final DeferredItem<Item> RUBY_ITEM = ITEMS.registerItem("ruby", RubyItem::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
