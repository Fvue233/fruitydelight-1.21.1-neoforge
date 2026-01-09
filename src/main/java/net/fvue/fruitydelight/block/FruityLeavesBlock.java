package net.fvue.fruitydelight.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;


import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class FruityLeavesBlock extends LeavesBlock implements BonemealableBlock{

    public final BlockState hangingFruitBlockState;

    public FruityLeavesBlock(BlockState hangingFruitBlockState,Properties settings) {
        super(settings);
        this.hangingFruitBlockState = hangingFruitBlockState;
    }
    @Override
    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos,BlockState state) {
        return world.getBlockState(pos.below()).isAir();
    }
    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random,  BlockPos pos,BlockState state) {
        return true;
    }
    @Override
    public void performBonemeal(ServerLevel world,RandomSource random, BlockPos pos,BlockState state) {
        world.setBlock(pos.below(), hangingFruitBlockState, 2);
    }

}
