/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.fabric.api.tag.convention.v2;

import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

import net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration;

/**
 * See {@link net.minecraft.registry.tag.ItemTags} for vanilla tags.
 * Note that addition to some vanilla tags implies having certain functionality.
 */
public final class ConventionalItemTags {
	private ConventionalItemTags() {
	}

	/**
	 * Natural stone-like blocks that can be used as a base ingredient in recipes that take stone.
	 */
	public static final TagKey<Item> STONES = register("stones");
	public static final TagKey<Item> COBBLESTONES = register("cobblestones");

	// Tool tags
	public static final TagKey<Item> TOOLS = register("tools");
	public static final TagKey<Item> SHEARS_TOOLS = register("tools/shears");
	/**
	 * For spear tools, like Minecraft's tridents.
	 * Note, other weapons like boomerangs and throwing knives are best put into their own tools tag.
	 */
	public static final TagKey<Item> SPEARS_TOOLS = register("tools/spears");
	public static final TagKey<Item> BOWS_TOOLS = register("tools/bows");
	public static final TagKey<Item> CROSSBOWS_TOOLS = register("tools/crossbows");
	public static final TagKey<Item> SHIELDS_TOOLS = register("tools/shields");
	public static final TagKey<Item> FISHING_RODS_TOOLS = register("tools/fishing_rods");
	public static final TagKey<Item> BRUSHES_TOOLS = register("tools/brushes");

	// Action-based tool tags
	public static final TagKey<Item> MELEE_WEAPONS_TOOLS = register("tools/melee_weapons");
	public static final TagKey<Item> RANGED_WEAPONS_TOOLS = register("tools/ranged_weapons");
	public static final TagKey<Item> MINING_TOOLS = register("tools/mining_tools");

	// Armor tags
	/**
	 * Collects the 4 vanilla armor tags into one parent collection for ease.
	 */
	public static final TagKey<Item> ARMORS = register("armors");

	// Tools/Armor tags
	/**
	 * Collects the many enchantable tags into one parent collection for ease.
	 */
	public static final TagKey<Item> ENCHANTABLES = register("enchantables");

	// Ores and ingots - categories
	public static final TagKey<Item> BRICKS = register("bricks");
	public static final TagKey<Item> DUSTS = register("dusts");
	public static final TagKey<Item> GEMS = register("gems");
	public static final TagKey<Item> INGOTS = register("ingots");
	public static final TagKey<Item> NUGGETS = register("nuggets");
	public static final TagKey<Item> ORES = register("ores");
	public static final TagKey<Item> RAW_MATERIALS = register("raw_materials");
	public static final TagKey<Item> RAW_BLOCKS = register("raw_blocks");

	// Raw material and blocks - vanilla instances
	public static final TagKey<Item> IRON_RAW_MATERIALS = register("raw_materials/iron");
	public static final TagKey<Item> GOLD_RAW_MATERIALS = register("raw_materials/gold");
	public static final TagKey<Item> COPPER_RAW_MATERIALS = register("raw_materials/copper");
	public static final TagKey<Item> IRON_RAW_BLOCKS = register("raw_blocks/iron");
	public static final TagKey<Item> GOLD_RAW_BLOCKS = register("raw_blocks/gold");
	public static final TagKey<Item> COPPER_RAW_BLOCKS = register("raw_blocks/copper");

	// Bricks - vanilla instances
	public static final TagKey<Item> NORMAL_BRICKS = register("bricks/normal");
	public static final TagKey<Item> NETHER_BRICKS = register("bricks/nether");

	// Ingots - vanilla instances
	public static final TagKey<Item> IRON_INGOTS = register("ingots/iron");
	public static final TagKey<Item> GOLD_INGOTS = register("ingots/gold");
	public static final TagKey<Item> COPPER_INGOTS = register("ingots/copper");
	public static final TagKey<Item> NETHERITE_INGOTS = register("ingots/netherite");

	// Ores - vanilla instances
	public static final TagKey<Item> NETHERITE_SCRAP_ORES = register("ores/netherite_scrap");
	public static final TagKey<Item> QUARTZ_ORES = register("ores/quartz");

