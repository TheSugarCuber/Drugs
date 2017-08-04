package blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static BlockCocaine blockCocaine;
	public static BlockPartial blockPartial;
	
	public static void preInitCommon()
	{
		blockCocaine = (BlockCocaine)(new BlockCocaine().setUnlocalizedName("block_cocaine"));
		GameRegistry.registerBlock(blockCocaine, "block_cocaine");
		
		// partial block
		blockPartial = (BlockPartial)(new BlockPartial().setUnlocalizedName("block_partial"));
	    GameRegistry.registerBlock(blockPartial, "block_partial");
	}
	
}
