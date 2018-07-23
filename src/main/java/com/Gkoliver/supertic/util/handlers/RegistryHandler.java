package com.Gkoliver.supertic.util.handlers;

import com.Gkoliver.supertic.init.ModBlocks;
import com.Gkoliver.supertic.init.ModItems;

import com.Gkoliver.supertic.util.IHasModel;
import com.Gkoliver.supertic.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;


@EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
@SideOnly(Side.CLIENT)

public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}

	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) 
	{
		for (Item item : ModItems.ITEMS)
		{
			if (item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		for (Block block : ModBlocks.BLOCKS)
		{
			if (block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}

	}
}
