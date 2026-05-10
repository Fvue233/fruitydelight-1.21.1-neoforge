package net.fvue.fruitydelight.init;


import net.minecraft.world.food.FoodProperties;

public interface FruityFoodComponents {

    FoodProperties FRUIT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build(); //
    FoodProperties FRUIT_S = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    FoodProperties HAWTHORN_SKEWER = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F).build();
    FoodProperties TANGHULU = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();

    FoodProperties APPLE_JELLY = new FoodProperties.Builder().nutrition(2).saturationModifier(0.5F).build();
}

