package net.fvue.fruitydelight.fluid;


import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class FruityFluidTypes {
    public static final DeferredRegister<FluidType> REGISTRY;
    public static final Supplier<FluidType> APPLE_JUICE_TYPE;
    public static final Supplier<FluidType> PEAR_JUICE_TYPE;
    public static final Supplier<FluidType> ORANGE_JUICE_TYPE;
    public static final Supplier<FluidType> BANANA_JUICE_TYPE;
    public static final Supplier<FluidType> COCONUT_JUICE_TYPE;
    public static final Supplier<FluidType> PINEAPPLE_JUICE_TYPE;
    public static final Supplier<FluidType> STRAWBERRY_JUICE_TYPE;
    public static final Supplier<FluidType> SYRUP_TYPE;
    static {
        REGISTRY = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, "fruitydelight");
        APPLE_JUICE_TYPE = REGISTRY.register("apple_juice", AppleJuiceFluidType::new);
        PEAR_JUICE_TYPE = REGISTRY.register("pear_juice", PearJuiceFluidType::new);
        ORANGE_JUICE_TYPE = REGISTRY.register("orange_juice", OrangeJuiceFluidType::new);
        BANANA_JUICE_TYPE = REGISTRY.register("banana_juice", BananaJuiceFluidType::new);
        COCONUT_JUICE_TYPE = REGISTRY.register("coconut_juice", CoconutJuiceFluidType::new);
        PINEAPPLE_JUICE_TYPE = REGISTRY.register("pineapple_juice", PineappleJuiceFluidType::new);
        STRAWBERRY_JUICE_TYPE = REGISTRY.register("strawberry_juice", StrawberryJuiceFluidType::new);

        SYRUP_TYPE = REGISTRY.register("syrup", SyrupFluidType::new);
    }
}
