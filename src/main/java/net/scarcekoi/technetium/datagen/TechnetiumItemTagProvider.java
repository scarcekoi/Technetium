package net.scarcekoi.technetium.datagen;

import com.simibubi.create.AllTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.scarcekoi.technetium.item.TechnetiumItems;
import net.scarcekoi.technetium.util.TechnetiumTags;

import java.util.concurrent.CompletableFuture;

public class TechnetiumItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public TechnetiumItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(TechnetiumTags.Items.TECHNETIUM_ITEMS)
                .add(TechnetiumItems.RAW_TECHNETIUM)
                .add(TechnetiumItems.TECHNETIUM_INGOT)
                .add(TechnetiumItems.TECHNETIUM_POWDER);
        getOrCreateTagBuilder(AllTags.AllItemTags.CRUSHED_RAW_MATERIALS.tag)
                .add(TechnetiumItems.CRUSHED_RAW_TECHNETIUM);
    }
}
