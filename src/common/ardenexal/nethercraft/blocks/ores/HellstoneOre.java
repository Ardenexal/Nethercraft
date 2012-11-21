package ardenexal.nethercraft.blocks.ores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Random;

import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;
import ardenexal.nethercraft.items.Items;
import ardenexal.nethercraft.lib.Reference;
import net.minecraft.src.Block;
import net.minecraft.src.BlockOre;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;

public class HellstoneOre extends BlockOre {

	public HellstoneOre(int id, int texture) {
		super(id, texture);
		
		setHardness(4.0F);
		setStepSound(soundStoneFootstep);
		setBlockName("Hellstone");
		setCreativeTab(Nethercraft.tabNethercraft);
	}

	@Override
	public String getTextureFile() {
		return CommonProxy.BLOCK_PNG;
	}

	public int idDropped(int par1, Random par2Random, int par3){
		return Items.hellstone.shiftedIndex;
	}
}
