package net.scarcekoi.technetium.compat;

import com.simibubi.create.AllItems;
import com.simibubi.create.foundation.data.recipe.CrushingRecipeGen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
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
            .output(.25f, TechnetiumItems.TECHNETIUM_POWDER, 3)
            .output(.75f, AllItems.EXP_NUGGET.get())),
            RAW_TECHNETIUM_BLOCK = create(Technetium.MOD_ID,() -> TechnetiumBlocks.RAW_TECHNETIUM_BLOCK, b -> b.duration(400)
            .output(TechnetiumItems.RAW_TECHNETIUM, 9)
            .output(.75f, AllItems.EXP_NUGGET.get(), 9)),
            TECHNETIUM_ORE = create(Technetium.MOD_ID,() -> TechnetiumBlocks.TECHNETIUM_ORE, b -> b.duration(250)
            .output(TechnetiumItems.RAW_TECHNETIUM, 5)
            .output(.25f, TechnetiumItems.RAW_TECHNETIUM)
            .output(.75f, AllItems.EXP_NUGGET.get())
            .output(.125f, Blocks.COBBLESTONE)),
            DEEPSLATE_TECHNETIUM_ORE = create(Technetium.MOD_ID,() -> TechnetiumBlocks.DEEPSLATE_TECHNETIUM_ORE, b -> b.duration(250)
            .output(TechnetiumItems.RAW_TECHNETIUM, 7)
            .output(.25f, TechnetiumItems.RAW_TECHNETIUM)
            .output(.75f, AllItems.EXP_NUGGET.get())
            .output(.125f, Blocks.COBBLED_DEEPSLATE));
}
