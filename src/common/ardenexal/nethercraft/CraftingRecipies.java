package ardenexal.nethercraft;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import ardenexal.nethercraft.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipies {
public static void init(){
		Mold(Items.uncookedpickmolditem,new ItemStack(Item.pickaxeWood));
		Mold(Items.uncookedaxemolditem,new ItemStack(Item.axeWood));
		Mold(Items.uncookedshovelmolditem,new ItemStack(Item.shovelWood));

		GameRegistry.addRecipe(new ItemStack(Items.uncookedswordbladekmolditem), "ccc","ccc","cpc",'c',new ItemStack(Item.clay),'p',new ItemStack(Item.swordWood));
		GameRegistry.addRecipe(new ItemStack(Items.uncookedswordhandlemolditem), "cpc","ccc","ccc",'c',new ItemStack(Item.clay),'p',new ItemStack(Item.swordWood));
}
//Basic Mold Recipes
public static void Mold(Item output,ItemStack tool){
	ItemStack clayStack = new ItemStack(Item.clay);
	
	GameRegistry.addRecipe(new ItemStack(output), "ccc","cpc","ccc",'c',clayStack,'p',tool);

}
}

