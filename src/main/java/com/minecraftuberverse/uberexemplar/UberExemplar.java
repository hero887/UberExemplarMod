package com.minecraftuberverse.uberexemplar;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = "required-after:IGWMod@1.2.0-27")
public class UberExemplar
{
	@Instance
	public static UberExemplar instance;

	@SidedProxy(clientSide = "com.minecraftuberverse.uberexemplar.ClientProxy", serverSide = "com.minecraftuberverse.uberexemplar.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
	}
}