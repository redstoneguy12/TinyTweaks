package dev.hephaestus.tweaks.block;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class Moistener {
	public static BlockState moisten(BlockState blockState) {
		return blockState;
	}

	public static BlockState dry(BlockState blockState) {
		return blockState;
	}

	public static void canMoisten(Block in, Block out) {}
}
