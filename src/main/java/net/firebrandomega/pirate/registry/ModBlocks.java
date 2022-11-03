package net.firebrandomega.pirate.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.firebrandomega.pirate.PirateMod;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static Block PALM_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG));
    public static Block PALM_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));
    public static Block PALM_LEAVES = new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static Block PALM_SAPLING = new Block(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING));
    public static Block PALM_DOOR = new Block(FabricBlockSettings.copyOf(Blocks.OAK_DOOR));
    public static Block PALM_TRAPDOOR = new Block(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR));
    public static Block PALM_FENCE = new Block(FabricBlockSettings.copyOf(Blocks.OAK_FENCE));
    public static Block PALM_FENCE_GATE = new Block(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE));
    public static Block PALM_STAIRS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_STAIRS));
    public static Block PALM_SLAB = new Block(FabricBlockSettings.copyOf(Blocks.OAK_SLAB));
    public static Block PALM_BUTTON = new Block(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON));
    public static Block PALM_PRESSURE_PLATE = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE));
    public static Block PALM_SIGN = new Block(FabricBlockSettings.copyOf(Blocks.OAK_SIGN));
    public static Block PALM_WALL_SIGN = new Block(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN));
    public static Block PALM_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD));
    public static Block STRIPPED_PALM_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG));
    public static Block STRIPPED_PALM_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD));
    public static Block POTTED_PALM_SAPLING = new FlowerPotBlock(PALM_SAPLING, AbstractBlock.Settings.of(Material.DECORATION).breakInstantly().nonOpaque());

    public static Block PIRATE_CHEST = new ChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> BlockEntityType.CHEST);



    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_log"), PALM_LOG);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_planks"), PALM_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_leaves"), PALM_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_sapling"), PALM_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_door"), PALM_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_trapdoor"), PALM_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_fence"), PALM_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_fence_gate"), PALM_FENCE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_stairs"), PALM_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_slab"), PALM_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_button"), PALM_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_pressure_plate"), PALM_PRESSURE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_sign"), PALM_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_wall_sign"), PALM_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_wood"), PALM_WOOD);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_stripped_log"), STRIPPED_PALM_LOG);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "palm_stripped_wood"), STRIPPED_PALM_WOOD);
        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "potted_palm_sapling"), POTTED_PALM_SAPLING);


        Registry.register(Registry.BLOCK, new Identifier(PirateMod.MOD_ID, "pirate_chest"), PIRATE_CHEST);
    }
}
