package com.minecraftuberverse.uberexemplar;

import net.minecraftforge.fml.common.event.FMLInterModComms;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init()
	{
		super.init();
		FMLInterModComms.sendMessage("IGWMod", "com.minecraftuberverse.uberexemplar.IGWHandler",
				"init");
	}
}
