package net.pyxal42.soulless.recipe;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class AltarRecipe implements Recipe<Inventory> {

    protected final Identifier id;
    protected final int power;
    protected final Ingredient input;
    protected final int inputAmount;
    protected final ItemStack output;

    public AltarRecipe(Identifier id,int power, Ingredient input, int inputAmount, ItemStack output){
        this.power = power;
        this.input = input;
        this.inputAmount = inputAmount;
        this.output = output;
        this.id = id;

    }



    @Override
    public boolean matches(Inventory inventory, World world) {
        return input.test(inventory.getStack(0)) && inventory.getStack(0).getCount() ==inputAmount;
    }

    @Override
    public ItemStack craft(Inventory inventory, DynamicRegistryManager registryManager) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }


    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return output;
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeThings.ALTAR_RECIPE_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipeThings.ALTAR_RECIPE_TYPE;
    }

    public int getPower(){return power;}
}
