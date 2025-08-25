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
        itemModelGenerator.register(ModItems.ESSENCE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESSENCE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLICE_OF_CHEESE, Models.GENERATED);
    }
}
