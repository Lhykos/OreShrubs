/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [09.06.2017 - 20:50]
 */
package lhykos.oreshrubs.api;

import lhykos.oreshrubs.api.oreshrub.OreShrubVariant;
import lhykos.oreshrubs.api.lootbag.LootBagVariant;

/**
 * This is main class to implement to create a OreShrubs plugin.
 * From here you get access to the mechanics of the mod.
 * IOreShrubsPlugins must have the {@link OreShrubsPlugin} annotation to get registered by OreShrubs.
 *
 * You can use a blank plugin too: {@link BlankOreShrubsPlugin}
 */
public interface IOreShrubsPlugin
{
	/**
	 * To register, replace or remove a OreShrubVariant you should use this registry.
	 * It also provide a class to get access to some helper methods and tools.
	 */
	void registerOreShrubs(IVariantRegistry<OreShrubVariant> oreShrubRegistry, IShrubHelper shrubHelper);

	/**
	 * To register, replace or remove a LootBagVariant you should use this registry.
	 * It also provide a class to get access to some helper methods and tools.
	 */
	void registerLootBags(IVariantRegistry<LootBagVariant> lootBagRegistry, ILootBagHelper lootBagHelper);
}
