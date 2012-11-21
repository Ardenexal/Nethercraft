package ardenexal.nethercraft;

import ardenexal.nethercraft.lib.Reference;

public class CommonProxy {
	public static String ITEMS_PNG = Reference.SPRITE_SHEET_LOCATION + Reference.ITEM_SPRITE_SHEET;
	public static String BLOCK_PNG = Reference.SPRITE_SHEET_LOCATION + Reference.BLOCK_SPRITE_SHEET;

	// Client stuff
	public void registerRenderers() {
		// Nothing here as this is the server side proxy
	}
}
