package ardenexal.nethercraft.items.molds;

import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;
import net.minecraft.src.Item;

public class cookedSwordBladeMoldItem extends Item {

	public cookedSwordBladeMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(8);
		setItemName("cookedSwordBladeMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}