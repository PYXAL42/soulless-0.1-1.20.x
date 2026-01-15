package net.pyxal42.soulless.recipe;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;

public class AltarRecipeSerializer<T extends AltarRecipe> implements RecipeSerializer<T> {

    private final RecipeFactory<T> recipeFactory;

    public AltarRecipeSerializer(RecipeFactory<T> recipeFactory){
        this.recipeFactory = recipeFactory;
    }

    @Override
    public T read(Identifier identifier, JsonObject jsonObject) {
        int power = JsonHelper.getInt(jsonObject,"power");
        //JsonElement jsonElement = JsonHelper.hasArray(jsonObject, "ingredient") ? JsonHelper.getArray(jsonObject, "ingredient") : JsonHelper.getObject(jsonObject, "ingredient");

        Ingredient ingredient = Ingredient.fromJson(JsonHelper.getObject(jsonObject,"ingredient"), false);
        int inputAmount = JsonHelper.getInt(jsonObject,"input_amount");
        JsonObject resultObject = JsonHelper.getObject(jsonObject, "result");
        Identifier resultID = new Identifier(JsonHelper.getString(resultObject, "item"));
        int resultCount = JsonHelper.hasNumber(resultObject, "count")?JsonHelper.getInt(resultObject,"count"):1;
        ItemStack output = new ItemStack((ItemConvertible) Registries.ITEM.getOrEmpty(resultID).orElseThrow(() -> {
            return new IllegalStateException("Item: " + resultID + " does not exist");
        }),resultCount);
        return this.recipeFactory.create(identifier, power,ingredient, inputAmount,output);
}
    @Override
    public T read(Identifier id, PacketByteBuf buf) {
        int power = buf.readInt();
        Ingredient input = Ingredient.fromPacket(buf);
        int inputAmount = buf.readInt();
        ItemStack output = buf.readItemStack();
        return this.recipeFactory.create(id, power, input, inputAmount, output);
    }

    @Override
    public void write(PacketByteBuf buf, T recipe) {
        buf.writeInt(recipe.power);
        recipe.input.write(buf);
        buf.writeInt(recipe.inputAmount);
        buf.writeItemStack(recipe.output);
    }

    public interface RecipeFactory<T extends AltarRecipe> {
        T create(Identifier id, int power,Ingredient input, int inputAmount, ItemStack output);
    }
}
