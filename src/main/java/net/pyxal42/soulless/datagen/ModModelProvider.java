package net.pyxal42.soulless.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.pyxal42.soulless.block.ModBlocks;
import net.pyxal42.soulless.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIMSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIMSTONE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFUSED_DIMSTONE_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIMSTONE_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFUSED_INKEEPING_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INKEEPING_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFUSED_BLOOMING_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOOMING_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFUSED_RADIANCE_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RADIANCE_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROTTEN_FLESH_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.AGONY_LOG).log(ModBlocks.AGONY_LOG).wood(ModBlocks.AGONY_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_AGONY_LOG).log(ModBlocks.STRIPPED_AGONY_LOG).wood(ModBlocks.STRIPPED_AGONY_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AGONY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AGONY_LEAVES);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BLOOD_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIV_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARRED_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMPTY_MOULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESY_MOULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_MOULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MILKY_MOULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONTRACT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESSENSTEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESSENCE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLICE_OF_CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLEAR_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESSENSTEEL_PLATE, Models.GENERATED);
    }
}
