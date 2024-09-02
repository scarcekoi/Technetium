package net.scarcekoi.technetium.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.scarcekoi.technetium.world.TechnetiumPlacedFeatures;

public class TechnetiumOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TechnetiumPlacedFeatures.TECHNETIUM_ORE_PLACED_KEY);
    }
}
