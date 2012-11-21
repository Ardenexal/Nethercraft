package ardenexal.nethercraft.items.molds;

import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;
import net.minecraft.src.Item;

public class cookedAxeMoldItem extends Item {

	public cookedAxeMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(6);
		setItemName("cookedAxeMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
