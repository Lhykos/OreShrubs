/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [13.06.2017 - 11:50]
 */
package lhykos.oreshrubs.api.oreshrub;

public enum OreDictPrefix
{
	UNDEFINED("undefined"),
	DUST("dust", "**"),
	NUGGET("nugget", "*"),
	INGOT("ingot", "***", "***", "***"),
	ORE("ore", "#S#", "S#S", "#S#"),
	GEM("gem", "*", "*");

	private String name;
	private String[] recipePattern;

	private OreDictPrefix(String name, String... recipePattern)
	{
		this.name = name;
		this.recipePattern = recipePattern;
	}

	public String getName()
	{
		return this.name;
	}

	public String[] getRecipePattern()
	{
		return this.recipePattern;
	}

	@Override
	public String toString()
	{
		return getName();
	}

	public static OreDictPrefix getFromOreDictName(String oreDictName)
	{
		for(OreDictPrefix prefix : OreDictPrefix.values())
		{
			if(oreDictName.toLowerCase().startsWith(prefix.getName()))
			{
				return prefix;
			}
		}

		return OreDictPrefix.UNDEFINED;
	}
}
