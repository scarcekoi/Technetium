package net.scarcekoi.technetium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.scarcekoi.technetium.block.TechnetiumBlocks;
import net.scarcekoi.technetium.item.TechnetiumItems;

import java.util.List;
import java.util.function.Consumer;

public class TechnetiumRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> TECHNETIUM_SMELTABLES = List.of(TechnetiumItems.RAW_TECHNETIUM,
            TechnetiumBlocks.TECHNETIUM_ORE, TechnetiumBlocks.DEEPSLATE_TECHNETIUM_ORE);

    public TechnetiumRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter,
                TECHNETIUM_SMELTABLES,
                RecipeCategory.MISC,
                TechnetiumItems.TECHNETIUM_INGOT,
                0.7F,
                200,
                "technetium");
        offerBlasting(exporter, TECHNETIUM_SMELTABLES,
                RecipeCategory.MISC,
                TechnetiumItems.TECHNETIUM_INGOT,
                0.7F,
                100,
                "technetium");

        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                TechnetiumItems.TECHNETIUM_INGOT,
                RecipeCategory.MISC,
                TechnetiumBlocks.TECHNETIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                TechnetiumItems.RAW_TECHNETIUM,
                RecipeCategory.MISC,
                TechnetiumBlocks.RAW_TECHNETIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                TechnetiumItems.TECHNETIUM_POWDER,
                RecipeCategory.MISC,
                TechnetiumItems.TECHNETIUM_INGOT,
                convertBetween(TechnetiumItems.TECHNETIUM_INGOT, TechnetiumItems.TECHNETIUM_POWDER),
                null,
                convertBetween(TechnetiumItems.TECHNETIUM_POWDER, TechnetiumItems.TECHNETIUM_INGOT),
                null
        );
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                TechnetiumItems.TECHNETIUM_INGOT,
                RecipeCategory.MISC,
                TechnetiumBlocks.TECHNETIUM_BLOCK,
                convertBetween(TechnetiumBlocks.TECHNETIUM_BLOCK, TechnetiumItems.TECHNETIUM_INGOT),
                null,
                convertBetween(TechnetiumItems.TECHNETIUM_INGOT, TechnetiumBlocks.TECHNETIUM_BLOCK),
                null
        );
    }
}
