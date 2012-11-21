package ardenexal.nethercraft.items.molds;

import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;
import net.minecraft.src.Item;

public class cookedPickMoldItem extends Item {

	public cookedPickMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(5);
		setItemName("cookedPickMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
