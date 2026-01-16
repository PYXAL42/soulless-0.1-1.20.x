package net.pyxal42.soulless.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.pyxal42.soulless.block.blockentity.CraftingPedestalBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {


    @Inject(method = "onKilledOther", at = @At("TAIL"))
    private void soulless$chargeNearbyAltar(ServerWorld world, LivingEntity other, CallbackInfoReturnable<Boolean> cir){
        //remember to check for specific entities later
        //works, but doesnt sync, ask if it should activate on kill by
        //not just players, if so use another server and client method
        for (int a = 0; a <= 5; a++) {
            for (int b = 0; b <= 5; b++) {
                for (int c = 0; c <= 5; c++) {

                    BlockPos pos = other.getBlockPos().add(a, b, c);
                    if (world.getBlockEntity(pos) instanceof CraftingPedestalBlockEntity pedestal && !pedestal.isMaxPower()) {
                        pedestal.addBlood(1);
                        PlayerEntity player =(PlayerEntity) (Object) this;
                        pedestal.syncToClient((ServerPlayerEntity) player);
                        world.playSound(null, pos, SoundEvents.BLOCK_RESPAWN_ANCHOR_CHARGE, SoundCategory.HOSTILE);
                        return;
                    }
                    pos = other.getBlockPos().add(-a, -b, -c);
                    if (world.getBlockEntity(pos) instanceof CraftingPedestalBlockEntity pedestal && !pedestal.isMaxPower()) {
                        pedestal.addBlood(1);
                        PlayerEntity player =(PlayerEntity) (Object) this;
                        pedestal.syncToClient((ServerPlayerEntity) player);
                        world.playSound(null, pos, SoundEvents.BLOCK_RESPAWN_ANCHOR_CHARGE, SoundCategory.HOSTILE);
                        return;
                    }
                }
            }
        }
    }

}
