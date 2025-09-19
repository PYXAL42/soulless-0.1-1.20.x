package net.pyxal42.soulless.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pyxal42.soulless.Soulless;

import static net.minecraft.item.ToolMaterials.IRON;
import static net.pyxal42.soulless.item.ModToolMaterial.LIV;

public class ModItems {
    public static final Item SLICE_OF_CHEESE = registerItem("slice_of_cheese", new Item(new Item.Settings().food(new FoodComponent.Builder().saturationModifier(0.8f).hunger(6).build())));
    public static final Item EMPTY_MOULD = registerItem("empty_mould", new Item(new FabricItemSettings()));
    public static final Item MILKY_MOULD = registerItem("milky_mould", new Item(new FabricItemSettings().recipeRemainder(EMPTY_MOULD)));
    public static final Item CHEESY_MOULD = registerItem("cheesy_mould", new Item(new FabricItemSettings().recipeRemainder(EMPTY_MOULD)));
    public static final Item HOT_MOULD = registerItem("hot_mould", new Item(new FabricItemSettings()));
    public static final Item BLOOD_BOTTLE = registerItem("blood_bottle", new Item(new FabricItemSettings()));
    public static final Item LIV_INGOT = registerItem("liv_ingot", new Item(new FabricItemSettings()));
    public static final Item LIV_BLADE = registerItem("liv_blade", new SwordItem(LIV,9,-2.6f, new FabricItemSettings()));
    public static final Item ESSENCE = registerItem("essence", new Item(new FabricItemSettings()));
    public static final Item ESSENSTEEL_INGOT = registerItem("essensteel_ingot", new Item(new FabricItemSettings()));
    public static final Item ESSENCE_SHARD = registerItem("essence_shard", new Item(new FabricItemSettings()));
    public static final Item RITUAL_DAGGER = registerItem("ritual_dagger", new SwordItem(IRON,0,-2.2f, new FabricItemSettings()));
    public static final Item CHARRED_INGOT = registerItem("charred_ingot", new Item(new FabricItemSettings()));
    public static final Item CONTRACT = registerItem("contract", new Item(new FabricItemSettings()));
    public static final Item CLEAR_SHARD = registerItem("clear_shard", new Item(new FabricItemSettings()));
    public static final Item ESSENSTEEL_PLATE = registerItem("essensteel_plate", new Item(new FabricItemSettings()));
    public static final Item AGREEMENT = registerItem("agreement", new Item(new FabricItemSettings()));
    public static final Item FABRIC = registerItem("fabric", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Soulless.MOD_ID, name), item);
    }

    public static void registerModItems(){
      Soulless.LOGGER.info("Registering Mod items for " + Soulless.MOD_ID);
    }
}