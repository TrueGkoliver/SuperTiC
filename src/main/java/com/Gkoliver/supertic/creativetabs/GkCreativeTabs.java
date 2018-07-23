package com.Gkoliver.supertic.creativetabs;

import slimeknights.mantle.client.CreativeTab;

import com.Gkoliver.supertic.init.ModItems;
import com.Gkoliver.supertic.items.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GkCreativeTabs {
	public static final CreativeTabs GK_SUPER_TIC_TAB = new CreativeTabs("gksupertic.items") {

		@Override
		public ItemStack getTabIconItem() {
			// TODO Auto-generated method stub
			return new ItemStack(ModItems.COMMUNISM_INGOT);
		}
		
	};
	
	public static final CreativeTabs GK_TAB_MISC = new CreativeTabs("gksupertic.misc") {

		@Override
		public ItemStack getTabIconItem() {
			// TODO Auto-generated method stub
			return new ItemStack(ModItems.BYZANTIUM_SWORD);
		}
		
	};
		
}
