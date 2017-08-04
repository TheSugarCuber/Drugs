package items;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	  public static KiloCocaine kiloCocaine;  // this holds the unique instance of your block
	  public static PlasticBagSmall plasticBagSmall;
	  public static PlasticBagSmallCocaine plasticBagSmallCocaine;

	  public static void preInitCommon()
	  {
	    // each instance of your item should have a name that is unique within your mod.  use lower case.
		  //kiloCocaine
		  kiloCocaine = (KiloCocaine)(new KiloCocaine().setUnlocalizedName("kiloCocaine"));
		  GameRegistry.registerItem(kiloCocaine, "kiloCocaine");
		  
		  //plasticBagSmall
		  plasticBagSmall = (PlasticBagSmall)(new PlasticBagSmall().setUnlocalizedName("plasticBagSmall"));
		  GameRegistry.registerItem(plasticBagSmall, "plasticBagSmall");
		  
		  plasticBagSmallCocaine = (PlasticBagSmallCocaine)(new PlasticBagSmallCocaine().setUnlocalizedName("plasticBagSmallCocaine"));
		  GameRegistry.registerItem(plasticBagSmallCocaine, "plasticBagSmallCocaine");
	  }

	  public static void initCommon()
	  {
	  }

	  public static void postInitCommon()
	  {
	  }
}
