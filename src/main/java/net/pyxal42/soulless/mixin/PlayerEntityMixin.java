package net.pyxal42.soulless.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.pyxal42.soulless.block.blockentity.CraftingPedestalBlockEntity;
import net.pyxal42.soulless.datagen.ModItemTagProvider;
import net.pyxal42.soulless.item.ModItems;
import net.pyxal42.soulless.tags.ModTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {


    @Inject(method = "onKilledOther", at = @At("TAIL"))
    private void collectBlood(ServerWorld world, LivingEntity other, CallbackInfoReturnable<Boolean> cir) {
        //reminder: remove this once the tag's entries are done
        if (other.getType().isIn(ModTags.HAS_BLOOD_TAG) || true) {
            PlayerEntity instance = (PlayerEntity) (Object) this;
            if (instance.getStackInHand(Hand.MAIN_HAND).isOf(ModItems.RITUAL_DAGGER) && instance.getStackInHand(Hand.OFF_HAND).isOf(Items.GLASS_BOTTLE)) {
                instance.setStackInHand(Hand.OFF_HAND, ModItems.BLOOD_BOTTLE.getDefaultStack());
            } else {


                for (int a = 0; a <= 5; a++) {
                    for (int b = 0; b <= 5; b++) {
                        for (int c = 0; c <= 5; c++) {
                            BlockPos pos = other.getBlockPos().add(a, b, c);
                            if (world.getBlockEntity(pos) instanceof CraftingPedestalBlockEntity pedestal && !pedestal.isMaxPower()) {
                                pedestal.addBlood(1);
                                PlayerEntity player = (PlayerEntity) (Object) this;
                                pedestal.syncToClient((ServerPlayerEntity) player);
                                world.playSound(null, pos, SoundEvents.BLOCK_RESPAWN_ANCHOR_CHARGE, SoundCategory.HOSTILE);
                                return;
                            }
                            pos = other.getBlockPos().add(-a, -b, -c);
                            if (world.getBlockEntity(pos) instanceof CraftingPedestalBlockEntity pedestal && !pedestal.isMaxPower()) {
                                pedestal.addBlood(1);
                                PlayerEntity player = (PlayerEntity) (Object) this;
                                pedestal.syncToClient((ServerPlayerEntity) player);
                                world.playSound(null, pos, SoundEvents.BLOCK_RESPAWN_ANCHOR_CHARGE, SoundCategory.HOSTILE);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

}
