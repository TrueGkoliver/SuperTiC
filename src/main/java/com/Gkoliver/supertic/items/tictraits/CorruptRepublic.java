package com.Gkoliver.supertic.items.tictraits;

import java.util.Random;

import com.Gkoliver.supertic.init.ModBlocks;

import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class CorruptRepublic extends AbstractTrait {
	public static final CorruptRepublic corruptempire = new CorruptRepublic("corrupt_empire", TextFormatting.BLACK);
	public CorruptRepublic(String identifier, TextFormatting color) {
		super(identifier, color);
		// TODO Auto-generated constructor stub
	}
	public void CorruptBlock(PlayerInteractEvent.RightClickBlock event) {
		Random the_random = new Random();
		int Chance = the_random.nextInt(5);
		BlockStateContainer thing = ModBlocks.COMMUNISM_BLOCK.getBlockState();
		BlockPos pos_block = event.getPos();
		World the_world = event.getWorld();
		the_world.setBlockState(pos_block, thing.getBaseState());
	}

}
