/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [30.03.2017 - 10:23]
 */
package lhykos.oreshrubs.api.oreshrub;

import net.minecraft.world.biome.Biome;

import java.util.ArrayList;
import java.util.List;

public class GenerationSettings
{
	/**
	 * A empty version for ore shrubs that can't be generated.
	 * Use this if you don't want any generation. Please avoid returning 'null'. Use this empty one instead!
	 */
	public static final GenerationSettings EMPTY = new GenerationSettings(-1, 0, -1, -1, -1, VeinShape.NONE, null);

	private int dimension;
	private int minGenHeight;
	private int maxGenHeight;
	private int veinSize;
	private int density;
	private VeinShape veinShape;
	private List<Biome> spawnBiomes;

	public GenerationSettings(int dimension, int minHeight, int maxHeight, int veinSize)
	{
		this(dimension, 1, minHeight, maxHeight, veinSize, VeinShape.NORMAL, new ArrayList<>());
	}

	public GenerationSettings(int dimension, int minGenHeight, int maxGenHeight, int veinSize, VeinShape veinShape)
	{
		this(dimension, 1, minGenHeight, maxGenHeight, veinSize, veinShape, new ArrayList<>());
	}

	/**
	 * @param dimension		The dimension in that the generation will work.
	 * @param density		How often the generator goes through a chunk.
	 * @param minHeight		The minimum generation height...
	 * @param maxHeight		... and the maximum generation height.
	 * @param veinSize		The maximum vein size.
	 * @param veinShape		The {@link VeinShape}.
	 * @param spawnBiomes	In which biomes the generation will work. A empty list means everywhere.
	 */
	public GenerationSettings(int dimension, int density, int minHeight, int maxHeight, int veinSize, VeinShape veinShape, List<Biome> spawnBiomes)
	{
		this.dimension = dimension;
		this.minGenHeight = minHeight;
		this.maxGenHeight = maxHeight;
		this.veinSize = veinSize;
		this.veinShape = veinShape;
		this.spawnBiomes = spawnBiomes;
		this.density = density;
	}

	public int getDimension()
	{
		return this.dimension;
	}

	public int getMinGenHeight()
	{
		return this.minGenHeight;
	}

	public int getMaxGenHeight()
	{
		return this.maxGenHeight;
	}

	public int getMaxVeinSize()
	{
		return veinSize;
	}

	public VeinShape getVeinShape()
	{
		return this.veinShape;
	}

	public List<Biome> getSpawnBiomes()
	{
		return spawnBiomes;
	}

	public int getDensity()
	{
		return this.density;
	}
}

