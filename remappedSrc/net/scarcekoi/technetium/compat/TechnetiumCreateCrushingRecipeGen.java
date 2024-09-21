package net.scarcekoi.technetium.compat;

import com.simibubi.create.foundation.data.recipe.CrushingRecipeGen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.scarcekoi.technetium.Technetium;
import net.scarcekoi.technetium.block.TechnetiumBlocks;
import net.scarcekoi.technetium.item.TechnetiumItems;

public class TechnetiumCreateCrushingRecipeGen extends CrushingRecipeGen {
    public TechnetiumCreateCrushingRecipeGen(FabricDataOutput output) {
        super(output);
    }

    GeneratedRecipe

            TECHNETIUM_INGOT = create(Technetium.MOD_ID,() -> TechnetiumItems.TECHNETIUM_INGOT, b -> b.duration(80)
            .output(TechnetiumItems.TECHNETIUM_POWDER, 6)
            .output(.25f, TechnetiumItems.TECHNETIUM_POWDER, 3)),
            RAW_TECHNETIUM_BLOCK = create(Technetium.MOD_ID,() -> TechnetiumBlocks.RAW_TECHNETIUM_BLOCK, b -> b.duration(80)
            .output(TechnetiumItems.RAW_TECHNETIUM, 6)
            .output(.25f, TechnetiumItems.RAW_TECHNETIUM, 3)),
            TECHNETIUM_BLOCK = create(Technetium.MOD_ID,() -> TechnetiumBlocks.TECHNETIUM_BLOCK, b -> b.duration(80)
            .output(TechnetiumItems.TECHNETIUM_INGOT, 6)
            .output(.25f, TechnetiumItems.TECHNETIUM_INGOT, 3));
}
