package net.scarcekoi.technetium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scarcekoi.technetium.item.TechnetiumItems;

import java.util.function.Consumer;

public class TechnetiumAdvancementProvider extends FabricAdvancementProvider {
    public TechnetiumAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(
                        TechnetiumItems.RAW_TECHNETIUM, // The display icon
                        Text.literal("A Radioactive Way"), // The title
                        Text.literal("That's one way to get cancer."), // The description
                        new Identifier("technetium:textures/gui/advancements/backgrounds/technetium.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_raw_technetium", InventoryChangedCriterion.Conditions.items(TechnetiumItems.RAW_TECHNETIUM))
                .build(consumer, "technetium" + "/root");
        Advancement getTechnetiumPowderAdvancement = Advancement.Builder.create().parent(rootAdvancement)
                .display(
                        TechnetiumItems.TECHNETIUM_POWDER,
                        Text.literal("Now It's a Powder"),
                        Text.literal("So you can inhale it."),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("got_technetium_powder", InventoryChangedCriterion.Conditions.items(TechnetiumItems.TECHNETIUM_POWDER))
                .build(consumer, "technetium" + "/got_technetium_powder");
    }
}