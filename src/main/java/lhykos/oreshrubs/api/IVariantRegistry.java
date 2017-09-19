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
	 * Register a variant.
	 * @deprecated Use 'preRegister* instead!
	 */
	@Deprecated
	void register(T variant);

	/**
	 * Register a variant.
	 * @since 0.2
	 */
	void preRegister(T variant);

	/**
	 * Remove a variant from the registry.
	 */
	void remove(T variant);

	/**
	 * Replace a variant in the registry.
	 * The registry names will be compared for the replacement!
	 */
	void replace(T replacementVariant);

	/**
	 * Get a variant from it's registryName.
	 */
	T getFromRegistryName(String registryName);

	/**
	 * Get a random variant from all registered variants.
	 */
	T getRandom(Random random);

	/**
	 * Get all registered variants.
	 */
	List<T> getAll();
}
