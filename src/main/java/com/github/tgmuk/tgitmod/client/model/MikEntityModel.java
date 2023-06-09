package com.github.tgmuk.tgitmod.client.model;// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.github.tgmuk.tgitmod.entity.MikEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class MikEntityModel extends EntityModel<MikEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("tgitmod", "mik_entity"), "main");
	private final ModelPart body;

	public MikEntityModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = new MeshDefinition();
		PartDefinition parts = mesh.getRoot();

		PartDefinition body = parts.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 17).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -9.0F, -4.0F, 10.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition hair = head.addOrReplaceChild("hair", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition hairfront = hair.addOrReplaceChild("hairfront", CubeListBuilder.create().texOffs(54, 53).addBox(-6.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(54, 33).addBox(-3.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(54, 0).addBox(0.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(36, 53).addBox(3.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.5F));

		PartDefinition hairmid = hair.addOrReplaceChild("hairmid", CubeListBuilder.create().texOffs(48, 21).addBox(-6.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 47).addBox(-3.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 47).addBox(0.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(3.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.5F));

		PartDefinition hairback = hair.addOrReplaceChild("hairback", CubeListBuilder.create().texOffs(45, 44).addBox(-6.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(45, 9).addBox(-3.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(36, 0).addBox(0.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(3.0F, -9.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.5F));

		PartDefinition legR = body.addOrReplaceChild("legR", CubeListBuilder.create().texOffs(16, 33).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 7.0F, 0.0F));

		PartDefinition legL = body.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(32, 33).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 7.0F, 0.0F));

		PartDefinition armR = body.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(20, 25).addBox(-10.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -3.0F, 0.0F));

		PartDefinition armL = body.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(20, 17).addBox(0.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -3.0F, 0.0F));

		PartDefinition axelhaare = body.addOrReplaceChild("axelhaare", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -1.0F, 0.0F));

		return LayerDefinition.create(mesh, 128, 128);
	}

	@Override
	public void setupAnim(MikEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}