# OreShrubs-API-0.3
- **DEPRECATED:** 'IOreShrubsPlugin::registerOreShrubs'
  - Replaced with same method put removed 'IShrubHelper'
 - **DEPRECATED:** 'IOreShrubsPlugin::registerLootBags'
  - Replaced with same method put removed 'ILootBagHelper'
- **DEPRECATED:** 'IOreShrubsHelper'
- 'IShrubHelper' and 'ILootBagHelper' instances are now accessible from 'OreShrubsAPI' directly.
  - The instances will be initialized in pre init.
- Added 'IShrubHelper::hasBerriesToHarvest'.
- Added 'IShrubHelper::placeShrubInWorld'
  - An easy method to place a ore shrub! 

# OreShrubs-API-0.2
- **DEPRECATED:** 'OreShrubVariant::isConfigurable'
  - Has no more a usage. Variants will be configured in json files.
  - Replaced by 'OreShrubVariant::isSerializable'
- **DEPRECATED:** 'OreShrubVariant::getRipeBerryColor'
  - Has no more a usage. Will use 'getBerryColor' instead.
- **DEPRECATED:** 'IVariantRegistry::register'
  - Replaced by 'IVariantRegistry::preRegister'
- **DEPRECATED:** 'CraftingResult.class', 'OreShrubVariant::setCraftingResult', 'OreShrubVariant::getCraftingResult'
  - Replaced with more clear variants: 'OreDictResult' and 'ItemStackResult'
- Added 'GenerationSettings::canGenerateHere'
  - Used in the final generation phase of the shrubs.

# OreShrubs-API 0.1
- Release.