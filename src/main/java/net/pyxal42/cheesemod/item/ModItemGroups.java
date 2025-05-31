package net.pyxal42.cheesemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pyxal42.cheesemod.CheeseMod;
import net.pyxal42.cheesemod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CHEESE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CheeseMod.MOD_ID, "cheese"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cheese"))
                    .icon(() -> new ItemStack(ModItems.SLICEOFCHEESE)).entries(( displayContext, entries) -> {
                        entries.add(ModItems.EMPTYMOULD);
                        entries.add(ModItems.MILKYMOULD);
                        entries.add(ModItems.CHEESYMOULD);
                        entries.add(ModItems.SLICEOFCHEESE);
                        entries.add(ModBlocks.DIMSTONE);
                    }).build());

    public static void registerItemGroups() {
        CheeseMod.LOGGER.info("Registering Item Groups for " + CheeseMod.MOD_ID);
    }

}
