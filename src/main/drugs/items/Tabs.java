package items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class Tabs extends Item{

	public static final CreativeTabs tabMyMod = new CreativeTabs("myMod")
	{
		@Override public Item getTabIconItem()
		{
			return net.minecraft.init.Items.blaze_powder;
		}	
	};
	
}
