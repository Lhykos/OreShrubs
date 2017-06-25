/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [09.06.2017 - 20:51]
 */
package lhykos.oreshrubs.api;

import java.util.List;
import java.util.Random;

public interface IVariantRegistry<T>
{
	/**
	 * Register a lootbag.
	 */
	void register(T variant);

	/**
	 * Remove a lootbag from the registry.
	 */
	void remove(T variant);

	/**
	 * Replace a lootbag in the registry.
	 * The registry names will be compared for the replacement!
	 */
	void replace(T replacementVariant);

	/**
	 * Get a lootbag from it's registryName.
	 */
	T getFromRegistryName(String registryName);

	/**
	 * Get a random lootbag from all registered variants.
	 */
	T getRandom(Random random);

	/**
	 * Get all registered variants.
	 */
	List<T> getAll();
}
