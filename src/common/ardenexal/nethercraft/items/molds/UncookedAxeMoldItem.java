package ardenexal.nethercraft.items.molds;

import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;
import net.minecraft.src.Item;

public class UncookedAxeMoldItem extends Item {

	public UncookedAxeMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(1);
		setItemName("uncookedAxeMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
