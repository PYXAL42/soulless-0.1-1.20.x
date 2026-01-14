package net.pyxal42.soulless.render.block;

import net.minecraft.client.render.*;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.random.Random;
import net.pyxal42.soulless.block.blockentity.PedestalBlockEntity;


public class PedestalBlockEntityRenderer implements BlockEntityRenderer<PedestalBlockEntity> {

    private final ItemRenderer itemRenderer;
    public static int ticks = 0;
    private final Random random = Random.create();


    public PedestalBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        itemRenderer = context.getItemRenderer();
    }

    //Private method from ItemEntityRenderer
    private int getRenderedAmount(ItemStack stack) {
        int i = 1;
        if (stack.getCount() > 48) {
            i = 5;
        } else if (stack.getCount() > 32) {
            i = 4;
        } else if (stack.getCount() > 16) {
            i = 3;
        } else if (stack.getCount() > 1) {
            i = 2;
        }

        return i;
    }


    @Override
    public void render(PedestalBlockEntity pedestal, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int i, int overlay) {
        //Basically just the render method from ItemEntityRenderer
        matrices.push();
        matrices.translate(0.5f, 1f, 0.5f);
        matrices.scale(1.25f, 1.25f, 1.25f);
        int light = WorldRenderer.getLightmapCoordinates(pedestal.getWorld(), pedestal.getPos().up());

        matrices.push();
        ItemStack itemStack = pedestal.getHeldStack();
        int j = itemStack.isEmpty() ? 187 : Item.getRawId(itemStack.getItem()) + itemStack.getDamage();
        this.random.setSeed((long) j);
        BakedModel bakedModel = this.itemRenderer.getModel(itemStack, pedestal.getWorld(), (LivingEntity) null, 1);
        boolean bl = bakedModel.hasDepth();
        int k = this.getRenderedAmount(itemStack);
        float h = 0.25F;
        float l = MathHelper.sin(((float) ticks + tickDelta) / 10.0F + pedestal.uniqueOffset) * 0.1F + 0.1F;
        float m = bakedModel.getTransformation().getTransformation(ModelTransformationMode.GROUND).scale.y();
        matrices.translate(0.0F, l + 0.25F * m, 0.0F);
        float n = ((float) ticks + tickDelta) / 20.0F + pedestal.uniqueOffset;
        matrices.multiply(RotationAxis.POSITIVE_Y.rotation(n));
        float o = bakedModel.getTransformation().ground.scale.x();
        float p = bakedModel.getTransformation().ground.scale.y();
        float q = bakedModel.getTransformation().ground.scale.z();
        float s;
        float t;
        if (!bl) {
            float r = -0.0F * (float) (k - 1) * 0.5F * o;
            s = -0.0F * (float) (k - 1) * 0.5F * p;
            t = -0.09375F * (float) (k - 1) * 0.5F * q;
            matrices.translate(r, s, t);
        }

        for (int u = 0; u < k; ++u) {
            matrices.push();
            if (u > 0) {
                if (bl) {
                    s = (this.random.nextFloat() * 2.0F - 1.0F) * 0.15F;
                    t = (this.random.nextFloat() * 2.0F - 1.0F) * 0.15F;
                    float v = (this.random.nextFloat() * 2.0F - 1.0F) * 0.15F;
                    matrices.translate(s, t, v);
                } else {
                    s = (this.random.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
                    t = (this.random.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
                    matrices.translate(s, t, 0.0F);
                }
            }

            this.itemRenderer.renderItem(itemStack, ModelTransformationMode.GROUND, false, matrices, vertexConsumers, light, OverlayTexture.DEFAULT_UV, bakedModel);
            matrices.pop();
            if (!bl) {
                matrices.translate(0.0F * o, 0.0F * p, 0.09375F * q);
            }
        }

        matrices.pop();


        matrices.pop();

    }

}




