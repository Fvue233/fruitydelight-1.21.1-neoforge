package net.fvue.fruitydelight.init;


import net.fvue.fruitydelight.FruityDelight;
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


                        output.accept(FruityBlocks.APPLE_SAPLING); // 苹果树苗
                        output.accept(FruityBlocks.PEAR_SAPLING); // 梨树苗
                        output.accept(FruityBlocks.ORANGE_SAPLING); // 橙子树苗
                        output.accept(FruityBlocks.BANANA_SAPLING); // 香蕉树苗
                        output.accept(FruityBlocks.HAWTHORN_SAPLING); // 山楂树苗

                        output.accept(FruityBlocks.APPLE_LEAVES); // 苹果树叶
                        output.accept(FruityBlocks.FLOWER_APPLE_LEAVES); // 开花的苹果树叶
                        output.accept(FruityBlocks.PEAR_LEAVES); // 梨树叶
                        output.accept(FruityBlocks.FLOWER_PEAR_LEAVES); // 开花的梨树叶
                        output.accept(FruityBlocks.ORANGE_LEAVES); // 橙子树叶
                        output.accept(FruityBlocks.FLOWER_ORANGE_LEAVES); // 开花的橙子树叶
                        output.accept(FruityBlocks.BANANA_LEAVES); // 香蕉树叶
                        output.accept(FruityBlocks.FLOWER_BANANA_LEAVES); // 开花的香蕉树叶
                        output.accept(FruityBlocks.HAWTHORN_LEAVES); // 山楂树叶
                        output.accept(FruityBlocks.FLOWER_HAWTHORN_LEAVES); // 开花的山楂树叶

                        output.accept(Items.APPLE); // 苹果
                        output.accept(FruityItems.PEAR); // 梨
                        output.accept(FruityItems.ORANGE); // 橙子
                        output.accept(FruityItems.BANANAS); // 香蕉串
                        output.accept(FruityItems.BANANA); // 香蕉
                        output.accept(FruityItems.HAWTHORN); // 山楂

                        output.accept(FruityItems.APPLE_JUICE); // 苹果汁
                        //output.accept(FruityItems.APPLE_JELLY);
                        output.accept(FruityItems.PEAR_JUICE); // 梨汁
                        output.accept(FruityItems.ORANGE_JUICE); // 橙子汁
                        output.accept(FruityItems.BANANA_JUICE); // 香蕉汁

                        output.accept(FruityItems.APPLE_POPSICLE); // 苹果冰棍
                        output.accept(FruityItems.PEAR_POPSICLE); // 梨冰棍
                        output.accept(FruityItems.ORANGE_POPSICLE); // 橙子冰棍
                        output.accept(FruityItems.BANANA_POPSICLE); // 香蕉冰棍

                        output.accept(FruityItems.HAWTHORN_SKEWER); // 山楂串
                        output.accept(FruityItems.TANGHULU); // 糖葫芦

                        output.accept(FruityItems.SYRUP_BUCKET); // 糖浆桶
                        output.accept(FruityItems.SYRUP_BOTTLE); // 糖浆瓶

                        output.accept(FruityBlocks.APPLE_CAKE); // 苹果蛋糕
                        output.accept(FruityBlocks.PEAR_CAKE); // 梨蛋糕
                        output.accept(FruityItems.APPLE_CAKE_SLICE); // 苹果蛋糕片
                        output.accept(FruityItems.PEAR_CAKE_SLICE); // 苹果蛋糕片

                        if (ModList.get().isLoaded("create")) {
                            output.accept(FruityItems.APPLE_JUICE_BUCKET); // 苹果汁桶
                            output.accept(FruityItems.PEAR_JUICE_BUCKET); // 梨汁桶
                            output.accept(FruityItems.ORANGE_JUICE_BUCKET); // 橙子汁桶
                            output.accept(FruityItems.BANANA_JUICE_BUCKET); // 香蕉汁桶

                        }
                        if (ModList.get().isLoaded("ratatouille")) {
                            output.accept(FruityItems.APPLE_POPSICLE_MOLD_SOLID); // 苹果冰棍模具（冷冻）
                            output.accept(FruityItems.APPLE_POPSICLE_MOLD_FILLED); // 苹果冰棍模具（填充）
                            output.accept(FruityItems.PEAR_POPSICLE_MOLD_SOLID); // 梨冰棍模具（冷冻）
                            output.accept(FruityItems.PEAR_POPSICLE_MOLD_FILLED); // 梨冰棍模具（填充）
                            output.accept(FruityItems.ORANGE_POPSICLE_MOLD_SOLID); // 橙子冰棍模具（冷冻）
                            output.accept(FruityItems.ORANGE_POPSICLE_MOLD_FILLED); // 橙子冰棍模具（填充）
                            output.accept(FruityItems.BANANA_POPSICLE_MOLD_SOLID); // 香蕉冰棍模具（冷冻）
                            output.accept(FruityItems.BANANA_POPSICLE_MOLD_FILLED); // 香蕉冰棍模具（填充）
                        }
                        if (ModList.get().isLoaded("beachparty")) {
                            output.accept(FruityItems.COCONUT_JUICE); // 椰汁
                            output.accept(FruityItems.COCONUT_JUICE_BUCKET); // 椰汁桶
                            output.accept(FruityItems.COCONUT_POPSICLE); // 椰子冰棍
                            output.accept(FruityItems.COCONUT_POPSICLE_MOLD_SOLID); // 椰子冰棍模具（冷冻）
                            output.accept(FruityItems.COCONUT_POPSICLE_MOLD_FILLED); // 椰子冰棍模具（填充）
                        }
                        if (ModList.get().isLoaded("farm_and_charm")) {
                            output.accept(FruityItems.STRAWBERRY_JUICE_BUCKET); // 草莓汁桶
                            output.accept(FruityItems.STRAWBERRY_POPSICLE); // 草莓冰棍
                            output.accept(FruityItems.STRAWBERRY_POPSICLE_MOLD_SOLID); // 草莓冰棍模具（冷冻）
                            output.accept(FruityItems.STRAWBERRY_POPSICLE_MOLD_FILLED); // 草莓冰棍模具（填充）
                        }
                        if (ModList.get().isLoaded("pineapple_delight")) {
                            output.accept(FruityItems.PINEAPPLE_JUICE_BUCKET); // 菠萝汁
                            output.accept(FruityItems.PINEAPPLE_POPSICLE); // 菠萝冰棍
                            output.accept(FruityItems.PINEAPPLE_POPSICLE_MOLD_SOLID); // 菠萝冰棍模具（冷冻）
                            output.accept(FruityItems.PINEAPPLE_POPSICLE_MOLD_FILLED); // 菠萝冰棍模具（填充）
                        }

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}





