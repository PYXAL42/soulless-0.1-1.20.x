package net.pyxal42.soulless.registry.tags;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class BlockTags {
    public static final TagKey<Block> DIMSTONE = of("dimstone");
    public static final TagKey<Block> DIMSTONE_FULL_BLOCK = of("dimstone_full_block");


    private BlockTags() {
    }

    private static TagKey<Block> of(String id){
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }
}