package net.fvue.fruitydelight.wrold.tree;


import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.wrold.FruityConfigureFeature;
import net.minecraft.world.level.block.grower.TreeGrower;


import java.util.Optional;

/**
 * 果树生长器生成器
 * <p>
 * 为每种果树的树苗定义 TreeGrower 实例，关联到对应的配置特征
 * 当玩家使用骨粉催熟树苗时，使用此生长器生成对应结构的树
 */
public class FruityTreeGenerator {
    // 苹果树苗生长器，关联苹果树配置特征
    public static final TreeGrower APPLE_SAPLING_GENERATOR = new TreeGrower(FruityDelight.MOD_ID + ":apple",
            Optional.empty(), Optional.of(FruityConfigureFeature.APPLE_TREE_KEY), Optional.empty());
    // 橙子树苗生长器，关联橙子树配置特征
    public static final TreeGrower ORANGE_SAPLING_GENERATOR = new TreeGrower(FruityDelight.MOD_ID + ":orange",
            Optional.empty(), Optional.of(FruityConfigureFeature.ORANGE_TREE_KEY), Optional.empty());
    // 梨树苗生长器，关联梨树配置特征
    public static final TreeGrower PEAR_SAPLING_GENERATOR = new TreeGrower(FruityDelight.MOD_ID + ":pear",
            Optional.empty(), Optional.of(FruityConfigureFeature.PEAR_TREE_KEY), Optional.empty());
    // 香蕉树苗生长器，关联香蕉树配置特征
    public static final TreeGrower BANANA_SAPLING_GENERATOR = new TreeGrower(FruityDelight.MOD_ID + ":banana",
            Optional.empty(), Optional.of(FruityConfigureFeature.BANANA_TREE_KEY), Optional.empty());
    // 山楂树苗生长器，关联山楂树配置特征
    public static final TreeGrower HAWTHORN_SAPLING_GENERATOR = new TreeGrower(FruityDelight.MOD_ID + ":hawthorn",
            Optional.empty(), Optional.of(FruityConfigureFeature.HAWTHORN_TREE_KEY), Optional.empty());
}
