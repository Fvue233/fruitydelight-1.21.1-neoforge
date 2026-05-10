package net.fvue.fruitydelight.init;

import net.fvue.fruitydelight.FruityDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;


public interface FruityFluidTags {

    TagKey<Fluid> DRINKS = neoforgeTag("drinks");

    private static TagKey<Fluid> bind(String name) {
        return TagKey.create(Registries.FLUID, ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, name));
    }

    static TagKey<Fluid> neoforgeTag(String name) {
        return TagKey.create(Registries.FLUID, ResourceLocation.fromNamespaceAndPath("c", name));
    }
}
