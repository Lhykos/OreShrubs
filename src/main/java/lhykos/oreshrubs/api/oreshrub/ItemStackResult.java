/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-License
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [10.09.2017 - 16:33]
 */
package lhykos.oreshrubs.api.oreshrub;

import net.minecraft.item.ItemStack;


public class ItemStackResult implements IOreBerryCrafting
{
	private ItemStack stack = ItemStack.EMPTY;

	private String itemName = "";
	private int count = 0;
	private int meta = 0;
	private String[] recipePattern;

	public ItemStackResult(ItemStack stack, String... recipePattern)
	{
		this.stack = stack;
		this.recipePattern = recipePattern;
	}

	public ItemStackResult(String itemName, int count, int meta, String... recipePattern)
	{
		this.itemName = itemName;
		this.count = count;
		this.meta = meta;
		this.recipePattern = recipePattern;
	}

	@Override
	public ItemStack getCraftingOutput()
	{
		return stack;
	}

	@Override
	public String[] getRecipePattern()
	{
		return recipePattern;
	}

	public String getItemName()
	{
		return this.itemName;
	}

	public int getCraftingAmount()
	{
		return this.count;
	}

	public int getMeta()
	{
		return this.meta;
	}
}
