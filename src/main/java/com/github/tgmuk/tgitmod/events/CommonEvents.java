package com.github.tgmuk.tgitmod.events;

import com.github.tgmuk.tgitmod.StaticModValues;
import com.github.tgmuk.tgitmod.entity.MikEntity;
import com.github.tgmuk.tgitmod.registration.EntityTypeRegister;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StaticModValues.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityTypeRegister.MIK_ENTITY.get(), MikEntity.getMikEntityAttributes().build());
    }
}
