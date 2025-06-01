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
    public static final ItemGroup CHEESE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Soulless.MOD_ID, "cheese"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.soulless"))
                    .icon(() -> new ItemStack(ModItems.SLICEOFCHEESE)).entries(( displayContext, entries) -> {
                        entries.add(ModItems.EMPTYMOULD);
                        entries.add(ModItems.MILKYMOULD);
                        entries.add(ModItems.CHEESYMOULD);
                        entries.add(ModItems.SLICEOFCHEESE);
                        entries.add(ModBlocks.DIMSTONE);
                    }).build());

    public static void registerItemGroups() {
        Soulless.LOGGER.info("Registering Item Groups for " + Soulless.MOD_ID);
    }

}
