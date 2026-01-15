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

    private int power =0;
    private static final int maxPower = 5;

    public CraftingPedestalBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ALTAR_BLOCKENTITY ,pos, state);
        this.matchGetter = RecipeManager.createCachedMatchGetter(ModRecipeThings.ALTAR_RECIPE_TYPE);
    }


    public void attemptCraft(){
        if (this.hasItem()){
            Inventory inventory = new SimpleInventory(getHeldStack());
            Optional<AltarRecipe> optionalRecipe = matchGetter.getFirstMatch(inventory,getWorld());
            if (optionalRecipe.isPresent() && optionalRecipe.get().getPower() <= this.power){
                AltarRecipe recipe = optionalRecipe.get();
                this.power -= recipe.getPower();
                setHeldStack(recipe.craft(inventory,getWorld().getRegistryManager()));
                //do vfx
            }
        }



    }

    public int getPower(){return power;}

    public void addPower(int value){
        power = Math.min(this.power + value, 5);

    }

    public boolean isMaxPower(){
        return power>=maxPower;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        power = nbt.getInt("power");
        super.readNbt(nbt);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        nbt.putInt("power", power);
        super.writeNbt(nbt);
    }
}
