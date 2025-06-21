package net.pyxal42.soulless.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pyxal42.soulless.Soulless;

import static net.minecraft.block.Blocks.DEEPSLATE;

public class ModBlocks {

    public static final Block DIMSTONE = registerBlock("dimstone",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block DIMSTONESTAIRS = registerBlock("dimstone_stairs",
            new StairsBlock(DIMSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS)));
    public static final Block DIMSTONESLAB = registerBlock("dimstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block DIMSTONEWALL = registerBlock("dimstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block DIMSTONEBRICK = registerBlock("dimstone_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DIMSTONEBRICKSTAIRS = registerBlock("dimstone_brick_stairs",
            new StairsBlock(DIMSTONEBRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS)));
    public static final Block DIMSTONEBRICKSLAB = registerBlock("dimstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final Block DIMSTONEBRICKWALL = registerBlock("dimstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block DIMSTONEPILLAR = registerBlock("dimstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block INFUSEDDIMSTONEPILLAR = registerBlock("infused_dimstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DIMSTONEALTAR = registerBlock("dimstone_altar",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Soulless.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Soulless.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Soulless.LOGGER.info("Registering Modblocks for " + Soulless.MOD_ID);

    }
}
