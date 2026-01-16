package net.pyxal42.soulless.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.pyxal42.soulless.Soulless;
import net.pyxal42.soulless.block.blockentity.CraftingPedestalBlockEntity;

public class ModPackets {

    public static final Identifier SYNC_ALTAR_S2C = Soulless.ID("sync_altar_s2c");

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(SYNC_ALTAR_S2C, ModPackets::receiveSyncAltarS2C);
    }


    public static void receiveSyncAltarS2C(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buf, PacketSender sender) {
        BlockPos pos = buf.readBlockPos();
        NbtCompound nbt = buf.readNbt();
        if ( nbt != null &&client.world.getBlockEntity(pos) instanceof CraftingPedestalBlockEntity altar) {
            altar.readNbt(nbt);
        }
    }
}
