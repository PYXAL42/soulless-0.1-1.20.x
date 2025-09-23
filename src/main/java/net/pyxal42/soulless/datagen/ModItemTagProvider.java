package net.pyxal42.soulless.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.pyxal42.soulless.block.ModBlocks;
import net.pyxal42.soulless.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.AGONY_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(ModBlocks.DIMSTONE.asItem());
        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(ModBlocks.DIMSTONE.asItem());
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.LIV_BLADE)
                .add(ModItems.RITUAL_DAGGER);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TOPHAT)
                .add(ModItems.GLASSES)
                .add(ModItems.PROPELLER_HAT)
                .add(ModItems.BLACK_JACKET)
                .add(ModItems.MAID_CORSET)
                .add(ModItems.MAID_HEADBAND);
    }
}
