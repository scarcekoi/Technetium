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
import net.scarcekoi.technetium.block.TechnetiumBlocks;
import net.scarcekoi.technetium.item.TechnetiumItems;

public class TechnetiumLootTableProvider extends FabricBlockLootTableProvider {
    public TechnetiumLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(TechnetiumBlocks.RAW_TECHNETIUM_BLOCK);
        addDrop(TechnetiumBlocks.TECHNETIUM_BLOCK);

        addDrop(TechnetiumBlocks.TECHNETIUM_ORE, technetiumOreDrops(TechnetiumBlocks.TECHNETIUM_ORE, TechnetiumItems.RAW_TECHNETIUM));
        addDrop(TechnetiumBlocks.DEEPSLATE_TECHNETIUM_ORE, technetiumOreDrops(TechnetiumBlocks.DEEPSLATE_TECHNETIUM_ORE, TechnetiumItems.RAW_TECHNETIUM));
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
