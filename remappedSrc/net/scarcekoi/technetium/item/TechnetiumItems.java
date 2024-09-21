package net.scarcekoi.technetium.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scarcekoi.technetium.Technetium;

public class TechnetiumItems {
    public static final Item RAW_TECHNETIUM = registerItem("raw_technetium", new Item(new FabricItemSettings()));
    public static final Item TECHNETIUM_INGOT = registerItem("technetium_ingot", new Item(new FabricItemSettings()));
    public static final Item TECHNETIUM_POWDER = registerItem("technetium_powder", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_TECHNETIUM);
        entries.add(TECHNETIUM_INGOT);
        entries.add(TECHNETIUM_POWDER);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Technetium.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Technetium.LOGGER.info("Regeristing mod items for " + Technetium.MOD_ID);
    }
}
