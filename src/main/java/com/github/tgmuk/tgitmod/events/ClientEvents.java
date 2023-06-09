package com.github.tgmuk.tgitmod.events;

import com.github.tgmuk.tgitmod.StaticModValues;
import com.github.tgmuk.tgitmod.client.model.MikEntityModel;
import com.github.tgmuk.tgitmod.client.render.MikEntityRenderer;
import com.github.tgmuk.tgitmod.registration.EntityTypeRegister;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StaticModValues.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void entityRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityTypeRegister.MIK_ENTITY.get(), MikEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MikEntityModel.LAYER_LOCATION, MikEntityModel::createBodyLayer);
    }
}
