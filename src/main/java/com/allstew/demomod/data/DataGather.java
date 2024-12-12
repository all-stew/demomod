package com.allstew.demomod.data;

import com.allstew.demomod.data.provider.ChineseLanguageProvider;
import com.allstew.demomod.data.provider.EnglishLanguageProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DataGather {

    public static void onGatherData(GatherDataEvent event) {
        var gen = event.getGenerator();
        var packOutput = gen.getPackOutput();
        gen.addProvider(event.includeClient(), new EnglishLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new ChineseLanguageProvider(packOutput));
    }
}
