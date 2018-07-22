package com.Gkoliver.supertic.items.tictraits;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;

import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.traits.AbstractTrait;
import slimeknights.tconstruct.tools.harvest.TinkerHarvestTools;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;


public class HammerAndSickle extends AbstractTrait {
	
	public static final HammerAndSickle hammer_sickle = new HammerAndSickle();
	public HammerAndSickle() {
		super("hammerandsickle",0x6d0101);
	}
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) {
		if(player instanceof EntityPlayer){
			EntityPlayer theplayer = (EntityPlayer) player;
			final InventoryPlayer theinventory = theplayer.inventory;
			final boolean hammer = theinventory.hasItemStack(new ItemStack(TinkerHarvestTools.hammer));
			final boolean sickle = theinventory.hasItemStack(new ItemStack(TinkerHarvestTools.scythe));
			System.out.println("Test");
			System.out.println(hammer);
			System.out.println(sickle);
			if (hammer && sickle) {
				World playerworld = theplayer.getEntityWorld();
				playerworld.createExplosion(theplayer, theplayer.posX, theplayer.posY, theplayer.posZ, 2, true);
				System.out.println("HMMMM");
			}
					
		}
		
	}


}

