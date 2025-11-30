package net.pyxal42.soulless.mixin;

import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.ItemStack;
import net.pyxal42.soulless.Soulless;
import net.pyxal42.soulless.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useLargeModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(ModItems.LIV_BLADE) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND && renderMode != ModelTransformationMode.FIXED) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Soulless.MOD_ID, "liv_blade_large", "inventory"));
        }
        return value;
    }
}
