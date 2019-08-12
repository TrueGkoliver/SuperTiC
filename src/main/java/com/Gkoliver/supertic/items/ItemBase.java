package com.Gkoliver.supertic.items;

import java.util.List;

import com.Gkoliver.supertic.Main;
import com.Gkoliver.supertic.init.ModItems;
import com.Gkoliver.supertic.util.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.Gkoliver.supertic.creativetabs.*;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(GkCreativeTabs.GK_SUPER_TIC_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	public void onHarvestBlock(ItemStack stack, World world, IBlockState state, BlockPos pos, EntityPlayer entity,
			List<ItemStack> drops) {
		// TODO Auto-generated method stub
		
	}
	
	
}
