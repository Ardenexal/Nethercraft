package ardenexal.nethercraft;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;
import ardenexal.nethercraft.blocks.machines.GuiMoldBench;
import ardenexal.nethercraft.blocks.machines.TileEntityMoldBench;
import ardenexal.nethercraft.blocks.machines.containerMoldBench;
import ardenexal.nethercraft.lib.Reference;

public class CommonProxy implements IGuiHandler {
	public static String ITEMS_PNG = Reference.SPRITE_SHEET_LOCATION + Reference.ITEM_SPRITE_SHEET;
	public static String BLOCK_PNG = Reference.SPRITE_SHEET_LOCATION + Reference.BLOCK_SPRITE_SHEET;

	// Client stuff
	public void registerRenderers() {
		// Nothing here as this is the server side proxy
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        if(tileEntity instanceof TileEntityMoldBench){
                return new containerMoldBench(player.inventory, (TileEntityMoldBench) tileEntity);
        }
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        if(tileEntity instanceof TileEntityMoldBench){
                return new GuiMoldBench(player.inventory, (TileEntityMoldBench) tileEntity);
        }
		return null;
	}

}


