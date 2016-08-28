package com.minecraftuberverse.uberexemplar;

import igwmod.api.WikiRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class IGWHandler
{
	public static void init()
	{
		if (ModAccessor.isModLoaded("tannery"))
		{
			Item i = ModAccessor.findItem("tannery", "boneknife");
			if (i != null) // Item was found!
			{
			}
			Block b = ModAccessor.findBlock("tannery", "butchersbench");
			if (b != null) // Block was found!
			{
			}
		}
		WikiRegistry.registerWikiTab(new UberTab());
	}
}
