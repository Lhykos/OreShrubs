/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [05.06.2017 - 10:32]
 */
package lhykos.oreshrubs.api.oreshrub;

import net.minecraft.item.ItemStack;

public class CraftingResult
{
	/**
	 * A empty version for ore shrubs which has berries, but out that you can't craft anything.
	 * Use this if you don't want that your berries can be crafted into something.
	 * Is used in the Experience Berries, for example.
	 */
	public static final CraftingResult EMPTY = new CraftingResult(ItemStack.EMPTY, OreDictPrefix.UNDEFINED);

	private String itemName = "";
	private int itemMeta = 0;
	private int craftingAmount = 1;
	private OreDictPrefix oreDictPrefix = OreDictPrefix.UNDEFINED;
	private String[] customRecipePattern = null;
	private ItemStack resultStack = ItemStack.EMPTY;
	private boolean registerOreRecipe = true;

	public CraftingResult(String itemName)
	{
		this(itemName, 0, 1, OreDictPrefix.UNDEFINED);
	}

	public CraftingResult(String itemName, String... customRecipePattern)
	{
		this(itemName, 0, 1, OreDictPrefix.UNDEFINED, customRecipePattern);
	}

	public CraftingResult(ItemStack resultStack, OreDictPrefix oreDictPrefix, String... customRecipePattern)
	{
		this.resultStack = resultStack;
		this.oreDictPrefix = oreDictPrefix;
		this.customRecipePattern = customRecipePattern;
	}

	/**
	 * @param itemName				Can be a {@link net.minecraft.util.ResourceLocation} or a OreDictionary-Name.
	 * @param itemMeta				The metadata of the crafting result.
	 * @param craftingAmount		The stack size if the crafting result.
	 * @param oreDictPrefix			A {@link OreDictPrefix}. If you set this, the containing recipe pattern will take to define the recipe.
	 *                              If you set a ore dictionary name as the 'itemName', it will try to automatically set a recipe pattern.
	 * @param customRecipePattern	A custom defined recipe pattern. If this is not null the pre-defined recipe pattern has no effect!
	 *                              You can use these characters in the recipe:
	 *                              '*'	- For the normal berries,
	 *                              '#' - For compressed berries,
	 *                          and 'S' - The 'blockToGrow' for the {@link OreShrubVariant}
	 */
	public CraftingResult(String itemName, int itemMeta, int craftingAmount, OreDictPrefix oreDictPrefix, String... customRecipePattern)
	{
		this.itemName = itemName;
		this.itemMeta = itemMeta;
		this.oreDictPrefix = oreDictPrefix;
		this.customRecipePattern = customRecipePattern;
		this.craftingAmount = Math.min(craftingAmount, 64);
	}

	/**
	 * Set the result stack for the recipe.
	 * Is used internally to change ingot recipes to nugget recipes if the nugget version of a metal is available.
	 */
	public void setResultStack(ItemStack resultStack)
	{
		this.resultStack = resultStack;
	}

	/**
	 * Change the OreDictPrefix and the item name.
	 * It's internally used to change ingot variants to nugget variants.
	 */
	public void adjustOreDictNameAndRecipe(OreDictPrefix to, String newName)
	{
		this.itemName = newName;
		this.oreDictPrefix = to;
	}

	public String getItemName()
	{
		return this.itemName;
	}

	public int getItemMeta()
	{
		return this.itemMeta;
	}

	public int getCraftingAmount()
	{
		return this.craftingAmount;
	}

	public ItemStack getResultStack()
	{
		return resultStack;
	}

	public OreDictPrefix getOreDictPrefix()
	{
		return this.oreDictPrefix;
	}

	public String[] getCustomRecipePattern()
	{
		return this.customRecipePattern;
	}

	/**
	 * If a ore recipe should be registered for that material.
	 * This has only effect, if the OreDictionary-Name is not empty and a valid ore exists.
	 */
	public CraftingResult disableOreRecipe()
	{
		this.registerOreRecipe = false;
		return this;
	}

	public boolean shouldRegisterOreRecipe()
	{
		return this.registerOreRecipe;
	}
}
