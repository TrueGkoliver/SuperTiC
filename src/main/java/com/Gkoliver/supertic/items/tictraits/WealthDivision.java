package com.Gkoliver.supertic.items.tictraits;

import java.util.ListIterator;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import slimeknights.tconstruct.library.traits.AbstractTrait;
import slimeknights.tconstruct.library.utils.ToolHelper;

public class WealthDivision extends AbstractTrait {
	public final static WealthDivision wealth_division = new WealthDivision();
	public WealthDivision() {
		super("wealth_division",0x6d0101);
	}
	public void blockHarvestDrops(ItemStack tool, BlockEvent.HarvestDropsEvent event, EntityLivingBase player) {
	    if(ToolHelper.isToolEffective2(tool, event.getState())) {
	      // go through the drops and replace them with their furnace'd variant if applicable
	      ListIterator<ItemStack> iter = event.getDrops().listIterator();
	      while (iter.hasNext()) {
	    	  ItemStack drop = iter.next();
	    	  EntityPlayer the_player = (EntityPlayer) player;
	    	  final InventoryPlayer theinventory = the_player.inventory;
	    	  ListIterator<ItemStack> inventory = theinventory.mainInventory.listIterator();
	    	  while (inventory.hasNext()) {
	    		  ItemStack the_item = inventory.next();
	    		  if (the_item == drop) {
	    			  System.out.println(the_item == drop);
	    			  theinventory.mainInventory.add(drop);
	    		  }
	    	  }
	    	  
	      }
	    }
	  }

}
