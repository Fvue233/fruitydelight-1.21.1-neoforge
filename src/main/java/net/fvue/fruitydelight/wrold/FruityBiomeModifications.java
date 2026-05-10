package net.fvue.fruitydelight.wrold;

import net.fvue.fruitydelight.FruityDelight;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

/**
 * 果树生物群系修改器
 */
public class FruityBiomeModifications {
    public static final ResourceKey<BiomeModifier> ADD_TREE_APPLE = registerKey("add_tree_apple");
    public static final ResourceKey<BiomeModifier> ADD_TREE_PEAR = registerKey("add_tree_pear");
    public static final ResourceKey<BiomeModifier> ADD_TREE_ORANGE = registerKey("add_tree_orange");
    public static final ResourceKey<BiomeModifier> ADD_TREE_BANANA = registerKey("add_tree_banana");
    public static final ResourceKey<BiomeModifier> ADD_TREE_HAWTHORN = registerKey("add_tree_hawthorn");

    /**
     * 引导注册所有果树的生物群系修改器
     * <p>
     * 将每种果树关联到特定的生物群系标签，决定它们在哪些环境中自然生成：
     * - 苹果树、梨树、橙子树：森林群系
     * - 香蕉树：丛林群系
     * - 山楂树：针叶林群系
     *
     * @param context 引导上下文，用于注册生物群系修改器
     */
    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        // 注册苹果树到森林群系
        context.register(ADD_TREE_APPLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(FruityPlacedFeature.APPLE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        // 注册梨树到森林群系
        context.register(ADD_TREE_PEAR, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(FruityPlacedFeature.PEAR_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        // 注册橙子树到森林群系
        context.register(ADD_TREE_ORANGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(FruityPlacedFeature.ORANGE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        // 注册香蕉树到丛林群系
        context.register(ADD_TREE_BANANA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(FruityPlacedFeature.BANANA_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        // 注册山楂树到针叶林群系
        context.register(ADD_TREE_HAWTHORN, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_TAIGA),
                HolderSet.direct(placedFeatures.getOrThrow(FruityPlacedFeature.HAWTHORN_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, name));
    }
}
