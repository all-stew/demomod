package com.allstew.demomod.data.provider;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.block.ModBlocks;
import com.allstew.demomod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnglishLanguageProvider extends LanguageProvider {

    public EnglishLanguageProvider(PackOutput packOutput) {
        super(packOutput, DemoMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add("creative_tab.demo_mod", "Demo Mod");
        this.add(ModItems.RUBY_ITEM.get(), "Ruby");
        this.add(ModItems.MAGIC_INGOT_ITEM.get(), "Magic Ingot");
        this.add(ModBlocks.RUBY_BLOCK.get(), "Ruby Block");
        this.add(ModBlocks.LAMP_BLOCK.get(), "Lamp");
    }
}

