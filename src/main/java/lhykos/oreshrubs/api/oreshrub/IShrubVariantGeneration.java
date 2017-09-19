/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-License
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [12.09.2017 - 13:15]
 */
package lhykos.oreshrubs.api.oreshrub;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.IChunkGenerator;

import java.util.Random;

public interface IShrubVariantGeneration
{
	boolean canGenerateHere(World world, Random random, IChunkGenerator chunkGenerator, BlockPos pos);
}
