package net.pyxal42.soulless.registry.tags;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.pyxal42.soulless.Soulless;

public final class ItemTags {
    public static final TagKey<Item> RAW_MEAT = of("raw_meat");


    private ItemTags() {
    }

    private static TagKey<Item> of(String id){
        return TagKey.of(RegistryKeys.ITEM, Soulless.ID(id));
    }
}