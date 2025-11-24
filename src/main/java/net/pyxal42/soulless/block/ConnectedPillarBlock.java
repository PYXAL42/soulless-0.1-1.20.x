package net.pyxal42.soulless.block;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluid;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;


public class ConnectedPillarBlock extends Block {

    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;
    public static final BooleanProperty UP = Properties.UP;
    public static final BooleanProperty DOWN = Properties.DOWN;
    public static final BooleanProperty EAST = Properties.EAST;
    public static final BooleanProperty WEST = Properties.WEST;
    public static final BooleanProperty SOUTH = Properties.SOUTH;
    public static final BooleanProperty NORTH = Properties.NORTH;

    public ConnectedPillarBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(UP, false).with(DOWN, false).with(EAST, false).with(WEST, false).with(SOUTH, false).with(NORTH, false).with(AXIS, Direction.Axis.Y));
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return changeRotation(state, rotation);
    }

    public static BlockState changeRotation(BlockState state, BlockRotation rotation) {
        switch (rotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch ((Direction.Axis)state.get(AXIS)) {
                    case X:
                        return state.with(AXIS, Direction.Axis.Z);
                    case Z:
                        return state.with(AXIS, Direction.Axis.X);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder){
        builder.add( UP, DOWN, EAST,WEST, SOUTH, NORTH, AXIS);
    }

    private static boolean isPillar(BlockView world, BlockPos pos, BlockState state) {
        if (state.isOf(ModBlocks.ORNATED_FLESH_PILLAR)){
            return true;
        } else {
            return false;
        }
    }
    @Nullable
    private static BlockPos getCauldronPos(World world, BlockPos pos, Fluid fluid) {
        Predicate<BlockState> predicate = state -> state.getBlock() instanceof AbstractCauldronBlock
                && ((AbstractCauldronBlock) state.getBlock()).canBeFilledByDripstone(fluid);
        BiPredicate<BlockPos, BlockState> biPredicate = (posx, state) -> canDripThrough(world, posx, state);
        return (BlockPos) searchInDirection(world, pos, Direction.DOWN.getDirection(), biPredicate, predicate, 11).orElse(null);
    }

    @Nullable
    private static BlockPos isTopBlockConnectable(World world, BlockPos pos) {
        Predicate<BlockState> predicate = state -> state.getBlock() instanceof ConnectedPillarBlock
                && ((ConnectedPillarBlock) state.getBlock()).AXIS(Y)
        }
        if (true){

        }
        BiPredicate<BlockPos, BlockState> biPredicate = (posx, state) -> isPillar(world, posx, state);
        return (BlockPos)searchInDirection(world, pos, Direction.DOWN.getDirection(), 1).orElse(null);
    }


    private static Optional<BlockPos> searchInDirection(
            WorldAccess world,
            BlockPos pos,
            Direction.AxisDirection direction,
            int range
    ) {
        Direction direction2 = Direction.get(direction, Direction.Axis.Y);
        BlockPos.Mutable mutable = pos.mutableCopy();

        for (int i = 1; i < range; i++) {
            mutable.move(direction2);
            BlockState blockState = world.getBlockState(mutable);
            if (world.isOutOfHeightLimit(mutable.getY())){
                return Optional.empty();
            }
        }
        return Optional.empty();
    }
}
