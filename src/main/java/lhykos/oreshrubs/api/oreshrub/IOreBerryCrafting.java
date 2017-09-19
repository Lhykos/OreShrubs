/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-License
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [10.09.2017 - 16:34]
 */
package lhykos.oreshrubs.api.oreshrub;

import net.minecraft.item.ItemStack;


public interface IOreBerryCrafting
{
	ItemStack getCraftingOutput();

	String[] getRecipePattern();
}