	// Gems - vanilla instances
	public static final TagKey<Item> QUARTZ_GEMS = register("gems/quartz");
	public static final TagKey<Item> LAPIS_GEMS = register("gems/lapis");
	public static final TagKey<Item> DIAMOND_GEMS = register("gems/diamond");
	public static final TagKey<Item> AMETHYST_GEMS = register("gems/amethyst");
	public static final TagKey<Item> EMERALD_GEMS = register("gems/emerald");
	public static final TagKey<Item> PRISMARINE_GEMS = register("gems/prismarine");

	// Dusts and Misc - vanilla instances
	public static final TagKey<Item> REDSTONE_DUSTS = register("dusts/redstone");
	public static final TagKey<Item> GLOWSTONE_DUSTS = register("dusts/glowstone");
	public static final TagKey<Item> COAL = register("coal");

	// Consumables
	public static final TagKey<Item> POTIONS = register("potions");

	// Foods
	public static final TagKey<Item> FOODS = register("foods");
	/**
	 * Apples and other foods that are considered fruits in the culinary field belong in this tag.
	 * Cherries would go here as they are considered a "stone fruit" within culinary fields.
	 */
	public static final TagKey<Item> FRUITS_FOODS = register("foods/fruits");
	/**
	 * Tomatoes and other foods that are considered vegetables in the culinary field belong in this tag.
	 */
	public static final TagKey<Item> VEGETABLES_FOODS = register("foods/vegetables");
	/**
	 * Strawberries, raspberries, and other berry foods belong in this tag.
	 * Cherries would NOT go here as they are considered a "stone fruit" within culinary fields.
	 */
	public static final TagKey<Item> BERRIES_FOODS = register("foods/berries");
	public static final TagKey<Item> BREADS_FOODS = register("foods/breads");
	public static final TagKey<Item> COOKIES_FOODS = register("foods/cookies");
	public static final TagKey<Item> RAW_MEATS_FOODS = register("foods/raw_meats");
	public static final TagKey<Item> COOKED_MEATS_FOODS = register("foods/cooked_meats");
	public static final TagKey<Item> RAW_FISHES_FOODS = register("foods/raw_fishes");
	public static final TagKey<Item> COOKED_FISHES_FOODS = register("foods/cooked_fishes");
	/**
	 * Soups, stews, and other liquid food in bowls belongs in this tag.
	 */
	public static final TagKey<Item> SOUPS_FOODS = register("foods/soups");
	/**
	 * Sweets and candies like lollipops or chocolate belong in this tag.
	 */
	public static final TagKey<Item> CANDIES_FOODS = register("foods/candies");
	/**
	 * Foods like cake that can be eaten when placed in the world belong in this tag.
	 */
	public static final TagKey<Item> EDIBLE_WHEN_PLACED_FOODS = register("foods/edible_when_placed");
	/**
	 * For foods that inflict food poisoning-like effects.
	 * Examples are Rotten Flesh's Hunger or Pufferfish's Nausea, or Poisonous Potato's Poison.
	 */
	public static final TagKey<Item> FOOD_POISONING_FOODS = register("foods/food_poisoning");

	// Buckets
	public static final TagKey<Item> BUCKETS = register("buckets");
	public static final TagKey<Item> EMPTY_BUCKETS = register("buckets/empty");
	/**
	 * Does not include entity water buckets.
	 */
	public static final TagKey<Item> WATER_BUCKETS = register("buckets/water");
	public static final TagKey<Item> LAVA_BUCKETS = register("buckets/lava");
	public static final TagKey<Item> MILK_BUCKETS = register("buckets/milk");
	public static final TagKey<Item> POWDER_SNOW_BUCKETS = register("buckets/powder_snow");
	public static final TagKey<Item> ENTITY_WATER_BUCKETS = register("buckets/entity_water");

	public static final TagKey<Item> BARRELS = register("barrels");
	public static final TagKey<Item> WOODEN_BARRELS = register("barrels/wooden");
	public static final TagKey<Item> BOOKSHELVES = register("bookshelves");
	public static final TagKey<Item> CHESTS = register("chests");
	public static final TagKey<Item> WOODEN_CHESTS = register("chests/wooden");
	public static final TagKey<Item> GLASS_BLOCKS = register("glass_blocks");
	public static final TagKey<Item> GLASS_PANES = register("glass_panes");
	public static final TagKey<Item> SHULKER_BOXES = register("shulker_boxes");

