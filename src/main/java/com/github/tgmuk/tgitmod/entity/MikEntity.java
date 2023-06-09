package com.github.tgmuk.tgitmod.entity;

import com.github.tgmuk.tgitmod.TGITMod;
import com.github.tgmuk.tgitmod.registration.EntityTypeRegister;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.jetbrains.annotations.Nullable;

public class MikEntity extends Animal {
    public MikEntity(EntityType<? extends MikEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob mob) {
        return EntityTypeRegister.MIK_ENTITY.get().create(level);
    }

    public static AttributeSupplier.Builder getMikEntityAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 15D).add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    @SubscribeEvent
    public static void entityUsed(PlayerInteractEvent.EntityInteract event) {
        if (event.getEntity().getType() == EntityTypeRegister.MIK_ENTITY.get()) {
            TGITMod.LOGGER.debug("ohh ja");
        }
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
    }




}
