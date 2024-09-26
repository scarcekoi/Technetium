package net.scarcekoi.technetium.compat;

import com.simibubi.create.foundation.data.recipe.PressingRecipeGen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.scarcekoi.technetium.Technetium;
import net.scarcekoi.technetium.item.TechnetiumItems;

public class TechnetiumCreatePressingRecipeGen extends PressingRecipeGen {
    public TechnetiumCreatePressingRecipeGen(FabricDataOutput output) {
        super(output);
    }

    GeneratedRecipe

            TECHNETIUM_SHEET = create(Technetium.MOD_ID,() -> TechnetiumItems.TECHNETIUM_INGOT, b -> b
            .output(TechnetiumItems.TECHNETIUM_SHEET));
}
