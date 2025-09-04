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
                    .icon(() -> new ItemStack(ModBlocks.INFUSED_DIMSTONE_PILLAR)).entries(( displayContext, entries) -> {
                        entries.add(ModBlocks.DIMSTONE);
                        entries.add(ModBlocks.DIMSTONE_STAIRS);
                        entries.add(ModBlocks.DIMSTONE_SLAB);
                        entries.add(ModBlocks.DIMSTONE_WALL);
                        entries.add(ModBlocks.DIMSTONE_BRICK);
                        entries.add(ModBlocks.DIMSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.DIMSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.DIMSTONE_BRICK_WALL);
                        entries.add(ModBlocks.DIMSTONE_PILLAR);
                        entries.add(ModBlocks.INFUSED_INKEEPING_CORE);
                        entries.add(ModBlocks.INKEEPING_CORE);
                        entries.add(ModBlocks.INFUSED_BLOOMING_CORE);
                        entries.add(ModBlocks.BLOOMING_CORE);
                        entries.add(ModBlocks.INFUSED_RADIANCE_CORE);
                        entries.add(ModBlocks.RADIANCE_CORE);
                        entries.add(ModBlocks.INFUSED_DIMSTONE_CORE);
                        entries.add(ModBlocks.DIMSTONE_CORE);
                        entries.add(ModBlocks.INFUSED_DIMSTONE_PILLAR);
                        entries.add(ModBlocks.DIMSTONE_PEDESTAL);
                        entries.add(ModItems.EMPTY_MOULD);
                        entries.add(ModItems.HOT_MOULD);
                        entries.add(ModItems.MILKY_MOULD);
                        entries.add(ModItems.CHEESY_MOULD);
                        entries.add(ModItems.SLICE_OF_CHEESE);
                        entries.add(ModBlocks.AGONY_LOG);
                        entries.add(ModBlocks.AGONY_WOOD);
                        entries.add(ModBlocks.STRIPPED_AGONY_LOG);
                        entries.add(ModBlocks.STRIPPED_AGONY_WOOD);
                        entries.add(ModBlocks.AGONY_PLANKS);
                        entries.add(ModBlocks.AGONY_LEAVES);
                        entries.add(ModItems.RITUAL_DAGGER);
                        entries.add(ModItems.BLOOD_BOTTLE);
                        entries.add(ModItems.CLEAR_SHARD);
                        entries.add(ModItems.ESSENCE_SHARD);
                        entries.add(ModItems.ESSENCE_INGOT);
                        entries.add(ModItems.ESSENCE);
                        entries.add(ModItems.LIV_INGOT);
                        entries.add(ModItems.LIV_BLADE);
                        entries.add(ModItems.CHARRED_INGOT);
                        entries.add(ModItems.CONTRACT);
                    }).build());

    public static void registerItemGroups() {
        Soulless.LOGGER.info("Registering Item Groups for " + Soulless.MOD_ID);
    }

}