	// Related to budding mechanics
	public static final TagKey<Item> BUDDING_BLOCKS = register("budding_blocks");
	public static final TagKey<Item> BUDS = register("buds");
	public static final TagKey<Item> CLUSTERS = register("clusters");

	public static final TagKey<Item> VILLAGER_JOB_SITES = register("villager_job_sites");

	// Sandstone
	public static final TagKey<Item> SANDSTONE_BLOCKS = register("sandstone/blocks");
	public static final TagKey<Item> SANDSTONE_SLABS = register("sandstone/slabs");
	public static final TagKey<Item> SANDSTONE_STAIRS = register("sandstone/stairs");
	public static final TagKey<Item> RED_SANDSTONE_BLOCKS = register("sandstone/red_blocks");
	public static final TagKey<Item> RED_SANDSTONE_SLABS = register("sandstone/red_slabs");
	public static final TagKey<Item> RED_SANDSTONE_STAIRS = register("sandstone/red_stairs");
	public static final TagKey<Item> UNCOLORED_SANDSTONE_BLOCKS = register("sandstone/uncolored_blocks");
	public static final TagKey<Item> UNCOLORED_SANDSTONE_SLABS = register("sandstone/uncolored_slabs");
	public static final TagKey<Item> UNCOLORED_SANDSTONE_STAIRS = register("sandstone/uncolored_stairs");

	// Dyes
	public static final TagKey<Item> DYES = register("dyes");
	public static final TagKey<Item> BLACK_DYES = register("dyes/black");
	public static final TagKey<Item> BLUE_DYES = register("dyes/blue");
	public static final TagKey<Item> BROWN_DYES = register("dyes/brown");
	public static final TagKey<Item> CYAN_DYES = register("dyes/cyan");
	public static final TagKey<Item> GRAY_DYES = register("dyes/gray");
	public static final TagKey<Item> GREEN_DYES = register("dyes/green");
	public static final TagKey<Item> LIGHT_BLUE_DYES = register("dyes/light_blue");
	public static final TagKey<Item> LIGHT_GRAY_DYES = register("dyes/light_gray");
	public static final TagKey<Item> LIME_DYES = register("dyes/lime");
	public static final TagKey<Item> MAGENTA_DYES = register("dyes/magenta");
	public static final TagKey<Item> ORANGE_DYES = register("dyes/orange");
	public static final TagKey<Item> PINK_DYES = register("dyes/pink");
	public static final TagKey<Item> PURPLE_DYES = register("dyes/purple");
	public static final TagKey<Item> RED_DYES = register("dyes/red");
	public static final TagKey<Item> WHITE_DYES = register("dyes/white");
	public static final TagKey<Item> YELLOW_DYES = register("dyes/yellow");

	// Items created with dyes
	/**
	 * Tag that holds all blocks and items that can be dyed a specific color.
	 * (Does not include color blending items like leather armor.
	 * Use {@link net.minecraft.registry.tag.ItemTags.DYEABLE} tag instead for color blending items)
	 * <p></p>
	 * Note: Use custom ingredients in recipes to do tag intersections and/or tag exclusions
	 * to make more powerful recipes utilizing multiple tags such as dyed tags for an ingredient.
	 * See {@link net.fabricmc.fabric.api.recipe.v1.ingredient.DefaultCustomIngredients}
	 * children classes for various custom ingredients available that can also be used in data generation.
	 */
	public static final TagKey<Item> DYED = register("dyed");
	public static final TagKey<Item> BLACK_DYED = register("dyed/black");
	public static final TagKey<Item> BLUE_DYED = register("dyed/blue");
	public static final TagKey<Item> BROWN_DYED = register("dyed/brown");
	public static final TagKey<Item> CYAN_DYED = register("dyed/cyan");
	public static final TagKey<Item> GRAY_DYED = register("dyed/gray");
	public static final TagKey<Item> GREEN_DYED = register("dyed/green");
	public static final TagKey<Item> LIGHT_BLUE_DYED = register("dyed/light_blue");
	public static final TagKey<Item> LIGHT_GRAY_DYED = register("dyed/light_gray");
	public static final TagKey<Item> LIME_DYED = register("dyed/lime");
	public static final TagKey<Item> MAGENTA_DYED = register("dyed/magenta");
	public static final TagKey<Item> ORANGE_DYED = register("dyed/orange");
	public static final TagKey<Item> PINK_DYED = register("dyed/pink");
	public static final TagKey<Item> PURPLE_DYED = register("dyed/purple");
	public static final TagKey<Item> RED_DYED = register("dyed/red");
	public static final TagKey<Item> WHITE_DYED = register("dyed/white");
	public static final TagKey<Item> YELLOW_DYED = register("dyed/yellow");

