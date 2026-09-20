package me.manossef.newwalls;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class NewWallsBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NewWalls.MODID);
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks", SoundType.STONE, 1.5F, 6.0F, MapColor.DIRT);
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_SLAB = registerSlab("polished_granite_brick_slab", SoundType.STONE, 1.5F, 6.0F, MapColor.DIRT);
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_STAIRS = registerStairs("polished_granite_brick_stairs", POLISHED_GRANITE_BRICKS, SoundType.STONE, 1.5F, 6.0F, MapColor.DIRT);
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_WALL = registerWall("polished_granite_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.DIRT);
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks", SoundType.STONE, 1.5F, 6.0F,MapColor.QUARTZ);
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_SLAB = registerSlab("polished_diorite_brick_slab", SoundType.STONE, 1.5F, 6.0F, MapColor.QUARTZ);
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_STAIRS = registerStairs("polished_diorite_brick_stairs", POLISHED_DIORITE_BRICKS, SoundType.STONE, 1.5F, 6.0F, MapColor.QUARTZ);
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_WALL = registerWall("polished_diorite_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.QUARTZ);
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_SLAB = registerSlab("polished_andesite_brick_slab", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_STAIRS = registerStairs("polished_andesite_brick_stairs", POLISHED_ANDESITE_BRICKS, SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_WALL = registerWall("polished_andesite_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> QUARTZ_WALL = registerWall("quartz_wall", SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final RegistryObject<Block> PURPUR_WALL = registerWall("purpur_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.COLOR_MAGENTA);
    public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = registerWall("prismarine_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.DIAMOND);
    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = registerWall("dark_prismarine_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.DIAMOND);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = registerWall("smooth_sandstone_wall", SoundType.STONE, 2.0F, 6.0F, MapColor.SAND);
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = registerWall("smooth_red_sandstone_wall", SoundType.STONE, 2.0F, 6.0F, MapColor.COLOR_ORANGE);
    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = registerWall("smooth_quartz_wall", SoundType.STONE, 2.0F, 6.0F, MapColor.QUARTZ);
    public static final RegistryObject<Block> STONE_WALL = registerWall("stone_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerWall("polished_granite_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.DIRT);
    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerWall("polished_diorite_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.QUARTZ);
    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerWall("polished_andesite_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerStairs("smooth_stone_stairs", () -> Blocks.SMOOTH_STONE, SoundType.STONE, 2.0F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> SMOOTH_STONE_WALL = registerWall("smooth_stone_wall", SoundType.STONE, 2.0F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = registerStairs("cut_sandstone_stairs", () -> Blocks.CUT_SANDSTONE, SoundType.STONE, 0.8F, 0.8F, MapColor.SAND);
    public static final RegistryObject<Block> CUT_SANDSTONE_WALL = registerWall("cut_sandstone_wall", SoundType.STONE, 0.8F, 0.8F, MapColor.SAND);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = registerStairs("cut_red_sandstone_stairs", () -> Blocks.CUT_RED_SANDSTONE, SoundType.STONE, 0.8F, 0.8F, MapColor.COLOR_ORANGE);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = registerWall("cut_red_sandstone_wall", SoundType.STONE, 0.8F, 0.8F, MapColor.COLOR_ORANGE);
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = registerSlab("cracked_stone_brick_slab", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = registerStairs("cracked_stone_brick_stairs", () -> Blocks.CRACKED_STONE_BRICKS, SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_WALL = registerWall("cracked_stone_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_SLAB = registerSlab("cracked_nether_brick_slab", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_STAIRS = registerStairs("cracked_nether_brick_stairs", () -> Blocks.CRACKED_NETHER_BRICKS, SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_WALL = registerWall("cracked_nether_brick_wall", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_FENCE = registerFence("cracked_nether_brick_fence", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_FENCE_GATE = registerFenceGate("cracked_nether_brick_fence_gate", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
    public static final RegistryObject<Block> RED_NETHER_BRICK_FENCE = registerFence("red_nether_brick_fence", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final RegistryObject<Block> RED_NETHER_BRICK_FENCE_GATE = registerFenceGate("red_nether_brick_fence_gate", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
    public static final RegistryObject<Block> NETHER_BRICK_FENCE_GATE = registerFenceGate("nether_brick_fence_gate", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerSlab("cracked_polished_blackstone_brick_slab", SoundType.STONE, 1.5F, 6.0F, MapColor.COLOR_BLACK);
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerStairs("cracked_polished_blackstone_brick_stairs", () -> Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, SoundType.STONE, 1.5F, 6.0F, MapColor.COLOR_BLACK);
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerWall("cracked_polished_blackstone_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.COLOR_BLACK);
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = registerSlab("quartz_brick_slab", SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = registerStairs("quartz_brick_stairs", () -> Blocks.QUARTZ_BRICKS, SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final RegistryObject<Block> QUARTZ_BRICK_WALL = registerWall("quartz_brick_wall", SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final RegistryObject<Block> QUARTZ_BRICK_FENCE = registerFence("quartz_brick_fence", SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final RegistryObject<Block> QUARTZ_BRICK_FENCE_GATE = registerFenceGate("quartz_brick_fence_gate", SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_SLAB = registerSlab("cracked_deepslate_brick_slab", SoundType.DEEPSLATE_BRICKS, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = registerStairs("cracked_deepslate_brick_stairs", () -> Blocks.CRACKED_DEEPSLATE_BRICKS, SoundType.DEEPSLATE_BRICKS, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_WALL = registerWall("cracked_deepslate_brick_wall", SoundType.DEEPSLATE_BRICKS, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_SLAB = registerSlab("cracked_deepslate_tile_slab", SoundType.DEEPSLATE_TILES, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_STAIRS = registerStairs("cracked_deepslate_tile_stairs", () -> Blocks.CRACKED_DEEPSLATE_TILES, SoundType.DEEPSLATE_TILES, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_WALL = registerWall("cracked_deepslate_tile_wall", SoundType.DEEPSLATE_TILES, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final RegistryObject<Block> TUFF_SLAB = registerSlab("tuff_slab", SoundType.TUFF, 1.5F, 6.0F, MapColor.TERRACOTTA_GRAY);
    public static final RegistryObject<Block> TUFF_STAIRS = registerStairs("tuff_stairs", () -> Blocks.TUFF, SoundType.TUFF, 1.5F, 6.0F, MapColor.TERRACOTTA_GRAY);
    public static final RegistryObject<Block> TUFF_WALL = registerWall("tuff_wall", SoundType.TUFF, 1.5F, 6.0F, MapColor.TERRACOTTA_GRAY);
    public static final RegistryObject<Block> CALCITE_SLAB = registerSlab("calcite_slab", SoundType.CALCITE, 0.75F, 0.75F, MapColor.TERRACOTTA_WHITE);
    public static final RegistryObject<Block> CALCITE_STAIRS = registerStairs("calcite_stairs", () -> Blocks.CALCITE, SoundType.CALCITE, 0.75F, 0.75F, MapColor.TERRACOTTA_WHITE);
    public static final RegistryObject<Block> CALCITE_WALL = registerWall("calcite_wall", SoundType.CALCITE, 0.75F, 0.75F, MapColor.TERRACOTTA_WHITE);
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerSlab("smooth_basalt_slab", SoundType.BASALT, 1.25F, 4.2F, MapColor.COLOR_BLACK);
    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerStairs("smooth_basalt_stairs", () -> Blocks.SMOOTH_BASALT, SoundType.BASALT, 1.25F, 4.2F, MapColor.COLOR_BLACK);
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerWall("smooth_basalt_wall", SoundType.BASALT, 1.25F, 4.2F, MapColor.COLOR_BLACK);
    public static final RegistryObject<Block> END_STONE_SLAB = registerSlab("end_stone_slab", SoundType.STONE, 3.0F, 9.0F, MapColor.SAND);
    public static final RegistryObject<Block> END_STONE_STAIRS = registerStairs("end_stone_stairs", () -> Blocks.END_STONE, SoundType.STONE, 3.0F, 9.0F, MapColor.SAND);
    public static final RegistryObject<Block> END_STONE_WALL = registerWall("end_stone_wall", SoundType.STONE, 3.0F, 9.0F, MapColor.SAND);
    public static final RegistryObject<Block> DRIPSTONE_SLAB = registerSlab("dripstone_slab", SoundType.DRIPSTONE_BLOCK, 1.5F, 1.0F, MapColor.TERRACOTTA_BROWN);
    public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerStairs("dripstone_stairs", () -> Blocks.DRIPSTONE_BLOCK, SoundType.DRIPSTONE_BLOCK, 1.5F, 1.0F, MapColor.TERRACOTTA_BROWN);
    public static final RegistryObject<Block> DRIPSTONE_WALL = registerWall("dripstone_wall", SoundType.DRIPSTONE_BLOCK, 1.5F, 1.0F, MapColor.TERRACOTTA_BROWN);

    private static RegistryObject<Block> registerBlock(String id, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return BLOCKS.register(id, () -> new Block(Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(NewWalls.MODID, id)))
            .sound(soundType)
            .strength(hardness, resistance)
            .mapColor(mapColor)
            .requiresCorrectToolForDrops()));
    }

    private static RegistryObject<Block> registerSlab(String id, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return BLOCKS.register(id, () -> new SlabBlock(Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(NewWalls.MODID, id)))
            .sound(soundType)
            .strength(hardness, resistance)
            .mapColor(mapColor)
            .requiresCorrectToolForDrops()));
    }

    private static RegistryObject<Block> registerStairs(String id, Supplier<Block> base, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return BLOCKS.register(id, () -> new StairBlock(base.get().defaultBlockState(), Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(NewWalls.MODID, id)))
            .sound(soundType)
            .strength(hardness, resistance)
            .mapColor(mapColor)
            .requiresCorrectToolForDrops()));
    }

    private static RegistryObject<Block> registerWall(String id, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return BLOCKS.register(id, () -> new WallBlock(Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(NewWalls.MODID, id)))
            .sound(soundType)
            .strength(hardness, resistance)
            .mapColor(mapColor)
            .requiresCorrectToolForDrops()));
    }

    private static RegistryObject<Block> registerFence(String id, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return BLOCKS.register(id, () -> new FenceBlock(Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(NewWalls.MODID, id)))
            .sound(soundType)
            .strength(hardness, resistance)
            .mapColor(mapColor)
            .requiresCorrectToolForDrops()));
    }

    private static RegistryObject<Block> registerFenceGate(String id, SoundType soundType, float hardness, float resistance, MapColor mapColor, SoundEvent closeSound, SoundEvent openSound) {
        return BLOCKS.register(id, () -> new FenceGateBlock(WoodType.OAK, Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(NewWalls.MODID, id)))
            .sound(soundType)
            .strength(hardness, resistance)
            .mapColor(mapColor)
            .requiresCorrectToolForDrops(), closeSound, openSound));
    }
}