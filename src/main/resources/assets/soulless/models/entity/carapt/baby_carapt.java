// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class baby_carapt extends EntityModel<Entity> {
	private final ModelPart root;
	private final ModelPart tail;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	public baby_carapt(ModelPart root) {
		this.root = root.getChild("root");
		this.tail = this.root.getChild("tail");
		this.LeftArm = this.root.getChild("LeftArm");
		this.RightArm = this.root.getChild("RightArm");
		this.LeftLeg = this.root.getChild("LeftLeg");
		this.RightLeg = this.root.getChild("RightLeg");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -9.0F, -4.0F, 8.0F, 6.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 26).cuboid(0.0F, -12.0F, -4.0F, 0.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData spikeRight_r1 = root.addChild("spikeRight_r1", ModelPartBuilder.create().uv(16, 25).cuboid(0.0F, -3.0F, -4.0F, 0.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -9.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		ModelPartData spikeLeft_r1 = root.addChild("spikeLeft_r1", ModelPartBuilder.create().uv(16, 14).cuboid(0.0F, -3.0F, -4.0F, 0.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		ModelPartData tail = root.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.0F, 4.0F));

		ModelPartData tail_r1 = tail.addChild("tail_r1", ModelPartBuilder.create().uv(0, 14).cuboid(0.0F, -1.0F, 0.0F, 0.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		ModelPartData LeftArm = root.addChild("LeftArm", ModelPartBuilder.create().uv(32, 0).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -7.0F, -4.0F, 0.0F, 0.0F, -0.1745F));

		ModelPartData RightArm = root.addChild("RightArm", ModelPartBuilder.create().uv(32, 10).cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -7.0F, -4.0F, 0.0F, 0.0F, 0.1745F));

		ModelPartData LeftLeg = root.addChild("LeftLeg", ModelPartBuilder.create().uv(32, 20).cuboid(0.1F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.9F, -7.0F, 4.0F, 0.0F, 0.0F, -0.1745F));

		ModelPartData RightLeg = root.addChild("RightLeg", ModelPartBuilder.create().uv(32, 30).cuboid(-2.1F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.9F, -7.0F, 4.0F, 0.0F, 0.0F, 0.1745F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}