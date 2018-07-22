package com.Gkoliver.supertic.items;

import com.Gkoliver.supertic.Main;
import com.Gkoliver.supertic.init.ModItems;
import com.Gkoliver.supertic.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
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
	
}
