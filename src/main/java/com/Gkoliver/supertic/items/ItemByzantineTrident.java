package com.Gkoliver.supertic.items;

import com.Gkoliver.supertic.creativetabs.GkCreativeTabs;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;

public class ItemByzantineTrident extends ItemBase {

	public ItemByzantineTrident(String name) {
		super(name);
		setMaxStackSize(0);
		setCreativeTab(GkCreativeTabs.GK_TAB_MISC);
		
	}
	public void onItemRightClick(ItemStack itemStack, World worldIn, EntityPlayer player, EnumHand handIn)
    {
    	Vec3d exist = player.getLookVec();
    	
    	/*
    	 * TODO currently fixing things with this
    	EntityTNTPrimed tnt = new EntityTNTPrimed(world, exist.x, exist.y, exist.z, player);
    	world.spawnEntity(tnt);
    	*/
    	//TODO Fix the thing and the things
    	worldIn.createExplosion(player, player.posX, player.posY, player.posZ, 5, true);
    	System.out.println("Gott! An explosion should be happening.");
    	
    }

	

}
