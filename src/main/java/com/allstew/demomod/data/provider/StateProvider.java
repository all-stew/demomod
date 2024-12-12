package com.allstew.demomod.data.provider;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class StateProvider extends BlockStateProvider {

    public StateProvider(PackOutput gen, ExistingFileHelper helper) {
        super(gen, DemoMod.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlock(ModBlocks.RUBY_BLOCK.get(), this.cubeAll(ModBlocks.RUBY_BLOCK.get()));
        this.simpleBlockItem(ModBlocks.RUBY_BLOCK.get(), this.cubeAll(ModBlocks.RUBY_BLOCK.get()));
    }
}
