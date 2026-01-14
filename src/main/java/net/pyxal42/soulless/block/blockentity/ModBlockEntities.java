package net.pyxal42.soulless.block.blockentity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.pyxal42.soulless.Soulless;
import net.pyxal42.soulless.block.ModBlocks;

public class ModBlockEntities {

    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BLOCKENTITY = register(
            FabricBlockEntityTypeBuilder.create(PedestalBlockEntity::new, ModBlocks.DIMSTONE_PEDESTAL).build(null)
            ,"pedestal_blockentity");


    public static <T extends BlockEntityType<?>> T register(T blockEntityType, String name) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Soulless.ID(name), blockEntityType);
    }



}
