package net.scarcekoi.technetium;

import net.fabricmc.api.ModInitializer;

import net.scarcekoi.technetium.block.ModBlocks;
import net.scarcekoi.technetium.item.ModItemGroups;
import net.scarcekoi.technetium.item.ModItems;
import net.scarcekoi.technetium.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Technetium implements ModInitializer {
		public static final String MOD_ID = "technetium";
		public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
	}
}