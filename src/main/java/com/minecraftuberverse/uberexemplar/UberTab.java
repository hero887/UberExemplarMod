package com.minecraftuberverse.uberexemplar;

import igwmod.gui.GuiWiki;
import net.minecraft.item.ItemStack;

public class UberTab extends BaseTab
{
	public UberTab()
	{
		super("ubertab");

		// add stuff to page list
		this.addSectionHeader("UAC0");
		this.pageEntries.add("UAC1");
	}

	@Override
	public ItemStack renderTabIcon(GuiWiki gui)
	{
		return null;// TODO replace with new ItemStack("insert item or block
					// here");
	}
}
