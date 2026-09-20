package me.manossef.newwalls;

import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NewWalls.MODID)
public class NewWalls {
    public static final String MODID = "newwalls";

    public NewWalls(FMLJavaModLoadingContext context) {
        BusGroup bus = context.getModBusGroup();
        NewWallsBlocks.BLOCKS.register(bus);
        NewWallsItems.ITEMS.register(bus);
        NewWallsCreativeTabs.TABS.register(bus);
    }
}