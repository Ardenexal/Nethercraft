package ardenexal.nethercraft;

import ardenexal.nethercraft.blocks.Blocks;
import ardenexal.nethercraft.blocks.machines.MoldBench;
import ardenexal.nethercraft.blocks.ores.HellstoneOre;
import ardenexal.nethercraft.items.Items;
import ardenexal.nethercraft.worldgen.OreGeneration;
import ardenexal.nethercraft.worldgen.WorldGen;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Ardenexal.Nethercraft", name = "Nethercraft", version = "0.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = true,channels={"Nethercraft"}, packetHandler = NethercraftPacketHandler.class)

public class Nethercraft {
	// The instance of your mod that Forge uses.
	@Instance("Ardenexal.Nethercraft")
	public static Nethercraft instance;
		

	
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "ardenexal.nethercraft.client.ClientProxy", serverSide = "ardenexal.nethercraft.CommonProxy")
	
	public static CommonProxy proxy;

	public static CreativeTabs tabNethercraft = new CreativeTabNethercraft(CreativeTabs.getNextID(), "NetherCraft");
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
	}

	@Init
	public void load(FMLInitializationEvent event) {
		Blocks.include();
		WorldGen.generate();
		Items.include();
		CraftingRecipies.init();
		
		NetworkRegistry.instance().registerGuiHandler(this,proxy);
		
		//Proxy
		proxy.registerRenderers();
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}