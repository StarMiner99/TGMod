package com.github.tgmuk.tgitmod.registration;

import com.github.tgmuk.tgitmod.StaticModValues;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, StaticModValues.MODID);

    // automatically adds BlockItem to every block
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemRegister.ITEMS.register(name, () -> new BlockItem(block.get(), properties));

        return block;
    }

    // blocks:
    public static final RegistryObject<Block> TEST_BLOCK = register("test", () -> new Block(Block.Properties.of(Material.CLAY)), new Item.Properties());


}
