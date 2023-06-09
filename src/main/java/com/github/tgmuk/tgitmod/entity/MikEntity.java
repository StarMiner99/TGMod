package com.github.tgmuk.tgitmod.entity;

import com.github.tgmuk.tgitmod.registration.EntityTypeRegister;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.jetbrains.annotations.Nullable;

public class MikEntity extends Animal {
    public MikEntity(EntityType<? extends MikEntity> entityType, Level level) {
        super(entityType, level);
    }

    @SubscribeEvent
    public void ooohITouchedIt(PlayerInteractEvent.EntityInteract event) {
        this.convertTo(EntityType.CAMEL, true);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob mob) {
        return EntityTypeRegister.MIK_ENTITY.get().create(level);
    }


    public static AttributeSupplier.Builder getMikEntityAttributes() {
        return Mob.createMobAttributes().add(Attributes.JUMP_STRENGTH, 2f).add(Attributes.MAX_HEALTH, 15);
    }


}
