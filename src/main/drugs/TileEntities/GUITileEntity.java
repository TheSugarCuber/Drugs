package TileEntities;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;

public class GUITileEntity extends GuiContainer
{

	public GUITileEntity(IInventory playerInv, ModTileEntity te) {
	    super(new ContainerTileEntity(playerInv, te));

	    this.xSize = 176;
	    this.ySize = 166;
	}

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
    }

}
