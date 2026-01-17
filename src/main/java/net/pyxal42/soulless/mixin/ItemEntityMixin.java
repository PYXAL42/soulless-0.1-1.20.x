package net.pyxal42.soulless.mixin;

import net.minecraft.entity.ItemEntity;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import net.pyxal42.soulless.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntity.class)
public abstract class ItemEntityMixin {
    @Shadow public abstract ItemStack getStack();

    @Inject(method = "tick", at = @At(value = "TAIL"))
    private void coolMould(CallbackInfo ci) {
        if (getStack().isOf(ModItems.HOT_MOULD)) {
            ItemEntity instance = (ItemEntity) (Object) this;
            if (instance.isTouchingWater() && instance.getFluidHeight(FluidTags.WATER) > instance.getStandingEyeHeight() - 0.11111111F) {
                instance.playSound(SoundEvents.BLOCK_FIRE_EXTINGUISH,1f,1f);
                World world = instance.getWorld();
                world.spawnEntity(new ItemEntity(world,instance.getX(), instance.getY(), instance.getZ(),ModItems.EMPTY_MOULD.getDefaultStack()));
                world.spawnEntity(new ItemEntity(world,instance.getX(), instance.getY(), instance.getZ(),Items.OBSIDIAN.getDefaultStack()));
                instance.discard();

            }
        }
    }

}
