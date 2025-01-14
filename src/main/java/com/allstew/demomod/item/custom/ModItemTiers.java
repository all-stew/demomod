package com.allstew.demomod.item.custom;

import com.allstew.demomod.item.ModItems;
import java.util.function.Supplier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public enum ModItemTiers implements Tier {
    RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2000, 10F, 4F, 30, () -> Ingredient.of(ModItems.RUBY_ITEM.get()));

    private final TagKey<Block> incorrectBlockForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModItemTiers(TagKey<Block> incorrectBlockForDrops, int uses, float speed, float damage,
        int enchantmentValue,
        Supplier<Ingredient> repairIngredient) {
        this.incorrectBlockForDrops = incorrectBlockForDrops;
        this.uses                   = uses;
        this.speed                  = speed;
        this.damage                 = damage;
        this.enchantmentValue       = enchantmentValue;
        this.repairIngredient       = new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlockForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
