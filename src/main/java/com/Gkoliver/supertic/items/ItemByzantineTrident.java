package com.Gkoliver.supertic.items;

import com.Gkoliver.supertic.creativetabs.GkCreativeTabs;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemByzantineTrident extends ItemSword {

	public ItemByzantineTrident(String name, ToolMaterial material) {
		super(material);
		setMaxStackSize(0);
		setUnlocalizedName(name);
		setRegistryName(name);

		setCreativeTab(GkCreativeTabs.GK_TAB_MISC);
		
	}
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)

    {
		EntityPlayer player = playerIn;
    	Vec3d exist = player.getLookVec();
    	ActionResult<ItemStack> result = new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
    	/*
    	 * TODO currently fixing things with this
    	EntityTNTPrimed tnt = new EntityTNTPrimed(world, exist.x, exist.y, exist.z, player);
    	world.spawnEntity(tnt);
    	*/
    	//TODO Fix the thing and the things
    	worldIn.createExplosion(player, player.posX, player.posY, player.posZ, 5, true);
    	System.out.println("Gott! An explosion should be happening.");
    	
    	return result;
    	
    	
    	
    }

	

}
