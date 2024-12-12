package com.allstew.demomod.data.provider;

import com.allstew.demomod.DemoMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ChineseLanguageProvider extends LanguageProvider {

    public ChineseLanguageProvider(PackOutput packOutput) {
        super(packOutput, DemoMod.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        this.add("item.demo_mod.ruby", "红宝石");
        this.add("creative_tab.demo_mod", "Demo Mod");
        this.add("block.demo_mod.ruby_block", "红宝石块");
    }
}
