package com.allstew.demomod.item;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DemoMod.MOD_ID);
    public static final DeferredItem<Item> RUBY_ITEM = ITEMS.registerSimpleItem("ruby");
    public static final DeferredItem<BlockItem> RUBY_BLOCK = ITEMS.registerSimpleBlockItem(
        "ruby_block",
        ModBlocks.RUBY_BLOCK
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
