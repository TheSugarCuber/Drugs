package items;

import blocks.StartupCommon;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly()
	  {
	    // required in order for the renderer to know how to render your item.\
		
		// kiloCocaine
	    ModelResourceLocation kiloCocaineModel = new ModelResourceLocation("drugs:kiloCocaine", "inventory");
	    final int DEFAULT_ITEM_SUBTYPE = 0;
	    ModelLoader.setCustomModelResourceLocation(items.StartupCommon.kiloCocaine, DEFAULT_ITEM_SUBTYPE, kiloCocaineModel);
	    
	    // PlasticBagSmall
	    ModelResourceLocation plasticBagSmallModel = new ModelResourceLocation("drugs:plasticBagSmall", "inventory");
	    ModelLoader.setCustomModelResourceLocation(items.StartupCommon.plasticBagSmall, DEFAULT_ITEM_SUBTYPE, plasticBagSmallModel);
	    
	    //plastic bag small cocaine
	    ModelResourceLocation plasticBagSmallCocaineModel = new ModelResourceLocation("drugs:plasticBagSmallCocaine", "inventory");
	    ModelLoader.setCustomModelResourceLocation(items.StartupCommon.plasticBagSmallCocaine, DEFAULT_ITEM_SUBTYPE, plasticBagSmallCocaineModel);
	   
	  }

	  public static void initClientOnly()
	  {
	  }

	  public static void postInitClientOnly()
	  {
	  }
}
