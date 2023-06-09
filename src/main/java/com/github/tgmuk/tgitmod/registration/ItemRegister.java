package com.github.tgmuk.tgitmod.registration;

import com.github.tgmuk.tgitmod.StaticModValues;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StaticModValues.MODID);
}
