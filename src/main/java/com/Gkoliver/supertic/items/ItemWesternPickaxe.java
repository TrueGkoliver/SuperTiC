package com.Gkoliver.supertic.items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemWesternPickaxe extends ItemBase {
	public ItemWesternPickaxe(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.setHarvestLevel("pickaxe", 5);
		this.setHarvestLevel("shovel", 5);
		this.setHarvestLevel("axe", 5);
	}
	@Override
	public void onHarvestBlock(final ItemStack stack, final World world, final IBlockState state, final BlockPos pos, final EntityPlayer entity,
			final List<ItemStack> drops)
	{
		final int fortune = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);

		final List<ItemStack> copy = new ArrayList<>(drops);

		for (int i = 0; i < fortune + 2; i++)
		{
			drops.addAll(copy);
		}
		
	}
	



}
