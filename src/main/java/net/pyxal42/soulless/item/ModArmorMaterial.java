package net.pyxal42.soulless.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.pyxal42.soulless.Soulless;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    COSMETIC_ONE("cosmetic_material_one",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ENTITY_VILLAGER_CELEBRATE,0f, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),
    //contains: Tophat, Black jacket
    COSMETIC_TWO("cosmetic_material_two",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA,0f, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),
    //contains: Glasses
    COSMETIC_THREE("cosmetic_material_three",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA,0f, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),
    //contains: Propeller hat
    MAID_COSTUME("maid_costume",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA,0f, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),
    //contains: Maid headband, Maid corset, Maid skirt, Maid thigh highs
    RED_LEGO("red_lego",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),
    YELLOW_lEGO("yellow_lego",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),
    LIME_lEGO("lime_lego",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),
    BLACK_lEGO("black_lego",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),
    CYAN_lEGO("cyan_lego",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),
    WHITE_lEGO("white_lego",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),
    BLUE_lEGO("blue_lego",25, new int[] {2, 3, 1, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0, 0,()-> Ingredient.ofItems(ModItems.FABRIC)),

    CULTIST("cultist",25, new int[] {4, 5, 5, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0.25f, 0.25f,()-> Ingredient.ofItems(ModItems.CURSED_FABRIC));
    //contains: Cultist hood, Cultist robe, Cultist pants and Cultist boots

    ;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()]*this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Soulless.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
