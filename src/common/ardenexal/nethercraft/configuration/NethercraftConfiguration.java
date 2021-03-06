/**
* Copyright (c) SpaceToad, 2011
* http://www.mod-buildcraft.com
*
* BuildCraft is distributed under the terms of the Minecraft Mod Public
* License 1.0, or MMPL. Please check the contents of the license located in
* http://www.mod-buildcraft.com/MMPL-1.0.txt
*/

package ardenexal.nethercraft.configuration;

import java.io.File;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class NethercraftConfiguration extends Configuration {

public NethercraftConfiguration(File file) {
super(file);
}

@Override
public void save() {
Property versionProp = null;

if (!categories.get(CATEGORY_GENERAL).containsKey("version")) {
versionProp = new Property();
versionProp.setName("version");
categories.get(CATEGORY_GENERAL).put("version", versionProp);
} else
versionProp = categories.get(CATEGORY_GENERAL).get("version");

versionProp.value = "v0.1";

super.save();
}

}