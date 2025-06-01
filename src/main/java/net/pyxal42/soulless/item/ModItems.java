package net.pyxal42.soulless.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pyxal42.soulless.Soulless;

public class ModItems {
    public static final Item SLICEOFCHEESE = registerItem("slice_of_cheese", new Item(new FabricItemSettings()));
    public static final Item EMPTYMOULD = registerItem("empty_mould", new Item(new FabricItemSettings()));
    public static final Item MILKYMOULD = registerItem("milky_mould", new Item(new FabricItemSettings().recipeRemainder(EMPTYMOULD)));
    public static final Item CHEESYMOULD = registerItem("cheesy_mould", new Item(new FabricItemSettings().recipeRemainder(EMPTYMOULD)));

    private static void addItemsToFoodAndDrinkTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SLICEOFCHEESE);
    }
    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(EMPTYMOULD);
        entries.add(MILKYMOULD);
        entries.add(CHEESYMOULD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Soulless.MOD_ID, name), item);
    }

    public static void registerModItems(){
      Soulless.LOGGER.info("Registering Mod items for " + Soulless.MOD_ID);

      ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
      ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkTabItemGroup);
    }
}
