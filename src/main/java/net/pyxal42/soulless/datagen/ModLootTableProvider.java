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
        addDrop(ModBlocks.DIMSTONE_BRICK_SLAB);
        addDrop(ModBlocks.DIMSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.DIMSTONE_BRICK_WALL);
        addDrop(ModBlocks.DIMSTONE_PILLAR);
        addDrop(ModBlocks.DIMSTONE_SLAB);
        addDrop(ModBlocks.DIMSTONE_STAIRS);
        addDrop(ModBlocks.DIMSTONE_WALL);
        addDrop(ModBlocks.INFUSED_DIMSTONE_PILLAR);
        addDrop(ModBlocks.AGONY_PLANKS);
        addDrop(ModBlocks.AGONY_LOG);
        addDrop(ModBlocks.AGONY_WOOD);
        addDrop(ModBlocks.STRIPPED_AGONY_LOG);
        addDrop(ModBlocks.STRIPPED_AGONY_WOOD);

        addDrop(ModBlocks.AGONY_LEAVES, leavesDrops(ModBlocks.AGONY_LEAVES, ModBlocks.DIMSTONE, 0.005f));
    }
}
