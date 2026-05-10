package net.fvue.fruitydelight.block.hangingfruit;

import com.mojang.serialization.MapCodec;
import net.fvue.fruitydelight.init.FruitySound;
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

/**
 * 悬挂果实基类
 * <p>
 * 所有悬挂果实的父类，提供通用的生长、采集和交互逻辑：
 * - 使用 AGE_4 属性控制果实的5个生长阶段（0-4）
 * - 支持随机生长和骨粉催熟
 * - 支持 projectiles 击落成熟果实
 * - 提供采摘音效播放功能
 */
public class HangingFruitBlock extends BushBlock implements BonemealableBlock {
    /** 果实生长阶段属性（0-4，4为完全成熟） */
    public static final IntegerProperty AGE = BlockStateProperties.AGE_4;

    /**
     * 构造悬挂果实方块
     * 设置默认状态为未生长（AGE=0）
     *
     * @param settings 方块属性配置
     */
    public HangingFruitBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    /**
     * 获取方块的序列化编解码器
     *
     * @return 编解码器（当前返回 null）
     */
    @Override
    protected  MapCodec<? extends BushBlock> codec() {
        return null;
    }

    /**
     * 创建方块状态定义
     * 添加 AGE 属性到方块状态中
     *
     * @param builder 状态定义构建器
     */
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }


    /**
     * 随机 tick 更新（自然生长）
     * <p>
     * 如果果实未完全成熟，有10%概率进入下一个生长阶段
     *
     * @param state 方块状态
     * @param world 服务器世界对象
     * @param pos 方块位置
     * @param random 随机数源
     */
    @Override
    public void randomTick( BlockState state,  ServerLevel world,  BlockPos pos,  RandomSource random) {
        if (!HangingFruitBlock.isFullyGrown(state) && random.nextFloat() < 0.1) {
            world.setBlock(pos, state.cycle(AGE), Block.UPDATE_CLIENTS);
        }
    }

    /**
     * 检查是否可以作为骨粉催熟目标
     * 条件：果实生长阶段小于4（未完全成熟）
     *
     * @param world 世界读取器
     * @param pos 方块位置
     * @param state 方块状态
     * @return 如果未成熟返回 true
     */
    @Override
    public boolean isValidBonemealTarget( LevelReader world,  BlockPos pos, BlockState state) {
        return state.getValue(AGE) < 4;
    }

    /**
     * 判断骨粉催熟是否成功
     * 条件：果实未完全成熟
     *
     * @param world 世界对象
     * @param random 随机数源
     * @param pos 方块位置
     * @param state 方块状态
     * @return 如果未成熟返回 true
     */
    public boolean isBonemealSuccess( Level world,  RandomSource random,  BlockPos pos,  BlockState state) {
        return !isFullyGrown(state);
    }

    /**
     * 执行骨粉催熟效果
     * 将果实推进到下一个生长阶段
     *
     * @param world 服务器世界对象
     * @param random 随机数源
     * @param pos 方块位置
     * @param state 方块状态
     */
    @Override
    public void performBonemeal( ServerLevel world,  RandomSource random,  BlockPos pos,  BlockState state) {
        if (!isFullyGrown(state)) {
            world.setBlock(pos, state.cycle(AGE), Block.UPDATE_CLIENTS);
        }
    }

    /**
     * 播放采摘果实的音效
     * 音量固定为1.0，音调在0.8-1.2之间随机
     *
     * @param world 世界对象
     * @param pos 方块位置
     */
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

    /**
     * 检查果实是否完全成熟
     *
     * @param state 方块状态
     * @return 如果 AGE=4 返回 true
     */
    private static boolean isFullyGrown(BlockState state) {
        return state.getValue(AGE) == 4;
    }

    /**
     * 处理弹射物击中事件
     * <p>
     * 如果果实已完全成熟，被弹射物击中时会掉落物品并销毁方块
     *
     * @param world 世界对象
     * @param state 方块状态
     * @param hit 命中结果
     * @param projectile 弹射物实体
     */
    @Override
    public void onProjectileHit( Level world,  BlockState state,  BlockHitResult hit,  Projectile projectile) {
        if (isFullyGrown(state)) {
            world.destroyBlock(hit.getBlockPos(), true);
        }
        super.onProjectileHit(world, state, hit, projectile);
    }
}
