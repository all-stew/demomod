package com.allstew.demomod.block;

import com.allstew.demomod.DemoMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DemoMod.MOD_ID);
    public static final DeferredHolder<Block, Block> RUBY_BLOCK;

    static {
        RUBY_BLOCK = BLOCKS.register(
            BlockIds.RUBY_BLOCK_ID,
            () -> new Block(
                BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(2F, 1.5F)
            )
        );
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
