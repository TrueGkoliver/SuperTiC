package com.Gkoliver.supertic.blocks;

import com.Gkoliver.supertic.creativetabs.GkCreativeTabs;
import com.Gkoliver.supertic.init.ModItems;
import com.Gkoliver.supertic.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material) {
		super(material);
		this.setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(GkCreativeTabs.GK_SUPER_TIC_TAB);

		
		
		
	}


	@Override
	public void registerModels() {
		
	}

}
