package net.pyxal42.soulless.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.pyxal42.soulless.block.blockentity.CraftingPedestalBlockEntity;
import net.pyxal42.soulless.item.ModItems;
import org.jetbrains.annotations.Nullable;

public class CraftingPedestalBlock extends PedestalBlock{
    protected CraftingPedestalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CraftingPedestalBlockEntity(pos,state);
    }


    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).isOf(ModItems.RITUAL_DAGGER) && world.getBlockEntity(pos) instanceof CraftingPedestalBlockEntity pedestal){
            pedestal.attemptCraft();
            return ActionResult.SUCCESS;
        }else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }
}
