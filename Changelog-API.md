#OreShrubs-API-0.2
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