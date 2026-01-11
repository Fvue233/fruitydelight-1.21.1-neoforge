package net.fvue.fruitydelight.item;

import net.fvue.fruitydelight.FruityDelight;
import net.fvue.fruitydelight.fluid.FruityFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.MelonJuiceItem;
import vectorwing.farmersdelight.common.item.PopsicleItem;

import static vectorwing.farmersdelight.common.registry.ModItems.foodItem;


public class FruityItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(FruityDelight.MOD_ID);

    //fruit
    public static final DeferredItem<Item> PEAR =
            ITEMS.register("pear",() -> new Item(new Item.Properties().food(FruityFoodComponents.FRUIT)));
    public static final DeferredItem<Item> ORANGE =
            ITEMS.register("orange",() -> new Item(new Item.Properties().food(FruityFoodComponents.FRUIT)));
    public static final DeferredItem<Item> HAWTHORN =
            ITEMS.register("hawthorn",() -> new Item(new Item.Properties().food(FruityFoodComponents.FRUIT_S)));
    /*public static final DeferredItem<Item> PEACH=
            ITEMS.register("peach",() -> new Item(new Item.Properties().food(FruityFoodComponents.FRUIT)));*/
    public static final DeferredItem<Item> BANANA=
            ITEMS.register("banana",() -> new Item(new Item.Properties().food(FruityFoodComponents.FRUIT)));
    public static final DeferredItem<Item> BANANAS =
            ITEMS.register("bananas",() -> new Item(new Item.Properties()));
    //juice
    public static final DeferredItem<Item> APPLE_JUICE =
            ITEMS.register("apple_juice",() -> new MelonJuiceItem(drinkItem()));
    public static final DeferredItem<Item> PEAR_JUICE =
            ITEMS.register("pear_juice",() -> new MelonJuiceItem(drinkItem()));
    public static final DeferredItem<Item> ORANGE_JUICE =
            ITEMS.register("orange_juice",() -> new MelonJuiceItem(drinkItem()));
    public static final DeferredItem<Item> BANANA_JUICE =
            ITEMS.register("banana_juice",() -> new MelonJuiceItem(drinkItem()));
    public static final DeferredItem<Item> COCONUT_JUICE =
            ITEMS.register("coconut_juice",() -> new MelonJuiceItem(drinkItem()));

    //jelly
    //public static final DeferredItem<Item> APPLE_JELLY =
    //        ITEMS.register("apple_jelly",() -> new Item(new Item.Properties().food(FruityFoodComponents.APPLE_JELLY)));
    //popsicle_mold
    public static final DeferredItem<Item> APPLE_POPSICLE_MOLD_FILLED =
                ITEMS.register("apple_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> APPLE_POPSICLE_MOLD_SOLID =
            ITEMS.register("apple_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEAR_POPSICLE_MOLD_FILLED =
            ITEMS.register("pear_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEAR_POPSICLE_MOLD_SOLID =
            ITEMS.register("pear_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_POPSICLE_MOLD_FILLED =
            ITEMS.register("orange_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_POPSICLE_MOLD_SOLID =
            ITEMS.register("orange_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BANANA_POPSICLE_MOLD_FILLED =
            ITEMS.register("banana_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BANANA_POPSICLE_MOLD_SOLID =
            ITEMS.register("banana_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COCONUT_POPSICLE_MOLD_FILLED =
            ITEMS.register("coconut_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COCONUT_POPSICLE_MOLD_SOLID =
            ITEMS.register("coconut_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINEAPPLE_POPSICLE_MOLD_FILLED =
            ITEMS.register("pineapple_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINEAPPLE_POPSICLE_MOLD_SOLID =
            ITEMS.register("pineapple_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRAWBERRY_POPSICLE_MOLD_FILLED =
            ITEMS.register("strawberry_popsicle_mold_filled",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRAWBERRY_POPSICLE_MOLD_SOLID =
            ITEMS.register("strawberry_popsicle_mold_solid",() -> new Item(new Item.Properties()));
    //popsicle
    public static final DeferredItem<Item> APPLE_POPSICLE =
            ITEMS.register("apple_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    public static final DeferredItem<Item> PEAR_POPSICLE =
            ITEMS.register("pear_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    public static final DeferredItem<Item> ORANGE_POPSICLE =
            ITEMS.register("orange_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    public static final DeferredItem<Item> BANANA_POPSICLE =
            ITEMS.register("banana_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    public static final DeferredItem<Item> COCONUT_POPSICLE =
            ITEMS.register("coconut_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    public static final DeferredItem<Item> PINEAPPLE_POPSICLE =
            ITEMS.register("pineapple_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    public static final DeferredItem<Item> STRAWBERRY_POPSICLE =
            ITEMS.register("strawberry_popsicle",() -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));

    //Tanghulu
    public static final DeferredItem<Item> HAWTHORN_SKEWER=
            ITEMS.register("hawthorn_skewer",() -> new Item(new Item.Properties().food(FruityFoodComponents.HAWTHORN_SKEWER).durability(0)));
    public static final DeferredItem<Item> TANGHULU=
            ITEMS.register("tanghulu",() -> new Item(new Item.Properties().food(FruityFoodComponents.TANGHULU)));
    //bottle
    public static final DeferredItem<Item> SYRUP_BOTTLE =
            ITEMS.register("syrup_bottle",() -> new Item(new Item.Properties().stacksTo(16)));
    // BUCKET
    public static final DeferredItem<Item> SYRUP_BUCKET =
            ITEMS.register("syrup_bucket",() -> new BucketItem((Fluid) FruityFluids.SYRUP.get(),new Item.Properties().craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> APPLE_JUICE_BUCKET =
            ITEMS.register("apple_juice_bucket",() -> new BucketItem((Fluid) FruityFluids.APPLE_JUICE.get(),new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> PEAR_JUICE_BUCKET =
            ITEMS.register("pear_juice_bucket",() -> new BucketItem((Fluid) FruityFluids.PEAR_JUICE.get(),new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> ORANGE_JUICE_BUCKET =
            ITEMS.register("orange_juice_bucket",() -> new BucketItem((Fluid) FruityFluids.ORANGE_JUICE.get(),new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> BANANA_JUICE_BUCKET =
            ITEMS.register("banana_juice_bucket",() -> new BucketItem((Fluid) FruityFluids.BANANA_JUICE.get(),new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> COCONUT_JUICE_BUCKET =
            ITEMS.register("coconut_juice_bucket",() -> new BucketItem((Fluid) FruityFluids.COCONUT_JUICE.get(),new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> PINEAPPLE_JUICE_BUCKET =
            ITEMS.register("pineapple_juice_bucket",() -> new BucketItem((Fluid) FruityFluids.PINEAPPLE_JUICE.get(),new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> STRAWBERRY_JUICE_BUCKET =
            ITEMS.register("strawberry_juice_bucket",() -> new BucketItem((Fluid) FruityFluids.STRAWBERRY_JUICE.get(),new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));


    public static Item.Properties drinkItem() {
        return (new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

