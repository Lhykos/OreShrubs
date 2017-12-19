# 1.12
# OreShrubs - 1.4.3
- FIX #18: Empty loot bag spawns a gold shrub.

# OreShrubs - 1.4.2
- Some API-Changes. See the API-Changelog for more.
- Updated to forge version: *14.23.1.2562*
- FIX #14: Shrub Collector house always rotated away from path.
- FIX: Only 'Compressed Gold OreBerries' can be crafted.

# OreShrubs - 1.4.1
- Removed ore shrub configuration from the config file.
- Removed 'custom-shrubs' directory from config directory.
  - All ore shrubs are now registered in the new 'shrubs' directory.
  - 'ModRegister.cfg' are removed. 
  - All valid oreshrubs will be registered in that directory as json files.
- All ores that are supported from my mod can now be configured by json.
  - A 'shrubs' directory in the config directory is created after the first start of Minecraft.
- LootBags can now also be configured with json files!
  - It's also possible to add custom loot bags.
- Shrubs don't hurt the player anymore if he is wearing at least one piece of armor.
- Tinker's Construct support for ore berries and ore shrubs!
- FIX: Cobalt and Ardite shrubs are not enabled.
- FIX: Game crashes on world load (1.12.1)
- API: The API has changed to version 0.2!
  - See changelog file!
- **Removed mod compatibility for: EvilCraft, ActuallyAdditions, DraconicEvolution and AppliedEnergistics**
  - I just want to support the common ores for the shrubs and after the mod has it's API, other mod authors can easily implement their own variants.
- Added ore support for Emerald(Can be found in extreme hills) and Glowstone(Only generate near glowstone blocks in the nether)
- Shrubs are now much rarer and some of them can only be found in certain biomes or dimensions!
  
# OreShrubs - 1.4.0
- Updated to 1.12. Could contain bugs!
- The Shrub-Collector Villager can now go out of his house.
- The Shrub-Collector Villager now have more balanced offers and less duplicates.

# 1.11.2
# OreShrubs - 1.3.3
- Some mobs have now a chance to drop a LootBag.
  - The EnderDragon and the Wither always drop a advanced LootBag.

# OreShrubs - 1.3.2
- FIX: JEI Tooltip for 'Shrub Fertilizer' is not shown translated.
- FIX: ItemStack get a empty NBTTagCompound when placing them in the crafting grid.
- FIX: German is not translated.
- Have to remove old translations. (ru_RU, and pt_PT) They are to outdated. Sorry! :/

# OreShrubs - 1.3.1
- Shrubs that can be found in the overworld now can be re-placed on every solid block.
  - Or every custom block that has set no 'growth_block'.
- Custom Shrubs output material can now a item resource location too. (See examples)
- Changed some names for custom shrubs. Please check the syntax!
- Shrubs variants no longer need a certain mod to be exist.
- Added 'EmptyBag' is used for crafting.
- Added 'Shrub Fertilizer'. Right click a shrub to speed up the growing. Has a less efficiency when it's fully grown.
- Added a wither proof ShrubTrap. It's crafted with 4 wither skulls and 4 obsidian around a normal shrub trap.
- Added 'Compressed OreBerries', they are used to craft the ore block of this variant. (Can be disabled in config.)
- Added 'Shrub-Collector'-Villager. He spawns in a new house in a village.
- Changed ShrubTrap Recipe. All skulls can be used for crafting. If the forgotten Shrines are disabled the random berries are replaced with experience berries.
- Changed LootBag recipes. They now need a 'Empty Bag' for crafting.
- Changed the loot from LootBags. From a normal one you get now 3 random items. From a advanced from the whole bag content.
- Experience OreBerries can be shift-right-clicked to consume the whole stack.

- Added a OreShrubs-API. Modders now can create their own plugin to register custom shrubs and loot bags.
  - You can get the API from GitHub. (I will add maven support later.)
- Added Licence! (See: https://github.com/Lhykos/OreShrubs/)

# OreShrubs - 1.3.0b
- Just updated to 1.11.2. May contain bugs! Urgh~


# 1.10.2
# OreShrubs - 1.2.1
- Removed trash loot tables from loot bags, they now should contain more good stuff!
- RandomShrubs can now be stacked in the world.
- FIX: Advanced lootbags are not craftable.

# OreShrubs - 1.2.0
- Add advanced config settings for OreShrubs. (Density, GenHeight, VeinSize, ...)
- Add forgotten shrines to the world generation. A RandomShrub will be generated inside them.
- Add a RandomShrub and RandomBerries. Can be found rarely in forgotten shrines.
  - They need a minimum light level of 13, otherwise they will shrink and turn in a burned OreShrub.
  - Has to be placed on Obsidian to grow.
- Add LootBags in two variants. Can be crafted out of random berries and contain random chest loot.
- Add new shrub:
  - DarkGem(EvilCraft) - Spawn in the Overworld.
  - CertusQuartz(Applied Energistics) - Spawn in the Overworld.
- Add possibility to add custom shrubs via a config file. (See Minecraft Forum Thread for more information.)
- Change OreBerries and OreShrubs as loot in chests. They know should be generate more consistent.
- Updated Translations.

# OreShrubs - 1.1.1
- Language Support for: Russian(ru_RU) [Thanks to 'Aurelius']
- All OreShrubs now registered like the recent added ones. That means: All Berries can directly craft to nuggets. (For now)
- All old berries are deprecated. You still have them in your inventory and should convert them in the new ones.
- Config option: 'craftOreBerriesToIngots' and 'disableOreBerryRecipesToo' are deleted. They are unnecessary now.
- Add a config option to disable a shrub.
- Add retroactively generation (Retrogen). Can be disabled in config.
- Add OreShrub and OreBerries as obtainable loot in chests.
- Change Gotten experience points from Experience Berries from 10 to 8.
- Change Uranium ingot recipe, if only yellorum is present.
- Change that only a collision with uranium or lead shrub will give negative effects.
- FIX: Right click a tiny OreShrub with flint and steel will ignite the block in front of it.
- FIX: Empty Ore Shrub, if a mod is not loaded but enabled in the config.
- FIX: Crash on start up, if a mod register a material, that not exist as item.

# OreShrubs - 1.1.0b
- Ore Shrubs have no more transparency if the graphics settings is set to 'Fast'. (Like leaves)
- Ore Shrubs can not floating anymore. They always need a solid face or a fully grown shrub below/above them.
- Add translation support. Please visit the Minecraft Forum Thread for that.
- Language Support for: Portuguese(pt_PT) [Thanks for the one who translated it!]
- The ShrubTrap has now a blast resistance like obsidian.
- Add new shrubs:
  - Quartz - Spawn in the Nether.
  - Draconium(Draconic Evolution) - Spawn in the End.
  - Cobalt, Ardite(Tinkers Construct) - Spawn in the Nether.
  - Black Quartz(Actually Additions) - Spawn in the Overworld.

Because of a new registration system for shrub types:
- The berries of the new added shrubs can directly crafted into nuggets. (Will be changed later.)
- Is the mod for a shrub type are not loaded, e.g. Draconic Evolution, the shrub block is disabled.
- Ore shrubs generate in slightly bigger veins but they are a little bit rarer.
- Ore shrubs can be placed on top and the bottom of a block. (Sometimes it looks strange, but its Minecraft!)
- Ore shrubs can only be placed on the blocks on which they were generated. (Draconium -> End Stone)
- Configs: 'craftOreBerriesToIngots' and 'disableOreBerryRecipesToo' will not work for the new added shrubs. These two configs are unnecessary for those.

# OreShrubs - 1.0.0
- Release
