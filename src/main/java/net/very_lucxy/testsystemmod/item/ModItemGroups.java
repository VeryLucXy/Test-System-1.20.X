package net.very_lucxy.testsystemmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.very_lucxy.testsystemmod.TestSystemMod;

public class ModItemGroups {

    public static final ItemGroup STEEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestSystemMod.MOD_ID, "steel"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.steel"))
                    .icon(() -> new ItemStack(ModItems.STEEL))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.STEEL);
                        entries.add(ModItems.RAW_STEEL);

                    }).build());

    public static void registerItemGroups() {
        TestSystemMod.LOGGER.info("Registering Item Groups for " + TestSystemMod.MOD_ID);
    }

}