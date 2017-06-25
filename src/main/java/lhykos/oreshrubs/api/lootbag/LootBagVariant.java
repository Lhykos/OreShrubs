/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [20.04.2017 - 11:23]
 */
package lhykos.oreshrubs.api.lootbag;

import com.google.common.collect.Lists;
import lhykos.oreshrubs.api.IRegistryName;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public class LootBagVariant implements IRegistryName
{
	private String registryName;
	private String craftingCoreItemName;
	private ItemStack craftingCoreItemStack = ItemStack.EMPTY;
	private List<ResourceLocation> lootTableLocations;
	private boolean hasAdvancedVariant = true;
	private boolean isEnabled = true;
	private int gemColor;
	private int rarity;

	/**
	 * Same as constructor with ItemStack parameter, but
	 * @param craftingCoreItemName A ore dictionary or resource location of a item. The @craftingCoreItemStack will set to this, if the item exists.
	 */
	public LootBagVariant(String registryName, int rarity, int gemColor, String craftingCoreItemName, ResourceLocation... lootTableLocations)
	{
		this.registryName = registryName;
		this.rarity = rarity;
		this.gemColor = gemColor;
		this.craftingCoreItemName = craftingCoreItemName;
		this.lootTableLocations = Lists.newArrayList(lootTableLocations);
	}

	/**
	 * @param registryName				A unique registry name!
	 * @param rarity					The rarity of thi loot bag. Higher values are higher rarity.
	 * @param gemColor					The gem color of the loot bag.
	 * @param craftingCoreItemStack		A Item that is used to craft the loot bag besides the random berries and the empty bag.
	 * @param lootTableLocations		All LootTable locations from where the loot should picked.
	 */
	public LootBagVariant(String registryName, int rarity, int gemColor, ItemStack craftingCoreItemStack, ResourceLocation... lootTableLocations)
	{
		this.registryName = registryName;
		this.rarity = rarity;
		this.gemColor = gemColor;
		this.craftingCoreItemStack = craftingCoreItemStack;
		this.lootTableLocations = Lists.newArrayList(lootTableLocations);
	}

	/**
	 * Set the craftingCoreItemStack.
	 */
	public LootBagVariant setCraftingCoreItemStack(ItemStack stack)
	{
		this.craftingCoreItemStack = stack;
		return this;
	}

	public ItemStack getCraftingCoreItemStack()
	{
		return this.craftingCoreItemStack;
	}

	public String getCraftingCoreItemName()
	{
		return this.craftingCoreItemName;
	}

	/**
	 * Mostly used internally to convert the registry name to a readable version for loot bags.
	 */
	public String getUppercaseName()
	{
		String[] split = registryName.split("_");
		String s1 = "";
		for(int i = 0; i < split.length; i++)
		{
			s1 += split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
			if(i != split.length - 1)
			{
				s1 += " ";
			}
		}

		return s1.equals("") ? registryName : s1;
	}

	/**
	 * Disable the advanced lootbag of a loot bag.
	 * Use this if the LootTables only get one item.
	 */
	public LootBagVariant disableAdvancedVariant()
	{
		this.hasAdvancedVariant = false;
		return this;
	}

	public String getRegistryName()
	{
		return this.registryName;
	}

	public int getGemColor()
	{
		return this.gemColor;
	}

	public int getRarity()
	{
		return this.rarity;
	}

	/**
	 * Disable or enable the loot bag lootbag.
	 */
	public LootBagVariant setIsEnabled(boolean isEnabled)
	{
		this.isEnabled = isEnabled;
		return this;
	}

	public boolean getIsEnabled()
	{
		return this.isEnabled;
	}

	public boolean hasAdvancedVariant()
	{
		return this.hasAdvancedVariant;
	}

	public List<ResourceLocation> getLootTableLocations()
	{
		return this.lootTableLocations;
	}
}
