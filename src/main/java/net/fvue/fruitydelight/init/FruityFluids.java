package net.fvue.fruitydelight.init;

import net.fvue.fruitydelight.FruityDelight;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class FruityFluids {
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, FruityDelight.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, FruityDelight.MOD_ID);

    public static ResourceLocation id(String name) {
        return ResourceLocation.tryBuild(FruityDelight.MOD_ID, name);
    }

    // -------------------- 流体ID --------------------
    // 苹果汁
    public static final ResourceLocation APPLE_JUICE_ID = id("apple_juice");
    public static final ResourceLocation FLOWING_APPLE_JUICE_ID = id("flowing_apple_juice");
    // 梨汁
    public static final ResourceLocation PEAR_JUICE_ID = id("pear_juice");
    public static final ResourceLocation FLOWING_PEAR_JUICE_ID = id("flowing_pear_juice");
    // 橙汁
    public static final ResourceLocation ORANGE_JUICE_ID = id("orange_juice");
    public static final ResourceLocation FLOWING_ORANGE_JUICE_ID = id("flowing_orange_juice");
    // 香蕉汁
    public static final ResourceLocation BANANA_JUICE_ID = id("banana_juice");
    public static final ResourceLocation FLOWING_BANANA_JUICE_ID = id("flowing_banana_juice");
    // 椰子汁
    public static final ResourceLocation COCONUT_JUICE_ID = id("coconut_juice");
    public static final ResourceLocation FLOWING_COCONUT_JUICE_ID = id("flowing_coconut_juice");
    // 菠萝汁
    public static final ResourceLocation PINEAPPLE_JUICE_ID = id("pineapple_juice");
    public static final ResourceLocation FLOWING_PINEAPPLE_JUICE_ID = id("flowing_pineapple_juice");
    // 草莓汁
    public static final ResourceLocation STRAWBERRY_JUICE_ID = id("strawberry_juice");
    public static final ResourceLocation FLOWING_STRAWBERRY_JUICE_ID = id("flowing_strawberry_juice");
    // 山楂汁
    public static final ResourceLocation HAWTHORN_JUICE_ID = id("hawthorn_juice");
    public static final ResourceLocation FLOWING_HAWTHORN_JUICE_ID = id("flowing_hawthorn_juice");
    // 苹果酱
    public static final ResourceLocation APPLE_JAM_ID = id("apple_jam");
    public static final ResourceLocation FLOWING_APPLE_JAM_ID = id("flowing_apple_jam");
    // 糖浆
    public static final ResourceLocation SYRUP_ID = id("syrup");
    public static final ResourceLocation FLOWING_SYRUP_ID = id("flowing_syrup");

    // -------------------- 流体属性 --------------------
    // 苹果汁
    public static final Supplier<FluidType> APPLE_JUICE_TYPE =
            FLUID_TYPES.register("apple_juice", () -> new FruityFluidTypes(APPLE_JUICE_ID, 0.4F, 0, false, false));
    // 梨汁
    public static final Supplier<FluidType> PEAR_JUICE_TYPE =
            FLUID_TYPES.register("pear_juice", () -> new FruityFluidTypes(PEAR_JUICE_ID, 0.4F, 0, false, false));
    // 橙汁
    public static final Supplier<FluidType> ORANGE_JUICE_TYPE =
            FLUID_TYPES.register("orange_juice", () -> new FruityFluidTypes(ORANGE_JUICE_ID, 0.4F, 0, false, false));
    // 香蕉汁
    public static final Supplier<FluidType> BANANA_JUICE_TYPE =
            FLUID_TYPES.register("banana_juice", () -> new FruityFluidTypes(BANANA_JUICE_ID, 0.4F, 0, false, false));
    // 椰子汁
    public static final Supplier<FluidType> COCONUT_JUICE_TYPE =
            FLUID_TYPES.register("coconut_juice", () -> new FruityFluidTypes(COCONUT_JUICE_ID, 0.4F, 0, false, false));
    // 菠萝汁
    public static final Supplier<FluidType> PINEAPPLE_JUICE_TYPE =
            FLUID_TYPES.register("pineapple_juice", () -> new FruityFluidTypes(PINEAPPLE_JUICE_ID, 0.4F, 0, false, false));
    // 草莓汁
    public static final Supplier<FluidType> STRAWBERRY_JUICE_TYPE =
            FLUID_TYPES.register("strawberry_juice", () -> new FruityFluidTypes(STRAWBERRY_JUICE_ID, 0.4F, 0, false, false));
    // 山楂汁
    public static final Supplier<FluidType> HAWTHORN_JUICE_TYPE =
            FLUID_TYPES.register("hawthorn_juice", () -> new FruityFluidTypes(HAWTHORN_JUICE_ID, 0.4F, 0, false, false));
    // 苹果酱
    public static final Supplier<FluidType> APPLE_JAM_TYPE =
            FLUID_TYPES.register("apple_jam", () -> new FruityFluidTypes(APPLE_JAM_ID, 0.6F, 0, false, false));
    // 糖浆
    public static final Supplier<FluidType> SYRUP_TYPE =
            FLUID_TYPES.register("syrup", () -> new FruityFluidTypes(SYRUP_ID, 0.5F, 0, false, false));

    // -------------------- 流体 Properties --------------------
    public static BaseFlowingFluid.Properties APPLE_JUICE_PROPERTIES;
    public static BaseFlowingFluid.Properties PEAR_JUICE_PROPERTIES;
    public static BaseFlowingFluid.Properties ORANGE_JUICE_PROPERTIES;
    public static BaseFlowingFluid.Properties BANANA_JUICE_PROPERTIES;
    public static BaseFlowingFluid.Properties COCONUT_JUICE_PROPERTIES;
    public static BaseFlowingFluid.Properties PINEAPPLE_JUICE_PROPERTIES;
    public static BaseFlowingFluid.Properties STRAWBERRY_JUICE_PROPERTIES;
    public static BaseFlowingFluid.Properties HAWTHORN_JUICE_PROPERTIES;
    public static BaseFlowingFluid.Properties APPLE_JAM_PROPERTIES;
    public static BaseFlowingFluid.Properties SYRUP_PROPERTIES;

    // -------------------- 流体 --------------------
    // 苹果汁
    public static final Supplier<BaseFlowingFluid.Source> APPLE_JUICE =
            FLUIDS.register("apple_juice", () -> new BaseFlowingFluid.Source(FruityFluids.APPLE_JUICE_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_APPLE_JUICE =
            FLUIDS.register("flowing_apple_juice", () -> new BaseFlowingFluid.Flowing(FruityFluids.APPLE_JUICE_PROPERTIES));
    // 梨汁
    public static final Supplier<BaseFlowingFluid.Source> PEAR_JUICE =
            FLUIDS.register("pear_juice", () -> new BaseFlowingFluid.Source(FruityFluids.PEAR_JUICE_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_PEAR_JUICE =
            FLUIDS.register("flowing_pear_juice", () -> new BaseFlowingFluid.Flowing(FruityFluids.PEAR_JUICE_PROPERTIES));
    // 橙汁
    public static final Supplier<BaseFlowingFluid.Source> ORANGE_JUICE =
            FLUIDS.register("orange_juice", () -> new BaseFlowingFluid.Source(FruityFluids.ORANGE_JUICE_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_ORANGE_JUICE =
            FLUIDS.register("flowing_orange_juice", () -> new BaseFlowingFluid.Flowing(FruityFluids.ORANGE_JUICE_PROPERTIES));
    // 香蕉汁
    public static final Supplier<BaseFlowingFluid.Source> BANANA_JUICE =
            FLUIDS.register("banana_juice", () -> new BaseFlowingFluid.Source(FruityFluids.BANANA_JUICE_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_BANANA_JUICE =
            FLUIDS.register("flowing_banana_juice", () -> new BaseFlowingFluid.Flowing(FruityFluids.BANANA_JUICE_PROPERTIES));
    // 椰子汁
    public static final Supplier<BaseFlowingFluid.Source> COCONUT_JUICE =
            FLUIDS.register("coconut_juice", () -> new BaseFlowingFluid.Source(FruityFluids.COCONUT_JUICE_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_COCONUT_JUICE =
            FLUIDS.register("flowing_coconut_juice", () -> new BaseFlowingFluid.Flowing(FruityFluids.COCONUT_JUICE_PROPERTIES));
    // 菠萝汁
    public static final Supplier<BaseFlowingFluid.Source> PINEAPPLE_JUICE =
            FLUIDS.register("pineapple_juice", () -> new BaseFlowingFluid.Source(FruityFluids.PINEAPPLE_JUICE_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_PINEAPPLE_JUICE =
            FLUIDS.register("flowing_pineapple_juice", () -> new BaseFlowingFluid.Flowing(FruityFluids.PINEAPPLE_JUICE_PROPERTIES));
    // 草莓汁
    public static final Supplier<BaseFlowingFluid.Source> STRAWBERRY_JUICE =
            FLUIDS.register("strawberry_juice", () -> new BaseFlowingFluid.Source(FruityFluids.STRAWBERRY_JUICE_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_STRAWBERRY_JUICE =
            FLUIDS.register("flowing_strawberry_juice", () -> new BaseFlowingFluid.Flowing(FruityFluids.STRAWBERRY_JUICE_PROPERTIES));
    // 山楂汁
    public static final Supplier<BaseFlowingFluid.Source> HAWTHORN_JUICE =
            FLUIDS.register("hawthorn_juice", () -> new BaseFlowingFluid.Source(FruityFluids.HAWTHORN_JUICE_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_HAWTHORN_JUICE =
            FLUIDS.register("flowing_hawthorn_juice", () -> new BaseFlowingFluid.Flowing(FruityFluids.HAWTHORN_JUICE_PROPERTIES));
    // 苹果酱
    public static final Supplier<BaseFlowingFluid.Source> APPLE_JAM =
            FLUIDS.register("apple_jam", () -> new BaseFlowingFluid.Source(FruityFluids.APPLE_JAM_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_APPLE_JAM =
            FLUIDS.register("flowing_apple_jam", () -> new BaseFlowingFluid.Flowing(FruityFluids.APPLE_JAM_PROPERTIES));
    // 糖浆
    public static final Supplier<BaseFlowingFluid.Source> SYRUP =
            FLUIDS.register("syrup", () -> new BaseFlowingFluid.Source(FruityFluids.SYRUP_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_SYRUP =
            FLUIDS.register("flowing_syrup", () -> new BaseFlowingFluid.Flowing(FruityFluids.SYRUP_PROPERTIES));

    static {
        // 苹果汁
        APPLE_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
                APPLE_JUICE_TYPE,
                APPLE_JUICE,
                FLOWING_APPLE_JUICE
        ).bucket(FruityItems.APPLE_JUICE_BUCKET)
                .block(FruityBlocks.APPLE_JUICE_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
        // 梨汁
        PEAR_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
                PEAR_JUICE_TYPE,
                PEAR_JUICE,
                FLOWING_PEAR_JUICE
        ).bucket(FruityItems.PEAR_JUICE_BUCKET)
                .block(FruityBlocks.PEAR_JUICE_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
        // 橙汁
        ORANGE_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
                ORANGE_JUICE_TYPE,
                ORANGE_JUICE,
                FLOWING_ORANGE_JUICE
        ).bucket(FruityItems.ORANGE_JUICE_BUCKET)
                .block(FruityBlocks.ORANGE_JUICE_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
        // 香蕉汁
        BANANA_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
                BANANA_JUICE_TYPE,
                BANANA_JUICE,
                FLOWING_BANANA_JUICE
        ).bucket(FruityItems.BANANA_JUICE_BUCKET)
                .block(FruityBlocks.BANANA_JUICE_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
        // 椰子汁
        COCONUT_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
                COCONUT_JUICE_TYPE,
                COCONUT_JUICE,
                FLOWING_COCONUT_JUICE
        ).bucket(FruityItems.COCONUT_JUICE_BUCKET)
                .block(FruityBlocks.COCONUT_JUICE_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
        // 菠萝汁
        PINEAPPLE_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
                PINEAPPLE_JUICE_TYPE,
                PINEAPPLE_JUICE,
                FLOWING_PINEAPPLE_JUICE
        ).bucket(FruityItems.PINEAPPLE_JUICE_BUCKET)
                .block(FruityBlocks.PINEAPPLE_JUICE_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
        // 草莓汁
        STRAWBERRY_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
                STRAWBERRY_JUICE_TYPE,
                STRAWBERRY_JUICE,
                FLOWING_STRAWBERRY_JUICE
        ).bucket(FruityItems.STRAWBERRY_JUICE_BUCKET)
                .block(FruityBlocks.STRAWBERRY_JUICE_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
        // 山楂汁
        HAWTHORN_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
                HAWTHORN_JUICE_TYPE,
                HAWTHORN_JUICE,
                FLOWING_HAWTHORN_JUICE
        ).bucket(FruityItems.HAWTHORN_JUICE_BUCKET)
                .block(FruityBlocks.HAWTHORN_JUICE_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
        // 苹果酱
        APPLE_JAM_PROPERTIES = new BaseFlowingFluid.Properties(
                APPLE_JAM_TYPE,
                APPLE_JAM,
                FLOWING_APPLE_JAM
        ).bucket(FruityItems.APPLE_JAM_BUCKET)
                .block(FruityBlocks.APPLE_JAM_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(3) // 流动查找距离
                .levelDecreasePerBlock(2) // 液面下降等级
                .tickRate(15); // 流动速度
        // 糖浆
        SYRUP_PROPERTIES = new BaseFlowingFluid.Properties(
                SYRUP_TYPE,
                SYRUP,
                FLOWING_SYRUP
        ).bucket(FruityItems.SYRUP_BUCKET)
                .block(FruityBlocks.SYRUP_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(3) // 流动查找距离
                .levelDecreasePerBlock(2) // 液面下降等级
                .tickRate(15); // 流动速度
    }
}
