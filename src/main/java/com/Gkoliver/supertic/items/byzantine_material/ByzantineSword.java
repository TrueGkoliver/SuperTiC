package com.Gkoliver.supertic.items.byzantine_material;

import com.Gkoliver.supertic.items.ItemBase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ByzantineSword extends ItemBase  {

	public ByzantineSword(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void onItemUse(ItemStack item, EntityPlayer player, World world,
		    // which block was in the target when clicked
		    int posx, int posy, int posz, 
		    // where on the target block was clicked (0.0-1.0)
		    int side, float blockx, float blocky, float blockz)
		{
		BlockPos bomb_pos;
		    
		    
		Vec3d thething = player.getLookVec();
		bomb_pos = new BlockPos(thething);
		    	
		world.createExplosion(player, bomb_pos.getX(), bomb_pos.getY(), bomb_pos.getZ(), 5, true);
		    	
		    
		System.out.println(world.getBiome(bomb_pos).getBiomeName());
		    
		    
		    
			
		}
	


}
