package net.firebrandomega.pirate.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.firebrandomega.pirate.registry.ModBlocks;
import net.firebrandomega.pirate.registry.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_LEAVES);
        blockStateModelGenerator.registerBuiltin(ModelIds.getMinecraftNamespacedBlock("pirate_chest"), ModBlocks.PALM_PLANKS).includeWithoutItem(ModBlocks.PIRATE_CHEST);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PALM_LOG, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRIPPED_PALM_LOG, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALM_PLANKS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALM_WOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRIPPED_PALM_WOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALM_LEAVES, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIRATE_CHEST, Models.GENERATED);
    }
}
