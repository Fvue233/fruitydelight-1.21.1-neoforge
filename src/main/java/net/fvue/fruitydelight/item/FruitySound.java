package net.fvue.fruitydelight.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class FruitySound {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, "fruitydelight");
    //pick fruit sound
    public static final DeferredHolder<SoundEvent, SoundEvent> HANGING_FRUIT_PICK = SOUND_EVENTS.register(
            "hanging_fruit_pick", // must match the resource location on the next line
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fruitydelight", "hanging_fruit_pick"))
    );
public static void register(IEventBus eventBus) {
    SOUND_EVENTS.register(eventBus);
}
}

