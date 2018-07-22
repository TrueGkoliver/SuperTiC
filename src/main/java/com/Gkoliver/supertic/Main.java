package com.Gkoliver.supertic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import com.Gkoliver.supertic.init.ISetUpMaterials;
import com.Gkoliver.supertic.init.ModItems;
import com.Gkoliver.supertic.items.ticparts.IMake;
import com.Gkoliver.supertic.items.ticparts.PartsCommunism;
import com.Gkoliver.supertic.items.tictraits.HammerAndSickle;
import com.Gkoliver.supertic.proxy.CommonProxy;
import com.Gkoliver.supertic.util.Reference;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import slimeknights.mantle.pulsar.control.PulseManager;
import slimeknights.tconstruct.TinkerIntegration;
import slimeknights.tconstruct.common.config.Config;
import slimeknights.tconstruct.library.MaterialIntegration;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.fluid.FluidMolten;
import slimeknights.tconstruct.library.materials.Material;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, dependencies = Reference.DEPENDS)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	
	public static PulseManager pulsemanager = new PulseManager(Config.pulseConfig);
	public static final Map<String, Material> super_tic_materials = new Object2ObjectOpenHashMap<>();
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		PartsCommunism part = new PartsCommunism();
		part.preInit();
		
		
		
		
		


		
	}
	
	public static void init(FMLInitializationEvent event)
	{	
		

	}
	
	public static void PostInit(FMLPostInitializationEvent event)
	{


		
	}


}
