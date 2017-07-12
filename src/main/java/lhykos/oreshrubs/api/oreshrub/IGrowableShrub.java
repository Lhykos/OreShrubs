/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [05.06.2017]
 */
package lhykos.oreshrubs.api.oreshrub;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * If a block implement this, it can be affected by the 'Growing Powder'.
 * It's also used internally in the ore shrub.
 */
public interface IGrowableShrub
{
	/**
	 * If this shrub can be affected by growing powder.
	 */
	boolean canUseGrowingPowder(World worldIn, Random random, BlockPos pos, IBlockState state);

	/**
	 * Return true if the shrub can grow.
	 */
	boolean canGrow(World world, Random random, BlockPos pos, IBlockState state, boolean fromGrowingPowder);

	void grow(World world, Random random, BlockPos pos, IBlockState state);

	/**
	 * Return true if the shrub is about to shrink.
	 */
	boolean shouldShrink(World world, Random random, BlockPos pos, IBlockState state);

	void shrink(World world, Random random, BlockPos pos, IBlockState state);
}
