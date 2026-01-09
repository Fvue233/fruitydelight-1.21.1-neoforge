package net.fvue.fruitydelight.block;

import net.fvue.fruitydelight.item.FruityItems;
import net.fvue.fruitydelight.item.FruitySound;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.common.util.TriState;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault


public class HangingPearBlock extends HangingFruitBlock{
    private static final VoxelShape[] SHAPES = new VoxelShape[]{Block.box(7, 13, 7, 9, 16, 9),
            Block.box(6, 13, 6, 10, 16, 10),
            Block.box(6.5, 13, 6.5, 9.5, 16, 9.5),
            Shapes.join(Block.box(5.5, 10, 5.5, 10.5, 15, 10.5), Block.box(7, 15, 7, 9, 16, 9), BooleanOp.OR),
            Shapes.join(Block.box(5, 8, 5, 11, 14, 11), Block.box(7, 14, 7, 9, 16, 9), BooleanOp.OR)};
    private static final VoxelShape[] COLL_SHAPES = new VoxelShape[]{Shapes.empty(),
            Shapes.empty(),
            Block.box(6.5, 13, 6.5, 9.5, 16, 9.5),
            Shapes.join(Block.box(5.5, 10, 5.5, 10.5, 15, 10.5), Block.box(7, 15, 7, 9, 16, 9), BooleanOp.OR),
            Shapes.join(Block.box(5, 8, 5, 11, 14, 11), Block.box(7, 14, 7, 9, 16, 9), BooleanOp.OR)};
    public HangingPearBlock(Properties settings) {
        super(settings);
    }

    @Override
    public  VoxelShape getShape(BlockState state,  BlockGetter world,  BlockPos pos,  CollisionContext context) {
        VoxelShape voxelShape = SHAPES[state.getValue(AGE)];
        Vec3 vec3d = state.getOffset(world, pos);
        return voxelShape.move(vec3d.x, vec3d.y, vec3d.z);
    }

    @Override
    public  VoxelShape getCollisionShape(BlockState state,  BlockGetter world,  BlockPos pos,  CollisionContext context) {
        VoxelShape voxelShape = COLL_SHAPES[state.getValue(AGE)];
        Vec3 vec3d = state.getOffset(world, pos);
        return voxelShape.move(vec3d.x, vec3d.y, vec3d.z);
    }

    @Override
    public float getMaxHorizontalOffset() {
        return super.getMaxHorizontalOffset();
    }

    @Override
    public boolean canSurvive(BlockState state,LevelReader world, BlockPos pos) {
        TriState soilDecision = world.getBlockState(pos.above()).canSustainPlant(world, pos.above(), Direction.DOWN, state);
        return !soilDecision.isDefault() ? soilDecision.isTrue() : world.getBlockState(pos.above()).is(FruityBlocks.FLOWER_PEAR_LEAVES);
    }

    @Override
    public  InteractionResult useWithoutItem(BlockState state,  Level world,  BlockPos pos,  Player player,  BlockHitResult hit) {
        int i = state.getValue(AGE);
        if (i == 4) {
            HangingFruitBlock.popResource(world, pos, new ItemStack(FruityItems.PEAR.get(), 1));
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


}