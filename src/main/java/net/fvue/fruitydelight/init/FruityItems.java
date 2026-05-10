package net.fvue.fruitydelight.init;

import net.fvue.fruitydelight.FruityDelight;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.MelonJuiceItem;
import vectorwing.farmersdelight.common.item.PopsicleItem;

import static vectorwing.farmersdelight.common.registry.ModItems.foodItem;

public interface FruityItems {
    DeferredRegister.Items ITEMS = DeferredRegister.createItems(FruityDelight.MOD_ID);

    // 水果
    DeferredItem<Item> PEAR = ITEMS.register("pear",() -> new Item(new Item.Properties().food(FruityFoodComponents.FRUIT)));
    DeferredItem<Item> ORANGE = ITEMS.register("orange",() -> new Item(new Item.Properties().food(FruityFoodComponents.FRUIT)));
    DeferredItem<Item> BANANA= ITEMS.register("banana",() -> new Item(new Item.Properties().food(FruityFoodComponents.FRUIT)));
    DeferredItem<Item> BANANAS = ITEMS.register("bananas",() -> new Item(new Item.Properties()));
    DeferredItem<Item> HAWTHORN = ITEMS.register("hawthorn",() -> new Item(new Item.Properties().food(FruityFoodComponents.FRUIT_S)));
//    DeferredItem<Item> PEACH= ITEMS.register("peach",() -> new Item(new Item.Properties().food(FruityFoodComponents.FRUIT)));

    // 果汁
    DeferredItem<Item> APPLE_JUICE = ITEMS.register("apple_juice",() -> new MelonJuiceItem(drinkItem())); // 苹果汁
    DeferredItem<Item> PEAR_JUICE = ITEMS.register("pear_juice",() -> new MelonJuiceItem(drinkItem())); // 梨汁
    DeferredItem<Item> ORANGE_JUICE = ITEMS.register("orange_juice",() -> new MelonJuiceItem(drinkItem())); // 橙汁
    DeferredItem<Item> BANANA_JUICE = ITEMS.register("banana_juice",() -> new MelonJuiceItem(drinkItem())); // 香蕉汁
    DeferredItem<Item> COCONUT_JUICE = ITEMS.register("coconut_juice",() -> new MelonJuiceItem(drinkItem())); // 椰子汁

    //jelly
//    DeferredItem<Item> APPLE_JELLY = ITEMS.register("apple_jelly",() -> new Item(new Item.Properties().food(FruityFoodComponents.APPLE_JELLY)));

