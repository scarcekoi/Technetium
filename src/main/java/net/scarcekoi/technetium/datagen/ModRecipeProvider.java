package net.scarcekoi.technetium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.scarcekoi.technetium.block.ModBlocks;
import net.scarcekoi.technetium.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> TECHNETIUM_SMELTABLES = List.of(ModItems.RAW_TECHNETIUM,
            ModBlocks.TECHNETIUM_ORE, ModBlocks.DEEPSLATE_TECHNETIUM_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter,
                TECHNETIUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.TECHNETIUM_INGOT,
                0.7F,
                200,
                "technetium");
        offerBlasting(exporter, TECHNETIUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.TECHNETIUM_INGOT,
                0.7F,
                100,
                "technetium");

        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                ModItems.TECHNETIUM_INGOT,
                RecipeCategory.MISC,
                ModBlocks.TECHNETIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                ModItems.RAW_TECHNETIUM,
                RecipeCategory.MISC,
                ModBlocks.RAW_TECHNETIUM_BLOCK);
    }
}
