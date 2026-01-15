package net.pyxal42.soulless.recipe;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.pyxal42.soulless.Soulless;

public class ModRecipeThings {

    public static final RecipeType<AltarRecipe> ALTAR_RECIPE_TYPE = RecipeType.register(Soulless.ID("altar_crafting").toString());
    public static final RecipeSerializer<AltarRecipe> ALTAR_RECIPE_SERIALIZER = RecipeSerializer.register(Soulless.ID("altar_crafting").toString(), new AltarRecipeSerializer<>(AltarRecipe::new));

    public static void registerRecipeThings(){
        Soulless.LOGGER.info("Registering recipe things for "+Soulless.MOD_ID);
    }

}
