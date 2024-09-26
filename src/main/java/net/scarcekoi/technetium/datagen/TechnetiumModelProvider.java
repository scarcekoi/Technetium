package net.scarcekoi.technetium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.scarcekoi.technetium.block.TechnetiumBlocks;
import net.scarcekoi.technetium.item.TechnetiumItems;

public class TechnetiumModelProvider extends FabricModelProvider {
    public TechnetiumModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(TechnetiumBlocks.RAW_TECHNETIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(TechnetiumBlocks.TECHNETIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(TechnetiumBlocks.TECHNETIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(TechnetiumBlocks.DEEPSLATE_TECHNETIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(TechnetiumItems.RAW_TECHNETIUM, Models.GENERATED);
        itemModelGenerator.register(TechnetiumItems.TECHNETIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(TechnetiumItems.TECHNETIUM_POWDER, Models.GENERATED);
        itemModelGenerator.register(TechnetiumItems.CRUSHED_RAW_TECHNETIUM, Models.GENERATED);
        itemModelGenerator.register(TechnetiumItems.TECHNETIUM_SHEET, Models.GENERATED);
    }
}
