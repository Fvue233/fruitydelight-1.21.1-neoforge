package net.fvue.fruitydelight.datagen;

import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.block.FruityBlocks;
import net.fvue.fruitydelight.item.FruityItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class FruityZhCnLangProvider extends LanguageProvider {

    public FruityZhCnLangProvider(PackOutput output) {
        super(output, FruityDelight.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        // 注册物品组标签
        add("itemGroup.fruitydelight_tab","果香四溢");

// 注册水果类物品
        add(FruityItems.ORANGE.get(), "橙子");
        add(FruityItems.PEAR.get(), "梨");
        add(FruityItems.BANANA.get(), "香蕉");
        add(FruityItems.BANANAS.get(), "香蕉串");
        add(FruityItems.APPLE_JUICE.get(), "苹果汁");
        add(FruityItems.APPLE_JUICE_BUCKET.get(), "苹果汁桶");
        add(FruityItems.APPLE_POPSICLE.get(), "苹果冰棍");
        add(FruityItems.APPLE_POPSICLE_MOLD_SOLID.get(), "苹果冰棍模具（冷冻）");
        add(FruityItems.APPLE_POPSICLE_MOLD_FILLED.get(), "苹果冰棍模具（填充）");
        add(FruityItems.BANANA_JUICE.get(), "香蕉汁"); // 修正原错误：原参数是"Banana"
        add(FruityItems.BANANA_JUICE_BUCKET.get(), "香蕉汁桶");
        add(FruityItems.BANANA_POPSICLE.get(), "香蕉冰棍");
        add(FruityItems.BANANA_POPSICLE_MOLD_FILLED.get(), "香蕉冰棍模具（填充）");
        add(FruityItems.BANANA_POPSICLE_MOLD_SOLID.get(), "香蕉冰棍模具（冷冻）");
        add(FruityItems.PEAR_JUICE.get(), "梨汁");
        add(FruityItems.PEAR_JUICE_BUCKET.get(), "梨汁桶");
        add(FruityItems.PEAR_POPSICLE.get(), "梨冰棍");
        add(FruityItems.PEAR_POPSICLE_MOLD_FILLED.get(), "梨冰棍模具（填充）");
        add(FruityItems.PEAR_POPSICLE_MOLD_SOLID.get(), "梨冰棍模具（冷冻）");
        add(FruityItems.ORANGE_JUICE.get(), "橙汁");
        add(FruityItems.ORANGE_JUICE_BUCKET.get(), "橙汁桶");
        add(FruityItems.ORANGE_POPSICLE.get(), "橙子冰棍");
        add(FruityItems.ORANGE_POPSICLE_MOLD_FILLED.get(), "橙子冰棍模具（填充）");
        add(FruityItems.ORANGE_POPSICLE_MOLD_SOLID.get(), "橙子冰棍模具（冷冻）");
        add(FruityItems.COCONUT_JUICE.get(), "椰子汁");
        add(FruityItems.COCONUT_POPSICLE.get(), "椰子冰棍");
        add(FruityItems.COCONUT_JUICE_BUCKET.get(), "椰子汁桶"); // 修正原错误：原参数是"Coconut Popsicle Mold Filled"
        add(FruityItems.COCONUT_POPSICLE_MOLD_FILLED.get(), "椰子冰棍模具（填充）");
        add(FruityItems.COCONUT_POPSICLE_MOLD_SOLID.get(), "椰子冰棍模具（冷冻）");
        add(FruityItems.PINEAPPLE_JUICE_BUCKET.get(), "菠萝汁桶");
        add(FruityItems.PINEAPPLE_POPSICLE.get(), "菠萝冰棍");
        add(FruityItems.PINEAPPLE_POPSICLE_MOLD_FILLED.get(), "菠萝冰棍模具（填充）");
        add(FruityItems.PINEAPPLE_POPSICLE_MOLD_SOLID.get(), "菠萝冰棍模具（冷冻）");
        add(FruityItems.STRAWBERRY_JUICE_BUCKET.get(), "草莓汁桶");
        add(FruityItems.STRAWBERRY_POPSICLE.get(), "草莓冰棍");
        add(FruityItems.STRAWBERRY_POPSICLE_MOLD_FILLED.get(), "草莓冰棍模具（填充）");
        add(FruityItems.STRAWBERRY_POPSICLE_MOLD_SOLID.get(), "草莓冰棍模具（冷冻）");
        add(FruityItems.TANGHULU.get(), "糖葫芦");
        add(FruityItems.HAWTHORN_SKEWER.get(), "山楂串");
        add(FruityItems.SYRUP_BUCKET.get(), "糖浆桶");
        add(FruityItems.SYRUP_BOTTLE.get(), "糖浆瓶");

// 注册水果类方块
        add(FruityBlocks.APPLE_LEAVES.get(), "苹果树叶");
        add(FruityBlocks.FLOWER_APPLE_LEAVES.get(), "开花的苹果树叶");
        add(FruityBlocks.APPLE_SAPLING.get(), "苹果树苗");
        add(FruityBlocks.PEAR_LEAVES.get(), "梨树叶");
        add(FruityBlocks.FLOWER_PEAR_LEAVES.get(), "开花的梨树叶");
        add(FruityBlocks.PEAR_SAPLING.get(), "梨树苗");
        add(FruityBlocks.ORANGE_LEAVES.get(), "橙子树叶");
        add(FruityBlocks.ORANGE_SAPLING.get(), "橙子树苗");
        add(FruityBlocks.FLOWER_ORANGE_LEAVES.get(), "开花的橙子树叶");
        add(FruityBlocks.BANANA_LEAVES.get(), "香蕉树叶");
        add(FruityBlocks.BANANA_SAPLING.get(), "香蕉树苗");
        add(FruityBlocks.FLOWER_BANANA_LEAVES.get(), "开花的香蕉树叶");
//流体
        add("fluid_type.fruitydelight.apple_juice","苹果汁");
        add("fluid_type.fruitydelight.pear_juice","梨汁");
        add("fluid_type.fruitydelight.orange_juice","橙子汁");
        add("fluid_type.fruitydelight.banana_juice","香蕉汁");
        add("fluid_type.fruitydelight.coconut_juice","椰子汁");
        add("fluid_type.fruitydelight.pineapple_juice","菠萝汁");
        add("fluid_type.fruitydelight.strawberry_juice","草莓汁");
        add("fluid_type.fruitydelight.syrup","糖浆");
    }
}
