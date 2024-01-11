package net.tutial2;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial2 implements ModInitializer {
	public static  final  String MOD_ID = "tutorialmod";
    public static final Item CUSTOM_ITEM = Registry.register(Registries.ITEM, new Identifier("tutorial","custom"),
			new Item(new FabricItemSettings())
			);

	@Override
	public void onInitialize() {
	}
}