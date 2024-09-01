package net.scarcekoi.technetium.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.scarcekoi.technetium.Technetium;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> TECHNETIUM_ORES =
                createTag("technetium_ores");
        public static final TagKey<Block> TECHNETIUM_BLOCKS =
                createTag("technetium_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Technetium.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TECHNETIUM_ITEMS =
                createTag("technetium_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Technetium.MOD_ID, name));
        }
    }
}
