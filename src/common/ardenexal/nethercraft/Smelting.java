package ardenexal.nethercraft;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import ardenexal.nethercraft.blocks.Blocks;
import ardenexal.nethercraft.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {

	public void init() {
		GameRegistry.addSmelting(Blocks.NetherIron.blockID, new ItemStack(Item.ingotIron), 0.1f);
		GameRegistry.addSmelting(Blocks.NetherGold.blockID, new ItemStack(Item.ingotGold), 0.1f);
		
		GameRegistry.addSmelting(Items.uncookedpickmolditem.shiftedIndex, new ItemStack(Items.cookedpickmolditem), 0.1f);
		GameRegistry.addSmelting(Items.uncookedaxemolditem.shiftedIndex, new ItemStack(Items.cookedaxemolditem), 0.1f);
		GameRegistry.addSmelting(Items.uncookedshovelmolditem.shiftedIndex, new ItemStack(Items.cookedshovelmolditem), 0.1f);
		GameRegistry.addSmelting(Items.uncookedswordbladekmolditem.shiftedIndex, new ItemStack(Items.cookedswordblademolditem), 0.1f);
		GameRegistry.addSmelting(Items.uncookedswordhandlemolditem.shiftedIndex, new ItemStack(Items.cookedswordhandlemolditem), 0.1f);
		
	}

}
