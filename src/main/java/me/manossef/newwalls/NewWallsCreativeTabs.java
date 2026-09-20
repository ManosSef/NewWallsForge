package me.manossef.newwalls;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.Row;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class NewWallsCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
        NewWalls.MODID);
    public static final RegistryObject<CreativeModeTab> NEWWALLS = TABS.register(NewWalls.MODID,
        () -> new CreativeModeTab.Builder(Row.TOP, 0).title(Component.translatable("itemGroup.newwalls"))
            .icon(() -> new ItemStack(Items.COBBLESTONE_WALL)).displayItems((_, b) -> {
                b.accept(NewWallsItems.STONE_WALL.get());
                b.accept(NewWallsItems.SMOOTH_STONE_STAIRS.get());
                b.accept(NewWallsItems.SMOOTH_STONE_WALL.get());
                b.accept(NewWallsItems.CRACKED_STONE_BRICK_STAIRS.get());
                b.accept(NewWallsItems.CRACKED_STONE_BRICK_SLAB.get());
                b.accept(NewWallsItems.CRACKED_STONE_BRICK_WALL.get());
                b.accept(NewWallsItems.POLISHED_GRANITE_WALL.get());
                b.accept(NewWallsItems.POLISHED_GRANITE_BRICKS.get());
                b.accept(NewWallsItems.POLISHED_GRANITE_BRICK_STAIRS.get());
                b.accept(NewWallsItems.POLISHED_GRANITE_BRICK_SLAB.get());
                b.accept(NewWallsItems.POLISHED_GRANITE_BRICK_WALL.get());
                b.accept(NewWallsItems.POLISHED_DIORITE_WALL.get());
                b.accept(NewWallsItems.POLISHED_DIORITE_BRICKS.get());
                b.accept(NewWallsItems.POLISHED_DIORITE_BRICK_STAIRS.get());
                b.accept(NewWallsItems.POLISHED_DIORITE_BRICK_SLAB.get());
                b.accept(NewWallsItems.POLISHED_DIORITE_BRICK_WALL.get());
                b.accept(NewWallsItems.POLISHED_ANDESITE_WALL.get());
                b.accept(NewWallsItems.POLISHED_ANDESITE_BRICKS.get());
                b.accept(NewWallsItems.POLISHED_ANDESITE_BRICK_STAIRS.get());
                b.accept(NewWallsItems.POLISHED_ANDESITE_BRICK_SLAB.get());
                b.accept(NewWallsItems.POLISHED_ANDESITE_BRICK_WALL.get());
                b.accept(NewWallsItems.CRACKED_DEEPSLATE_BRICK_STAIRS.get());
                b.accept(NewWallsItems.CRACKED_DEEPSLATE_BRICK_SLAB.get());
                b.accept(NewWallsItems.CRACKED_DEEPSLATE_BRICK_WALL.get());
                b.accept(NewWallsItems.CRACKED_DEEPSLATE_TILE_STAIRS.get());
                b.accept(NewWallsItems.CRACKED_DEEPSLATE_TILE_SLAB.get());
                b.accept(NewWallsItems.CRACKED_DEEPSLATE_TILE_WALL.get());
                b.accept(NewWallsItems.SMOOTH_SANDSTONE_WALL.get());
                b.accept(NewWallsItems.SMOOTH_RED_SANDSTONE_WALL.get());
                b.accept(NewWallsItems.CUT_SANDSTONE_STAIRS.get());
                b.accept(NewWallsItems.CUT_SANDSTONE_WALL.get());
                b.accept(NewWallsItems.CUT_RED_SANDSTONE_STAIRS.get());
                b.accept(NewWallsItems.CUT_RED_SANDSTONE_WALL.get());
                b.accept(NewWallsItems.PRISMARINE_BRICK_WALL.get());
                b.accept(NewWallsItems.DARK_PRISMARINE_WALL.get());
                b.accept(NewWallsItems.NETHER_BRICK_FENCE_GATE.get());
                b.accept(NewWallsItems.CRACKED_NETHER_BRICK_STAIRS.get());
                b.accept(NewWallsItems.CRACKED_NETHER_BRICK_SLAB.get());
                b.accept(NewWallsItems.CRACKED_NETHER_BRICK_WALL.get());
                b.accept(NewWallsItems.CRACKED_NETHER_BRICK_FENCE.get());
                b.accept(NewWallsItems.CRACKED_NETHER_BRICK_FENCE_GATE.get());
                b.accept(NewWallsItems.RED_NETHER_BRICK_FENCE.get());
                b.accept(NewWallsItems.RED_NETHER_BRICK_FENCE_GATE.get());
                b.accept(NewWallsItems.SMOOTH_BASALT_STAIRS.get());
                b.accept(NewWallsItems.SMOOTH_BASALT_SLAB.get());
                b.accept(NewWallsItems.SMOOTH_BASALT_WALL.get());
                b.accept(NewWallsItems.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
                b.accept(NewWallsItems.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get());
                b.accept(NewWallsItems.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get());
                b.accept(NewWallsItems.END_STONE_STAIRS.get());
                b.accept(NewWallsItems.END_STONE_SLAB.get());
                b.accept(NewWallsItems.END_STONE_WALL.get());
                b.accept(NewWallsItems.PURPUR_WALL.get());
                b.accept(NewWallsItems.QUARTZ_WALL.get());
                b.accept(NewWallsItems.QUARTZ_BRICK_STAIRS.get());
                b.accept(NewWallsItems.QUARTZ_BRICK_SLAB.get());
                b.accept(NewWallsItems.QUARTZ_BRICK_WALL.get());
                b.accept(NewWallsItems.QUARTZ_BRICK_FENCE.get());
                b.accept(NewWallsItems.QUARTZ_BRICK_FENCE_GATE.get());
                b.accept(NewWallsItems.SMOOTH_QUARTZ_WALL.get());
                b.accept(NewWallsItems.CALCITE_STAIRS.get());
                b.accept(NewWallsItems.CALCITE_SLAB.get());
                b.accept(NewWallsItems.CALCITE_WALL.get());
                b.accept(NewWallsItems.DRIPSTONE_STAIRS.get());
                b.accept(NewWallsItems.DRIPSTONE_SLAB.get());
                b.accept(NewWallsItems.DRIPSTONE_WALL.get());
            }).build());
}