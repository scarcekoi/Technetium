package net.scarcekoi.technetium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.scarcekoi.technetium.block.TechnetiumBlocks;
import net.scarcekoi.technetium.util.TechnetiumTags;

import java.util.concurrent.CompletableFuture;

public class TechnetiumBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TechnetiumBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(TechnetiumTags.Blocks.TECHNETIUM_ORES)
                .add(TechnetiumBlocks.TECHNETIUM_ORE)
                .add(TechnetiumBlocks.DEEPSLATE_TECHNETIUM_ORE);

        getOrCreateTagBuilder(TechnetiumTags.Blocks.TECHNETIUM_BLOCKS)
                .addTag(TechnetiumTags.Blocks.TECHNETIUM_ORES)
                .add(TechnetiumBlocks.RAW_TECHNETIUM_BLOCK)
                .add(TechnetiumBlocks.TECHNETIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(TechnetiumTags.Blocks.TECHNETIUM_BLOCKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .addTag(TechnetiumTags.Blocks.TECHNETIUM_BLOCKS);
    }
}
