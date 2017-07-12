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

import lhykos.oreshrubs.api.oreshrub.OreShrubVariant;
import net.minecraft.item.ItemStack;

public interface IShrubHelper
{
	/**
	 * Get the shrub block as ItemStack from a OreShrubVariant.
	 */
	ItemStack getShrub(OreShrubVariant variant);

	/**
	 * Get the shrub block as ItemStack from a OreShrubVariant with a specific size.
	 */
	ItemStack getShrub(OreShrubVariant variant, int size);

	/**
	 * Get the OreBerries as ItemStack from a OreShrubVariant.
	 */
	ItemStack getBerries(OreShrubVariant variant);

	/**
	 * Get the Compressed -reBerries as ItemStack from a OreShrubVariant.
	 */
	ItemStack getCompressedBerries(OreShrubVariant variant);

	/**
	 * Get the OreBerries as ItemStack from a OreShrubVariant with a size.
	 */
	ItemStack getBerries(OreShrubVariant variant, int size);

	/**
	 * Get the Compressed-OreBerries as ItemStack from a OreShrubVariant with a size.
	 */
	ItemStack getCompressedBerries(OreShrubVariant variant, int size);

	/**
	 * Read the OreShrubVariant from a OreBerry ItemStack.
	 */
	OreShrubVariant getVariantFromBerries(ItemStack berries);

	/**
	 * Set a OreShrubVariant to a OreBerry ItemStack.
	 */
	void setVariantToBerries(ItemStack berries, OreShrubVariant variant);

	/**
	 * Get the translated display name for a OreShrub-Block or OreBerries.
	 */
	String getDisplayName(OreShrubVariant variant, boolean forBlock);
}
