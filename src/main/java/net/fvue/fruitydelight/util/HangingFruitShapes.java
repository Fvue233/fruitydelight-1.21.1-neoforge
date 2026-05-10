package net.fvue.fruitydelight.util;

import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import  net.minecraft.world.level.block.Block;

/**
 * 悬挂果实碰撞箱工具类
 * <p>
 * 定义所有悬挂果实的视觉形状和碰撞形状数组
 * 包含默认形状（苹果、梨、橙子、山楂）和香蕉专用形状
 * 每个数组索引对应果实的生长阶段（AGE 0-4）
 */
public class HangingFruitShapes {

    /**
     * 默认果实的视觉形状数组
     * 用于苹果、梨、橙子、山楂等标准大小的果实
     * 索引 0-4 分别对应不同的生长阶段，果实逐渐变大
     */
    public static final VoxelShape[] DEFAULT_SHAPES = new VoxelShape[]{
            Block.box(7, 13, 7, 9, 16, 9),
            Block.box(6, 13, 6, 10, 16, 10),
            Block.box(6.5, 13, 6.5, 9.5, 16, 9.5),
            Shapes.join(
                    Block.box(5.5, 10, 5.5, 10.5, 15, 10.5),
                    Block.box(7, 15, 7, 9, 16, 9), BooleanOp.OR),
            Shapes.join(
                    Block.box(5, 8, 5, 11, 14, 11),
                    Block.box(7, 14, 7, 9, 16, 9), BooleanOp.OR)
    };

    /**
     * 默认果实的碰撞形状数组
     * 前两个生长阶段无碰撞体，成熟后才有碰撞检测
     * 用于苹果、梨、橙子、山楂等标准大小的果实
     */
    public static final VoxelShape[] DEFAULT_COLL_SHAPES = new VoxelShape[]{
            Shapes.empty(),
            Shapes.empty(),
            Block.box(6.5, 13, 6.5, 9.5, 16, 9.5),
            Shapes.join(
                    Block.box(5.5, 10, 5.5, 10.5, 15, 10.5),
                    Block.box(7, 15, 7, 9, 16, 9), BooleanOp.OR),
            Shapes.join(
                    Block.box(5, 8, 5, 11, 14, 11),
                    Block.box(7, 14, 7, 9, 16, 9), BooleanOp.OR)
    };

    /**
     * 香蕉的视觉形状数组
     * 香蕉串在完全成熟时具有特殊的 elongated 形状（Y轴延伸至34-36）
     */
    public static final VoxelShape[] BANANA_SHAPES = new VoxelShape[]{
            Block.box(7, 13, 7, 9, 16, 9),
            Block.box(6, 13, 6, 10, 16, 10),
            Block.box(6.5, 13, 6.5, 9.5, 16, 9.5),
            Shapes.join(
                    Block.box(5.5, 10, 5.5, 10.5, 15, 10.5),
                    Block.box(7, 15, 7, 9, 16, 9), BooleanOp.OR),
            Shapes.join(
                    Block.box(5, 8, 5, 11, 14, 11),
                    Block.box(7, 34, 7, 9, 36, 9), BooleanOp.OR)
    };

    /**
     * 香蕉的碰撞形状数组
     * 香蕉串的碰撞箱位置较高（Y轴33-36），匹配其特殊的视觉模型
     * 前两个生长阶段无碰撞体
     */
    public static final VoxelShape[] BANANA_COLL_SHAPES = new VoxelShape[]{
            Shapes.empty(),
            Shapes.empty(),
            Block.box(6.5, 8, 6.5, 9.5, 16, 9.5),
            Shapes.join(
                    Block.box(5.5, 4, 5.5, 10.5, 15, 10.5),
                    Block.box(7, 15, 7, 9, 16, 9), BooleanOp.OR),
            Shapes.join(
                    Block.box(5, 0, 5, 11, 14, 11),
                    Block.box(7, 14, 7, 9, 36, 9), BooleanOp.OR)
    };
}
