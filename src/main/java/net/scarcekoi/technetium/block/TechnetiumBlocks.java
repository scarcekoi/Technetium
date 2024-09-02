package net.scarcekoi.technetium.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.scarcekoi.technetium.Technetium;

public class TechnetiumBlocks {
    public static final Block RAW_TECHNETIUM_BLOCK = registerBlock("raw_technetium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK)));
    public static final Block TECHNETIUM_BLOCK = registerBlock("technetium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));

    public static final Block TECHNETIUM_ORE = registerBlock("technetium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)
                    .strength(3.0F, 3.0F),
                    UniformIntProvider.create(0, 5)));
    public static final Block DEEPSLATE_TECHNETIUM_ORE = registerBlock("deepslate_technetium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE)
                    .strength(4.5F, 3.0F),
                    UniformIntProvider.create(0, 5)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Technetium.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(Technetium.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Technetium.LOGGER.info("Registering mod blocks for " + Technetium.MOD_ID);
    }
}
