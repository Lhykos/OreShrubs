/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [22.06.2017 - 12:19]
 */
package lhykos.oreshrubs.api.enchanting;

import net.minecraft.enchantment.Enchantment;

import java.util.Map;

/**
 * Implement this on a item or block so that you can enchant them in the anvil.
 * It controls which enchantments can be applied to the item or block.
 */
public interface IEnchantable
{
	/**
	 * Get a map of all enchantments with the maximum level that can be applied on this.
	 */
	Map<Enchantment, Integer> getAllowedEnchantments();

	int getEnchantability();
}
