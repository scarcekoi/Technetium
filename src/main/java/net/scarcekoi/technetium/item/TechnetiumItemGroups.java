package net.scarcekoi.technetium.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scarcekoi.technetium.Technetium;
import net.scarcekoi.technetium.block.TechnetiumBlocks;

public class TechnetiumItemGroups {
    public static final ItemGroup TECHNETIUM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Technetium.MOD_ID, "technetium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.technetium"))
                    .icon(() -> new ItemStack(TechnetiumItems.TECHNETIUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(TechnetiumItems.RAW_TECHNETIUM);
                        entries.add(TechnetiumItems.TECHNETIUM_INGOT);
                        entries.add(TechnetiumItems.TECHNETIUM_POWDER);
                        entries.add(TechnetiumItems.CRUSHED_RAW_TECHNETIUM);

                        entries.add(TechnetiumBlocks.RAW_TECHNETIUM_BLOCK);
                        entries.add(TechnetiumBlocks.TECHNETIUM_BLOCK);

                        entries.add(TechnetiumBlocks.TECHNETIUM_ORE);
                        entries.add(TechnetiumBlocks.DEEPSLATE_TECHNETIUM_ORE);
                    }).build());

    public static void registerItemGroups() {
        Technetium.LOGGER.info("Registering item groups for " + Technetium.MOD_ID);
    }
}