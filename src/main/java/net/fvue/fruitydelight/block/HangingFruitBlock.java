package net.fvue.fruitydelight.block;

import com.mojang.serialization.MapCodec;
import net.fvue.fruitydelight.item.FruitySound;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;


import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault

public class HangingFruitBlock extends BushBlock implements BonemealableBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_4;

    public HangingFruitBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    @Override
    protected  MapCodec<? extends BushBlock> codec() {
        return null;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }


    @Override
    public void randomTick( BlockState state,  ServerLevel world,  BlockPos pos,  RandomSource random) {
        if (!HangingFruitBlock.isFullyGrown(state) && random.nextFloat() < 0.1) {
            world.setBlock(pos, state.cycle(AGE), Block.UPDATE_CLIENTS);
        }
    }

    @Override
    public boolean isValidBonemealTarget( LevelReader world,  BlockPos pos, BlockState state) {
        return state.getValue(AGE) < 4;
    }

    public boolean isBonemealSuccess( Level world,  RandomSource random,  BlockPos pos,  BlockState state) {
        return !isFullyGrown(state);
    }

    @Override
    public void performBonemeal( ServerLevel world,  RandomSource random,  BlockPos pos,  BlockState state) {
        if (!isFullyGrown(state)) {
            world.setBlock(pos, state.cycle(AGE), Block.UPDATE_CLIENTS);
        }
    }
    protected static void playPickFruitSound(Level world, BlockPos pos) {
        world.playSound(
                null,
                pos,
                FruitySound.HANGING_FRUIT_PICK.get(),
                SoundSource.BLOCKS,
                1.0f,
                0.8f + world.random.nextFloat() * 0.4f
        );
    }
    private static boolean isFullyGrown(BlockState state) {
        return state.getValue(AGE) == 4;
    }

    @Override
    public void onProjectileHit( Level world,  BlockState state,  BlockHitResult hit,  Projectile projectile) {
        if (isFullyGrown(state)) {
            world.destroyBlock(hit.getBlockPos(), true);
        }
        super.onProjectileHit(world, state, hit, projectile);
    }
}
