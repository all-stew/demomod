package com.allstew.demomod.data.provider;

import com.allstew.demomod.DemoMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnglishLanguageProvider extends LanguageProvider {

    public EnglishLanguageProvider(PackOutput packOutput) {
        super(packOutput, DemoMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add("item.demo_mod.ruby", "Ruby");
        this.add("creative_tab.demo_mod", "Demo Mod");
        this.add("block.demo_mod.ruby_block", "Ruby Block");
    }
}

