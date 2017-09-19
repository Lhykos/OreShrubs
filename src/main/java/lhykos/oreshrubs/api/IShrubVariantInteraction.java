/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-License
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [08.09.2017 - 18:01]
 */
package lhykos.oreshrubs.api;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IShrubVariantInteraction
{
	/**
	 * The action that should execute if a entity collides with the ore shrub.
	 *
	 * @param world		The world.
	 * @param pos		The block pos of the shrub.
	 * @param state		The state of the shrub.
	 * @param entity	The entity that collides with this shrub.
	 * @since  0.2
	 */
	void onCollide(World world, BlockPos pos, IBlockState state, Entity entity);

	/**
	 * The action that should execute if a player right click with the berries.
	 *
	 * @param stack		The ore berries stack.
	 * @param world		The world.
	 * @param player	The player that uses the berries.
	 *
	 * @return          The amount of berries are used.
	 * @since  0.2
	 */
	int consumeBerries(ItemStack stack, World world, EntityPlayer player, EnumHand hand);
}