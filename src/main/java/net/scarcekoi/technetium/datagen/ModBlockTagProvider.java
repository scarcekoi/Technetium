package net.scarcekoi.technetium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.scarcekoi.technetium.block.ModBlocks;
import net.scarcekoi.technetium.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.TECHNETIUM_ORES)
                .add(ModBlocks.TECHNETIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TECHNETIUM_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.TECHNETIUM_BLOCKS)
                .addTag(ModTags.Blocks.TECHNETIUM_ORES)
                .add(ModBlocks.RAW_TECHNETIUM_BLOCK)
                .add(ModBlocks.TECHNETIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(ModTags.Blocks.TECHNETIUM_BLOCKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .addTag(ModTags.Blocks.TECHNETIUM_BLOCKS);
    }
}
