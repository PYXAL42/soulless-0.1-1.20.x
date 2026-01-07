package net.pyxal42.soulless.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pyxal42.soulless.Soulless;

import static net.minecraft.item.ToolMaterials.IRON;
import static net.pyxal42.soulless.item.ModToolMaterial.LIV;
import static net.pyxal42.soulless.item.ModToolMaterial.SEELERIUM;

public class ModItems {
    public static final Item SLICE_OF_CHEESE = registerItem("slice_of_cheese", new Item(new Item.Settings().food(new FoodComponent.Builder().saturationModifier(0.8f).hunger(6).build())));
    public static final Item BLOOD_BOTTLE = registerItem("blood_bottle", new Item(new Item.Settings().food(new FoodComponent.Builder().saturationModifier(0.8f).hunger(2).build())));
    public static final Item CONTRACT = registerItem("contract", new Item(new FabricItemSettings()));
    public static final Item EMPTY_MOULD = registerItem("empty_mould", new Item(new FabricItemSettings()));
    public static final Item MILKY_MOULD = registerItem("milky_mould", new Item(new FabricItemSettings().recipeRemainder(EMPTY_MOULD)));
    public static final Item CHEESY_MOULD = registerItem("cheesy_mould", new Item(new FabricItemSettings().recipeRemainder(EMPTY_MOULD)));
    public static final Item HOT_MOULD = registerItem("hot_mould", new Item(new FabricItemSettings()));
    public static final Item LIV_INGOT = registerItem("liv_ingot", new Item(new FabricItemSettings()));
    public static final Item LIV_BLADE = registerItem("liv_blade", new SwordItem(LIV,9,-2.6f, new FabricItemSettings()));
    public static final Item ESSENCE = registerItem("essence", new Item(new FabricItemSettings()));
    public static final Item ESSENSTEEL_INGOT = registerItem("essensteel_ingot", new Item(new FabricItemSettings()));
    public static final Item ESSENSTEEL_PLATE = registerItem("essensteel_plate", new Item(new FabricItemSettings()));
    public static final Item ESSENCE_SHARD = registerItem("essence_shard", new Item(new FabricItemSettings()));
    public static final Item CHARRED_INGOT = registerItem("charred_ingot", new Item(new FabricItemSettings()));
    public static final Item AGREEMENT = registerItem("agreement", new Item(new FabricItemSettings()));
    public static final Item RITUAL_DAGGER = registerItem("ritual_dagger", new SwordItem(IRON,0,-2.2f, new FabricItemSettings()));
    public static final Item HEARTLESS_DAGGER = registerItem("heartless_dagger", new SwordItem(IRON,0,-2.2f, new FabricItemSettings()));
    public static final Item SOULFULL_DAGGER = registerItem("soulfull_dagger", new SwordItem(IRON,0,-2.2f, new FabricItemSettings()));
    public static final Item CLEAR_SHARD = registerItem("clear_shard", new Item(new FabricItemSettings()));
    public static final Item FABRIC = registerItem("fabric", new Item(new FabricItemSettings()));
    public static final Item TOPHAT = registerItem("tophat",  new ArmorItem(ModArmorMaterial.COSMETIC_ONE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLACK_JACKET = registerItem("black_jacket", new ArmorItem(ModArmorMaterial.COSMETIC_ONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GLASSES = registerItem("glasses", new ArmorItem(ModArmorMaterial.COSMETIC_TWO, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PROPELLER_HAT = registerItem("propeller_hat", new ArmorItem(ModArmorMaterial.COSMETIC_THREE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item MAID_HEADBAND = registerItem("maid_headband", new ArmorItem(ModArmorMaterial.MAID_COSTUME, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item MAID_CORSET = registerItem("maid_corset", new ArmorItem(ModArmorMaterial.MAID_COSTUME, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item MAID_SKIRT = registerItem("maid_skirt", new ArmorItem(ModArmorMaterial.MAID_COSTUME, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item MAID_SOCKS = registerItem("maid_socks", new ArmorItem(ModArmorMaterial.MAID_COSTUME, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RUSTY_METAL_INGOT = registerItem("rusty_metal_ingot", new Item(new FabricItemSettings()));
    public static final Item XAVELITE_INGOT = registerItem("xavelite_ingot", new Item(new FabricItemSettings()));
    public static final Item CULTIST_HOOD = registerItem("cultist_hood", new ArmorItem(ModArmorMaterial.CULTIST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CULTIST_ROBE = registerItem("cultist_robe", new ArmorItem(ModArmorMaterial.CULTIST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item CULTIST_LEGGINGS = registerItem("cultist_pants", new ArmorItem(ModArmorMaterial.CULTIST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item CULTIST_BOOTS = registerItem("cultist_boots", new ArmorItem(ModArmorMaterial.CULTIST, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item SEELERIUM_INGOT = registerItem("seelerium_ingot", new Item(new FabricItemSettings()));
    public static final Item DUSHARIN_INGOT = registerItem("dusharin_ingot", new Item(new FabricItemSettings()));
    public static final Item PYXIUM_INGOT = registerItem("pyxium_ingot", new Item(new FabricItemSettings()));
    public static final Item PIECE_OF_PYXIUM = registerItem("piece_of_pyxium", new Item(new FabricItemSettings()));
    public static final Item PYXIUM_COATED_SPIKE = registerItem("pyxium_coated_spike", new Item(new FabricItemSettings()));
    public static final Item CURSED_FABRIC = registerItem("cursed_fabric", new Item(new FabricItemSettings()));
    public static final Item BLOOD_CRYSTAL = registerItem("blood_crystal", new Item(new FabricItemSettings()));
    public static final Item BOOK_OF_THE_DEAD = registerItem("book_of_the_dead", new Item(new FabricItemSettings()));
    public static final Item DUSHARIN_KYOKETSU = registerItem("dusharin_kyoketsu", new Item(new FabricItemSettings()));
    public static final Item LEAR = registerItem("lear", new SwordItem(SEELERIUM,5,-2.0f, new FabricItemSettings()));
    public static final Item SOUL_CAPTURE_BALL = registerItem("soul_capture_ball", new Item(new FabricItemSettings()));
    public static final Item YELLOW_LEGO_HELMET = registerItem("yellow_lego_helmet", new ArmorItem(ModArmorMaterial.YELLOW_lEGO, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RED_LEGO_HELMET = registerItem("red_lego_helmet", new ArmorItem(ModArmorMaterial.RED_LEGO, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLACk_LEGO_HELMET = registerItem("black_lego_helmet", new ArmorItem(ModArmorMaterial.BLACK_lEGO, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LIME_LEGO_HELMET = registerItem("lime_lego_helmet", new ArmorItem(ModArmorMaterial.LIME_lEGO, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CYAN_LEGO_HELMET = registerItem("cyan_lego_helmet", new ArmorItem(ModArmorMaterial.CYAN_lEGO, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item WHITE_LEGO_HELMET = registerItem("white_lego_helmet", new ArmorItem(ModArmorMaterial.WHITE_lEGO, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLUE_LEGO_HELMET = registerItem("blue_lego_helmet", new ArmorItem(ModArmorMaterial.BLUE_lEGO, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LAPIS_CLUTTER = registerItem("lapis_clutter", new Item(new FabricItemSettings()));
    public static final Item PARCHEMINE = registerItem("parchemine", new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Soulless.MOD_ID, name), item);
    }

    public static void registerModItems(){
      Soulless.LOGGER.info("Registering Mod items for " + Soulless.MOD_ID);
    }
}