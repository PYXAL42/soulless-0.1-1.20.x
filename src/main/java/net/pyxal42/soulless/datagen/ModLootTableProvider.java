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
        addDrop(ModBlocks.DIMSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.DIMSTONE_BRICK_WALL);
        addDrop(ModBlocks.DIMSTONE_PILLAR);
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
        addDrop(ModBlocks.BONED_ROTTEN_FLESH_BLOCK);
        addDrop(ModBlocks.BONED_ROTTEN_FLESH_STAIRS);
        addDrop(ModBlocks.BONED_ROTTEN_FLESH_WALL);
        addDrop(ModBlocks.BONED_FLESH_BLOCK);
        addDrop(ModBlocks.BONED_FLESH_STAIRS);
        addDrop(ModBlocks.BONED_FLESH_WALL);
        addDrop(ModBlocks.BONED_LIVING_FLESH_BLOCK);
        addDrop(ModBlocks.BONED_LIVING_FLESH_STAIRS);
        addDrop(ModBlocks.BONED_LIVING_FLESH_WALL);
        addDrop(ModBlocks.AMERRACK);
        addDrop(ModBlocks.XAVELITE_BLOCK);
        addDrop(ModBlocks.XAVELITE_STAIRS);
        addDrop(ModBlocks.RUSTY_METAL_BARS);
        addDrop(ModBlocks.RUSTY_METAL_BLOCK);
        addDrop(ModBlocks.RUSTY_METAL_STAIRS);
        addDrop(ModBlocks.SEELERIUM_BLOCK);
        addDrop(ModBlocks.SEELERIUM_STAIRS);
        addDrop(ModBlocks.DUSHARIN_BLOCK);
        addDrop(ModBlocks.DUSHARIN_STAIRS);
        addDrop(ModBlocks.PYXIUM_BLOCK);
        addDrop(ModBlocks.PYXIUM_STAIRS);
        //Slabs
        addDrop(ModBlocks.DIMSTONE_SLAB, slabDrops(ModBlocks.DIMSTONE_SLAB));
        addDrop(ModBlocks.DIMSTONE_BRICK_SLAB, slabDrops(ModBlocks.DIMSTONE_BRICK_SLAB));
        addDrop(ModBlocks.BONED_ROTTEN_FLESH_SLAB, slabDrops(ModBlocks.BONED_ROTTEN_FLESH_SLAB));
        addDrop(ModBlocks.BONED_FLESH_SLAB, slabDrops(ModBlocks.BONED_FLESH_SLAB));
        addDrop(ModBlocks.BONED_LIVING_FLESH_SLAB, slabDrops(ModBlocks.BONED_LIVING_FLESH_SLAB));
        addDrop(ModBlocks.XAVELITE_SLAB, slabDrops(ModBlocks.XAVELITE_SLAB));
        addDrop(ModBlocks.RUSTY_METAL_SLAB, slabDrops(ModBlocks.RUSTY_METAL_SLAB));
        addDrop(ModBlocks.SEELERIUM_SLAB, slabDrops(ModBlocks.SEELERIUM_SLAB));
        addDrop(ModBlocks.DUSHARIN_SLAB, slabDrops(ModBlocks.DUSHARIN_SLAB));
        addDrop(ModBlocks.PYXIUM_SLAB, slabDrops(ModBlocks.PYXIUM_SLAB));
        //Silk touch
        addDrop(ModBlocks.CLEAR_GLASS, dropsWithSilkTouch(ModBlocks.CLEAR_GLASS));
        //Leaves
        addDrop(ModBlocks.AGONY_LEAVES, leavesDrops(ModBlocks.AGONY_LEAVES, ModBlocks.DIMSTONE, 0.005f));
    }
}
