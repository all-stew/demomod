package com.allstew.demomod.item;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.block.BlockIds;
import com.allstew.demomod.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Items;

public class ModItems {

    public static final Items ITEMS = DeferredRegister.createItems(DemoMod.MOD_ID);
    public static final DeferredHolder<Item, Item> RUBY_ITEM;
    public static final DeferredHolder<Item, BlockItem> RUBY_BLOCK_ITEM;

    static {
        RUBY_ITEM       = ITEMS.register(
            ItemIds.RUBY_ID,
            () -> new Item(new Item.Properties())
        );
        RUBY_BLOCK_ITEM = ITEMS.register(
            BlockIds.RUBY_BLOCK_ID,
            () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties())
        );
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
