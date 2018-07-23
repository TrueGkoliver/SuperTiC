package com.Gkoliver.supertic.blocks;

import com.Gkoliver.supertic.Main;
import com.Gkoliver.supertic.creativetabs.GkCreativeTabs;
import com.Gkoliver.supertic.init.ModBlocks;
import com.Gkoliver.supertic.init.ModItems;
import com.Gkoliver.supertic.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(GkCreativeTabs.GK_SUPER_TIC_TAB);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
