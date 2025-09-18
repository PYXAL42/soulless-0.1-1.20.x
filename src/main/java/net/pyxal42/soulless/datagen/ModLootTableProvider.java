package net.pyxal42.soulless.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.pyxal42.soulless.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DIMSTONE);
        addDrop(ModBlocks.DIMSTONE_PEDESTAL);
        addDrop(ModBlocks.DIMSTONE_BRICK);
        addDrop(ModBlocks.DIMSTONE_BRICK_SLAB, slabDrops(ModBlocks.DIMSTONE_BRICK_SLAB));
        addDrop(ModBlocks.DIMSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.DIMSTONE_BRICK_WALL);
        addDrop(ModBlocks.DIMSTONE_PILLAR);
        addDrop(ModBlocks.DIMSTONE_SLAB, slabDrops(ModBlocks.DIMSTONE_SLAB));
        addDrop(ModBlocks.DIMSTONE_STAIRS);
        addDrop(ModBlocks.DIMSTONE_WALL);
        addDrop(ModBlocks.INFUSED_DIMSTONE_PILLAR);
        addDrop(ModBlocks.AGONY_PLANKS);
        addDrop(ModBlocks.AGONY_LOG);
        addDrop(ModBlocks.AGONY_WOOD);
        addDrop(ModBlocks.STRIPPED_AGONY_LOG);
        addDrop(ModBlocks.STRIPPED_AGONY_WOOD);
        addDrop(ModBlocks.INFUSED_BLOOMING_CORE);
        addDrop(ModBlocks.INFUSED_DIMSTONE_CORE);
        addDrop(ModBlocks.INFUSED_INKEEPING_CORE);
        addDrop(ModBlocks.INFUSED_RADIANCE_CORE);
        addDrop(ModBlocks.DIMSTONE_CORE);
        addDrop(ModBlocks.BLOOMING_CORE);
        addDrop(ModBlocks.INKEEPING_CORE);
        addDrop(ModBlocks.RADIANCE_CORE);
        addDrop(ModBlocks.ROTTEN_FLESH_BLOCK);
        addDrop(ModBlocks.ROTTEN_FLESH_SLAB, slabDrops(ModBlocks.ROTTEN_FLESH_SLAB));
        addDrop(ModBlocks.ROTTEN_FLESH_STAIRS);
        addDrop(ModBlocks.ROTTEN_FLESH_WALL);
        addDrop(ModBlocks.FLESH_BLOCK);
        addDrop(ModBlocks.FLESH_SLAB, slabDrops(ModBlocks.FLESH_SLAB));
        addDrop(ModBlocks.FLESH_STAIRS);
        addDrop(ModBlocks.FLESH_WALL);
        addDrop(ModBlocks.CLEAR_GLASS, dropsWithSilkTouch(ModBlocks.CLEAR_GLASS));

        addDrop(ModBlocks.AGONY_LEAVES, leavesDrops(ModBlocks.AGONY_LEAVES, ModBlocks.DIMSTONE, 0.005f));
    }
}
