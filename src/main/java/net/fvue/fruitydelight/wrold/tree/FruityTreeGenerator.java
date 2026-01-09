package net.fvue.fruitydelight.wrold.tree;


import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.wrold.FruityConfigureFeature;
import net.minecraft.world.level.block.grower.TreeGrower;


import java.util.Optional;


public class FruityTreeGenerator {
    public static final TreeGrower APPLE_SAPLING_GENERATOR = new TreeGrower(FruityDelight.MOD_ID + ":apple",
            Optional.empty(), Optional.of(FruityConfigureFeature.APPLE_TREE_KEY), Optional.empty());
    public static final TreeGrower ORANGE_SAPLING_GENERATOR = new TreeGrower(FruityDelight.MOD_ID + ":orange",
            Optional.empty(), Optional.of(FruityConfigureFeature.ORANGE_TREE_KEY), Optional.empty());
    public static final TreeGrower PEAR_SAPLING_GENERATOR = new TreeGrower(FruityDelight.MOD_ID + ":pear",
            Optional.empty(), Optional.of(FruityConfigureFeature.PEAR_TREE_KEY), Optional.empty());
    public static final TreeGrower BANANA_SAPLING_GENERATOR = new TreeGrower(FruityDelight.MOD_ID + ":banana",
            Optional.empty(), Optional.of(FruityConfigureFeature.BANANA_TREE_KEY), Optional.empty());
}
