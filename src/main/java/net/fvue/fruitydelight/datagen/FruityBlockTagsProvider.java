package net.fvue.fruitydelight.datagen;

import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.block.FruityBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


import java.util.concurrent.CompletableFuture;

public class FruityBlockTagsProvider extends BlockTagsProvider {
    public FruityBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FruityDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        tag(BlockTags.LEAVES)
                .add(FruityBlocks.APPLE_LEAVES.get())
                .add(FruityBlocks.FLOWER_APPLE_LEAVES.get())
                .add(FruityBlocks.BANANA_LEAVES.get())
                .add(FruityBlocks.FLOWER_BANANA_LEAVES.get())
                .add(FruityBlocks.ORANGE_LEAVES.get())
                .add(FruityBlocks.FLOWER_ORANGE_LEAVES.get())
                .add(FruityBlocks.PEAR_LEAVES.get());

    }
}
