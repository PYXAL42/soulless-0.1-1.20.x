package net.pyxal42.cheesemod;

import net.fabricmc.api.ModInitializer;

import net.pyxal42.cheesemod.block.ModBlocks;
import net.pyxal42.cheesemod.item.ModItemGroups;
import net.pyxal42.cheesemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheeseMod implements ModInitializer {
	public static final String MOD_ID = "cheese-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("What's up? not my motivation");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}