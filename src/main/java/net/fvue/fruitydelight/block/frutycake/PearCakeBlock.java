package net.fvue.fruitydelight.block.frutycake;


import net.fvue.fruitydelight.init.FruityItems;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import vectorwing.farmersdelight.common.tag.ModTags;

/**
 * 梨蛋糕方块
 * <p>
 * 继承自原版蛋糕方块，支持使用刀具切割获取蛋糕切片
 * 玩家可以直接食用或使用刀切割获得梨蛋糕切片物品
 */
public final class PearCakeBlock extends CakeBlock {
    /**
     * 构造梨蛋糕方块
     * 复制原版蛋糕的方块属性
     */
    public PearCakeBlock() {
        super(Properties.ofFullCopy(Blocks.CAKE));
    }

    /**
     * 处理物品交互（使用刀具切割蛋糕）
     * <p>
     * 当玩家使用刀具右键蛋糕时：
     * - 增加蛋糕被切次数
     * - 掉落一个梨蛋糕切片
     * - 如果蛋糕已被切完则移除方块
     *
     * @param stack 玩家手中的物品
     * @param state 当前方块状态
     * @param level 世界对象
     * @param pos 方块位置
     * @param player 玩家对象
     * @param hand 交互的手
     * @param hitResult 命中结果
     * @return 交互结果
     */
    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        int i = state.getValue(BITES);

        // 如果不是刀具，使用默认蛋糕行为
        if (!stack.is(ModTags.Items.KNIVES)) {
            return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
        }

        // 根据已切次数更新蛋糕状态
        if (i < 6) {
            level.setBlock(pos, state.setValue(BITES, i + 1), 3);
        } else {
            level.removeBlock(pos, false);
            level.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
        }

        // 生成梨蛋糕切片物品
        final var cake = new ItemStack(FruityItems.PEAR_CAKE_SLICE.get());

        // 尝试添加到玩家背包，失败则掉落在地上
        if (!player.addItem(cake)) {
            level.addFreshEntity(new ItemEntity((Level) level, pos.getX(), pos.getY(), pos.getZ(), cake));
        }

        return ItemInteractionResult.SUCCESS;
    }

    /**
     * 食用蛋糕
     * <p>
     * 玩家直接右键蛋糕时的食用逻辑：
     * - 恢复饥饿值和饱和度
     * - 增加食用统计
     * - 更新蛋糕被咬次数或移除方块
     *
     * @param level 世界访问器
     * @param pos 方块位置
     * @param state 方块状态
     * @param player 玩家对象
     * @return 交互结果
     */
    public static InteractionResult eat(LevelAccessor level, BlockPos pos, BlockState state,
                                        Player player) {
        int i = state.getValue(BITES);

        // 检查玩家是否可以进食
        if(!player.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            player.awardStat(Stats.EAT_CAKE_SLICE);
            player.getFoodData().eat(3, 0.4F);
            level.gameEvent(player, GameEvent.EAT, pos);

            // 更新蛋糕状态
            if (i < 6) {
                level.setBlock(pos, state.setValue(BITES, i + 1), 3);
            } else {
                level.removeBlock(pos, false);
                level.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }

            return InteractionResult.SUCCESS;
        }
    }
}
