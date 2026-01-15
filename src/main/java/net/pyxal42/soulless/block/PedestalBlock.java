package net.pyxal42.soulless.block;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.pyxal42.soulless.block.blockentity.ModBlockEntities;
import net.pyxal42.soulless.block.blockentity.PedestalBlockEntity;
import net.pyxal42.soulless.item.ModItems;
import org.jetbrains.annotations.Nullable;

public class PedestalBlock extends BlockWithEntity {
    protected PedestalBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new PedestalBlockEntity(ModBlockEntities.PEDESTAL_BLOCKENTITY,pos,state);
    }


    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (hand == Hand.MAIN_HAND && world.getBlockEntity(pos) instanceof PedestalBlockEntity pedestal) {
            ItemStack stack = player.getStackInHand(hand);
                player.setStackInHand(hand, pedestal.getHeldStack());
                pedestal.setHeldStack(stack);

        }

        return ActionResult.CONSUME;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (world.getBlockEntity(pos) instanceof PedestalBlockEntity pedestal && pedestal.hasItem()) {
            world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), pedestal.getHeldStack()));
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public boolean isCullingShapeFullCube(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }



    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
