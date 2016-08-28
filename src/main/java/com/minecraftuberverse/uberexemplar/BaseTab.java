package com.minecraftuberverse.uberexemplar;

import igwmod.gui.tabs.BaseWikiTab;
import net.minecraft.client.resources.I18n;

public abstract class BaseTab extends BaseWikiTab
{
	private String name;

	public BaseTab(String name)
	{
		super();
		this.name = name;
	}

	@Override
	public final String getName()
	{
		return "ue.tabname." + name;
	}

	@Override
	protected final String getPageName(String pageEntry)
	{
		return I18n.format("ue.entry." + pageEntry);
	}

	@Override
	protected final String getPageLocation(String pageEntry)
	{
		return "uberexemplar:" + name + "/" + pageEntry;
	}
}
