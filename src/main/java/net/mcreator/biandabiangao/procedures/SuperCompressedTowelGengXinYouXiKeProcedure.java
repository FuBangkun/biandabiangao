package net.mcreator.biandabiangao.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.biandabiangao.init.BiandabiangaoModBlocks;

public class SuperCompressedTowelGengXinYouXiKeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y + 1, z), BiandabiangaoModBlocks.SUPER_COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 1, z), BiandabiangaoModBlocks.SUPER_COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z), BiandabiangaoModBlocks.SUPER_COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y, z), BiandabiangaoModBlocks.SUPER_COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z + 1), BiandabiangaoModBlocks.SUPER_COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z - 1), BiandabiangaoModBlocks.SUPER_COMPRESSED_TOWEL.get().defaultBlockState(), 3);
	}
}
