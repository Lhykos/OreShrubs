# HOWTO - Custom Shrubs

Custom Shrubs are made with JSON.

Here you have all terms you can use to make a custom shrub.
You don't have to to use all, expect for some important ones. You can only use these ones you are really need.
For all unset values will default values applied.

**Look in the examples if you are not know how it should look like.**

## custom_shrubs
This is the main element that contains a array with all custom-shrub-variants.

### enabled
If the shrub is enabled or not. **Important**

### registry_name
Set a unique registry name. **Important**

### rarity
How rare this shrub should be. E.g. is used in the generation. (Default: 5)

### shrub_color
Which color the shrub has. You can use HEX Values if you want. (Default: 0xFFFFFF)

### berry_color
Which color the berries on the shrub have. You can use HEX Values if you want. (0xFFFFFF)

### growth_chance
The chance the shrub has to grow in a random in game tick. (Default: 20)

### max_harvested_berries
How many berries you can harvest from a shrub. (Default: 4, Maximum: 64)

### light_level
How many light the shrub emits. Can be a range from 0 (no light) up to 15 (like a torch). (Default: 0)

### max_growth_light
The maximum light the shrub can be exposed until it will shrink.
Can be a range from 0 (no light) up to 15 (like a torch). (Default: 10)

### growth_block
The block on which the shrub can be placed and generated. If this is not set, it can be placed on every solid block.

You can use a resource location for it.


## OreDictResult
Use this if you want to register a output material for the berries with the ore dictionary.

### oredict_name
The name in the ore dictionary, e.g. "ingotGold".

### crafting_amount
The amount of items you get from the crafting.

### register_ore_recipe
If set to true you can craft the ore out of this material. (As long as it exists.)

### recipe_pattern
The recipe pattern for the crafting.
You can use this characters to define the recipe:

- '*' - For normal ore berries.
- **#** - For compressed ore berries.
- **S** - For the 'growth_block' of this shrub. If this is not set the shrub can be placed on every solid block.


## ItemStackResult
Use this if you want to register a output material for the berries and want to take a item directly.

### item_name
The name of the item. You should always use the mod prefix: e.g. minecraft:gold_ingot

### item_meta
The metadata for the item.

### crafting_amount
The amount of items you get from the crafting.

### recipe_pattern
See OreDictResult.


## Generation Settings
If you set this element the shrub will be generated in the world.

### dimension
In which dimension the shrub can be generated. (Default: 0)

### min_generation_height
The minimum generation height of this shrub. (Default: 1)

### max_generation_height
The maximum generation height of this shrub. (Default: 60)

### vein_size
The maximum vein size of the generation for this shrub. (Default: 4)

### vein_shape
The shape for the generation of this shrub.

You can use this shapes:

- **NORMAL** -  Generate a random vein in a 3x3x3 radius.
- **PILLAR_UP** - Generate a upwards pillar. The height depends on the vein size.
- **PILLAR_DOWN** - Generate a downwards pillar. The depth depends on the vein size.

### spawn_biomes
A array of biomes where the shrub can be generated.
