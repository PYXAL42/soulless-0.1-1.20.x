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
                    .icon(() -> new ItemStack(ModBlocks.INFUSEDDIMSTONEPILLAR)).entries(( displayContext, entries) -> {
                        entries.add(ModBlocks.DIMSTONE);
                        entries.add(ModBlocks.DIMSTONESTAIRS);
                        entries.add(ModBlocks.DIMSTONESLAB);
                        entries.add(ModBlocks.DIMSTONEBRICK);
                        entries.add(ModBlocks.DIMSTONEBRICKSTAIRS);
                        entries.add(ModBlocks.DIMSTONEBRICKSLAB);
                        entries.add(ModBlocks.DIMSTONEPILLAR);
                        entries.add(ModBlocks.INFUSEDDIMSTONEPILLAR);
                        entries.add(ModItems.EMPTYMOULD);
                        entries.add(ModItems.HOTMOULD);
                        entries.add(ModItems.MILKYMOULD);
                        entries.add(ModItems.CHEESYMOULD);
                        entries.add(ModItems.SLICEOFCHEESE);
                        entries.add(ModItems.BLOODBOTTLE);
                    }).build());

    public static void registerItemGroups() {
        Soulless.LOGGER.info("Registering Item Groups for " + Soulless.MOD_ID);
    }

}
