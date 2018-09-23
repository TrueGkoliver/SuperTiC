package com.Gkoliver.supertic.items.tictraits;

import java.util.Random;

import com.Gkoliver.supertic.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class CorruptRepublic extends AbstractTrait {
	public static final CorruptRepublic corruptempire = new CorruptRepublic("corrupt_empire", TextFormatting.BLACK);
	public CorruptRepublic(String identifier, TextFormatting color) {
		super(identifier, color);
		// TODO Auto-generated constructor stub
	}
	public void beforeBlockBreak(ItemStack tool, BlockEvent.BreakEvent event) {
		Random the_random = new Random();
		int Chance = the_random.nextInt(4);
		BlockStateContainer thing = ModBlocks.COMMUNISM_BLOCK.getBlockState();
		BlockPos pos_block = event.getPos();
		World the_world = event.getWorld();
		System.out.println(Chance);
		
		
		//Diamond
		BlockStateContainer diamond = Block.getBlockById(57).getBlockState();
		//Emerald
		BlockStateContainer emerald = Block.getBlockById(133).getBlockState();
		//Quartz
		BlockStateContainer quartz = Block.getBlockById(155).getBlockState();
		//Gold
		BlockStateContainer gold = Block.getBlockById(41).getBlockState();
		
		if (Chance == 1) {
			the_world.setBlockState(pos_block, quartz.getBaseState());	
		}
		else if (Chance == 2) {
			the_world.setBlockState(pos_block, diamond.getBaseState());	
			
		} else if (Chance == 3) {
			the_world.setBlockState(pos_block, emerald.getBaseState());	
			
		} else if (Chance == 0) {
			the_world.setBlockState(pos_block, gold.getBaseState());
		}
		
		
		
	}

}
