package net.fvue.fruitydelight.wrold;

import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.init.FruityBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

/**
 * 注册树木的世界生成配置
 */
public class FruityPlacedFeature {
    public static final ResourceKey<PlacedFeature> APPLE_TREE_PLACED_KEY = registerKey("apple_tree_placed");
    public static final ResourceKey<PlacedFeature> PEAR_TREE_PLACED_KEY = registerKey("pear_tree_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_TREE_PLACED_KEY = registerKey("orange_tree_placed");
    public static final ResourceKey<PlacedFeature> BANANA_TREE_PLACED_KEY = registerKey("banana_tree_placed");
    public static final ResourceKey<PlacedFeature> HAWTHORN_TREE_PLACED_KEY = registerKey("hawthorn_tree_placed");

    /**
     * 引导注册所有果树的放置特征
     * <p>
     * 为每种果树定义世界生成规则，包括：
     * - 引用对应的配置特征（树结构）
     * - 设置生成频率和分布规则
     * - 指定可放置的树苗方块
     *
     * @param context 引导上下文，用于注册放置特征
     */
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // 注册苹果树放置特征：每区块基础0次，2%概率额外生成最多2棵
        register(context, APPLE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(FruityConfigureFeature.APPLE_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.02f, 2),
                        FruityBlocks.APPLE_SAPLING.get()));
        // 注册梨树放置特征：每区块基础0次，2%概率额外生成最多2棵
        register(context, PEAR_TREE_PLACED_KEY, configuredFeatures.getOrThrow(FruityConfigureFeature.PEAR_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.02f, 2),
                        FruityBlocks.PEAR_SAPLING.get()));
        // 注册橙子树放置特征：每区块基础0次，2%概率额外生成最多2棵
        register(context, ORANGE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(FruityConfigureFeature.ORANGE_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.02f, 2),
                        FruityBlocks.ORANGE_SAPLING.get()));
        // 注册香蕉树放置特征：每区块基础0次，2%概率额外生成最多2棵
        register(context, BANANA_TREE_PLACED_KEY, configuredFeatures.getOrThrow(FruityConfigureFeature.BANANA_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.02f, 2),
                        FruityBlocks.BANANA_SAPLING.get()));
        // 注册山楂树放置特征：每区块基础0次，2%概率额外生成最多2棵
        register(context, HAWTHORN_TREE_PLACED_KEY, configuredFeatures.getOrThrow(FruityConfigureFeature.HAWTHORN_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.02f, 2),
                        FruityBlocks.HAWTHORN_SAPLING.get()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
