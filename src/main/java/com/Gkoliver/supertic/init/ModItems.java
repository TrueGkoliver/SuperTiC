package com.Gkoliver.supertic.init;

import java.util.ArrayList;
import java.util.List;

import com.Gkoliver.supertic.items.ItemBase;
import com.Gkoliver.supertic.items.ItemByzantineTrident;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModItems 
{

	public static List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item SUPER_PAIN_INGOT = new ItemBase("super_pain_ingot");
	public static final Item SUPER_QUICK_INGOT = new ItemBase("super_quick_ingot");
	public static final Item COMMUNISM_INGOT = new ItemBase("communism_ingot");
	
	/*public static final Item BYZANTIUM_INGOT = new ItemBase("byzantium_ingot");*/
	public static final Item BYZANTIUM_SWORD = new ItemByzantineTrident("byzantium_sword");
	
	
	
}
