package ardenexal.nethercraft.blocks.machines;

import net.minecraft.src.GuiContainer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.StatCollector;

import org.lwjgl.opengl.GL11;

import ardenexal.nethercraft.lib.Reference;

public class GuiMoldBench extends GuiContainer {

        public GuiMoldBench (InventoryPlayer inventoryPlayer,TileEntityMoldBench tileEntity) {
                //the container is instantiated and passed to the superclass for handling
                super(new containerMoldBench(inventoryPlayer, tileEntity));
        }

        @Override
        protected void drawGuiContainerForegroundLayer(int par1, int par2) {
                //draw text and stuff here
                //the parameters for drawString are: string, x, y, color
                fontRenderer.drawString("Mold Bench", (xSize/2)-25, 6, 4210752);

                
        }

        @Override
        protected void drawGuiContainerBackgroundLayer(float par1, int par2,
                        int par3) {
                //draw your Gui here, only thing you need to change is the path
                int texture = mc.renderEngine.getTexture(Reference.SPRITE_SHEET_LOCATION + "gui/guiMoldBench.png");
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.mc.renderEngine.bindTexture(texture);
                int x = (width - xSize) / 2;
                int y = (height - ySize) / 2;
                this.drawTexturedModalRect(x, y, 0, 0, 191, 176);
        }

}