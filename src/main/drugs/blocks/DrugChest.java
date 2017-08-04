package blocks;

import items.Tabs;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DrugChest extends BlockContainer {

	protected DrugChest() {
		super(Material.iron);
		setCreativeTab(Tabs.tabMyMod);
		setHardness(2.0f);
		setResistance(6.0f);
		setHarvestLevel("pickaxe", 2);
		
	}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntities.ModTileEntity();
	}
	
	@Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        super.breakBlock(world, pos, state);
        world.removeTileEntity(pos);
    }

    @Override
    public boolean onBlockEventReceived(World worldIn, BlockPos pos, IBlockState state, int eventID, int eventParam) {
        super.onBlockEventReceived(worldIn, pos, state, eventID, eventParam);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
    }

}
