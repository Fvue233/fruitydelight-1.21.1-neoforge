package net.fvue.fruitydelight.tag;

import net.fvue.fruitydelight.FruityDelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;


public class FruityItemTags {
    public static final TagKey<Item> FRUIT_JUICES = ItemTags.create(ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, "fruit_juices"));
    public static final TagKey<Item> FRUITS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, "fruits"));
    public static final TagKey<Item> FRUIT_POPSICLES = ItemTags.create(ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, "fruit_popsicles"));
}
