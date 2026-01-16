package net.pyxal42.soulless.block.blockentity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.pyxal42.soulless.networking.ModPackets;
import org.jetbrains.annotations.Nullable;

public class PedestalBlockEntity extends BlockEntity {

    private ItemStack heldStack;
    public float uniqueOffset;

    public PedestalBlockEntity(BlockEntityType type,BlockPos pos, BlockState state) {
        super(type, pos, state);
        heldStack = ItemStack.EMPTY;
        this.uniqueOffset = Random.create().nextFloat() * 3.1415927F * 2.0F;
    }

    public PedestalBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.PEDESTAL_BLOCKENTITY, pos, state);
        heldStack = ItemStack.EMPTY;
        this.uniqueOffset = Random.create().nextFloat() * 3.1415927F * 2.0F;
    }




    public boolean hasItem(){
        return !(heldStack == null ||heldStack.isEmpty());
    }
    public void setHeldStack(ItemStack stack){
        heldStack = stack;
    }

    public ItemStack getHeldStack(){
        return heldStack;
    }




    public void syncToClient(ServerPlayerEntity player){
        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeBlockPos(getPos());
        NbtCompound nbt = new NbtCompound();
        writeNbt(nbt);
        buf.writeNbt(nbt);
        ServerPlayNetworking.send(player, ModPackets.SYNC_ALTAR_S2C,buf);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
         NbtCompound compound = new NbtCompound();
         writeNbt(compound);
        return compound;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        heldStack = ItemStack.fromNbt((NbtCompound)(nbt.get("heldStack")));

        super.readNbt(nbt);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        nbt.put("heldStack", heldStack.writeNbt(new NbtCompound()));
        super.writeNbt(nbt);
    }


}
