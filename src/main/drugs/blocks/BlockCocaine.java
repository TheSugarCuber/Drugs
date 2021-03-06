package blocks;

import items.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCocaine extends Block {

	public BlockCocaine() {
		super(Material.sand);
		this.setCreativeTab(Tabs.tabMyMod);
		this.setHardness(1.0F);
		setHarvestLevel("Sand", 0);
		setStepSound(soundTypeSand);
	}
	
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.SOLID;
	}

	@Override
	public boolean isOpaqueCube() {
		return true;
	}
	
	@Override
	public boolean isFullCube() 
	{
		return true;
	}
	
	@Override
	public int getRenderType()
	{
		return 3;
	}
	
}
