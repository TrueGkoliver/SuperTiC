package com.Gkoliver.supertic.util;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import slimeknights.tconstruct.library.materials.Material;

public class Utilities {
	public static void setDispItem(Material mat, String ore) {
		List<ItemStack> ores = OreDictionary.getOres(ore);
		if (mat == null || ores.isEmpty())
			return;
		mat.setRepresentativeItem(ores.get(0));
	}


}
