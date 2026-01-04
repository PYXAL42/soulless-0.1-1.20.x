// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class soul_conglomeratet extends EntityModel<Entity> {
	private final ModelPart bb_main;
	public soul_conglomeratet(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(-38, -30).cuboid(-19.0F, -24.0F, -16.0F, 32.0F, 24.0F, 32.0F, new Dilation(0.0F))
		.uv(-22, -14).cuboid(-17.0F, -28.0F, -12.0F, 16.0F, 4.0F, 16.0F, new Dilation(0.0F))
		.uv(-14, -10).cuboid(-1.0F, -26.0F, -5.0F, 12.0F, 2.0F, 12.0F, new Dilation(0.0F))
		.uv(-8, 0).cuboid(-7.0F, -22.0F, -18.0F, 16.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(-9, -1).cuboid(-15.0F, -13.0F, -19.0F, 8.0F, 8.0F, 3.0F, new Dilation(0.0F))
		.uv(-10, -10).cuboid(13.0F, -24.0F, 2.0F, 1.0F, 16.0F, 12.0F, new Dilation(0.0F))
		.uv(-12, -12).cuboid(13.0F, -10.0F, -14.0F, 2.0F, 8.0F, 14.0F, new Dilation(0.0F))
		.uv(-8, -14).cuboid(-21.0F, -23.0F, -4.0F, 2.0F, 14.0F, 16.0F, new Dilation(0.0F))
		.uv(-7, -14).cuboid(-20.0F, -13.0F, -10.0F, 1.0F, 10.0F, 16.0F, new Dilation(0.0F))
		.uv(-2, -2).cuboid(-2.0F, -6.0F, -20.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(-2, -2).cuboid(3.0F, -35.0F, -12.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(-10, -10).cuboid(13.0F, -7.0F, -3.0F, 4.0F, 4.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, -14.0F, 16.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}