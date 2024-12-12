package com.allstew.demomod.data.provider;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.item.ItemIds;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModelProvider extends ItemModelProvider {

    public ModelProvider(PackOutput gen, ExistingFileHelper helper) {
        super(gen, DemoMod.MOD_ID, helper);
    }

    @Override
    protected void registerModels() {
        this.singleTexture(
            ItemIds.RUBY_ID,
            ResourceLocation.withDefaultNamespace("item/generated"),
            "layer0",
            ResourceLocation.fromNamespaceAndPath(DemoMod.MOD_ID, "item/" + ItemIds.RUBY_ID)
        );
    }
}