package net.pyxal42.soulless;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.pyxal42.soulless.block.ModBlocks;
import net.pyxal42.soulless.block.blockentity.ModBlockEntities;
import net.pyxal42.soulless.networking.ModPackets;
import net.pyxal42.soulless.render.block.PedestalBlockEntityRenderer;

public class SoullessClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AGONY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLEAR_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUSTY_METAL_BARS, RenderLayer.getCutout());

        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BLOCKENTITY, PedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.ALTAR_BLOCKENTITY, PedestalBlockEntityRenderer::new);

        ModPackets.registerS2CPackets();

        ClientTickEvents.END_CLIENT_TICK.register((t) -> PedestalBlockEntityRenderer.ticks++);
    }
}
