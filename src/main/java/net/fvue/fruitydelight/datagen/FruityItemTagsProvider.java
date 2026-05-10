package net.fvue.fruitydelight.datagen;

import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.init.FruityItems;
import net.fvue.fruitydelight.init.FruityItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.concurrent.CompletableFuture;

public class FruityItemTagsProvider extends ItemTagsProvider {

    public FruityItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags,  @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, FruityDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // c:fruits
        tag(FruityItemTags.FRUITS_NEO)
                .add(FruityItems.PEAR.get())
                .add(FruityItems.ORANGE.get())
                .add(FruityItems.BANANAS.get())
                .add(FruityItems.BANANA.get())
                .add(FruityItems.HAWTHORN.get());
        // c:crpos/fruits
        tag(FruityItemTags.CROPS_FRUITS)
                .add(FruityItems.PEAR.get())
                .add(FruityItems.ORANGE.get())
                .add(FruityItems.BANANAS.get())
                .add(FruityItems.BANANA.get())
                .add(FruityItems.HAWTHORN.get());

        // fruitydelight:fruits
        tag(FruityItemTags.FRUITS)
                .add(Items.APPLE)
                .add(FruityItems.PEAR.get())
                .add(FruityItems.ORANGE.get())
                .add(FruityItems.BANANAS.get())
                .add(FruityItems.BANANA.get())
                .add(FruityItems.HAWTHORN.get());
        // fruitydelight:fruit_juices
        tag(FruityItemTags.FRUIT_JUICES)
                .add(FruityItems.BANANA_JUICE.get())
                .add(FruityItems.ORANGE_JUICE.get())
                .add(FruityItems.PEAR_JUICE.get())
                .add(FruityItems.APPLE_JUICE.get())
                .add(ModItems.MELON_JUICE.get())
                .add(FruityItems.COCONUT_JUICE.get());
        // fruitydelight:fruit_popsicles
        tag(FruityItemTags.FRUIT_POPSICLES)
                .add(FruityItems.BANANA_POPSICLE.get())
                .add(FruityItems.ORANGE_POPSICLE.get())
                .add(FruityItems.PEAR_POPSICLE.get())
                .add(FruityItems.APPLE_POPSICLE.get())
                .add(FruityItems.COCONUT_POPSICLE.get())
                .add(FruityItems.PINEAPPLE_POPSICLE.get())
                .add(FruityItems.STRAWBERRY_POPSICLE.get())
                .add(ModItems.MELON_POPSICLE.get());
    }
}
