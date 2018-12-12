package com.Gkoliver.supertic.items.tictraits;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class WesternTrait extends AbstractTrait {
	public static final WesternTrait WESTERNER = new WesternTrait("western_trait", 0xeaffb2);
	
	public WesternTrait(String identifier, int color) {
		super(identifier, color);
		// TODO Auto-generated constructor stub
	}
	public void afterBlockBreak(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player, boolean wasEffective) {
		if (world.getBlockState(new BlockPos(pos.down())) != null) {
			world.setBlockState(pos, Blocks.FIRE.getDefaultState());
		}
	}
	

}
