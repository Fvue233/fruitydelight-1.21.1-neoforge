package net.fvue.fruitydelight.datagen;

import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.init.FruityFluidTags;
import net.fvue.fruitydelight.init.FruityFluids;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModFluidTagsProvider extends FluidTagsProvider {
    public ModFluidTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FruityDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        // c:drinks
        tag(FruityFluidTags.DRINKS)
                .add(FruityFluids.BANANA_JUICE.get())
                .add(FruityFluids.ORANGE_JUICE.get())
                .add(FruityFluids.PEAR_JUICE.get())
                .add(FruityFluids.APPLE_JUICE.get())
                .add(FruityFluids.COCONUT_JUICE.get());

        tag(FluidTags.create(ResourceLocation.fromNamespaceAndPath("c", "drinks/banana"))).add(FruityFluids.BANANA_JUICE.get());
        tag(FluidTags.create(ResourceLocation.fromNamespaceAndPath("c", "drinks/orange"))).add(FruityFluids.ORANGE_JUICE.get());
        tag(FluidTags.create(ResourceLocation.fromNamespaceAndPath("c", "drinks/pear"))).add(FruityFluids.PEAR_JUICE.get());
        tag(FluidTags.create(ResourceLocation.fromNamespaceAndPath("c", "drinks/coconut"))).add(FruityFluids.COCONUT_JUICE.get());

        tag(FluidTags.create(ResourceLocation.fromNamespaceAndPath("c", "drinks/apple")))
                .addOptional(ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, "apple_juice"));


    }
}
