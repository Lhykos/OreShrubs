/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [14.06.2017 - 21:57]
 */
package lhykos.oreshrubs.api;

import lhykos.oreshrubs.api.lootbag.LootBagVariant;
import net.minecraft.item.ItemStack;

public interface ILootBagHelper
{
	/**
	 * Initialize a ItemStack with the loot bag data.
	 * [Name]					-	LootBag registry name.
	 * [Advanced][TakenItems]	-	How many items a player has take from the advanced loot bag.
	 * [Advanced][Inventory]	-	The inventory with all the loot.
	 */
	void initializeLootBag(ItemStack lootBag, LootBagVariant bagType);

	/**
	 * If the loot bag has a initialized data tag.
	 */
	boolean hasLootBagTag(ItemStack lootBag);

	/**
	 * Is the loot bag is the advanced version.
	 */
	boolean isAdvanced(ItemStack lootBag);

	/**
	 * Make the loot bag advanced. This is so much better!
	 */
	void makeAdvanced(ItemStack lootBag);

	/**
	 * Return a suitable display name for the loot bag.
	 * If the bagType is not valid, a default value is returned.
	 */
	String getLootBagDisplayName(ItemStack lootBag);

	/**
	 * Get the ItemStack from the LootBagVariant.
	 */
	ItemStack getStackFromVariant(LootBagVariant lootBagVariant, boolean advanced);

	/**
	 * Get the LootBagVariant from the ItemStack.
	 * Return a EMPTY one on fail.
	 */
	LootBagVariant getVariantFromStack(ItemStack lootBag);

	/**
	 * How many items the player has already taken from the loot bag.
	 */
	int getTakenItems(ItemStack lootBag);

	/**
	 * Add a amount to taken items.
	 */
	void incrementTakenItems(ItemStack lootBag, int amount);
}
