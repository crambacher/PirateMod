package net.firebrandomega.pirate;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.firebrandomega.pirate.registry.ModBlocks;
import net.firebrandomega.pirate.registry.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PirateMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("pirate");
	public static final String MOD_ID = "pirate";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "general"),
			() -> new ItemStack(ModItems.SCIMITAR));

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();

	}
}
