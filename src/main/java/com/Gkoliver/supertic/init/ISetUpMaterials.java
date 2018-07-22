package com.Gkoliver.supertic.init;

import java.util.ArrayList;

import com.Gkoliver.supertic.items.tictraits.HammerAndSickle;

import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.fluid.FluidMolten;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.tinkering.MaterialItem;

public interface ISetUpMaterials {
	public static void setup() {
		Material communism = new Material("communism", TextFormatting.AQUA);
		Material super_quick = new Material("super_quick", TextFormatting.AQUA);
		Material super_hurt = new Material("super_hurt", TextFormatting.AQUA);
		ArrayList<Material> list_of_materials = new ArrayList<Material>();
		
		
		
		communism.addItem(ModItems.COMMUNISM_INGOT, 1, Material.VALUE_Ingot);
		super_quick.addItem(ModItems.SUPER_QUICK_INGOT, 1, Material.VALUE_Ingot);
		super_hurt.addItem(ModItems.SUPER_PAIN_INGOT, 1, Material.VALUE_Ingot);
		
		communism.setCraftable(true);
		
		communism.addTrait(HammerAndSickle.hammer_sickle);
		
		list_of_materials.add(communism);
		list_of_materials.add(super_quick);
		list_of_materials.add(super_hurt);

	}


}
