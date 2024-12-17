package com.allstew.demomod.data.provider;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.block.ModBlocks;
import com.allstew.demomod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ChineseLanguageProvider extends LanguageProvider {

    public ChineseLanguageProvider(PackOutput packOutput) {
        super(packOutput, DemoMod.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        this.add("creative_tab.demo_mod", "Demo Mod");
        this.add(ModItems.RUBY_ITEM.get(), "红宝石");
        this.add(ModBlocks.RUBY_BLOCK.get(), "红宝石块");
        this.add(ModBlocks.LAMP_BLOCK.get(), "灯");
    }
}
