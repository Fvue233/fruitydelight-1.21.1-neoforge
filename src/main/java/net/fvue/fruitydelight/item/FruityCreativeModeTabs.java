package net.fvue.fruitydelight.item;


import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.block.FruityBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FruityCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FruityDelight.MOD_ID);

    public static final Supplier<CreativeModeTab> FRUITYDELIGHT =
            CREATIVE_MODE_TABS.register("fruitydelight_tab",()-> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(FruityItems.PEAR.get()))
                    .title(Component.translatable("itemGroup.fruitydelight_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.APPLE);
                        output.accept(FruityBlocks.APPLE_SAPLING);
                        output.accept(FruityBlocks.APPLE_LEAVES);
                        output.accept(FruityBlocks.FLOWER_APPLE_LEAVES);
                        output.accept(FruityItems.APPLE_JUICE_BUCKET);
                        output.accept(FruityItems.APPLE_POPSICLE);
                        output.accept(FruityItems.APPLE_POPSICLE_MOLD_FILLED);
                        output.accept(FruityItems.APPLE_POPSICLE_MOLD_SOLID);
                        output.accept(FruityItems.APPLE_JUICE);
                        //output.accept(FruityItems.APPLE_JELLY);
                        output.accept(FruityItems.PEAR);
                        output.accept(FruityBlocks.PEAR_SAPLING);
                        output.accept(FruityBlocks.PEAR_LEAVES);
                        output.accept(FruityBlocks.FLOWER_PEAR_LEAVES);
                        output.accept(FruityItems.PEAR_JUICE_BUCKET);
                        output.accept(FruityItems.PEAR_POPSICLE);
                        output.accept(FruityItems.PEAR_POPSICLE_MOLD_FILLED);
                        output.accept(FruityItems.PEAR_POPSICLE_MOLD_SOLID);
                        output.accept(FruityItems.PEAR_JUICE);
                        output.accept(FruityItems.ORANGE);
                        output.accept(FruityBlocks.ORANGE_SAPLING);
                        output.accept(FruityBlocks.ORANGE_LEAVES);
                        output.accept(FruityBlocks.FLOWER_ORANGE_LEAVES);
                        output.accept(FruityItems.ORANGE_JUICE_BUCKET);
                        output.accept(FruityItems.ORANGE_POPSICLE);
                        output.accept(FruityItems.ORANGE_POPSICLE_MOLD_FILLED);
                        output.accept(FruityItems.ORANGE_POPSICLE_MOLD_SOLID);
                        output.accept(FruityItems.ORANGE_JUICE);
                        output.accept(FruityBlocks.BANANA_SAPLING);
                        output.accept(FruityItems.BANANAS);
                        output.accept(FruityItems.BANANA);
                        output.accept(FruityBlocks.BANANA_LEAVES);
                        output.accept(FruityBlocks.FLOWER_BANANA_LEAVES);
                        output.accept(FruityItems.BANANA_JUICE_BUCKET);
                        output.accept(FruityItems.BANANA_POPSICLE);
                        output.accept(FruityItems.BANANA_POPSICLE_MOLD_FILLED);
                        output.accept(FruityItems.BANANA_POPSICLE_MOLD_SOLID);
                        output.accept(FruityItems.BANANA_JUICE);
                        output.accept(FruityItems.HAWTHORN);
                        output.accept(FruityItems.HAWTHORN_SKEWER);
                        output.accept(FruityItems.TANGHULU);
                        if (ModList.get().isLoaded("beachparty")) {
                            output.accept(FruityItems.COCONUT_JUICE);
                            output.accept(FruityItems.COCONUT_JUICE_BUCKET);
                            output.accept(FruityItems.COCONUT_POPSICLE);
                            output.accept(FruityItems.COCONUT_POPSICLE_MOLD_FILLED);
                            output.accept(FruityItems.COCONUT_POPSICLE_MOLD_SOLID);
                        }
                        if (ModList.get().isLoaded("farm_and_charm")) {
                            output.accept(FruityItems.STRAWBERRY_JUICE_BUCKET);
                            output.accept(FruityItems.STRAWBERRY_POPSICLE);
                            output.accept(FruityItems.STRAWBERRY_POPSICLE_MOLD_FILLED);
                            output.accept(FruityItems.STRAWBERRY_POPSICLE_MOLD_SOLID);
                        }
                        if (ModList.get().isLoaded("pineapple_delight")) {
                            output.accept(FruityItems.PINEAPPLE_JUICE_BUCKET);
                            output.accept(FruityItems.PINEAPPLE_POPSICLE);
                            output.accept(FruityItems.PINEAPPLE_POPSICLE_MOLD_FILLED);
                            output.accept(FruityItems.PINEAPPLE_POPSICLE_MOLD_SOLID);
                        }

                        output.accept(FruityItems.SYRUP_BUCKET);
                        output.accept(FruityItems.SYRUP_BOTTLE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}





