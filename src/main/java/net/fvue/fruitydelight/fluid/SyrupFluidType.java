package net.fvue.fruitydelight.fluid;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;

import java.util.function.Consumer;

@MethodsReturnNonnullByDefault
public class SyrupFluidType extends FluidType {
    public SyrupFluidType() {
        super(Properties.create().fallDistanceModifier(0.0F).canExtinguish(true).supportsBoating(true).canHydrate(true).motionScale(0.007).canConvertToSource(true).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
    }

    @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
        consumer.accept(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL_TEXTURE = ResourceLocation.fromNamespaceAndPath("fruitydelight", "block/syrup_fluid_still");
            private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.fromNamespaceAndPath("fruitydelight", "block/syrup_fluid_flow");

            public ResourceLocation getStillTexture() {
                return STILL_TEXTURE;
            }

            public ResourceLocation getFlowingTexture() {
                return FLOWING_TEXTURE;
            }
        });
    }
}
