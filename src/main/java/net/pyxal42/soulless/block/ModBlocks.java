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

import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block DIMSTONE = registerBlock("dimstone",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE)));
    public static final Block DIMSTONE_STAIRS = registerBlock("dimstone_stairs",
            new StairsBlock(DIMSTONE.getDefaultState(), FabricBlockSettings.copyOf(DIMSTONE)));
    public static final Block DIMSTONE_SLAB = registerBlock("dimstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DIMSTONE)));
    public static final Block DIMSTONE_WALL = registerBlock("dimstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DIMSTONE)));
    public static final Block DIMSTONE_BRICK = registerBlock("dimstone_brick",
            new Block(FabricBlockSettings.copyOf(DIMSTONE)));
    public static final Block DIMSTONE_BRICK_STAIRS = registerBlock("dimstone_brick_stairs",
            new StairsBlock(DIMSTONE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(DIMSTONE_BRICK)));
    public static final Block DIMSTONE_BRICK_SLAB = registerBlock("dimstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DIMSTONE_BRICK)));
    public static final Block DIMSTONE_BRICK_WALL = registerBlock("dimstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DIMSTONE_BRICK)));
    public static final Block DIMSTONE_PILLAR = registerBlock("dimstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(DIMSTONE_BRICK)));
    public static final Block INFUSED_DIMSTONE_PILLAR = registerBlock("infused_dimstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(DIMSTONE_PILLAR).luminance(4)));
    public static final Block DIMSTONE_PEDESTAL = registerBlock("dimstone_pedestal",
            new Block(FabricBlockSettings.copyOf(DIMSTONE)));
    public static final Block DIMSTONE_CORE = registerBlock("dimstone_core",
            new Block(FabricBlockSettings.copyOf(DIMSTONE)));
    public static final Block INFUSED_DIMSTONE_CORE = registerBlock("infused_dimstone_core",
            new Block(FabricBlockSettings.copyOf(DIMSTONE_CORE).luminance(4)));
    public static final Block INKEEPING_CORE = registerBlock("inkeeping_core",
            new Block(FabricBlockSettings.copyOf(DIMSTONE_CORE)));
    public static final Block INFUSED_INKEEPING_CORE = registerBlock("infused_inkeeping_core",
            new Block(FabricBlockSettings.copyOf(INFUSED_DIMSTONE_CORE).luminance(4)));
    public static final Block BLOOMING_CORE = registerBlock("blooming_core",
            new Block(FabricBlockSettings.copyOf(DIMSTONE_CORE)));
    public static final Block INFUSED_BLOOMING_CORE = registerBlock("infused_blooming_core",
            new Block(FabricBlockSettings.copyOf(DIMSTONE_CORE).luminance(4)));
    public static final Block RADIANCE_CORE = registerBlock("radiance_core",
            new Block(FabricBlockSettings.copyOf(DIMSTONE_CORE)));
    public static final Block INFUSED_RADIANCE_CORE = registerBlock("infused_radiance_core",
            new Block(FabricBlockSettings.copyOf(INFUSED_DIMSTONE_CORE).luminance(4)));
    public static final Block BONED_ROTTEN_FLESH_BLOCK = registerBlock("boned_rotten_flesh_block",
            new Block(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block BONED_ROTTEN_FLESH_STAIRS = registerBlock("boned_rotten_flesh_stairs",
            new StairsBlock(BONED_ROTTEN_FLESH_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(BONED_ROTTEN_FLESH_BLOCK)));
    public static final Block BONED_ROTTEN_FLESH_SLAB = registerBlock("boned_rotten_flesh_slab",
            new SlabBlock(FabricBlockSettings.copyOf(BONED_ROTTEN_FLESH_BLOCK)));
    public static final Block BONED_ROTTEN_FLESH_WALL = registerBlock("boned_rotten_flesh_wall",
            new WallBlock(FabricBlockSettings.copyOf(BONED_ROTTEN_FLESH_BLOCK)));
    public static final Block FLESH_BLOCK = registerBlock("flesh_block",
            new Block(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block FLESH_PILLAR = registerBlock("flesh_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(FLESH_BLOCK)));
    public static final Block FLESH_STAIRS = registerBlock("flesh_stairs",
            new StairsBlock(FLESH_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(FLESH_BLOCK)));
    public static final Block FLESH_SLAB = registerBlock("flesh_slab",
            new SlabBlock(FabricBlockSettings.copyOf(FLESH_BLOCK)));
    public static final Block FLESH_WALL = registerBlock("flesh_wall",
            new WallBlock(FabricBlockSettings.copyOf(FLESH_BLOCK)));
    public static final Block BONED_FLESH_BLOCK = registerBlock("boned_flesh_block",
            new Block(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block BONED_FLESH_STAIRS = registerBlock("boned_flesh_stairs",
            new StairsBlock(BONED_FLESH_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(BONED_FLESH_BLOCK)));
    public static final Block BONED_FLESH_SLAB = registerBlock("boned_flesh_slab",
            new SlabBlock(FabricBlockSettings.copyOf(BONED_FLESH_BLOCK)));
    public static final Block BONED_FLESH_WALL = registerBlock("boned_flesh_wall",
            new WallBlock(FabricBlockSettings.copyOf(BONED_FLESH_BLOCK)));
    public static final Block BONED_LIVING_FLESH_BLOCK = registerBlock("boned_living_flesh_block",
            new Block(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block BONED_LIVING_FLESH_STAIRS = registerBlock("boned_living_flesh_stairs",
            new StairsBlock(BONED_LIVING_FLESH_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(BONED_LIVING_FLESH_BLOCK)));
    public static final Block BONED_LIVING_FLESH_SLAB = registerBlock("boned_living_flesh_slab",
            new SlabBlock(FabricBlockSettings.copyOf(BONED_LIVING_FLESH_BLOCK)));
    public static final Block BONED_LIVING_FLESH_WALL = registerBlock("boned_living_flesh_wall",
            new WallBlock(FabricBlockSettings.copyOf(BONED_LIVING_FLESH_BLOCK)));
    public static final Block CLEAR_GLASS = registerBlock("clear_glass",
            new GlassBlock(FabricBlockSettings.copyOf(GLASS).nonOpaque()));
    public static final Block AMERRACK = registerBlock("amerrack",
            new Block(FabricBlockSettings.copyOf(SOUL_SOIL)));
    public static final Block AMERRACK_BRICK = registerBlock("amerrack_brick",
            new Block(FabricBlockSettings.copyOf(AMERRACK)));
    public static final Block CHISELED_AMERRACK = registerBlock("chiseled_amerrack",
            new Block(FabricBlockSettings.copyOf(AMERRACK)));
    public static final Block FABRIC_BLOCK = registerBlock("fabric_block",
            new PillarBlock(FabricBlockSettings.copyOf(WHITE_WOOL)));
    public static final Block XAVELITE_BLOCK = registerBlock("xavelite_block",
            new PillarBlock(FabricBlockSettings.copyOf(IRON_BLOCK)));
    public static final Block XAVELITE_SLAB = registerBlock("xavelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(XAVELITE_BLOCK)));
    public static final Block XAVELITE_STAIRS = registerBlock("xavelite_stairs",
            new StairsBlock(XAVELITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.XAVELITE_BLOCK)));
    public static final Block RUSTY_METAL_BLOCK = registerBlock("rusty_metal_block",
            new Block(FabricBlockSettings.copyOf(IRON_BLOCK)));
    public static final Block RUSTY_METAL_SLAB = registerBlock("rusty_metal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(RUSTY_METAL_BLOCK)));
    public static final Block RUSTY_METAL_STAIRS = registerBlock("rusty_metal_stairs",
            new StairsBlock(RUSTY_METAL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(RUSTY_METAL_BLOCK)));
    public static final Block RUSTY_METAL_BARS = registerBlock("rusty_metal_bars",
            new PaneBlock((FabricBlockSettings.copyOf(IRON_BARS))));
    public static final Block SEELERIUM_BLOCK = registerBlock("seelerium_block",
            new Block(FabricBlockSettings.copyOf(IRON_BLOCK)));
    public static final Block SEELERIUM_SLAB = registerBlock("seelerium_slab",
            new SlabBlock(FabricBlockSettings.copyOf(SEELERIUM_BLOCK)));
    public static final Block SEELERIUM_STAIRS = registerBlock("seelerium_stairs",
            new StairsBlock(SEELERIUM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(SEELERIUM_BLOCK)));
    public static final Block DUSHARIN_BLOCK = registerBlock("dusharin_block",
            new Block(FabricBlockSettings.copyOf(IRON_BLOCK)));
    public static final Block DUSHARIN_SLAB = registerBlock("dusharin_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DUSHARIN_BLOCK)));
    public static final Block DUSHARIN_STAIRS = registerBlock("dusharin_stairs",
            new StairsBlock(DUSHARIN_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(DUSHARIN_BLOCK)));

    public static final Block AGONY_LOG = registerBlock("agony_log",
            new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG).strength(4f)));
    public static final Block AGONY_WOOD = registerBlock("agony_wood",
            new PillarBlock(FabricBlockSettings.copyOf(OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_AGONY_LOG = registerBlock("stripped_agony_log",
            new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_AGONY_WOOD = registerBlock("stripped_agony_wood",
            new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_WOOD).strength(4f)));


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
