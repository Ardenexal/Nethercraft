package ardenexal.nethercraft.items.molds;

import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;
import net.minecraft.src.Item;

public class UncookedShovelMoldItem extends Item {

	public UncookedShovelMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(2);
		setItemName("uncookedShovelMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
