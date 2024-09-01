package net.scarcekoi.technetium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.scarcekoi.technetium.block.ModBlocks;
import net.scarcekoi.technetium.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RAW_TECHNETIUM_BLOCK);
        addDrop(ModBlocks.TECHNETIUM_BLOCK);

        addDrop(ModBlocks.TECHNETIUM_ORE, technetiumOreDrops(ModBlocks.TECHNETIUM_ORE, ModItems.RAW_TECHNETIUM));
        addDrop(ModBlocks.DEEPSLATE_TECHNETIUM_ORE, technetiumOreDrops(ModBlocks.DEEPSLATE_TECHNETIUM_ORE, ModItems.RAW_TECHNETIUM));
    }

    public LootTable.Builder technetiumOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }
}
