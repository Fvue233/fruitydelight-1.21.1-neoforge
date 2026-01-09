package net.fvue.fruitydelight.fluid;


import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FruityFluids {
    public static final DeferredRegister<Fluid> REGISTRY;
    public static final Supplier<FlowingFluid> APPLE_JUICE;
    public static final Supplier<FlowingFluid> FLOWING_APPLE_JUICE;
    public static final Supplier<FlowingFluid> PEAR_JUICE;
    public static final Supplier<FlowingFluid> FLOWING_PEAR_JUICE;
    public static final Supplier<FlowingFluid> ORANGE_JUICE;
    public static final Supplier<FlowingFluid> FLOWING_ORANGE_JUICE;
    public static final Supplier<FlowingFluid> BANANA_JUICE;
    public static final Supplier<FlowingFluid> FLOWING_BANANA_JUICE;
    public static final Supplier<FlowingFluid> COCONUT_JUICE;
    public static final Supplier<FlowingFluid> FLOWING_COCONUT_JUICE;
    public static final Supplier<FlowingFluid> PINEAPPLE_JUICE;
    public static final Supplier<FlowingFluid> FLOWING_PINEAPPLE_JUICE;
    public static final Supplier<FlowingFluid> STRAWBERRY_JUICE;
    public static final Supplier<FlowingFluid> FLOWING_STRAWBERRY_JUICE;

    public static final Supplier<FlowingFluid> SYRUP;
    public static final Supplier<FlowingFluid> FLOWING_SYRUP;


    static {
        REGISTRY = DeferredRegister.create(Registries.FLUID, "fruitydelight");
        APPLE_JUICE = REGISTRY.register("apple_juice", AppleJuiceFluid.Source::new);
        FLOWING_APPLE_JUICE = REGISTRY.register("flowing_apple_juice", AppleJuiceFluid.Flowing::new);
        PEAR_JUICE = REGISTRY.register("pear_juice", PearJuiceFluid.Source::new);
        FLOWING_PEAR_JUICE = REGISTRY.register("flowing_pear_juice", PearJuiceFluid.Flowing::new);
        ORANGE_JUICE = REGISTRY.register("orange_juice", OrangeJuiceFluid.Source::new);
        FLOWING_ORANGE_JUICE = REGISTRY.register("flowing_orange_juice", OrangeJuiceFluid.Flowing::new);
        BANANA_JUICE = REGISTRY.register("banana_juice", BananaJuiceFluid.Source::new);
        FLOWING_BANANA_JUICE = REGISTRY.register("flowing_banana_juice", BananaJuiceFluid.Flowing::new);
        COCONUT_JUICE = REGISTRY.register("coconut_juice", CoconutJuiceFluid.Source::new);
        FLOWING_COCONUT_JUICE = REGISTRY.register("flowing_coconut_juice", CoconutJuiceFluid.Flowing::new);
        PINEAPPLE_JUICE = REGISTRY.register("pineapple_juice", PineappleJuiceFluid.Source::new);
        FLOWING_PINEAPPLE_JUICE = REGISTRY.register("flowing_pineapple_juice", PineappleJuiceFluid.Flowing::new);
        STRAWBERRY_JUICE = REGISTRY.register("strawberry_juice", StrawberryJuiceFluid.Source::new);
        FLOWING_STRAWBERRY_JUICE = REGISTRY.register("flowing_strawberry_juice", StrawberryJuiceFluid.Flowing::new);


        SYRUP = REGISTRY.register("syrup", SyrupFluid.Source::new);
        FLOWING_SYRUP = REGISTRY.register("flowing_syrup", SyrupFluid.Flowing::new);

    }
}
