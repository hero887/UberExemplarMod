package com.minecraftuberverse.uberexemplar;

import igwmod.api.WikiRegistry;

public class IGWHandler
{
	public static void init()
	{
		WikiRegistry.registerWikiTab(new UberTab());
	}
}
