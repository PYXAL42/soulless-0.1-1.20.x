package net.pyxal42.soulless.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.pyxal42.soulless.block.ModBlocks;
import net.pyxal42.soulless.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    private void genSlabAndStairsModels(BlockStateModelGenerator blockStateModelGenerator, Block block, Block slab, Block stairs) {
        BlockStateModelGenerator.BlockTexturePool pool = blockStateModelGenerator.registerCubeAllModelTexturePool(block);
        pool.slab(slab);
        pool.stairs(stairs);
    } //big thanks to "More slabs and stairs" for this datagen code

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Simple cube
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFUSED_DIMSTONE_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIMSTONE_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFUSED_INKEEPING_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INKEEPING_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFUSED_BLOOMING_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOOMING_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFUSED_RADIANCE_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RADIANCE_CORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLEAR_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMERRACK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMERRACK_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_AMERRACK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AGONY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AGONY_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ESSENCE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAPIS_CLUTTERED_DIMSTONE);
        //Logs
        blockStateModelGenerator.registerLog(ModBlocks.AGONY_LOG).log(ModBlocks.AGONY_LOG).wood(ModBlocks.AGONY_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_AGONY_LOG).log(ModBlocks.STRIPPED_AGONY_LOG).wood(ModBlocks.STRIPPED_AGONY_WOOD);
        //SLABS AND STAIRS DATAGEN HOLY MOLY THANKS AGAIN TO THE MORE SLABS AND STAIRS MOD FOR THIS BLESSING OF A DATAGEN
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.DIMSTONE, ModBlocks.DIMSTONE_SLAB, ModBlocks.DIMSTONE_STAIRS);
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.DIMSTONE_BRICK, ModBlocks.DIMSTONE_BRICK_SLAB, ModBlocks.DIMSTONE_BRICK_STAIRS);
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.FLESH_BLOCK, ModBlocks.FLESH_SLAB, ModBlocks.FLESH_STAIRS);
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.BONED_FLESH_BLOCK, ModBlocks.BONED_FLESH_SLAB, ModBlocks.BONED_FLESH_STAIRS);
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.BONED_ROTTEN_FLESH_BLOCK, ModBlocks.BONED_ROTTEN_FLESH_SLAB, ModBlocks.BONED_ROTTEN_FLESH_STAIRS);
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.BONED_LIVING_FLESH_BLOCK, ModBlocks.BONED_LIVING_FLESH_SLAB, ModBlocks.BONED_LIVING_FLESH_STAIRS);
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.XAVELITE_BLOCK, ModBlocks.XAVELITE_SLAB, ModBlocks.XAVELITE_STAIRS);
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.RUSTY_METAL_BLOCK, ModBlocks.RUSTY_METAL_SLAB, ModBlocks.RUSTY_METAL_STAIRS);
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.SEELERIUM_BLOCK, ModBlocks.SEELERIUM_SLAB, ModBlocks.SEELERIUM_STAIRS);
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.DUSHARIN_BLOCK, ModBlocks.DUSHARIN_SLAB, ModBlocks.DUSHARIN_STAIRS);
        genSlabAndStairsModels(blockStateModelGenerator, ModBlocks.PYXIUM_BLOCK, ModBlocks.PYXIUM_SLAB, ModBlocks.PYXIUM_STAIRS);
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
        itemModelGenerator.register(ModItems.AGREEMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FABRIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLASSES, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPHAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PROPELLER_HAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_JACKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAID_CORSET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAID_HEADBAND, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAID_SKIRT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAID_SOCKS, Models.GENERATED);
        itemModelGenerator.register(ModItems.XAVELITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUSTY_METAL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEELERIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUSHARIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CURSED_FABRIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CULTIST_HOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CULTIST_ROBE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CULTIST_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CULTIST_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PYXIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIECE_OF_PYXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PYXIUM_COATED_SPIKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOOK_OF_THE_DEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLOOD_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_CAPTURE_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAPIS_CLUTTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_LEGO_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_LEGO_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_LEGO_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACk_LEGO_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LEGO_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_LEGO_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_LEGO_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PARCHEMINE, Models.GENERATED);
    }
}
