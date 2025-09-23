package net.pyxal42.soulless.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.pyxal42.soulless.Soulless;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    TOPHAT_AMAT("tophat_material",25, new int[] {4, 5, 5, 4}, 25, SoundEvents.ENTITY_VILLAGER_CELEBRATE,0f, 0.5f,()-> Ingredient.ofItems(ModItems.FABRIC)),
    GLASSES_AMAT("glasses_material",25, new int[] {4, 5, 5, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA,0f, 0.5f,()-> Ingredient.ofItems(ModItems.FABRIC)),
    PROPELLER_HAT_AMAT("propeller_hat_material",25, new int[] {4, 5, 5, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA,0f, 0.5f,()-> Ingredient.ofItems(ModItems.FABRIC)),
    BLACK_JACKET_AMAT("black_jacket_material",25, new int[] {4, 5, 5, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA,0f, 0.5f,()-> Ingredient.ofItems(ModItems.FABRIC)),
    MAID_COSTUME("maid_costume",25, new int[] {4, 5, 5, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA,0f, 0.5f,()-> Ingredient.ofItems(ModItems.FABRIC));

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
