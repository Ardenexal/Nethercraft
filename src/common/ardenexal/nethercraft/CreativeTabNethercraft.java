package ardenexal.nethercraft;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.StringTranslate;

public class CreativeTabNethercraft extends CreativeTabs {

	public CreativeTabNethercraft(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return Block.netherBrick.blockID;
	}
	public String getTranslatedTabLabel()
	{
	return StringTranslate.getInstance().translateKey("" + this.getTabLabel());
	}

	public String getTabLabel()
	{
	return "Nethercraft";
	}
}
