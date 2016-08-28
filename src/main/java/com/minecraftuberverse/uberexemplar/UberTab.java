package com.minecraftuberverse.uberexemplar;

import igwmod.gui.GuiWiki;
import igwmod.gui.tabs.BaseWikiTab;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class UberTab extends BaseWikiTab
{
	public UberTab()
	{
		super();
		this.addSectionHeader("test");
		this.pageEntries.add("test3");
		this.pageEntries.add("test4");
		this.addSectionHeader("test2");
		this.pageEntries.add("test5");
		this.pageEntries.add("test6");
	}

	@Override
	public String getName()
	{
		// TODO Auto-generated method stub
		return "key";
	}

	@Override
	public ItemStack renderTabIcon(GuiWiki gui)
	{
		// TODO Auto-generated method stub
		return new ItemStack(Blocks.anvil); // Replace null with
											// Item you
		// wish to show
	}

	@Override
	protected String getPageName(String pageEntry)
	{
		return I18n.format("ue.entry." + pageEntry);
	}

	@Override
	protected String getPageLocation(String pageEntry)
	{
		return "uberexemplar:ubertab/" + pageEntry;
	}
}
