package com.allstew.demomod.data.provider;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.block.ModBlocks;
import com.allstew.demomod.block.custom.LampBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class StateProvider extends BlockStateProvider {

    public StateProvider(PackOutput gen, ExistingFileHelper helper) {
        super(gen, DemoMod.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlockWithItem(ModBlocks.RUBY_BLOCK.get(), this.cubeAll(ModBlocks.RUBY_BLOCK.get()));
        propertyBlock(ModBlocks.LAMP_BLOCK.get());
    }

    public void propertyBlock(Block block) {
        var block_off = models().cubeAll("lamp_off",
            ResourceLocation.fromNamespaceAndPath(DemoMod.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + "lamp_off"));
        var block_on = models().cubeAll("lamp_on",
            ResourceLocation.fromNamespaceAndPath(DemoMod.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + "lamp_on"));
        getVariantBuilder(block).partialState().with(LampBlock.LIT, true)
            .modelForState().modelFile(block_on).addModel()
            .partialState().with(LampBlock.LIT, false)
            .modelForState().modelFile(block_off).addModel();
        simpleBlockItem(block, block_off);
    }
}
