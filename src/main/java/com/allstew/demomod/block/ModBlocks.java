package com.allstew.demomod.block;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.block.custom.LampBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DemoMod.MOD_ID);
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.registerSimpleBlock(
        BlockIds.RUBY_BLOCK_ID,
        BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
            .requiresCorrectToolForDrops()
            .strength(2F, 1.5F)
    );
    public static final DeferredBlock<Block> LAMP_BLOCK = BLOCKS.registerBlock(
        BlockIds.LAMP_BLOCK_ID,
        LampBlock::new,
        BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
            .strength(2F, 1.5F)
            .lightLevel(state -> state.getValue(LampBlock.LIT) ? 15 : 0)
    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
