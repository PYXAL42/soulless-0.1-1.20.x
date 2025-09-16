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
        offerShapelessRecipe(exporter, ModItems.SLICE_OF_CHEESE, ModItems.CHEESY_MOULD, "cheese", 2);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIMSTONE_WALL, ModBlocks.DIMSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIMSTONE_BRICK_WALL, ModBlocks.DIMSTONE_BRICK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.ROTTEN_FLESH_WALL, ModBlocks.ROTTEN_FLESH_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.FLESH_WALL, ModBlocks.FLESH_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.LIVING_FLESH_WALL, ModBlocks.LIVING_FLESH_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_SLAB, ModBlocks.DIMSTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIMSTONE_BRICK_SLAB, ModBlocks.DIMSTONE_BRICK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROTTEN_FLESH_SLAB, ModBlocks.ROTTEN_FLESH_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLESH_SLAB, ModBlocks.FLESH_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIVING_FLESH_SLAB, ModBlocks.LIVING_FLESH_BLOCK);

    }
}
