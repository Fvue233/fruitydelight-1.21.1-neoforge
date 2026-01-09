package net.fvue.fruitydelight;

import net.fvue.fruitydelight.datagen.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = FruityDelight.MOD_ID)

public class FruityDataGenerater {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        //generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
        //        List.of(new LootTableProvider.SubProviderEntry(FruityBlockLootTablesProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        //generator.addProvider(event.includeServer(), new FruityRecipesProvider(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new FruityBlockTagsProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new FruityItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        //generator.addProvider(event.includeClient(), new FruityItemModelsProvider(packOutput, existingFileHelper));
        //generator.addProvider(event.includeClient(), new FruityBlockStatesProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new FruityEnUsLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new FruityZhCnLangProvider(packOutput));
    }
}
