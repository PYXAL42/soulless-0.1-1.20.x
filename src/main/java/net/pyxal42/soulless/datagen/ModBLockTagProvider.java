package net.pyxal42.soulless.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.pyxal42.soulless.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBLockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBLockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DIMSTONE)
                .add(ModBlocks.DIMSTONE_PEDESTAL)
                .add(ModBlocks.DIMSTONE_BRICK)
                .add(ModBlocks.DIMSTONE_BRICK_SLAB)
                .add(ModBlocks.DIMSTONE_BRICK_STAIRS)
                .add(ModBlocks.DIMSTONE_BRICK_WALL)
                .add(ModBlocks.DIMSTONE_PILLAR)
                .add(ModBlocks.DIMSTONE_SLAB)
                .add(ModBlocks.DIMSTONE_STAIRS)
                .add(ModBlocks.DIMSTONE_WALL)
                .add(ModBlocks.INFUSED_DIMSTONE_PILLAR);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DIMSTONE_BRICK_WALL)
                .add(ModBlocks.DIMSTONE_WALL)
                .add(ModBlocks.FLESH_WALL)
                .add(ModBlocks.ROTTEN_FLESH_WALL);
    }
}
