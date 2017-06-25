/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [30.03.2017 - 13:12]
 */
package lhykos.oreshrubs.api.oreshrub;

import lhykos.oreshrubs.api.IRegistryName;
import lhykos.oreshrubs.api.damagesource.DamageSourceOreShrubs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;


public class OreShrubVariant implements IRegistryName
{
    private boolean isEnabled = true;
    private String customDisplayName;
    private String registryName;
    private CraftingResult craftingResult = CraftingResult.EMPTY;
    private GenerationSettings generationSettings = GenerationSettings.EMPTY;
    private IBlockState blockToGrow;
    private int shrubColor;
    private int berryColor;
    private int rarity;
    private int growthChance;
    private int maxHarvestedBerries;
    private int lightLevel;
    private int maxGrowthLight;

    public OreShrubVariant(String registryName, int rarity, int shrubColor, int berryColor)
    {
        this(registryName, rarity, 15, 4, 0, 10, shrubColor, berryColor);
    }

    /**
     * @param registryName          A unique registry name!
     * @param rarity                How rare this lootbag is. Higher values are a higher rarity!
     * @param growthChance          The chance a shrub has to grow in a random game tick. Avoid vales under 1!
     * @param maxHarvestedBerries   The maximum amount of berries you can harvest from a fully grown shrub.
     * @param lightLevel            The light the shrub emits.
     * @param maxGrowthLight        The maximum light the shrub can be exposed before it will shrink.
     * @param shrubColor            The shrub block color.
     * @param berryColor            The berries color.
     */
    public OreShrubVariant(String registryName, int rarity, int growthChance, int maxHarvestedBerries, int lightLevel, int maxGrowthLight, int shrubColor, int berryColor)
    {
        this.registryName = registryName;
        this.rarity = rarity;
        this.shrubColor = shrubColor;
        this.berryColor = berryColor;
        this.setGrowthChance(growthChance);
        this.setMaxHarvestedBerries(maxHarvestedBerries);
        this.setLightLevel(lightLevel);
        this.setMaxGrowthLight(maxGrowthLight);
    }

    /**
     * The action that should execute if a entity collides with the ore shrub.
     *
     * @param world		The World.
     * @param pos		The BlockPos of the shrub.
     * @param state		The IBlockState of the shrub.
     * @param entity	The Entity that collides with this shrub.
     */
    public void onCollide(World world, BlockPos pos, IBlockState state, Entity entity)
    {
        if(entity instanceof EntityLivingBase)
        {
            entity.attackEntityFrom(DamageSourceOreShrubs.ORESHRUB, 1.0F);
        }
    }

    /**
     * The action that should execute if a player right click with the berries that
     * correspondent with this ore shrub.
     *
     * @param stack		The OreBerries-Stack.
     * @param world		The World.
     * @param player	The player that right clicks with the berries.
     *
     * @return          The amount of berries that are consumed.
     */
    public int onConsumeBerries(ItemStack stack, World world, EntityPlayer player, EnumHand hand)
    {
        return 0;
    }

    public String getRegistryName()
    {
        return this.registryName;
    }

    /**
     * Set if the shrub is enabled or not.
     * This is mostly used to disable the shrub if the crafting results output stack is empty.
     */
    public OreShrubVariant setIsEnabled(boolean isEnabled)
    {
        this.isEnabled = isEnabled;
        return this;
    }

    public boolean getIsEnabled()
    {
        return this.isEnabled;
    }

    /**
     * The chance the ore shrub has to grow in a random in game tick.
     * Make sure your value is above 0! Otherwise it won't work.
     */
    public OreShrubVariant setGrowthChance(int growthChance)
    {
        this.growthChance = Math.max(growthChance, 1);
        return this;
    }

    public int getGrowthChance()
    {
        return this.growthChance;
    }

    /**
     * Set the maximum amount of berries that can be harvested from a fully grown ore shrub.
     * To avoid bug's don't set values above the stack limit of 64!
     */
    public OreShrubVariant setMaxHarvestedBerries(int amount)
    {
        this.maxHarvestedBerries = Math.min(amount, 64);
        return this;
    }

    public int getMaxHarvestedBerries()
    {
        return maxHarvestedBerries;
    }

    /**
     * Set the block on which the ore shrub can grow and re placed.
     * Set this to null, allow them to grow and replace on every solid block.
     */
    public OreShrubVariant setGrowthBlock(IBlockState state)
    {
        this.blockToGrow = state;
        return this;
    }

    public IBlockState getBlockToGrow()
    {
        return blockToGrow;
    }

    /**
     * Set the crafting result from the berries.
     * @see CraftingResult
     */
    public OreShrubVariant setCraftingResult(CraftingResult craftingResult)
    {
        this.craftingResult = craftingResult;
        return this;
    }

    public CraftingResult getCraftingResult()
    {
        return craftingResult;
    }

    /**
     * The color of the ore shrub.
     */
    public int getShrubColor()
    {
        return this.shrubColor;
    }

    /**
     * The color of the ore berries.
     */
    public int getBerryColor()
    {
        return this.berryColor;
    }

    /**
     * The color of the ripe berries on the shrub.
     * This is normally the same color as the Berries has.
     */
    public int getRipeBerryColor()
    {
        return getBerryColor();
    }

    /**
     * Set the generation settings for this lootbag. Allow them to generate in the world.
     * Return 'GenerationSettings.EMPTY' to not allow them to generate.
     * @see GenerationSettings
     */
    public OreShrubVariant setGenerationSettings(GenerationSettings generationSettings)
    {
        this.generationSettings = generationSettings;
        return this;
    }

    public GenerationSettings getGenerationSettings()
    {
        return generationSettings;
    }

    /**
     * Simplified call to check if this lootbag can be generated.
     */
    public boolean canGenerateShrubs()
    {
        return generationSettings != null && generationSettings != GenerationSettings.EMPTY;
    }

    /**
     * Set custom display name for this lootbag.
     * You should set this if you have a empty {@link CraftingResult}.
     * Otherwise the shrub block will just named 'Ore Shrub'.
     */
    public OreShrubVariant setCustomDisplayName(String displayName)
    {
        this.customDisplayName = displayName;
        return this;
    }

    @Nullable
    public String getCustomDisplayName()
    {
        return this.customDisplayName;
    }

    /**
     * Set the light level the shrub emits.
     * If you set this value over the 'maxGrowthLight' the shrub will never grow!
     */
    public OreShrubVariant setLightLevel(int lightLevel)
    {
        this.lightLevel = Math.min(lightLevel, 15);
        return this;
    }

    public int getLightLevel()
    {
        return this.lightLevel;
    }

    /**
     * Set the maximum light the shrub can be exposed before it will shrink.
     */
    public OreShrubVariant setMaxGrowthLight(int maxGrowthLight)
    {
        this.maxGrowthLight = Math.min(maxGrowthLight, 15);
        return this;
    }

    public int getMaxGrowLight()
    {
        return maxGrowthLight;
    }

    public int getRarity()
    {
        return this.rarity;
    }

    /**
     * Return true if this shrub can be configured via the config file.
     * For custom shrubs, it's set to false!
     */
    public boolean isConfigurable()
    {
        return true;
    }
}
