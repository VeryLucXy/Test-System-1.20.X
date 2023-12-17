package net.very_lucxy.testsystemmod;

import net.fabricmc.api.ModInitializer;

import net.very_lucxy.testsystemmod.item.ModItemGroups;
import net.very_lucxy.testsystemmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSystemMod implements ModInitializer {
	public static final String MOD_ID = "testsystemmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("testsystemmod");

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

	}
}