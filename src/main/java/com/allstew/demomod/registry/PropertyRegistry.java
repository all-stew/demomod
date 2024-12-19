package com.allstew.demomod.registry;

import com.allstew.demomod.DemoMod;
import com.allstew.demomod.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = DemoMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PropertyRegistry {

    @SubscribeEvent
    public static void propertiesOverrideRegistry(FMLClientSetupEvent event) {
        event.enqueueWork(() -> ItemProperties.register(
            ModItems.MAGIC_INGOT_ITEM.get(),
            ResourceLocation.fromNamespaceAndPath(DemoMod.MOD_ID, "size"),
            ((itemStack, clientLevel, livingEntity, i) -> itemStack.getCount())
        ));
    }
}