    // 模具
    DeferredItem<Item> APPLE_POPSICLE_MOLD_FILLED = ITEMS.register("apple_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    DeferredItem<Item> APPLE_POPSICLE_MOLD_SOLID = ITEMS.register("apple_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    DeferredItem<Item> PEAR_POPSICLE_MOLD_FILLED = ITEMS.register("pear_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    DeferredItem<Item> PEAR_POPSICLE_MOLD_SOLID = ITEMS.register("pear_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    DeferredItem<Item> ORANGE_POPSICLE_MOLD_FILLED = ITEMS.register("orange_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    DeferredItem<Item> ORANGE_POPSICLE_MOLD_SOLID = ITEMS.register("orange_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    DeferredItem<Item> BANANA_POPSICLE_MOLD_FILLED = ITEMS.register("banana_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    DeferredItem<Item> BANANA_POPSICLE_MOLD_SOLID = ITEMS.register("banana_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    DeferredItem<Item> COCONUT_POPSICLE_MOLD_FILLED = ITEMS.register("coconut_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    DeferredItem<Item> COCONUT_POPSICLE_MOLD_SOLID = ITEMS.register("coconut_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    DeferredItem<Item> PINEAPPLE_POPSICLE_MOLD_FILLED = ITEMS.register("pineapple_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    DeferredItem<Item> PINEAPPLE_POPSICLE_MOLD_SOLID = ITEMS.register("pineapple_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    DeferredItem<Item> STRAWBERRY_POPSICLE_MOLD_FILLED = ITEMS.register("strawberry_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    DeferredItem<Item> STRAWBERRY_POPSICLE_MOLD_SOLID = ITEMS.register("strawberry_popsicle_mold_solid",() -> new Item(new Item.Properties()));

    // 冰棍
    DeferredItem<Item> APPLE_POPSICLE = ITEMS.register("apple_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    DeferredItem<Item> PEAR_POPSICLE = ITEMS.register("pear_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    DeferredItem<Item> ORANGE_POPSICLE = ITEMS.register("orange_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    DeferredItem<Item> BANANA_POPSICLE = ITEMS.register("banana_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    DeferredItem<Item> COCONUT_POPSICLE = ITEMS.register("coconut_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    DeferredItem<Item> PINEAPPLE_POPSICLE = ITEMS.register("pineapple_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    DeferredItem<Item> STRAWBERRY_POPSICLE = ITEMS.register("strawberry_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));

    // 糖葫芦
    DeferredItem<Item> HAWTHORN_SKEWER= ITEMS.register("hawthorn_skewer",() -> new Item(new Item.Properties().food(FruityFoodComponents.HAWTHORN_SKEWER).durability(0)));
    DeferredItem<Item> TANGHULU= ITEMS.register("tanghulu",() -> new Item(new Item.Properties().food(FruityFoodComponents.TANGHULU)));

    // 瓶
    DeferredItem<Item> SYRUP_BOTTLE = ITEMS.register("syrup_bottle",() -> new Item(new Item.Properties().stacksTo(16)));

    // 水果蛋糕
    DeferredItem<Item> APPLE_CAKE_SLICE = ITEMS.register("apple_cake_slice",() -> new PopsicleItem(foodItem(FoodValues.CAKE_SLICE)));
    DeferredItem<Item> PEAR_CAKE_SLICE = ITEMS.register("pear_cake_slice",() -> new PopsicleItem(foodItem(FoodValues.CAKE_SLICE)));

    // 桶
    DeferredItem<Item> SYRUP_BUCKET = ITEMS.register("syrup_bucket", () ->
            new BucketItem(FruityFluids.SYRUP.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    // 果汁
    DeferredItem<Item> APPLE_JUICE_BUCKET = ITEMS.register("apple_juice_bucket", () ->
            new BucketItem(FruityFluids.APPLE_JUICE.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    DeferredItem<Item> PEAR_JUICE_BUCKET = ITEMS.register("pear_juice_bucket", () ->
            new BucketItem(FruityFluids.PEAR_JUICE.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    DeferredItem<Item> ORANGE_JUICE_BUCKET = ITEMS.register("orange_juice_bucket", () ->
            new BucketItem(FruityFluids.ORANGE_JUICE.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    DeferredItem<Item> BANANA_JUICE_BUCKET = ITEMS.register("banana_juice_bucket", () ->
            new BucketItem(FruityFluids.BANANA_JUICE.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    DeferredItem<Item> COCONUT_JUICE_BUCKET = ITEMS.register("coconut_juice_bucket", () ->
            new BucketItem(FruityFluids.COCONUT_JUICE.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    DeferredItem<Item> PINEAPPLE_JUICE_BUCKET = ITEMS.register("pineapple_juice_bucket", () ->
            new BucketItem(FruityFluids.PINEAPPLE_JUICE.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    DeferredItem<Item> STRAWBERRY_JUICE_BUCKET = ITEMS.register("strawberry_juice_bucket", () ->
            new BucketItem(FruityFluids.STRAWBERRY_JUICE.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    DeferredItem<Item> HAWTHORN_JUICE_BUCKET = ITEMS.register("hawthorn_juice_bucket", () ->
            new BucketItem(FruityFluids.HAWTHORN_JUICE.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    // 酱
    DeferredItem<Item> APPLE_JAM_BUCKET = ITEMS.register("apple_jam_bucket", () ->
            new BucketItem(FruityFluids.APPLE_JAM.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    static Item.Properties drinkItem() {
        return (new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

