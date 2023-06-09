package com.github.tgmuk.tgitmod.client.render;

import com.github.tgmuk.tgitmod.StaticModValues;
import com.github.tgmuk.tgitmod.client.model.MikEntityModel;
import com.github.tgmuk.tgitmod.entity.MikEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MikEntityRenderer extends MobRenderer<MikEntity, MikEntityModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(StaticModValues.MODID, "textures/entity/mik_entity.png");
    public MikEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new MikEntityModel(context.bakeLayer(MikEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(MikEntity entity) {
        return TEXTURE;
    }
}
