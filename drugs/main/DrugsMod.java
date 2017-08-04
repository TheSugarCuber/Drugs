package main;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = DrugsMod.MODID, version = DrugsMod.VERSION)
public class DrugsMod {

	public static final String MODID = "drugs";
	public static final String VERSION = "1.0";
	
	// The instance of your mod that Forge uses. 
	@Mod.Instance(DrugsMod.MODID)
	public static DrugsMod instance;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="main.ClientOnlyProxy", serverSide="main.DedicatedServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit();
	}
	public void init(FMLPreInitializationEvent event)
	{
		proxy.init();
	}
	public void postInit(FMLPreInitializationEvent event)
	{
		proxy.postInit();
	}
	
	public static String prependModID(String name) {return MODID + ":" + name;}
		
	
}
