/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [Jun 2017, 13:45]
 */
package lhykos.oreshrubs.api.damagesource;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public class DamageSourceOreShrubs
{
	public static final DamageSource ORESHRUB = new DamageSource("oreshrub");

	public static DamageSource fromShrubTrap(EntityLivingBase attacker)
	{
		return new EntityDamageSource(ORESHRUB.damageType, attacker)
		{
			@Override
			public ITextComponent getDeathMessage(EntityLivingBase entityLivingBaseIn)
			{
				String s = "death.attack." + this.damageType + ".trap";
				return new TextComponentTranslation(s, entityLivingBaseIn.getDisplayName());
			}
		};
	}
}
