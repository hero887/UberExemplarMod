package com.minecraftuberverse.uberexemplar;

import igwmod.gui.GuiWiki;
import net.minecraft.item.ItemStack;

public class UberTab extends BaseTab
{
	public UberTab()
	{
		super("ubertab");

		// add stuff to page list
		this.addSectionHeader("test");
		this.pageEntries.add("test3");
		this.pageEntries.add("test4");
		this.addSectionHeader("test2");
		this.pageEntries.add("test5");
		this.pageEntries.add("test6");
	}

	@Override
	public ItemStack renderTabIcon(GuiWiki gui)
	{
		return null;// TODO replace with new ItemStack("insert item or block
					// here");
	}
}
