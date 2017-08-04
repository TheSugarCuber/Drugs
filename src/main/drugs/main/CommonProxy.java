package main;

import blocks.StartupCommon;
import items.Tabs;
import net.minecraft.entity.player.EntityPlayer;

public abstract class CommonProxy {

	public void preInit()
	{
		blocks.StartupCommon.preInitCommon();
		items.StartupCommon.preInitCommon();
	}
	
	public void init()
	{
		blocks.StartupCommon.preInitCommon();
		items.StartupCommon.preInitCommon();

	}
	
	public void postInit()
	{
		blocks.StartupCommon.preInitCommon();
		items.StartupCommon.preInitCommon();

	}
	
	abstract public boolean playerIsInCreativeMode(EntityPlayer player);
	
}
