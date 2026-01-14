package net.pyxal42.soulless.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.pyxal42.soulless.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Iterate over an array of our blocks instead (blocks are added in registry)
        for (Block block: ModBlocks.MODBLOCKLIST){
            if (block instanceof SlabBlock){
                addDrop(block, slabDrops(block));
            }else if (block == ModBlocks.CLEAR_GLASS){
                addDrop(ModBlocks.CLEAR_GLASS, dropsWithSilkTouch(ModBlocks.CLEAR_GLASS));
            }else if (block == ModBlocks.AGONY_LEAVES){
                addDrop(ModBlocks.AGONY_LEAVES, leavesDrops(ModBlocks.AGONY_LEAVES, ModBlocks.DIMSTONE, 0.005f));
            }else{
                addDrop(block);
            }
        }

    }
}
