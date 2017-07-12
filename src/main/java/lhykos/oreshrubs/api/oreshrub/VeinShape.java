/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [09.06.2017 - 21:07]
 */
package lhykos.oreshrubs.api.oreshrub;

/**
 * The vein shape variants a oreshrub can have when it gets generated.
 * NONE 		- Have no shape. Will not be generated.
 * NORMAL 		- Will try to generate a random vein size in a area of 3x3x3.
 * PILLAR_UP	- Will generate a upwards pillar. The height depends on the vein size.
 * PILLAR_DOWN	- Will generate a downwards pillar. The depth depends on the vein size.
 */
public enum VeinShape
{
	NONE,
	NORMAL,
	PILLAR_UP,
	PILLAR_DOWN;

	public static VeinShape getFromString(String s)
	{
		return VeinShape.valueOf(s.toUpperCase());
	}
}
