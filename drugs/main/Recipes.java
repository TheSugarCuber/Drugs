package main;

import blocks.BlockCocaine;
import items.KiloCocaine;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Recipes {

	public static void preInitCommon()
	{
		GameRegistry.addRecipe(new ItemStack(blocks.StartupCommon.blockCocaine, 1), new Object[] {
				"KKK",
				"KKK",
				"kkk",
					'K', items.StartupCommon.kiloCocaine
		});
	}
	
	public static void initCommon()
	{
		
	}
	
}
