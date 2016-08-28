package com.minecraftuberverse.uberexemplar;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModAccessor
{
	public static boolean isModLoaded(String modId)
	{
		return Loader.isModLoaded(modId);
	}

	public static Item findItem(String modId, String itemId)
	{
		return GameRegistry.findItem(modId, itemId);
	}

	public static Block findBlock(String modId, String blockId)
	{
		return GameRegistry.findBlock(modId, blockId);
	}
}
