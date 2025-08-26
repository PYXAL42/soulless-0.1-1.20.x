package net.pyxal42.soulless;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.pyxal42.soulless.block.ModBlocks;
import net.pyxal42.soulless.item.ModItemGroups;
import net.pyxal42.soulless.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Soulless implements ModInitializer {
	public static final String MOD_ID = "soulless";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("What's up? not my motivation");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		StrippableBlockRegistry.register(ModBlocks.AGONY_LOG, ModBlocks.STRIPPED_AGONY_LOG);
		StrippableBlockRegistry.register(ModBlocks.AGONY_WOOD, ModBlocks.STRIPPED_AGONY_WOOD);
	}
}