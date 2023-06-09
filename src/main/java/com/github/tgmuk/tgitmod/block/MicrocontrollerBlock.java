package com.github.tgmuk.tgitmod.block;

import com.github.tgmuk.tgitmod.TGITMod;
import com.github.tgmuk.tgitmod.entity.MikEntity;
import com.github.tgmuk.tgitmod.registration.BlockRegister;
import com.github.tgmuk.tgitmod.registration.EntityTypeRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;

public class MicrocontrollerBlock extends Block {

    public MicrocontrollerBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL));
    }

    @Override
    public void onNeighborChange(BlockState state, LevelReader level, BlockPos pos, BlockPos neighbor) {
        super.onNeighborChange(state, level, pos, neighbor);

        TGITMod.LOGGER.debug("block change");
        if (level.getBlockState(pos.above()).getBlock() == Blocks.REDSTONE_BLOCK &&
            level.getBlockState(pos.below()).getBlock() == BlockRegister.RAM_BLOCK.get()) {

            TGITMod.LOGGER.debug("OMG lass mal spawnen");

            if (level instanceof Level realLevel) {
                TGITMod.LOGGER.debug("level = level");
                MikEntity mik = new MikEntity(EntityTypeRegister.MIK_ENTITY.get(), realLevel);
                mik.setPos(pos.getCenter());
                realLevel.addFreshEntity(mik);

            }
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult bhr) {


        if (level.getBlockState(pos.above()).getBlock() == Blocks.REDSTONE_BLOCK &&
                level.getBlockState(pos.below()).getBlock() == BlockRegister.RAM_BLOCK.get()) {
            MikEntity mik = new MikEntity(EntityTypeRegister.MIK_ENTITY.get(), level);
            mik.setPos(pos.getCenter());

            level.setBlock(pos, Blocks.AIR.defaultBlockState(), 3);
            level.setBlock(pos.above(), Blocks.AIR.defaultBlockState(), 3);
            level.setBlock(pos.below(), Blocks.AIR.defaultBlockState(), 3);

            level.addFreshEntity(mik);
        }

        return super.use(state, level, pos, player, hand, bhr);
    }
}
