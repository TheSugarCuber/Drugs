package blocks;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupClientOnly {

	public static void preInitClientOnly()
	{
		// Block of Cocaine
		Item itemBlockCocaine = GameRegistry.findItem("drugs", "block_cocaine");
		ModelResourceLocation itemModelResourceLocation1 = new ModelResourceLocation("drugs:block_cocaine", "inventory");
		ModelLoader.setCustomModelResourceLocation(itemBlockCocaine, 0, itemModelResourceLocation1);
	
		// partial block
		Item itemBlockPartial = GameRegistry.findItem("drugs", "block_partial");
	    ModelResourceLocation itemModelResourceLocation2 = new ModelResourceLocation("drugs:block_partial", "inventory");
	    final int DEFAULT_ITEM_SUBTYPE = 0;
	    ModelLoader.setCustomModelResourceLocation(itemBlockPartial, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation2);
		
	    Item drugChest = GameRegistry.findItem("drugs", "drug_chest");
	    ModelResourceLocation drugChestModel = new ModelResourceLocation("drugs:drug_chest", "inventory");
	    ModelLoader.setCustomModelResourceLocation(drugChest, DEFAULT_ITEM_SUBTYPE, drugChestModel);
	    
	}
	
	public static void initClientOnly()
	{
	}
	
	public static void postInitClientOnly()
	{
	}
	
}
