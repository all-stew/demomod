package com.allstew.demomod.block;

import com.allstew.demomod.DemoMod;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DemoMod.MOD_ID);
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.registerSimpleBlock(
        "ruby_block"
    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
