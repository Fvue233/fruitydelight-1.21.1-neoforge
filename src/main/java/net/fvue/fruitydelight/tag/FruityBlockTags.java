package net.fvue.fruitydelight.tag;

import net.fvue.fruitydelight.FruityDelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class FruityBlockTags {
    public static final TagKey<Block> FRUIT_LEAVES = BlockTags.create(ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, "fruit_leaves"));

}
