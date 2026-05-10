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

/**
 * 果树树叶方块
 * <p>
 * 继承自原版树叶方块，并实现骨粉催熟接口
 * 当玩家对树叶使用骨粉时，会在树叶下方生成对应的悬挂果实
 */
@ParametersAreNonnullByDefault
public class FruityLeavesBlock extends LeavesBlock implements BonemealableBlock{

    public final BlockState hangingFruitBlockState;

    public FruityLeavesBlock(BlockState hangingFruitBlockState,Properties settings) {
        super(settings);
        this.hangingFruitBlockState = hangingFruitBlockState;
    }

    /**
     * 检查是否可以作为骨粉催熟目标
     * 条件：树叶下方必须是空气方块
     *
     * @param world 世界读取器
     * @param pos 方块位置
     * @param state 方块状态
     * @return 如果下方是空气则返回 true
     */
    @Override
    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos,BlockState state) {
        return world.getBlockState(pos.below()).isAir();
    }


    /**
     * 判断骨粉催熟是否成功
     * 始终返回 true，表示催熟必定成功
     *
     * @param world 世界对象
     * @param random 随机数源
     * @param pos 方块位置
     * @param state 方块状态
     * @return 始终返回 true
     */
    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random,  BlockPos pos,BlockState state) {
        return true;
    }

    /**
     * 执行骨粉催熟效果
     * 在树叶下方生成对应的悬挂果实方块
     *
     * @param world 服务器世界对象
     * @param random 随机数源
     * @param pos 方块位置
     * @param state 方块状态
     */
    @Override
    public void performBonemeal(ServerLevel world,RandomSource random, BlockPos pos,BlockState state) {
        world.setBlock(pos.below(), hangingFruitBlockState, 2);
    }
}
