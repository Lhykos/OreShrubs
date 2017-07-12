/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [14.06.2017 - 21:53]
 */
package lhykos.oreshrubs.api;

/**
 * Provides some helper methods and tools for OreShrubs.
 * Get the instance from {@link IOreShrubsPlugin}
 */
public interface IOreShrubsHelper
{
	/**
	 * Get the helper for Shrubs.
	 */
	IShrubHelper getShrubHelper();

	/**
	 * Get the helper for LootBags.
	 */
	ILootBagHelper getLootBagHelper();
}
