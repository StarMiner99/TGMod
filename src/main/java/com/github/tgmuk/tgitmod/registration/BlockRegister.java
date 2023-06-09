package com.github.tgmuk.tgitmod.registration;

import com.github.tgmuk.tgitmod.StaticModValues;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, StaticModValues.MODID);

    // blocks:
    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test", () -> new Block(Block.Properties.of(Material.CLAY)));

}
