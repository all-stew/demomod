package com.allstew.demomod.item;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.block.BlockIds;
import com.allstew.demomod.block.ModBlocks;
import com.allstew.demomod.item.custom.RubyApple;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Items;

public class ModItems {

    public static final Items ITEMS = DeferredRegister.createItems(DemoMod.MOD_ID);
    public static final DeferredItem<Item> RUBY_ITEM;
    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM;
    public static final DeferredItem<BlockItem> LAMP_BLOCK_ITEM;
    public static final DeferredItem<Item> MAGIC_INGOT_ITEM;
    public static final DeferredItem<Item> RUBY_APPLE_ITEM;

    static {
        RUBY_ITEM        = ITEMS.registerSimpleItem(ItemIds.RUBY_ID);
        RUBY_BLOCK_ITEM  = ITEMS.registerSimpleBlockItem(
            BlockIds.RUBY_BLOCK_ID,
            ModBlocks.RUBY_BLOCK
        );
        LAMP_BLOCK_ITEM  = ITEMS.registerSimpleBlockItem(
            BlockIds.LAMP_BLOCK_ID,
            ModBlocks.LAMP_BLOCK
        );
        MAGIC_INGOT_ITEM = ITEMS.registerSimpleItem(
            ItemIds.MAGIC_INGOT_ID,
            new Item.Properties()
        );
        RUBY_APPLE_ITEM = ITEMS.register(
            ItemIds.RUBY_APPLE_ID,
            RubyApple::new
        );
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
