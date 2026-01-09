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

public abstract class StrawberryJuiceFluid extends BaseFlowingFluid {

    public static final Properties PROPERTIES;

    private StrawberryJuiceFluid() {
        super(PROPERTIES);
    }

    static {
        PROPERTIES = (new Properties(FruityFluidTypes.STRAWBERRY_JUICE_TYPE, FruityFluids.STRAWBERRY_JUICE, FruityFluids.FLOWING_STRAWBERRY_JUICE)).explosionResistance(100.0F).bucket(FruityItems.STRAWBERRY_JUICE_BUCKET).block(FruityBlocks.STRAWBERRY_JUICE_BLOCK);
    }

    @Override
    public boolean canConvertToSource(FluidState state, Level level, BlockPos pos) {
        return false;
    }

    public static class Source extends StrawberryJuiceFluid {
        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }

    public static class Flowing extends StrawberryJuiceFluid {
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
