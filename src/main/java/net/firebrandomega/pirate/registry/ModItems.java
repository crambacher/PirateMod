package net.firebrandomega.pirate.registry;

import net.firebrandomega.pirate.PirateMod;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item SCIMITAR = new SwordItem(ToolMaterials.IRON, 3, -2.4f, new Item.Settings().group(PirateMod.ITEM_GROUP));

    //Block Items
    public static final Item PALM_LOG = new BlockItem(ModBlocks.PALM_LOG, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_PLANKS = new BlockItem(ModBlocks.PALM_PLANKS, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_LEAVES = new BlockItem(ModBlocks.PALM_LEAVES, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_SAPLING = new BlockItem(ModBlocks.PALM_SAPLING, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_DOOR = new BlockItem(ModBlocks.PALM_DOOR, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_TRAPDOOR = new BlockItem(ModBlocks.PALM_TRAPDOOR, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_FENCE = new BlockItem(ModBlocks.PALM_FENCE, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_FENCE_GATE = new BlockItem(ModBlocks.PALM_FENCE_GATE, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_STAIRS = new BlockItem(ModBlocks.PALM_STAIRS, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_SLAB = new BlockItem(ModBlocks.PALM_SLAB, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_PRESSURE_PLATE = new BlockItem(ModBlocks.PALM_PRESSURE_PLATE, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_BUTTON = new BlockItem(ModBlocks.PALM_BUTTON, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_SIGN = new BlockItem(ModBlocks.PALM_SIGN, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_WALL_SIGN = new BlockItem(ModBlocks.PALM_WALL_SIGN, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item PALM_WOOD = new BlockItem(ModBlocks.PALM_WOOD, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item STRIPPED_PALM_LOG = new BlockItem(ModBlocks.STRIPPED_PALM_LOG, new Item.Settings().group(PirateMod.ITEM_GROUP));
    public static final Item STRIPPED_PALM_WOOD = new BlockItem(ModBlocks.STRIPPED_PALM_WOOD, new Item.Settings().group(PirateMod.ITEM_GROUP));

    public static final Item PIRATE_CHEST = new BlockItem(ModBlocks.PIRATE_CHEST, new Item.Settings().group(PirateMod.ITEM_GROUP));




    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "scimitar"), SCIMITAR);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_log"), PALM_LOG);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_planks"), PALM_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_leaves"), PALM_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_sapling"), PALM_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_door"), PALM_DOOR);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_trapdoor"), PALM_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_fence"), PALM_FENCE);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_fence_gate"), PALM_FENCE_GATE);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_stairs"), PALM_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_slab"), PALM_SLAB);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_pressure_plate"), PALM_PRESSURE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_button"), PALM_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_sign"), PALM_SIGN);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_wall_sign"), PALM_WALL_SIGN);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "palm_wood"), PALM_WOOD);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "stripped_palm_log"), STRIPPED_PALM_LOG);
        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "stripped_palm_wood"), STRIPPED_PALM_WOOD);

        Registry.register(Registry.ITEM, new Identifier(PirateMod.MOD_ID, "pirate_chest"), PIRATE_CHEST);
    }
}
