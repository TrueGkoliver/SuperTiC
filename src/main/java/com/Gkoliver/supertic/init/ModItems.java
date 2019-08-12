package com.Gkoliver.supertic.init;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.Gkoliver.supertic.items.ItemBase;
import com.Gkoliver.supertic.items.ItemByzantineTrident;
import com.Gkoliver.supertic.items.ItemWesternPickaxe;
import com.Gkoliver.supertic.items.byzantine_material.ByzantineSword;
import com.Gkoliver.supertic.items.byzantine_material.WestCharm;
import com.ibm.icu.util.TimeUnit;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import slimeknights.tconstruct.library.tools.ToolCore;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.ranged.item.Arrow;
import slimeknights.tconstruct.tools.ranged.item.Bolt;
import slimeknights.tconstruct.tools.ranged.item.Shuriken;
import slimeknights.tconstruct.tools.tools.Excavator;
import slimeknights.tconstruct.tools.tools.Hammer;
import slimeknights.tconstruct.tools.tools.Scythe;

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
	public static final Item WESTERN_TERROR = new ItemWesternPickaxe("western_pick") {
		@Override
		public void onHarvestBlock(final ItemStack stack, final World world, final IBlockState state, final BlockPos pos, final EntityPlayer entity,
				final List<ItemStack> drops)
		{
			System.out.println("Got to onHarvestBlock");
			final int fortune = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);

			final List<ItemStack> copy = new ArrayList<>(drops);

			for (int i = 0; i < fortune + 2; i++)
			{
				System.out.println("got to fortune loop");
				drops.addAll(copy);
			}
			
		}
		@Override
	    public boolean canHarvestBlock(IBlockState blockIn)
	    {
			return true;
	    	
	    }

	};
	//stub
	public static final Item WEST_CHARM = new WestCharm("charm_western") {
		private NonNullList<ItemStack> invarray;
		private Iterator<ItemStack> oi;
		private ItemStack thing;
		private Iterator<ItemStack> mmm;
		private Iterator<ItemStack> lll;

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
			World the_world = worldIn;
			EntityPlayer area = playerIn;
			InventoryPlayer inv = area.inventory;
			invarray = inv.mainInventory;
			oi = invarray.iterator();
			mmm = inv.armorInventory.iterator();
			
			if (playerIn.getHeldItemOffhand() != null) {
				lll = inv.offHandInventory.iterator();
				while (lll.hasNext()) {
					thing = lll.next();
					if (thing.isItemDamaged()) {
						thing.setItemDamage(0);
					}
				} 
			}
			
			
			while (oi.hasNext()) {
				thing = oi.next();
				if (thing.isItemDamaged()) {
					thing.setItemDamage(0);
				}
			}
			while (mmm.hasNext()) {
				thing = mmm.next();
				if (thing.isItemDamaged()) {
					thing.setItemDamage(0);
				}
			}
	        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	    }

	};
	//no u
	public static final Item ROMA_CHARM = new WestCharm("charm_roma") {
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
			float closest = Float.MAX_VALUE;
			Entity thisOne=null;
			for (int i = 0; i < worldIn.loadedEntityList.size(); i++)
			{
				System.out.println("Got to mob list loaded");
				if (((Entity)worldIn.loadedEntityList.get(i)).getDistance(playerIn)<closest)
				{
					System.out.println("Got to getting distance");
					System.out.println(worldIn.loadedEntityList.get(i));
					if (worldIn.loadedEntityList.get(i) instanceof EntityMob) //if it is a mob...
					{
						System.out.println("Got to closest");
						closest = ((Entity)worldIn.loadedEntityList.get(i)).getDistance(playerIn);
						thisOne = ((Entity)worldIn.loadedEntityList.get(i));
					}
				}
			}
			if (thisOne!=null)
			{
				worldIn.addWeatherEffect(new EntityLightningBolt(worldIn,thisOne.posX,thisOne.posY, thisOne.posZ, false));
				System.out.println(thisOne);
			}
			return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	    }
	};
	static int cooldown = 0;
	public static final Item WEST_SWORD = new WestCharm("sword_west") {
		@SubscribeEvent
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
			if (!worldIn.isRemote) {
				if (cooldown == 0) {
					Vec3d motion = playerIn.getLookVec();
					double motionX = motion.x;
					double motionY = motion.y;
					double motionZ = motion.z;
					double accX = motionX * 0.1;
					double accY = motionY * 0.1;
					double accZ = motionZ * 0.1;
					EntityLargeFireball fireball = new EntityLargeFireball(playerIn.world, playerIn.posX, playerIn.posY, playerIn.posZ, accX, accY, accZ);
					fireball.motionX = motionX;
					fireball.motionY = motionY;
					fireball.motionZ = motionZ;
					fireball.explosionPower = 2;
					worldIn.spawnEntity(fireball);
					for (int i = 0; i < 5; i++) {
						//System.out.println("Debug fireball");
						Random xyz = new Random();
						double xrand = xyz.nextDouble() + xyz.nextInt(10-5);
						double yrand = xyz.nextDouble() + xyz.nextInt(10)-5;
						double zrand = xyz.nextDouble() + xyz.nextInt(10)-5;
						Vec3d pmotion = playerIn.getLookVec();
						double pmotionX = motion.x + xyz.nextDouble() + xyz.nextInt(6)-3;
						double pmotionY = motion.y + xyz.nextDouble() + xyz.nextInt(6)-3;
						double pmotionZ = motion.z + xyz.nextDouble() + xyz.nextInt(6)-3;
						double paccX = pmotionX * 0.1;
						double paccY = pmotionY * 0.1;
						double paccZ = pmotionZ * 0.1;
						EntityLargeFireball pfireball = new EntityLargeFireball(playerIn.world, playerIn.posX+xrand, playerIn.posY+yrand, playerIn.posZ+zrand, paccX, paccY, paccZ);
						pfireball.motionX = pmotionX;
						pfireball.motionY = pmotionY;
						pfireball.motionZ = pmotionZ;
						pfireball.explosionPower = 2;
						worldIn.spawnEntity(pfireball);
					}
					cooldown = 10;
				}
				
		    }
			return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
		
	    }
		@SubscribeEvent
		public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
			if (cooldown > 0) {
				cooldown--;
			}
			
		}

	}; 
	public static final Item EAST_GODLIKE = new WestCharm("east_god") {
		@SubscribeEvent
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
			for(int i = 0; i < playerIn.inventory.getSizeInventory(); i++){
				ItemStack curStack = playerIn.inventory.getStackInSlot(i);
				if (curStack.getItem() instanceof ToolCore) {
					ToolCore x = (ToolCore) curStack.getItem();
					for(int r = 0; r < 100; r++) {
						TinkerModifiers.modBaneOfArthopods.apply(curStack);
						TinkerModifiers.modSmite.apply(curStack);
						TinkerModifiers.modLuck.apply(curStack);
						TinkerModifiers.modNecrotic.apply(curStack);
						TinkerModifiers.modReinforced.apply(curStack);
						TinkerModifiers.modDiamond.apply(curStack);
						TinkerModifiers.modEmerald.apply(curStack);
					}
					boolean instance_shuriken = (curStack.getItem() instanceof Shuriken);
					boolean instance_arrow = (curStack.getItem() instanceof Arrow);
					boolean instance_bolt = (curStack.getItem() instanceof Bolt);
					boolean instance_hammer = (curStack.getItem() instanceof Hammer);
					boolean instance_scythe = (curStack.getItem() instanceof Scythe);
					boolean instance_excavator = (curStack.getItem() instanceof Excavator);
					if (instance_shuriken || instance_arrow || instance_bolt) {
						TinkerModifiers.modFins.apply(curStack);
					} else {
						TinkerModifiers.modHaste.apply(curStack);
						TinkerModifiers.modBeheading.apply(curStack);
						
					}
					if (instance_hammer || instance_scythe || instance_excavator) {
						TinkerModifiers.modHarvestWidth.apply(curStack);
						TinkerModifiers.modHarvestHeight.apply(curStack);
					}
				}
				
			}
			return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	    }
	};
	public static final Item EAST_CREATOR = new WestCharm("east_creator") {
		@SubscribeEvent
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
			for(int i = 0; i < playerIn.inventory.getSizeInventory(); i++){
				ItemStack curStack = playerIn.inventory.getStackInSlot(i);
				if (curStack.getItem() instanceof ToolCore) {
					ToolCore x = (ToolCore) curStack.getItem();
					for (int boa = 0; boa < 120; boa++) {TinkerModifiers.modBaneOfArthopods.apply(curStack);}
					for (int smite = 0; smite < 120; smite++) {TinkerModifiers.modSmite.apply(curStack);}
					for (int reinforced = 0; reinforced < 5; reinforced++) {TinkerModifiers.modReinforced.apply(curStack);}
					for (int sharp = 0; sharp < 360; sharp++) {TinkerModifiers.modSharpness.apply(curStack);}
					for (int luck = 0; luck < 360; luck++) {TinkerModifiers.modLuck.apply(curStack);}
						//
						//
						//
						//
						
					
					
					//
					for (int b = 0; b < 10; b++) {
						TinkerModifiers.modNecrotic.apply(curStack);
						TinkerModifiers.modBeheading.apply(curStack);
					}
					boolean instance_shuriken = (curStack.getItem() instanceof Shuriken);
					boolean instance_arrow = (curStack.getItem() instanceof Arrow);
					boolean instance_bolt = (curStack.getItem() instanceof Bolt);
					boolean instance_hammer = (curStack.getItem() instanceof Hammer);
					boolean instance_scythe = (curStack.getItem() instanceof Scythe);
					boolean instance_excavator = (curStack.getItem() instanceof Excavator);
					if (instance_shuriken || instance_arrow || instance_bolt) {
						TinkerModifiers.modFins.apply(curStack);
					} else {
						for (int aa = 0; aa < 5; aa++) {
							TinkerModifiers.modHaste.apply(curStack);
						}
						
						
						
					
					if (instance_hammer || instance_scythe || instance_excavator) {
						TinkerModifiers.modHarvestWidth.apply(curStack);
						TinkerModifiers.modHarvestHeight.apply(curStack);
					}
					TinkerModifiers.modDiamond.apply(curStack);
					TinkerModifiers.modEmerald.apply(curStack);
				}
				
			}
		
	    }
		return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	};
	
	
};
}
