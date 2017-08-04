package main;

import GUI.GUIHandler;
import blocks.StartupCommon;
import items.Tabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.NetworkRegistry;

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
		NetworkRegistry.INSTANCE.registerGuiHandler(DrugsMod.instance, new GUIHandler());

	}
	
	public void postInit()
	{
		blocks.StartupCommon.preInitCommon();
		items.StartupCommon.preInitCommon();

	}
	
	abstract public boolean playerIsInCreativeMode(EntityPlayer player);
	
}
