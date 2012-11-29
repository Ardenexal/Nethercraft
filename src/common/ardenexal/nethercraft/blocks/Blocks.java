package ardenexal.nethercraft.blocks;

import ardenexal.nethercraft.Nethercraft;
import ardenexal.nethercraft.blocks.ores.HellstoneOre;
import ardenexal.nethercraft.blocks.ores.NetherCopperOre;
import ardenexal.nethercraft.blocks.ores.NetherDiamond;
import ardenexal.nethercraft.blocks.ores.NetherGoldOre;
import ardenexal.nethercraft.blocks.ores.NetherIronOre;
import ardenexal.nethercraft.blocks.ores.NetherSilverOre;
import ardenexal.nethercraft.blocks.ores.NetherTinOre;
import ardenexal.nethercraft.blocks.machines.*;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;

public class Blocks {
	
	// Blocks
	public static Block HellstoneOre;
	public static Block NetherIron;
	public static Block NetherGold;
	public static Block NetherSilver;
	public static Block NetherTin;
	public static Block NetherCopper;
	public static Block NetherDiamond;
	public static Block MoldBench;
	
	public static void include(){
		HellstoneOre = new HellstoneOre(1551,0);
		NetherIron = new NetherIronOre(1552,1);
		NetherGold = new NetherGoldOre(1553,2);
		NetherSilver = new NetherSilverOre(1554,6);
		NetherTin = new NetherTinOre(1555,5);
		NetherCopper = new NetherCopperOre(1556,4);
		NetherDiamond = new NetherDiamond(1557,3);
		MoldBench = new MoldBench(1558);
		
		addBlock(HellstoneOre,"Hellstone Ore");
		addBlock(NetherIron,"Nether Iron Ore");
		addBlock(NetherGold,"Nether Gold Ore");
		addBlock(NetherSilver,"Nether Silver Ore");
		addBlock(NetherTin,"Nether Tin Ore");
		addBlock(NetherCopper,"Nether Copper Ore");
		addBlock(NetherDiamond,"Nether Diamond");
		addBlock(MoldBench,"Mold Bench");

		
		
		
	}
	public static void addBlock(Block block, String Name){
		GameRegistry.registerBlock(block);
		LanguageRegistry.addName(block, Name);
	}
}
