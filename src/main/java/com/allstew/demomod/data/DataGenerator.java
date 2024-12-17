package com.allstew.demomod.data;

import com.allstew.demomod.data.provider.ChineseLanguageProvider;
import com.allstew.demomod.data.provider.EnglishLanguageProvider;
import com.allstew.demomod.data.provider.ModelProvider;
import com.allstew.demomod.data.provider.StateProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DataGenerator {

    public static void onGatherData(GatherDataEvent event) {
        var gen = event.getGenerator();
        var packOutput = gen.getPackOutput();
        var helper = event.getExistingFileHelper();
        gen.addProvider(event.includeClient(), new EnglishLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new ChineseLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new ModelProvider(packOutput, helper));
        gen.addProvider(event.includeClient(), new StateProvider(packOutput, helper));
    }
}
