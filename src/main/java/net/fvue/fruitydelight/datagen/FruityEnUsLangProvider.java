package net.fvue.fruitydelight.datagen;

import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.block.FruityBlocks;
import net.fvue.fruitydelight.fluid.FruityFluids;
import net.fvue.fruitydelight.item.FruityItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class FruityEnUsLangProvider extends LanguageProvider {

    public FruityEnUsLangProvider(PackOutput output) {
        super(output, FruityDelight.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.fruitydelight_tab","FruityDelight");

        add(FruityItems.ORANGE.get(), "Orange");
        add(FruityItems.PEAR.get(), "Pear");
        add(FruityItems.BANANA.get(), "Banana");
        add(FruityItems.BANANAS.get(), "Bananas");
        add(FruityItems.APPLE_JUICE.get(), "Apple Juice");
        add(FruityItems.APPLE_JUICE_BUCKET.get(), "Apple Juice Bucket");
        add(FruityItems.APPLE_POPSICLE.get(), "Apple Popsicle");
        add(FruityItems.APPLE_POPSICLE_MOLD_SOLID.get(), "Apple Popsicle Mold Solid");
        add(FruityItems.APPLE_POPSICLE_MOLD_FILLED.get(), "Apple Popsicle Mold Filled");
        add(FruityItems.BANANA_JUICE.get(), "Banana");
        add(FruityItems.BANANA_JUICE_BUCKET.get(), "Banana Juice Bucket");
        add(FruityItems.BANANA_POPSICLE.get(), "Banana Popsicle");
        add(FruityItems.BANANA_POPSICLE_MOLD_FILLED.get(), "Banana Popsicle Mold Filled");
        add(FruityItems.BANANA_POPSICLE_MOLD_SOLID.get(), "Banana Popsicle Mold Solid");
        add(FruityItems.PEAR_JUICE.get(), "Pear Juice");
        add(FruityItems.PEAR_JUICE_BUCKET.get(), "Pear Juice Bucket");
        add(FruityItems.PEAR_POPSICLE.get(), "Pear Popsicle");
        add(FruityItems.PEAR_POPSICLE_MOLD_FILLED.get(), "Pear Popsicle Mold Filled");
        add(FruityItems.PEAR_POPSICLE_MOLD_SOLID.get(), "Pear Popsicle Mold Solid");
        add(FruityItems.ORANGE_JUICE.get(), "Orange Juice");
        add(FruityItems.ORANGE_JUICE_BUCKET.get(), "Orange Juice Bucket");
        add(FruityItems.ORANGE_POPSICLE.get(), "Orange Popsicle");
        add(FruityItems.ORANGE_POPSICLE_MOLD_FILLED.get(), "Orange Popsicle Mold Filled");
        add(FruityItems.ORANGE_POPSICLE_MOLD_SOLID.get(), "Orange Popsicle Mold Solid");
        add(FruityItems.COCONUT_JUICE.get(), "Coconut Juice");
        add(FruityItems.COCONUT_POPSICLE.get(), "Coconut Popsicle");
        add(FruityItems.COCONUT_JUICE_BUCKET.get(), "Coconut Popsicle Mold Filled");
        add(FruityItems.COCONUT_POPSICLE_MOLD_FILLED.get(), "Coconut Popsicle Mold Filled");
        add(FruityItems.COCONUT_POPSICLE_MOLD_SOLID.get(), "Coconut Popsicle Mold Solid");
        add(FruityItems.PINEAPPLE_JUICE_BUCKET.get(), "Pineapple Juice Bucket");
        add(FruityItems.PINEAPPLE_POPSICLE.get(), "Pineapple Popsicle");
        add(FruityItems.PINEAPPLE_POPSICLE_MOLD_FILLED.get(), "Pineapple Popsicle Mold Filled");
        add(FruityItems.PINEAPPLE_POPSICLE_MOLD_SOLID.get(), "Pineapple Popsicle Mold Solid");
        add(FruityItems.STRAWBERRY_JUICE_BUCKET.get(), "Strawberry Juice Bucket");
        add(FruityItems.STRAWBERRY_POPSICLE.get(), "Strawberry Popsicle");
        add(FruityItems.STRAWBERRY_POPSICLE_MOLD_FILLED.get(), "Strawberry Popsicle Mold Filled");
        add(FruityItems.STRAWBERRY_POPSICLE_MOLD_SOLID.get(), "Strawberry Popsicle Mold Solid");
        add(FruityItems.TANGHULU.get(), "Tanghulu");
        add(FruityItems.HAWTHORN_SKEWER.get(), "hawthorn_skewer");
        add(FruityItems.SYRUP_BUCKET.get(), "syrup_bucket");
        add(FruityItems.SYRUP_BOTTLE.get(), "syrup_bottle");


        add(FruityBlocks.APPLE_LEAVES.get(), "Apple Leaves");
        add(FruityBlocks.FLOWER_APPLE_LEAVES.get(), "Flower Apple Leaves");
        add(FruityBlocks.APPLE_SAPLING.get(), "Apple Sapling");
        add(FruityBlocks.PEAR_LEAVES.get(), "Pear Leaves");
        add(FruityBlocks.FLOWER_PEAR_LEAVES.get(), "Flower Pear Leaves");
        add(FruityBlocks.PEAR_SAPLING.get(), "Pear Sapling");
        add(FruityBlocks.ORANGE_LEAVES.get(), "Orange Leaves");
        add(FruityBlocks.ORANGE_SAPLING.get(), "Orange Sapling");
        add(FruityBlocks.FLOWER_ORANGE_LEAVES.get(), "Flower Orange Leaves");
        add(FruityBlocks.BANANA_LEAVES.get(), "Banana Leaves");
        add(FruityBlocks.BANANA_SAPLING.get(), "Banana Sapling");
        add(FruityBlocks.FLOWER_BANANA_LEAVES.get(), "Flower Banana Leaves");

        add("fluid_type.fruitydelight.apple_juice","Apple Juice");
        add("fluid_type.fruitydelight.pear_juice","Pear Juice");
        add("fluid_type.fruitydelight.orange_juice","Orange Juice");
        add("fluid_type.fruitydelight.banana_juice","Banana Juice");
        add("fluid_type.fruitydelight.coconut_juice","Coconut Juice");
        add("fluid_type.fruitydelight.pineapple_juice","Pineapple Juice");
        add("fluid_type.fruitydelight.strawberry_juice","Strawberry Juice");
        add("fluid_type.fruitydelight.syrup","Syrup");
    }
}
