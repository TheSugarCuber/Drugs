package main;

import blocks.StartupClientOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class ClientOnlyProxy extends CommonProxy {

	public void preInit()
	{
		super.preInit();
		
		blocks.StartupClientOnly.preInitClientOnly();
		items.StartupClientOnly.preInitClientOnly();
	}
	
	public void init()
	{
		super.init();
		
		blocks.StartupClientOnly.preInitClientOnly();
		items.StartupClientOnly.preInitClientOnly();
	}
	
	public void postInit()
	{
		super.postInit();
		
		blocks.StartupClientOnly.preInitClientOnly();
		items.StartupClientOnly.preInitClientOnly();
	}
	
	
	@Override
	public boolean playerIsInCreativeMode(EntityPlayer player) {
		if(player instanceof EntityPlayerMP)
		{
			EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
			return entityPlayerMP.theItemInWorldManager.isCreative();
		}
		else if(player instanceof EntityPlayerSP)
		{
			return Minecraft.getMinecraft().playerController.isInCreativeMode();
		}
		return false;
	}

	
	
}
