package net.fvue.fruitydelight.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public interface FruitySound {
    DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, "fruitydelight");

    // 采摘悬挂水果的音效
    DeferredHolder<SoundEvent, SoundEvent> HANGING_FRUIT_PICK = SOUND_EVENTS.register("hanging_fruit_pick",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fruitydelight", "hanging_fruit_pick"))
    );

    static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}

