package net.scarcekoi.technetium;

import net.fabricmc.api.ModInitializer;

import net.scarcekoi.technetium.block.TechnetiumBlocks;
import net.scarcekoi.technetium.item.TechnetiumItemGroups;
import net.scarcekoi.technetium.item.TechnetiumItems;
import net.scarcekoi.technetium.world.gen.TechnetiumWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Technetium implements ModInitializer {
		public static final String MOD_ID = "technetium";
		public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TechnetiumItemGroups.registerItemGroups();

		TechnetiumItems.registerModItems();
		TechnetiumBlocks.registerModBlocks();

		TechnetiumWorldGeneration.generateModWorldGen();
	}
}