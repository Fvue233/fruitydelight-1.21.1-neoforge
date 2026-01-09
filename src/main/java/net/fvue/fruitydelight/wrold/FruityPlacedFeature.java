package net.fvue.fruitydelight.wrold;

import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.block.FruityBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class FruityPlacedFeature {
    public static final ResourceKey<PlacedFeature> APPLE_TREE_PLACED_KEY = registerKey("apple_tree_placed");
    public static final ResourceKey<PlacedFeature> PEAR_TREE_PLACED_KEY = registerKey("pear_tree_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_TREE_PLACED_KEY = registerKey("orange_tree_placed");
    public static final ResourceKey<PlacedFeature> BANANA_TREE_PLACED_KEY = registerKey("banana_tree_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, APPLE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(FruityConfigureFeature.APPLE_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.02f, 2),
                        FruityBlocks.APPLE_SAPLING.get()));
        register(context, PEAR_TREE_PLACED_KEY, configuredFeatures.getOrThrow(FruityConfigureFeature.PEAR_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.02f, 2),
                        FruityBlocks.PEAR_SAPLING.get()));
        register(context, ORANGE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(FruityConfigureFeature.ORANGE_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.02f, 2),
                        FruityBlocks.ORANGE_SAPLING.get()));
        register(context, BANANA_TREE_PLACED_KEY, configuredFeatures.getOrThrow(FruityConfigureFeature.BANANA_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.02f, 2),
                        FruityBlocks.BANANA_SAPLING.get()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
