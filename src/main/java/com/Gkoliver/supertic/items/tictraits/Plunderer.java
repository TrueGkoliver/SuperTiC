package com.Gkoliver.supertic.items.tictraits;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class Plunderer extends AbstractTrait {
	public static final Plunderer plunderer = new Plunderer("plunderer", 0x940000);
	public Plunderer(String identifier, int color) {
		super(identifier, color);
		
		// TODO Auto-generated constructor stub
	}
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, boolean isCritical) {
		EntityTNTPrimed xyz = new EntityTNTPrimed(player.world);
		xyz.setFuse(5000);
		player.world.spawnEntity(xyz);
		xyz.posX = target.posX;
		xyz.posZ = target.posZ;
		xyz.posY = target.posY + 5;
		while(xyz.getFuse() >= 2500) {
			xyz.posX = target.posX;
			xyz.posZ = target.posZ;
			xyz.posY = target.posY + 5;
		}
		while(xyz.getFuse() <= 2500) {
			xyz.posX = target.posX;
			xyz.posZ = target.posZ;
		}
		
	}

}
