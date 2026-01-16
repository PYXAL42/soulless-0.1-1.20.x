package net.pyxal42.soulless.block.blockentity;

import net.minecraft.block.BlockState;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.util.math.BlockPos;
import net.pyxal42.soulless.recipe.AltarRecipe;
import net.pyxal42.soulless.recipe.ModRecipeThings;

import java.util.Optional;

public class CraftingPedestalBlockEntity extends PedestalBlockEntity{
    private final RecipeManager.MatchGetter<Inventory, AltarRecipe> matchGetter;

    private int blood =0;
    private int souls =0;
    private static final int maxPower = 4;

    public CraftingPedestalBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ALTAR_BLOCKENTITY ,pos, state);
        this.matchGetter = RecipeManager.createCachedMatchGetter(ModRecipeThings.ALTAR_RECIPE_TYPE);
    }


    public void attemptCraft(){
        if (this.hasItem()){
            Inventory inventory = new SimpleInventory(getHeldStack());
            Optional<AltarRecipe> optionalRecipe = matchGetter.getFirstMatch(inventory,getWorld());
            if (optionalRecipe.isPresent()){
                AltarRecipe recipe = optionalRecipe.get();
                if (recipe.getBlood() <= this.blood && recipe.getSouls() <= this.souls){
                    this.blood -= recipe.getBlood();
                    this.souls -= recipe.getSouls();
                    setHeldStack(recipe.craft(inventory, getWorld().getRegistryManager()));
                    //do vfx
            }
            }
        }



    }

    public int getBlood(){return blood;}
    public int getSouls(){return souls;}

    public void addBlood(int value){
        if (totalPower()+value <= maxPower) {
            blood += value;
        }

    }
    public void addSouls(int value){
        if (totalPower()+value <= maxPower) {
            souls += value;
        }

    }

    public int totalPower(){
        return (blood+souls);
    }

    public boolean isMaxPower(){
        return (blood+souls) >=maxPower;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        blood = nbt.getInt("blood");
        souls = nbt.getInt("souls");
        super.readNbt(nbt);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        nbt.putInt("blood", blood);
        nbt.putInt("souls", souls);
        super.writeNbt(nbt);
    }
}
