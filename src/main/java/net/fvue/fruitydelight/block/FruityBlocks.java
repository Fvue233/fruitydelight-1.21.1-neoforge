package net.fvue.fruitydelight.block;


import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.fluid.FruityFluids;
import net.fvue.fruitydelight.item.FruityItems;
import net.fvue.fruitydelight.wrold.tree.FruityTreeGenerator;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FruityBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FruityDelight.MOD_ID);


    // Pear
    public static final DeferredBlock<Block> PEAR_SAPLING =
            register("pear_sapling",()-> new SaplingBlock(FruityTreeGenerator.PEAR_SAPLING_GENERATOR,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> HANGING_PEAR =
            register("hanging_pear", () -> new HangingPearBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noOcclusion().dynamicShape().sound(SoundType.AZALEA).pushReaction(PushReaction.DESTROY).randomTicks().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final  DeferredBlock<Block> FLOWER_PEAR_LEAVES =
            register("flower_pear_leaves", () -> new FruityLeavesBlock(HANGING_PEAR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final  DeferredBlock<Block> PEAR_LEAVES =
            register("pear_leaves", () -> new FruityLeavesBlock(HANGING_PEAR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    // Apple
    public static final DeferredBlock<Block> APPLE_SAPLING =
            register("apple_sapling",()-> new SaplingBlock(FruityTreeGenerator.APPLE_SAPLING_GENERATOR,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> HANGING_APPLE =
            register("hanging_apple", () -> new HangingAppleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noOcclusion().dynamicShape().sound(SoundType.AZALEA).pushReaction(PushReaction.DESTROY).randomTicks().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final DeferredBlock<Block> FLOWER_APPLE_LEAVES =
            register("flower_apple_leaves", () -> new FruityLeavesBlock(HANGING_APPLE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final  DeferredBlock<Block> APPLE_LEAVES =
            register("apple_leaves", () -> new FruityLeavesBlock(HANGING_APPLE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    // Orange
    public static final DeferredBlock<Block> ORANGE_SAPLING =
            register("orange_sapling",()-> new SaplingBlock(FruityTreeGenerator.ORANGE_SAPLING_GENERATOR,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> HANGING_ORANGE =
            register("hanging_orange", () -> new HangingOrangeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).noOcclusion().dynamicShape().sound(SoundType.AZALEA).pushReaction(PushReaction.DESTROY).randomTicks().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final DeferredBlock<Block> FLOWER_ORANGE_LEAVES =
            register("flower_orange_leaves", () -> new FruityLeavesBlock(HANGING_ORANGE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final  DeferredBlock<Block> ORANGE_LEAVES =
            register("orange_leaves", () -> new FruityLeavesBlock(HANGING_ORANGE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    //Banana
    public static final DeferredBlock<Block> BANANA_SAPLING =
            register("banana_sapling",()-> new SaplingBlock(FruityTreeGenerator.BANANA_SAPLING_GENERATOR,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> HANGING_BANANA =
            register("hanging_banana", () -> new HangingBananaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noOcclusion().dynamicShape().sound(SoundType.AZALEA).pushReaction(PushReaction.DESTROY).randomTicks().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final DeferredBlock<Block> FLOWER_BANANA_LEAVES =
            register("flower_banana_leaves", () -> new FruityLeavesBlock(HANGING_BANANA.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final  DeferredBlock<Block> BANANA_LEAVES =
            register("banana_leaves", () -> new FruityLeavesBlock(HANGING_BANANA.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    //Fluid
    public static final DeferredBlock<LiquidBlock> APPLE_JUICE_BLOCK;
    public static final DeferredBlock<LiquidBlock> PEAR_JUICE_BLOCK;
    public static final DeferredBlock<LiquidBlock> ORANGE_JUICE_BLOCK;
    public static final DeferredBlock<LiquidBlock> BANANA_JUICE_BLOCK;
    public static final DeferredBlock<LiquidBlock> COCONUT_JUICE_BLOCK;
    public static final DeferredBlock<LiquidBlock> PINEAPPLE_JUICE_BLOCK;
    public static final DeferredBlock<LiquidBlock> STRAWBERRY_JUICE_BLOCK;
    public static final DeferredBlock<LiquidBlock> SYRUP_BLOCK;
    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        FruityItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties()));
    }
    private static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block) {
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    static {
        APPLE_JUICE_BLOCK = BLOCKS.register("apple_juice_block", () -> new LiquidBlock((FlowingFluid) FruityFluids.APPLE_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
        PEAR_JUICE_BLOCK = BLOCKS.register("pear_juice_block", () -> new LiquidBlock((FlowingFluid) FruityFluids.PEAR_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
        ORANGE_JUICE_BLOCK = BLOCKS.register("orange_juice_block", () -> new LiquidBlock((FlowingFluid) FruityFluids.ORANGE_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
        BANANA_JUICE_BLOCK = BLOCKS.register("banana_juice_block", () -> new LiquidBlock((FlowingFluid) FruityFluids.BANANA_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
        COCONUT_JUICE_BLOCK = BLOCKS.register("coconut_juice_block", () -> new LiquidBlock((FlowingFluid) FruityFluids.COCONUT_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
        PINEAPPLE_JUICE_BLOCK = BLOCKS.register("pineapple_juice_block", () -> new LiquidBlock((FlowingFluid) FruityFluids.PINEAPPLE_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
        STRAWBERRY_JUICE_BLOCK = BLOCKS.register("strawberry_juice_block", () -> new LiquidBlock((FlowingFluid) FruityFluids.STRAWBERRY_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));

        SYRUP_BLOCK = BLOCKS.register("syrup_block", () -> new LiquidBlock((FlowingFluid) FruityFluids.SYRUP.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    }
}
