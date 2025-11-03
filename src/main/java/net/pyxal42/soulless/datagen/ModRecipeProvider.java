package net.pyxal42.soulless.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.pyxal42.soulless.block.ModBlocks;
import net.pyxal42.soulless.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //Single item shapeless recipes
        offerShapelessRecipe(exporter, ModItems.SLICE_OF_CHEESE, ModItems.CHEESY_MOULD, "cheese", 2);
        offerShapelessRecipe(exporter, ModItems.FABRIC, ModBlocks.FABRIC_BLOCK, "cheese", 4);
        //Wall recipes
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIMSTONE_WALL, ModBlocks.DIMSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIMSTONE_BRICK_WALL, ModBlocks.DIMSTONE_BRICK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.BONED_ROTTEN_FLESH_WALL, ModBlocks.BONED_ROTTEN_FLESH_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.BONED_FLESH_WALL, ModBlocks.BONED_FLESH_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.BONED_LIVING_FLESH_WALL, ModBlocks.BONED_LIVING_FLESH_BLOCK);
        //Slab recipes
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_SLAB, ModBlocks.DIMSTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_BRICK_SLAB, ModBlocks.DIMSTONE_BRICK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BONED_ROTTEN_FLESH_SLAB, ModBlocks.BONED_ROTTEN_FLESH_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BONED_FLESH_SLAB, ModBlocks.BONED_FLESH_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BONED_LIVING_FLESH_SLAB, ModBlocks.BONED_LIVING_FLESH_BLOCK);
        //2x2 compacting recipe
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModBlocks.FABRIC_BLOCK, ModItems.FABRIC);
        //Stone cutter recipes
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE, ModBlocks.DIMSTONE_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE, ModBlocks.DIMSTONE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE, ModBlocks.DIMSTONE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE, ModBlocks.DIMSTONE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE, ModBlocks.DIMSTONE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE, ModBlocks.DIMSTONE_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE, ModBlocks.DIMSTONE_BRICK_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE, ModBlocks.DIMSTONE_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_BRICK, ModBlocks.DIMSTONE_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_BRICK, ModBlocks.DIMSTONE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_BRICK, ModBlocks.DIMSTONE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_BRICK, ModBlocks.DIMSTONE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_BRICK, ModBlocks.DIMSTONE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_BRICK, ModBlocks.DIMSTONE_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_BRICK, ModBlocks.DIMSTONE_BRICK_STAIRS);
    }
}
