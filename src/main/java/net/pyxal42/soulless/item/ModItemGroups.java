package net.pyxal42.soulless.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pyxal42.soulless.Soulless;
import net.pyxal42.soulless.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SOULLESSGROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Soulless.MOD_ID, "soulless"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.soulless"))
                    .icon(() -> new ItemStack(ModBlocks.DIMSTONE_PEDESTAL)).entries(( displayContext, entries) -> {
                        //---Vanilla tier blocks and items---
                        //Fabric and cosmetics
                        entries.add(ModBlocks.FABRIC_BLOCK);
                        entries.add(ModItems.FABRIC);
                        entries.add(ModItems.TOPHAT);
                        entries.add(ModItems.BLACK_JACKET);
                        entries.add(ModItems.GLASSES);
                        entries.add(ModItems.PROPELLER_HAT);
                        entries.add(ModItems.MAID_HEADBAND);
                        entries.add(ModItems.MAID_CORSET);
                        entries.add(ModItems.MAID_SKIRT);
                        entries.add(ModItems.MAID_SOCKS);
                        entries.add(ModItems.CLEAR_SHARD);
                        entries.add(ModBlocks.CLEAR_GLASS);
                        entries.add(ModItems.AGREEMENT);
                        entries.add(ModItems.RITUAL_DAGGER);
                        //all flesh blocks
                        entries.add(ModBlocks.BONED_FLESH_BLOCK);
                        entries.add(ModBlocks.BONED_FLESH_STAIRS);
                        entries.add(ModBlocks.BONED_FLESH_SLAB);
                        entries.add(ModBlocks.BONED_FLESH_WALL);
                        //all rotten flesh blocks
                        entries.add(ModBlocks.BONED_ROTTEN_FLESH_BLOCK);
                        entries.add(ModBlocks.BONED_ROTTEN_FLESH_STAIRS);
                        entries.add(ModBlocks.BONED_ROTTEN_FLESH_SLAB);
                        entries.add(ModBlocks.BONED_ROTTEN_FLESH_WALL);
                        //---Blood tier blocks and items---
                        //all dimstone blocks
                        entries.add(ModBlocks.DIMSTONE);
                        entries.add(ModBlocks.DIMSTONE_STAIRS);
                        entries.add(ModBlocks.DIMSTONE_SLAB);
                        entries.add(ModBlocks.DIMSTONE_WALL);
                        entries.add(ModBlocks.DIMSTONE_BRICK);
                        entries.add(ModBlocks.DIMSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.DIMSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.DIMSTONE_BRICK_WALL);
                        entries.add(ModBlocks.DIMSTONE_PILLAR);
                        entries.add(ModBlocks.DIMSTONE_CORE);
                        entries.add(ModBlocks.INKEEPING_CORE);
                        entries.add(ModBlocks.BLOOMING_CORE);
                        entries.add(ModBlocks.RADIANCE_CORE);
                        entries.add(ModBlocks.DIMSTONE_PEDESTAL);
                        //all other dimstone-like items
                        entries.add(ModItems.EMPTY_MOULD);
                        entries.add(ModItems.HOT_MOULD);
                        entries.add(ModItems.MILKY_MOULD);
                        entries.add(ModItems.CHEESY_MOULD);
                        entries.add(ModItems.SLICE_OF_CHEESE);
                        entries.add(ModItems.CONTRACT);
                        //all blood-like items and blocks
                        entries.add(ModItems.BLOOD_BOTTLE);
                        //all liv items
                        entries.add(ModItems.LIV_INGOT);
                        entries.add(ModItems.LIV_BLADE);
                        entries.add(ModItems.CHARRED_INGOT);
                        //all living flesh blocks
                        entries.add(ModBlocks.BONED_LIVING_FLESH_BLOCK);
                        entries.add(ModBlocks.BONED_LIVING_FLESH_STAIRS);
                        entries.add(ModBlocks.BONED_LIVING_FLESH_SLAB);
                        entries.add(ModBlocks.BONED_LIVING_FLESH_WALL);
                        //all agony wood blocks
                        entries.add(ModBlocks.AGONY_LOG);
                        entries.add(ModBlocks.AGONY_WOOD);
                        entries.add(ModBlocks.STRIPPED_AGONY_LOG);
                        entries.add(ModBlocks.STRIPPED_AGONY_WOOD);
                        entries.add(ModBlocks.AGONY_PLANKS);
                        entries.add(ModBlocks.AGONY_LEAVES);
                        //---Soul tier blocks and items---
                        entries.add(ModBlocks.AMERRACK);
                        //---Essence tier blocks and items---
                        //all essence items
                        entries.add(ModItems.ESSENCE_SHARD);
                        entries.add(ModItems.ESSENSTEEL_INGOT);
                        entries.add(ModItems.ESSENSTEEL_PLATE);
                        entries.add(ModItems.ESSENCE);
                        //all infused blocks
                        entries.add(ModBlocks.INFUSED_DIMSTONE_PILLAR);
                        entries.add(ModBlocks.INFUSED_DIMSTONE_CORE);
                        entries.add(ModBlocks.INFUSED_INKEEPING_CORE);
                        entries.add(ModBlocks.INFUSED_BLOOMING_CORE);
                        entries.add(ModBlocks.INFUSED_RADIANCE_CORE);



                        //---Life tier blocks and items---
                    }).build());

    public static void registerItemGroups() {
        Soulless.LOGGER.info("Registering Item Groups for " + Soulless.MOD_ID);
    }

}
