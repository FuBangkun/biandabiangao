
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biandabiangao.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.biandabiangao.block.SuperCompressedTowelBlock;
import net.mcreator.biandabiangao.block.CompressedTowelBlock;
import net.mcreator.biandabiangao.BiandabiangaoMod;

public class BiandabiangaoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BiandabiangaoMod.MODID);
	public static final RegistryObject<Block> COMPRESSED_TOWEL = REGISTRY.register("compressed_towel", () -> new CompressedTowelBlock());
	public static final RegistryObject<Block> SUPER_COMPRESSED_TOWEL = REGISTRY.register("super_compressed_towel",
			() -> new SuperCompressedTowelBlock());
}
