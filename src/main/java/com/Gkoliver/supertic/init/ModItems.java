package com.Gkoliver.supertic.init;

import java.util.ArrayList;
import java.util.List;

import com.Gkoliver.supertic.items.ItemBase;
import com.Gkoliver.supertic.items.ItemByzantineTrident;
import com.Gkoliver.supertic.items.byzantine_material.ByzantineSword;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ModItems 
{

	public static List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item SUPER_PAIN_INGOT = new ItemBase("super_pain_ingot");
	public static final Item SUPER_QUICK_INGOT = new ItemBase("super_quick_ingot");
	public static final Item COMMUNISM_INGOT = new ItemBase("communism_ingot");
	
	public static final Item BYZANTIUM_INGOT = new ItemBase("byzantium_ingot");
	public static final Item BYZANTIUM_SWORD = new ByzantineSword("byzantium_sword") {
		private EntityLivingBase area;

		@Override
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
			World the_world = worldIn;
			area = playerIn;
			
			area.world.createExplosion(area, area.posX, area.posY, area.posZ, 5, true);
			area.setPositionAndUpdate(area.posX, (area.posY) + 6, area.posZ);
	        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	    }

	};
	
	
}
