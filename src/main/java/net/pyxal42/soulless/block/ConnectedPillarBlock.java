package net.pyxal42.soulless.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.block.enums.Thickness;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

public class ConnectedPillarBlock extends Block implements Waterloggable {
    public static final BooleanProperty UP = Properties.UP;
    public static final BooleanProperty DOWN = Properties.DOWN;
    public static final BooleanProperty EAST = Properties.EAST;
    public static final BooleanProperty WEST = Properties.WEST;
    public static final BooleanProperty SOUTH = Properties.SOUTH;
    public static final BooleanProperty NORTH = Properties.NORTH;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public ConnectedPillarBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(UP, false).with(DOWN, false).with(EAST, false).with(WEST, false).with(SOUTH, false).with(NORTH, false).with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder){
        builder.add( UP, DOWN, EAST,WEST, SOUTH, NORTH, WATERLOGGED);
    }
}
