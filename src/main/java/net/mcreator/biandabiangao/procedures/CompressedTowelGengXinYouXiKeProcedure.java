package net.mcreator.biandabiangao.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.biandabiangao.init.BiandabiangaoModBlocks;

public class CompressedTowelGengXinYouXiKeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() instanceof LiquidBlock) {
			world.setBlock(new BlockPos(x, y + 1, z), BiandabiangaoModBlocks.COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() instanceof LiquidBlock) {
			world.setBlock(new BlockPos(x, y - 1, z), BiandabiangaoModBlocks.COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() instanceof LiquidBlock) {
			world.setBlock(new BlockPos(x + 1, y, z), BiandabiangaoModBlocks.COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() instanceof LiquidBlock) {
			world.setBlock(new BlockPos(x - 1, y, z), BiandabiangaoModBlocks.COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() instanceof LiquidBlock) {
			world.setBlock(new BlockPos(x, y, z + 1), BiandabiangaoModBlocks.COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() instanceof LiquidBlock) {
			world.setBlock(new BlockPos(x, y, z - 1), BiandabiangaoModBlocks.COMPRESSED_TOWEL.get().defaultBlockState(), 3);
		}
	}
}
