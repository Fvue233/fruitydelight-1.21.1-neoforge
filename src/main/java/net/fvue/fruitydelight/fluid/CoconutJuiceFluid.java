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

public abstract class CoconutJuiceFluid extends BaseFlowingFluid {

    public static final Properties PROPERTIES;

    private CoconutJuiceFluid() {
        super(PROPERTIES);
    }

    static {
        PROPERTIES = (new Properties(FruityFluidTypes.COCONUT_JUICE_TYPE, FruityFluids.COCONUT_JUICE, FruityFluids.FLOWING_COCONUT_JUICE)).explosionResistance(100.0F).bucket(FruityItems.COCONUT_JUICE_BUCKET).block(FruityBlocks.COCONUT_JUICE_BLOCK);
    }

    @Override
    public boolean canConvertToSource(FluidState state, Level level, BlockPos pos) {
        return false;
    }

    public static class Source extends CoconutJuiceFluid {
        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }

    public static class Flowing extends CoconutJuiceFluid {
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
