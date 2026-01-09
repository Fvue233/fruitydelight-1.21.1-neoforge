package net.fvue.fruitydelight.datagen;

import net.fvue.fruitydelight.block.FruityBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Set;

public class FruityBlockLootTablesProvider extends BlockLootSubProvider {
    public FruityBlockLootTablesProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //dropSelf(FruityBlocks.APPLE_LEAVES.get());
    }
}
