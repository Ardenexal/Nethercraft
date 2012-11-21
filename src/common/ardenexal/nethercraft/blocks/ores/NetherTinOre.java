package ardenexal.nethercraft.blocks.ores;

import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;
import net.minecraft.src.BlockOre;

public class NetherTinOre extends BlockOre {

	public NetherTinOre(int par1, int par2) {
		super(par1, par2);
		setHardness(4.0F);
		setStepSound(soundStoneFootstep);
		setBlockName("NetherTinOre");
		setCreativeTab(Nethercraft.tabNethercraft);


	}

	@Override
	public String getTextureFile() {
		return CommonProxy.BLOCK_PNG;
	}

}
