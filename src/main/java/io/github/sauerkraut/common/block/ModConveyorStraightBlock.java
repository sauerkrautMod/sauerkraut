package io.github.sauerkraut.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.Tag;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ModConveyorStraightBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty CONNECTED_RIGHT = BooleanProperty.create("connected_right");
    public static final BooleanProperty CONNECTED_BACK = BooleanProperty.create("connected_back");
    public static final BooleanProperty CONNECTED_LEFT = BooleanProperty.create("connected_left");

    public ModConveyorStraightBlock(Properties properties) {
        super(properties);
        this.setDefaultState(
                this.getDefaultState()
                        .with(FACING, Direction.NORTH)
                        .with(CONNECTED_RIGHT, false)
                        .with(CONNECTED_BACK, false)
                        .with(CONNECTED_LEFT, false)
        );
    }

    private void updateConnections(World world, BlockPos pos, Direction facing) {
        BlockPos right = pos.add(facing.rotateY().getDirectionVec());
        BlockPos back = pos.add(facing.getOpposite().getDirectionVec());
        BlockPos left = pos.add(facing.rotateYCCW().getDirectionVec());


    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getPos();
        Direction facing = context.getPlacementHorizontalFacing();

        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing());
    }
}
