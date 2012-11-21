package ardenexal.nethercraft.worldgen;

import java.util.Random;

import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import ardenexal.nethercraft.blocks.Blocks;

public class WorldGen {

	//Ore Generation
	public static OreGeneration HellstoneGen = new OreGeneration(Blocks.HellstoneOre,1,8, 0, 32, 10);
	public static OreGeneration NetherIronGen = new OreGeneration(Blocks.NetherIron,1,6, 0, 128, 20);
	public static OreGeneration NetherGoldGen = new OreGeneration(Blocks.NetherGold,1,4, 0, 64, 5);
	public static OreGeneration NetherSilverGen = new OreGeneration(Blocks.NetherSilver,1,6, 0, 128, 5);
	public static OreGeneration NetherTinGen = new OreGeneration(Blocks.NetherTin,1,6, 0, 128, 10);
	public static OreGeneration NetherCopperGen = new OreGeneration(Blocks.NetherCopper,1,6, 0, 128, 10);
	public static OreGeneration NetherDiamondGen = new OreGeneration(Blocks.NetherDiamond,1,5, 0, 16, 2);
	

    
	public static void generate() {
		GameRegistry.registerWorldGenerator(HellstoneGen);
		GameRegistry.registerWorldGenerator(NetherIronGen);
		GameRegistry.registerWorldGenerator(NetherGoldGen);
		GameRegistry.registerWorldGenerator(NetherSilverGen);
		GameRegistry.registerWorldGenerator(NetherTinGen);
		GameRegistry.registerWorldGenerator(NetherCopperGen);
		GameRegistry.registerWorldGenerator(NetherDiamondGen);
	}

}
