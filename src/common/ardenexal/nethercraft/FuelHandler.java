package ardenexal.nethercraft;

import ardenexal.nethercraft.items.Items;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler 
{
public int getBurnTime(ItemStack fuel) 
{
	if(fuel.itemID == Items.hellstone.shiftedIndex)
		return 2000;
		else
		return 0;
}
}