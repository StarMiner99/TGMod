package com.github.tgmuk.tgitmod.registration;

import com.github.tgmuk.tgitmod.StaticModValues;
import com.github.tgmuk.tgitmod.entity.MikEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityTypeRegister {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StaticModValues.MODID);

    public static final RegistryObject<EntityType<MikEntity>> MIK_ENTITY = ENTITY_TYPES.register("mik_entity", () -> EntityType.Builder.of(MikEntity::new, MobCategory.CREATURE).build(StaticModValues.MODID + ":mik"));
}
