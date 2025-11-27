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
                .add(ModBlocks.INFUSED_DIMSTONE_PILLAR)
                .add(ModBlocks.INFUSED_BLOOMING_CORE)
                .add(ModBlocks.INFUSED_DIMSTONE_CORE)
                .add(ModBlocks.INFUSED_INKEEPING_CORE)
                .add(ModBlocks.INFUSED_RADIANCE_CORE)
                .add(ModBlocks.BLOOMING_CORE)
                .add(ModBlocks.INKEEPING_CORE)
                .add(ModBlocks.RADIANCE_CORE)
                .add(ModBlocks.DIMSTONE_CORE)
                .add(ModBlocks.FLESH_BLOCK)
                .add(ModBlocks.FLESH_PILLAR)
                .add(ModBlocks.FLESH_STAIRS)
                .add(ModBlocks.FLESH_SLAB)
                .add(ModBlocks.FLESH_WALL)
                .add(ModBlocks.BONED_FLESH_BLOCK)
                .add(ModBlocks.BONED_FLESH_STAIRS)
                .add(ModBlocks.BONED_FLESH_SLAB)
                .add(ModBlocks.BONED_FLESH_WALL)
                .add(ModBlocks.BONED_ROTTEN_FLESH_BLOCK)
                .add(ModBlocks.BONED_ROTTEN_FLESH_STAIRS)
                .add(ModBlocks.BONED_ROTTEN_FLESH_SLAB)
                .add(ModBlocks.BONED_ROTTEN_FLESH_WALL)
                .add(ModBlocks.BONED_LIVING_FLESH_BLOCK)
                .add(ModBlocks.BONED_LIVING_FLESH_STAIRS)
                .add(ModBlocks.BONED_LIVING_FLESH_SLAB)
                .add(ModBlocks.BONED_LIVING_FLESH_WALL)
                .add(ModBlocks.XAVELITE_BLOCK)
                .add(ModBlocks.XAVELITE_STAIRS)
                .add(ModBlocks.XAVELITE_SLAB)
                .add(ModBlocks.RUSTY_METAL_BLOCK)
                .add(ModBlocks.RUSTY_METAL_STAIRS)
                .add(ModBlocks.RUSTY_METAL_SLAB)
                .add(ModBlocks.RUSTY_METAL_BARS)
                .add(ModBlocks.AMERRACK)
                .add(ModBlocks.AMERRACK_BRICK)
                .add(ModBlocks.CHISELED_AMERRACK)
                .add(ModBlocks.AMERRACK_PILLAR)
                .add(ModBlocks.SEELERIUM_BLOCK)
                .add(ModBlocks.SEELERIUM_STAIRS)
                .add(ModBlocks.SEELERIUM_SLAB)
                .add(ModBlocks.DUSHARIN_BLOCK)
                .add(ModBlocks.DUSHARIN_SLAB)
                .add(ModBlocks.DUSHARIN_STAIRS);
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.AGONY_WOOD)
                .add(ModBlocks.STRIPPED_AGONY_WOOD)
                .add(ModBlocks.AGONY_LOG)
                .add(ModBlocks.STRIPPED_AGONY_LOG)
                .add(ModBlocks.AGONY_PLANKS);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DIMSTONE_BRICK_WALL)
                .add(ModBlocks.DIMSTONE_WALL)
                .add(ModBlocks.BONED_ROTTEN_FLESH_WALL)
                .add(ModBlocks.BONED_FLESH_WALL)
                .add(ModBlocks.FLESH_WALL)
                .add(ModBlocks.BONED_LIVING_FLESH_WALL);
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.DIMSTONE_SLAB)
                .add(ModBlocks.DIMSTONE_BRICK_SLAB)
                .add(ModBlocks.BONED_ROTTEN_FLESH_SLAB)
                .add(ModBlocks.FLESH_SLAB)
                .add(ModBlocks.BONED_FLESH_SLAB)
                .add(ModBlocks.XAVELITE_SLAB)
                .add(ModBlocks.RUSTY_METAL_SLAB)
                .add(ModBlocks.SEELERIUM_SLAB)
                .add(ModBlocks.DUSHARIN_SLAB);
        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.DIMSTONE_STAIRS)
                .add(ModBlocks.DIMSTONE_BRICK_STAIRS)
                .add(ModBlocks.BONED_ROTTEN_FLESH_STAIRS)
                .add(ModBlocks.FLESH_STAIRS)
                .add(ModBlocks.BONED_FLESH_STAIRS)
                .add(ModBlocks.BONED_LIVING_FLESH_STAIRS)
                .add(ModBlocks.XAVELITE_STAIRS)
                .add(ModBlocks.RUSTY_METAL_STAIRS)
                .add(ModBlocks.SEELERIUM_STAIRS)
                .add(ModBlocks.DUSHARIN_STAIRS);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.AGONY_LEAVES);
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.XAVELITE_BLOCK)
                .add(ModBlocks.DUSHARIN_BLOCK)
                .add(ModBlocks.SEELERIUM_BLOCK);
        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
                .add(ModBlocks.DIMSTONE)
                .add(ModBlocks.DIMSTONE_BRICK)
                .add(ModBlocks.DIMSTONE_PILLAR);
    }
}
