package net.fvue.fruitydelight.init;

import net.fvue.fruitydelight.FruityDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;


public interface FruityItemTags {

    TagKey<Item> FRUIT_JUICES = bind("fruit_juices");
    TagKey<Item> FRUITS = bind("fruits");
    TagKey<Item> FRUIT_POPSICLES = bind("fruit_popsicles");

    TagKey<Item> FRUITS_NEO = neoforgeItemTag("fruits");
    TagKey<Item> CROPS_FRUITS = neoforgeItemTag("crpos/fruits");

    private static TagKey<Item> bind(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FruityDelight.MOD_ID, name));
    }

    private static TagKey<Item> neoforgeItemTag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", name));
    }
}
