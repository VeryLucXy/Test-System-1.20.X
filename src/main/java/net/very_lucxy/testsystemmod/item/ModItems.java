package net.very_lucxy.testsystemmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.very_lucxy.testsystemmod.TestSystemMod;

public class ModItems {

    public static final Item STEEL = registerItem("steel", new Item(new FabricItemSettings()));
    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(STEEL);
        entries.add(RAW_STEEL);
    }

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(TestSystemMod.MOD_ID, name), item);

    }

    public static void registerModItems() {
        TestSystemMod.LOGGER.info("Registering Mod Items for " + TestSystemMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

}
