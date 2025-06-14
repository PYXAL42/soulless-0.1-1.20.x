package net.pyxal42.soulless.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pyxal42.soulless.Soulless;

import static net.pyxal42.soulless.item.ModToolMaterial.LIV;

public class ModItems {
    public static final Item SLICEOFCHEESE = registerItem("slice_of_cheese", new Item(new Item.Settings().food(new FoodComponent.Builder().saturationModifier(0.8f).hunger(6).build())));
    public static final Item EMPTYMOULD = registerItem("empty_mould", new Item(new FabricItemSettings()));
    public static final Item MILKYMOULD = registerItem("milky_mould", new Item(new FabricItemSettings().recipeRemainder(EMPTYMOULD)));
    public static final Item CHEESYMOULD = registerItem("cheesy_mould", new Item(new FabricItemSettings().recipeRemainder(EMPTYMOULD)));
    public static final Item HOTMOULD = registerItem("hot_mould", new Item(new FabricItemSettings()));
    public static final Item BLOODBOTTLE = registerItem("blood_bottle", new Item(new FabricItemSettings()));
    public static final Item LIVINGOT = registerItem("liv_ingot", new Item(new FabricItemSettings()));
    public static final Item LIVBLADE = registerItem("liv_blade", new SwordItem(LIV,9,-2.6f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Soulless.MOD_ID, name), item);
    }

    public static void registerModItems(){
      Soulless.LOGGER.info("Registering Mod items for " + Soulless.MOD_ID);
    }
}