	// Storage blocks - categories
	/**
	 * A storage block is generally a block that has a recipe to craft a bulk of 1 kind of resource to a block
	 * and has a mirror recipe to reverse the crafting with no loss in resources.
	 * <p></p>
	 * Honey Block is special in that the reversing recipe is not a perfect mirror of the crafting recipe
	 * and so, it is considered a special case and not given a storage block tag.
	 */
	public static final TagKey<Item> STORAGE_BLOCKS = register("storage_blocks");
	public static final TagKey<Item> STORAGE_BLOCKS_BONE_MEAL = register("storage_blocks/bone_meal");
	public static final TagKey<Item> STORAGE_BLOCKS_COAL = register("storage_blocks/coal");
	public static final TagKey<Item> STORAGE_BLOCKS_COPPER = register("storage_blocks/copper");
	public static final TagKey<Item> STORAGE_BLOCKS_DIAMOND = register("storage_blocks/diamond");
	public static final TagKey<Item> STORAGE_BLOCKS_DRIED_KELP = register("storage_blocks/dried_kelp");
	public static final TagKey<Item> STORAGE_BLOCKS_EMERALD = register("storage_blocks/emerald");
	public static final TagKey<Item> STORAGE_BLOCKS_GOLD = register("storage_blocks/gold");
	public static final TagKey<Item> STORAGE_BLOCKS_IRON = register("storage_blocks/iron");
	public static final TagKey<Item> STORAGE_BLOCKS_LAPIS = register("storage_blocks/lapis");
	public static final TagKey<Item> STORAGE_BLOCKS_NETHERITE = register("storage_blocks/netherite");
	public static final TagKey<Item> STORAGE_BLOCKS_RAW_COPPER = register("storage_blocks/raw_copper");
	public static final TagKey<Item> STORAGE_BLOCKS_RAW_GOLD = register("storage_blocks/raw_gold");
	public static final TagKey<Item> STORAGE_BLOCKS_RAW_IRON = register("storage_blocks/raw_iron");
	public static final TagKey<Item> STORAGE_BLOCKS_REDSTONE = register("storage_blocks/redstone");
	public static final TagKey<Item> STORAGE_BLOCKS_SLIME = register("storage_blocks/slime");
	public static final TagKey<Item> STORAGE_BLOCKS_WHEAT = register("storage_blocks/wheat");

	// Other
	public static final TagKey<Item> PLAYER_WORKSTATIONS_CRAFTING_TABLES = register("player_workstations/crafting_tables");
	public static final TagKey<Item> PLAYER_WORKSTATIONS_FURNACES = register("player_workstations/furnaces");
	public static final TagKey<Item> STRINGS = register("strings");
	/**
	 * For rod-like materials to be used in recipes.
	 */
	public static final TagKey<Item> RODS = register("rods");
	/**
	 * For stick-like materials to be used in recipes.
	 * One example is a mod adds stick variants such as Spruce Sticks but would like stick recipes to be able to use it.
	 */
	public static final TagKey<Item> WOODEN_RODS = register("rods/wooden");
	public static final TagKey<Item> BLAZE_RODS = register("rods/blaze");
	public static final TagKey<Item> BREEZE_RODS = register("rods/breeze");
	public static final TagKey<Item> ROPES = register("ropes");
	public static final TagKey<Item> CHAINS = register("chains");

	/**
	 * Tag that holds all items that recipe viewers should not show to users.
	 */
	public static final TagKey<Item> HIDDEN_FROM_RECIPE_VIEWERS = register("hidden_from_recipe_viewers");

	private static TagKey<Item> register(String tagId) {
		return TagRegistration.ITEM_TAG.registerC(tagId);
	}
}
