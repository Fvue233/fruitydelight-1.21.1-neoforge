package net.fvue.fruitydelight.wrold;

import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.init.FruityBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.CherryTrunkPlacer;

/**
 * 定义树木的结构配置
 */
public class FruityConfigureFeature {
    public static final ResourceKey<ConfiguredFeature<?, ?>> APPLE_TREE_KEY = registerKey("apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEAR_TREE_KEY = registerKey("pear_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_TREE_KEY = registerKey("orange_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BANANA_TREE_KEY = registerKey("banana_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HAWTHORN_TREE_KEY = registerKey("hawthorn_tree");

    /**
     * 引导注册所有果树的配置特征
     * <p>
     * 为每种果树定义完整的树结构配置，包括：
     * - 树干材质和生成器
     * - 树叶方块及其权重分布
     * - 树冠形状生成器
     * - 树的尺寸限制
     *
     * @param context 引导上下文，用于注册配置特征
     */
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        // 注册苹果树配置：橡木树干，50%概率生成开花树叶，使用樱花树冠形状
        register(context, APPLE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new CherryTrunkPlacer(7, 1, 0,
                        ConstantInt.of(2),
                        UniformInt.of(2, 4),
                        UniformInt.of(1, 2),
                        UniformInt.of(3, 4)),

                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(FruityBlocks.APPLE_LEAVES.get().defaultBlockState(), 1)
                        .add(FruityBlocks.FLOWER_APPLE_LEAVES.get().defaultBlockState(), 1)
                        .build()),

                new CherryFoliagePlacer(
                        ConstantInt.of(4),
                        ConstantInt.of(0),
                        ConstantInt.of(5),
                        0.25f,
                        0.25f,
                        0.16666667f,
                        0.33333334f
                ),

                new TwoLayersFeatureSize(0, 0, 0)).build());

        // 注册梨树配置：橡木树干，50%概率生成开花树叶，使用樱花树冠形状
        register(context, PEAR_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new CherryTrunkPlacer(7, 1, 0,
                        ConstantInt.of(2),
                        UniformInt.of(2, 4),
                        UniformInt.of(1, 2),
                        UniformInt.of(3, 4)),

                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(FruityBlocks.PEAR_LEAVES.get().defaultBlockState(), 1)
                        .add(FruityBlocks.FLOWER_PEAR_LEAVES.get().defaultBlockState(), 1)
                        .build()),

                new CherryFoliagePlacer(
                        ConstantInt.of(4),
                        ConstantInt.of(0),
                        ConstantInt.of(5),
                        0.25f,
                        0.25f,
                        0.16666667f,
                        0.33333334f
                ),

                new TwoLayersFeatureSize(0, 0, 0)).build());

        // 注册橙子树配置：橡木树干，50%概率生成开花树叶，使用樱花树冠形状
        register(context, ORANGE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new CherryTrunkPlacer(7, 1, 0,
                        ConstantInt.of(2),
                        UniformInt.of(2, 4),
                        UniformInt.of(1, 2),
                        UniformInt.of(3, 4)),

                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(FruityBlocks.ORANGE_LEAVES.get().defaultBlockState(), 1)
                        .add(FruityBlocks.FLOWER_ORANGE_LEAVES.get().defaultBlockState(), 1)
                        .build()),

                new CherryFoliagePlacer(
                        ConstantInt.of(4),
                        ConstantInt.of(0),
                        ConstantInt.of(5),
                        0.25f,
                        0.25f,
                        0.16666667f,
                        0.33333334f
                ),

                new TwoLayersFeatureSize(0, 0, 0)).build());

        // 注册香蕉树配置：丛林木树干，80%普通叶 + 20%开花叶，使用樱花树冠形状
        register(context, BANANA_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                new CherryTrunkPlacer(7, 1, 0,
                        ConstantInt.of(2),
                        UniformInt.of(2, 4),
                        UniformInt.of(1, 2),
                        UniformInt.of(3, 4)),

                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(FruityBlocks.BANANA_LEAVES.get().defaultBlockState(), 8)
                        .add(FruityBlocks.FLOWER_BANANA_LEAVES.get().defaultBlockState(), 2)
                        .build()),

                new CherryFoliagePlacer(
                        ConstantInt.of(4),
                        ConstantInt.of(0),
                        ConstantInt.of(5),
                        0.25f,
                        0.25f,
                        0.16666667f,
                        0.33333334f
                ),

                new TwoLayersFeatureSize(0, 0, 0)).build());

        // 注册山楂树配置：云杉木树干，80%普通叶 + 20%开花叶，使用金合欢树冠形状
        register(context, HAWTHORN_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.SPRUCE_LOG),
                new CherryTrunkPlacer(3, 1, 0,
                        ConstantInt.of(2),
                        UniformInt.of(2, 4),
                        UniformInt.of(1, 2),
                        UniformInt.of(3, 4)),

                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(FruityBlocks.HAWTHORN_LEAVES.get().defaultBlockState(), 8)
                        .add(FruityBlocks.FLOWER_HAWTHORN_LEAVES.get().defaultBlockState(), 2)
                        .build()),

                new AcaciaFoliagePlacer(
                        ConstantInt.of(0),
                        ConstantInt.of(3)

                ),

                new TwoLayersFeatureSize(0, 0, 0)).build());
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
