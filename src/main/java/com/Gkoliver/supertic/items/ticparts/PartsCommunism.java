
package com.Gkoliver.supertic.items.ticparts;

import java.util.ArrayList;

import com.Gkoliver.supertic.Main;

import com.ibm.icu.impl.duration.impl.Utils;
import com.Gkoliver.supertic.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import slimeknights.mantle.pulsar.pulse.Pulse;
import slimeknights.tconstruct.TinkerIntegration;
import slimeknights.tconstruct.library.*;
import slimeknights.tconstruct.library.fluid.*;
import slimeknights.tconstruct.library.materials.*;
import com.Gkoliver.supertic.items.tictraits.*;
import net.minecraft.util.text.*;
import com.Gkoliver.supertic.util.Utilities;
@Pulse(id = PartsCommunism.PulseId, description = "stuff", pulsesRequired = PartsCommunism.PulseId, forced = true)
public class PartsCommunism implements IMake {
	


	public ArrayList<Material> list_of_materials;

	public final static String PulseId = "SuperTicMaterials";
	
	public void preInit() {
		
		
		Material communism = new Material("communism", TextFormatting.DARK_RED);
		Material super_quick = new Material("super_quick", TextFormatting.YELLOW);
		Material super_hurt = new Material("super_hurt", TextFormatting.RED);
		
		
		//Roman Materials
		
		Material roma_west = new Material("roma_west", 0xff6549);
		Material roma_east = new Material("roma_east", 0x512d99);
		Material roma_unity = new Material("roma_unity", 0x300001);
		
		//0.8 Traits
		roma_east.addTrait(CorruptRepublic.corruptempire);
		
		
		;
		
		communism.addItem(new ItemStack(ModItems.COMMUNISM_INGOT), 1, Material.VALUE_Ingot);
		super_quick.addItem(new ItemStack(ModItems.SUPER_QUICK_INGOT), 1, Material.VALUE_Ingot);
		super_hurt.addItem(new ItemStack(ModItems.SUPER_PAIN_INGOT), 1, Material.VALUE_Ingot);
		TinkerRegistry.addMaterialStats(communism,
                new HeadMaterialStats(130, 4.10f, 3.00f, 5),
                new HandleMaterialStats(0.50f, -50),
                new ExtraMaterialStats(25),
                new BowMaterialStats(0.2f, 0.4f, -1f)
		);
		TinkerRegistry.addMaterialStats(super_hurt, 
				new HeadMaterialStats(400, 5, 100, 5),
				new HandleMaterialStats(5, 400),
				new ExtraMaterialStats(400),
				new BowMaterialStats(0.3f, 400f, 200)
				
				);
		TinkerRegistry.addMaterialStats(super_quick, 
				new HeadMaterialStats(100, 10f, 30, 5),
				new HandleMaterialStats(5, 100),
				new ExtraMaterialStats(100),
				new BowMaterialStats(5f, 400f, 50)
				
				);
		TinkerRegistry.addMaterialStats(roma_west,
                new HeadMaterialStats(130, 4.10f, 3.00f, 5),
                new HandleMaterialStats(0.50f, -50),
                new ExtraMaterialStats(25),
                new BowMaterialStats(0.2f, 0.4f, -1f)
		);
		TinkerRegistry.addMaterialStats(roma_east,
                new HeadMaterialStats(130, 4.10f, 3.00f, 5),
                new HandleMaterialStats(0.50f, -50),
                new ExtraMaterialStats(25),
                new BowMaterialStats(0.2f, 0.4f, -1f)
		);
		TinkerRegistry.addMaterialStats(roma_unity,
                new HeadMaterialStats(130, 4.10f, 3.00f, 5),
                new HandleMaterialStats(0.50f, -50),
                new ExtraMaterialStats(25),
                new BowMaterialStats(0.2f, 0.4f, -1f)
		);

		
		
		
		communism.addTrait(HammerAndSickle.hammer_sickle);
		/*
		 * TODO Fix Wealth Division
		 * 
		 * communism.addTrait(WealthDivision.wealth_division);
		 * 
		 * 
		 * */
		
		TinkerRegistry.addMaterial(communism);
		TinkerRegistry.addMaterial(super_quick);
		TinkerRegistry.addMaterial(super_hurt);
		TinkerRegistry.addMaterial(roma_west);
		TinkerRegistry.addMaterial(roma_east);
		TinkerRegistry.addMaterial(roma_unity);
	}
	
	
	public void init2() {
	}
	

}

