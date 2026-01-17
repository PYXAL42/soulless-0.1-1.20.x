package net.pyxal42.soulless.tags;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.pyxal42.soulless.Soulless;

public class ModTags {
    public static final TagKey<Block> DIMSTONE = blockTag("dimstone");
    public static final TagKey<Block> DIMSTONE_FULL_BLOCK = blockTag("dimstone_full_block");


    public static final TagKey<Item> RAW_MEAT = itemTag("raw_meat");


    public static final TagKey<EntityType<?>> HAS_BLOOD_TAG = entityTag("has_blood");


    private static TagKey<EntityType<?>> entityTag(String id) {return TagKey.of(RegistryKeys.ENTITY_TYPE, Soulless.ID(id));}
    private static TagKey<Block> blockTag(String id){
        return TagKey.of(RegistryKeys.BLOCK, Soulless.ID(id));
    }
    private static TagKey<Item> itemTag(String id){return TagKey.of(RegistryKeys.ITEM, Soulless.ID(id));}

}
