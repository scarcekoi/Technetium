package net.scarcekoi.technetium;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.scarcekoi.technetium.compat.TechnetiumCreateCrushingRecipeGen;
import net.scarcekoi.technetium.datagen.*;
import net.scarcekoi.technetium.world.TechnetiumConfiguredFeatures;
import net.scarcekoi.technetium.world.TechnetiumPlacedFeatures;

public class TechnetiumDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(TechnetiumBlockTagProvider::new);
		pack.addProvider(TechnetiumItemTagProvider::new);
		pack.addProvider(TechnetiumLootTableProvider::new);
		pack.addProvider(TechnetiumModelProvider::new);
		pack.addProvider(TechnetiumRecipeProvider::new);
		pack.addProvider(TechnetiumWorldGenerator::new);

		pack.addProvider(TechnetiumCreateCrushingRecipeGen::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, TechnetiumConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, TechnetiumPlacedFeatures::bootstrap);
	}
}
