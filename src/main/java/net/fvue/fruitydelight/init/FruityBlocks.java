package net.fvue.fruitydelight.init;

import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.block.FruityLeavesBlock;
import net.fvue.fruitydelight.block.frutycake.*;
import net.fvue.fruitydelight.block.hangingfruit.FruitBlock.*;
import net.fvue.fruitydelight.wrold.tree.FruityTreeGenerator;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public interface FruityBlocks {
    DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FruityDelight.MOD_ID);

    // 梨
    DeferredBlock<Block> PEAR_SAPLING = register("pear_sapling",()->
            new SaplingBlock(FruityTreeGenerator.PEAR_SAPLING_GENERATOR,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    DeferredBlock<Block> HANGING_PEAR = register("hanging_pear", () ->
            new HangingPearBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noOcclusion().dynamicShape().sound(SoundType.AZALEA)
                    .pushReaction(PushReaction.DESTROY).randomTicks().offsetType(BlockBehaviour.OffsetType.XZ)));
    DeferredBlock<Block> FLOWER_PEAR_LEAVES = register("flower_pear_leaves", () ->
            new FruityLeavesBlock(HANGING_PEAR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    DeferredBlock<Block> PEAR_LEAVES = register("pear_leaves", () ->
            new FruityLeavesBlock(HANGING_PEAR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    // 苹果
    DeferredBlock<Block> APPLE_SAPLING = register("apple_sapling",()->
            new SaplingBlock(FruityTreeGenerator.APPLE_SAPLING_GENERATOR,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    DeferredBlock<Block> HANGING_APPLE = register("hanging_apple", () ->
            new HangingAppleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noOcclusion().dynamicShape().sound(SoundType.AZALEA)
                    .pushReaction(PushReaction.DESTROY).randomTicks().offsetType(BlockBehaviour.OffsetType.XZ)));
    DeferredBlock<Block> FLOWER_APPLE_LEAVES = register("flower_apple_leaves", () ->
            new FruityLeavesBlock(HANGING_APPLE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    DeferredBlock<Block> APPLE_LEAVES = register("apple_leaves", () ->
            new FruityLeavesBlock(HANGING_APPLE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    // 山楂
    DeferredBlock<Block> HAWTHORN_SAPLING = register("hawthorn_sapling",()->
            new SaplingBlock(FruityTreeGenerator.HAWTHORN_SAPLING_GENERATOR,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    DeferredBlock<Block> HANGING_HAWTHORN = register("hanging_hawthorn", () ->
            new HangingHawthornBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noOcclusion().dynamicShape().sound(SoundType.AZALEA)
                    .pushReaction(PushReaction.DESTROY).randomTicks().offsetType(BlockBehaviour.OffsetType.XZ)));
    DeferredBlock<Block> FLOWER_HAWTHORN_LEAVES = register("flower_hawthorn_leaves", () ->
            new FruityLeavesBlock(HANGING_HAWTHORN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    DeferredBlock<Block> HAWTHORN_LEAVES = register("hawthorn_leaves", () ->
            new FruityLeavesBlock(HANGING_HAWTHORN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    // 橙子
    DeferredBlock<Block> ORANGE_SAPLING = register("orange_sapling",()->
            new SaplingBlock(FruityTreeGenerator.ORANGE_SAPLING_GENERATOR,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    DeferredBlock<Block> HANGING_ORANGE = register("hanging_orange", () ->
            new HangingOrangeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).noOcclusion().dynamicShape().sound(SoundType.AZALEA)
                    .pushReaction(PushReaction.DESTROY).randomTicks().offsetType(BlockBehaviour.OffsetType.XZ)));
    DeferredBlock<Block> FLOWER_ORANGE_LEAVES = register("flower_orange_leaves", () ->
            new FruityLeavesBlock(HANGING_ORANGE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    DeferredBlock<Block> ORANGE_LEAVES = register("orange_leaves", () ->
            new FruityLeavesBlock(HANGING_ORANGE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    // 香蕉
    DeferredBlock<Block> BANANA_SAPLING = register("banana_sapling",()->
            new SaplingBlock(FruityTreeGenerator.BANANA_SAPLING_GENERATOR,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    DeferredBlock<Block> HANGING_BANANA = register("hanging_banana", () ->
            new HangingBananaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noOcclusion().dynamicShape().sound(SoundType.AZALEA)
                    .pushReaction(PushReaction.DESTROY).randomTicks().offsetType(BlockBehaviour.OffsetType.XZ)));
    DeferredBlock<Block> FLOWER_BANANA_LEAVES = register("flower_banana_leaves", () ->
            new FruityLeavesBlock(HANGING_BANANA.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    DeferredBlock<Block> BANANA_LEAVES = register("banana_leaves", () ->
            new FruityLeavesBlock(HANGING_BANANA.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    // 蛋糕
    DeferredBlock<Block> APPLE_CAKE = register("apple_cake", AppleCakeBlock::new);
    DeferredBlock<Block> PEAR_CAKE = register("pear_cake", PearCakeBlock::new);

    // 流体桶
    DeferredBlock<LiquidBlock> APPLE_JUICE_BLOCK = BLOCKS.register("apple_juice", () ->
            new LiquidBlock(FruityFluids.APPLE_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    DeferredBlock<LiquidBlock> PEAR_JUICE_BLOCK = BLOCKS.register("pear_juice", () ->
            new LiquidBlock(FruityFluids.PEAR_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    DeferredBlock<LiquidBlock> ORANGE_JUICE_BLOCK = BLOCKS.register("orange_juice", () ->
            new LiquidBlock(FruityFluids.ORANGE_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    DeferredBlock<LiquidBlock> BANANA_JUICE_BLOCK = BLOCKS.register("banana_juice", () ->
            new LiquidBlock(FruityFluids.BANANA_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    DeferredBlock<LiquidBlock> COCONUT_JUICE_BLOCK = BLOCKS.register("coconut_juice", () ->
            new LiquidBlock(FruityFluids.COCONUT_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    DeferredBlock<LiquidBlock> PINEAPPLE_JUICE_BLOCK = BLOCKS.register("pineapple_juice", () ->
            new LiquidBlock(FruityFluids.PINEAPPLE_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    DeferredBlock<LiquidBlock> STRAWBERRY_JUICE_BLOCK = BLOCKS.register("strawberry_juice", () ->
            new LiquidBlock(FruityFluids.STRAWBERRY_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    DeferredBlock<LiquidBlock> HAWTHORN_JUICE_BLOCK = BLOCKS.register("hawthorn_juice", () ->
            new LiquidBlock(FruityFluids.HAWTHORN_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    DeferredBlock<LiquidBlock> APPLE_JAM_BLOCK = BLOCKS.register("apple_jam", () ->
            new LiquidBlock(FruityFluids.APPLE_JAM.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    DeferredBlock<LiquidBlock> SYRUP_BLOCK = BLOCKS.register("syrup", () ->
            new LiquidBlock(FruityFluids.SYRUP.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));



    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        FruityItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block) {
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }

    static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
