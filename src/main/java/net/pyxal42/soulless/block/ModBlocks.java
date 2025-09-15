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
import static net.minecraft.block.Blocks.NETHERRACK;

public class ModBlocks {

    public static final Block DIMSTONE = registerBlock("dimstone",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block DIMSTONE_STAIRS = registerBlock("dimstone_stairs",
            new StairsBlock(DIMSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS)));
    public static final Block DIMSTONE_SLAB = registerBlock("dimstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block DIMSTONE_WALL = registerBlock("dimstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block DIMSTONE_BRICK = registerBlock("dimstone_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DIMSTONE_BRICK_STAIRS = registerBlock("dimstone_brick_stairs",
            new StairsBlock(DIMSTONE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS)));
    public static final Block DIMSTONE_BRICK_SLAB = registerBlock("dimstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final Block DIMSTONE_BRICK_WALL = registerBlock("dimstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block DIMSTONE_PILLAR = registerBlock("dimstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block INFUSED_DIMSTONE_PILLAR = registerBlock("infused_dimstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).luminance(4)));
    public static final Block DIMSTONE_PEDESTAL = registerBlock("dimstone_pedestal",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block INFUSED_INKEEPING_CORE = registerBlock("infused_inkeeping_core",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE).luminance(4)));
    public static final Block INKEEPING_CORE = registerBlock("inkeeping_core",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block INFUSED_DIMSTONE_CORE = registerBlock("infused_dimstone_core",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE).luminance(4)));
    public static final Block DIMSTONE_CORE = registerBlock("dimstone_core",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block INFUSED_BLOOMING_CORE = registerBlock("infused_blooming_core",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE).luminance(4)));
    public static final Block BLOOMING_CORE = registerBlock("blooming_core",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block INFUSED_RADIANCE_CORE = registerBlock("infused_radiance_core",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE).luminance(4)));
    public static final Block RADIANCE_CORE = registerBlock("radiance_core",
            new Block(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            new Block(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block ROTTEN_FLESH_STAIRS = registerBlock("rotten_flesh_stairs",
            new StairsBlock(ROTTEN_FLESH_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_STAIRS)));
    public static final Block ROTTEN_FLESH_SLAB = registerBlock("rotten_flesh_slab",
            new SlabBlock(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block ROTTEN_FLESH_WALL = registerBlock("rotten_flesh_wall",
            new WallBlock(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block FLESH_BLOCK = registerBlock("flesh_block",
            new Block(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block FLESH_STAIRS = registerBlock("flesh_stairs",
            new StairsBlock(FLESH_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_STAIRS)));
    public static final Block FLESH_SLAB = registerBlock("flesh_slab",
            new SlabBlock(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block FLESH_WALL = registerBlock("flesh_wall",
            new WallBlock(FabricBlockSettings.copyOf(NETHERRACK)));


    public static final Block AGONY_LOG = registerBlock("agony_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block AGONY_WOOD = registerBlock("agony_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_AGONY_LOG = registerBlock("stripped_agony_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_AGONY_WOOD = registerBlock("stripped_agony_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));


    public static final Block AGONY_PLANKS = registerBlock("agony_planks",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f).nonOpaque()));
    public static final Block AGONY_LEAVES = registerBlock("agony_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()));

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
