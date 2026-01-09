package net.fvue.fruitydelight.fluid;


import net.fvue.fruitydelight.block.FruityBlocks;
import net.fvue.fruitydelight.item.FruityItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public abstract class BananaJuiceFluid extends BaseFlowingFluid {

    public static final Properties PROPERTIES;

    private BananaJuiceFluid() {
        super(PROPERTIES);
    }

    static {
        PROPERTIES = (new Properties(FruityFluidTypes.BANANA_JUICE_TYPE, FruityFluids.BANANA_JUICE, FruityFluids.FLOWING_BANANA_JUICE)).explosionResistance(100.0F).bucket(FruityItems.BANANA_JUICE_BUCKET).block(FruityBlocks.BANANA_JUICE_BLOCK);
    }

    @Override
    public boolean canConvertToSource(FluidState state, Level level, BlockPos pos) {
        return false;
    }

    public static class Source extends BananaJuiceFluid {
        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }

    public static class Flowing extends BananaJuiceFluid {
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(new Property[]{LEVEL});
        }

        public int getAmount(FluidState state) {
            return (Integer)state.getValue(LEVEL);
        }

        public boolean isSource(FluidState state) {
            return false;
        }
    }
}
