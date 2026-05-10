package net.fvue.fruitydelight.block.hangingfruit.FruitBlock;

import net.fvue.fruitydelight.block.hangingfruit.HangingFruitBlock;
import net.fvue.fruitydelight.init.FruityItems;
import net.fvue.fruitydelight.util.HangingFruitShapes;
import net.fvue.fruitydelight.init.FruityBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.common.util.TriState;

/**
 * 悬挂的苹果方块
 * <p>
 * 继承自悬挂果实基类，实现苹果的生长和采集逻辑
 * 苹果成熟后（AGE=4）可以被玩家右键采集，采集后重置生长阶段
 */
public class HangingAppleBlock extends HangingFruitBlock {
    /**
     * 构造悬挂苹果方块
     *
     * @param settings 方块属性配置
     */
    public HangingAppleBlock(Properties settings) {
        super(settings);
    }

    /**
     * 获取方块的视觉形状
     * 根据生长阶段使用对应的碰撞箱，并应用随机偏移
     *
     * @param state 方块状态
     * @param world 世界读取器
     * @param pos 方块位置
     * @param context 碰撞上下文
     * @return 移动后的视觉形状
     */
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        VoxelShape voxelShape = HangingFruitShapes.DEFAULT_SHAPES[state.getValue(AGE)];
        Vec3 vec3d = state.getOffset(world, pos);
        return voxelShape.move(vec3d.x, vec3d.y, vec3d.z);
    }

    /**
     * 获取方块的碰撞形状
     * 根据生长阶段使用对应的碰撞箱，并应用随机偏移
     *
     * @param state 方块状态
     * @param world 世界读取器
     * @param pos 方块位置
     * @param context 碰撞上下文
     * @return 移动后的碰撞形状
     */
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        VoxelShape voxelShape = HangingFruitShapes.DEFAULT_COLL_SHAPES[state.getValue(AGE)];
        Vec3 vec3d = state.getOffset(world, pos);
        return voxelShape.move(vec3d.x, vec3d.y, vec3d.z);
    }

    /**
     * 获取最大水平偏移量
     *
     * @return 最大水平偏移量
     */
    @Override
    public float getMaxHorizontalOffset() {
        return super.getMaxHorizontalOffset();
    }

    /**
     * 检查方块是否可以生存
     * 条件：上方方块可以维持植物生长，或者是开花的苹果树叶
     *
     * @param state 方块状态
     * @param world 世界读取器
     * @param pos 方块位置
     * @return 如果满足生存条件返回 true
     */
    @Override
    public boolean canSurvive(BlockState state,LevelReader world, BlockPos pos) {
        TriState soilDecision = world.getBlockState(pos.above()).canSustainPlant(world, pos.above(), Direction.DOWN, state);
        return !soilDecision.isDefault() ? soilDecision.isTrue() : world.getBlockState(pos.above()).is(FruityBlocks.FLOWER_APPLE_LEAVES);
    }

    /**
     * 处理无物品交互（右键采摘苹果）
     * <p>
     * 当苹果完全成熟（AGE=4）时：
     * - 掉落一个苹果物品
     * - 播放采摘音效
     * - 重置生长阶段为 0
     *
     * @param state 方块状态
     * @param world 世界对象
     * @param pos 方块位置
     * @param player 玩家对象
     * @param hit 命中结果
     * @return 交互结果
     */
    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        int i = state.getValue(AGE);
        if (i == 4) {
            HangingFruitBlock.popResource(world, pos, new ItemStack(Items.APPLE, 1));
            HangingFruitBlock.playPickFruitSound(world, pos);
            if (!world.isClientSide()) {
                BlockState blockState = state.setValue(AGE, 0);
                world.setBlock(pos, blockState, Block.UPDATE_CLIENTS);
                world.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, blockState));

            }
            return InteractionResult.SUCCESS;
        }
        return super.useWithoutItem(state, world, pos, player, hit);
    }

    /**
     * 获取玩家中键拾取此方块时获得的物品
     * <p>
     * 返回苹果物品，用于创造模式下的方块复制
     *
     * @param state   当前方块状态
     * @param target  命中结果信息
     * @param level   世界读取器
     * @param pos     方块位置
     * @param player  执行拾取的玩家
     * @return 包含苹果物品的 ItemStack
     */
    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos, Player player) {
        return new ItemStack(Items.APPLE);
    }
}
