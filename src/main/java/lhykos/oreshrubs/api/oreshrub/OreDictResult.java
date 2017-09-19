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

import java.util.List;

public class OreDictResult implements IOreBerryCrafting
{
	private String oreDictName = "";
	private int count = 0;
	private List<ItemStack> ores;
	private boolean registerOreRecipe = true;
	String[] recipePattern;

	public OreDictResult(String oreDictName, String... recipePattern)
	{
		this(oreDictName, 1, recipePattern);
	}

	public OreDictResult(String oreDictName, int count, String... recipePattern)
	{
		this.oreDictName = oreDictName;
		this.count = count;
		this.recipePattern = recipePattern;
	}

	@Override
	public ItemStack getCraftingOutput()
	{
		ItemStack stack = ores == null || ores.isEmpty() ? ItemStack.EMPTY : ores.get(0);
		if(!stack.isEmpty())
		{
			stack.setCount(count);
		}

		return stack;
	}

	@Override
	public String[] getRecipePattern()
	{
		if(recipePattern == null || recipePattern.length == 0)
		{
			OreDictPrefix prefix = OreDictPrefix.getFromOreDictName(oreDictName);
			if (prefix != OreDictPrefix.UNDEFINED)
			{
				return prefix.getRecipePattern();
			}
		}

		return recipePattern;
	}

	public void setOutputStacks(List<ItemStack> ores)
	{
		this.ores = ores;
	}

	public String getOreDictName()
	{
		return this.oreDictName;
	}

	public int getCraftingAmount()
	{
		return this.count;
	}

	public boolean isRegisterOreRecipe()
	{
		return registerOreRecipe;
	}

	public OreDictResult setRegisterOreRecipe(boolean shouldRegister)
	{
		this.registerOreRecipe = shouldRegister;
		return this;
	}
}
