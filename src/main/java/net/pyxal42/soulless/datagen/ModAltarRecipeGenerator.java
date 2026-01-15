package net.pyxal42.soulless.datagen;

import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.pyxal42.soulless.item.ModItems;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModAltarRecipeGenerator implements DataProvider {

    private FabricDataOutput output;
    private HashMap<String,JsonObject> recipeHashMap;

    public ModAltarRecipeGenerator(FabricDataOutput output){
    this.output = output;
    }

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        List<CompletableFuture<?>> futureList = new ArrayList<>();
        recipeHashMap = new HashMap<>();
        generate();
        for (Map.Entry<String, JsonObject> entry: recipeHashMap.entrySet()){
            Path path = output.getPath().resolve("data/soulless/recipes/"+entry.getKey()+".json");
            futureList.add(DataProvider.writeToPath(writer,entry.getValue(),path));
        }
        return CompletableFuture.allOf(futureList.toArray(new CompletableFuture[]{}));
    }

    @Override
    public String getName() {
        return "Altar Recipe Generator";
    }


    //use the createRecipe in here to add a recipe
    private void generate(){
        createRecipe("blood_crystal_altar_recipe", 1,Ingredient.ofStacks(new ItemStack(ModItems.CLEAR_SHARD,2)),2, ModItems.BLOOD_CRYSTAL.getDefaultStack());
    }


    private void createRecipe(String name, int power, Ingredient ingredient, int inputAmount, ItemStack output){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type","soulless:altar_crafting");
        jsonObject.addProperty("power", power);
        jsonObject.add("ingredient", ingredient.toJson());
        jsonObject.addProperty("input_amount",inputAmount);
        JsonObject outputJsonObject = new JsonObject();
        outputJsonObject.addProperty("item", Registries.ITEM.getId(output.getItem()).toString());
        if (output.getCount() > 1) {
            outputJsonObject.addProperty("count", output.getCount());
        }
        jsonObject.add("result", outputJsonObject);
        recipeHashMap.put(name,jsonObject);

    }


}
