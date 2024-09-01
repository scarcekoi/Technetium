package net.scarcekoi.technetium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.scarcekoi.technetium.block.ModBlocks;
import net.scarcekoi.technetium.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TECHNETIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TECHNETIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TECHNETIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TECHNETIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_TECHNETIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TECHNETIUM_INGOT, Models.GENERATED);
    }
}
