package items;

import blocks.StartupCommon;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	public static void preInitClientOnly()
	  {
	    // required in order for the renderer to know how to render your item.\
		
		// kiloCocaine
	    ModelResourceLocation itemModelResourceLocation1 = new ModelResourceLocation("drugs:kiloCocaine", "inventory");
	    final int DEFAULT_ITEM_SUBTYPE = 0;
	    ModelLoader.setCustomModelResourceLocation(items.StartupCommon.kiloCocaine, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation1);
	    
	    // PlasticBagSmall
	    ModelResourceLocation itemModelResourceLocation2 = new ModelResourceLocation("drugs:plasticBagSmall", "inventory");
	    ModelLoader.setCustomModelResourceLocation(items.StartupCommon.plasticBagSmall, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation2);
	    
	  }

	  public static void initClientOnly()
	  {
	  }

	  public static void postInitClientOnly()
	  {
	  }
}
