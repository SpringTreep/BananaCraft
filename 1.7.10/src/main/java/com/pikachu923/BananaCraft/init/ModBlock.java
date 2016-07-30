package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.reference.Reference;

import block.*;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlock {
	public static final BlockWrapper BananaBlock = new BananaBlock("BananaBlock");
	public static final BlockWrapper BananaOre = new BananaOre("BananaOre");
	public static final BlockWrapper BananaStone = new BananaStone("BananaStone");
	

public static void init() {
    GameRegistry.registerBlock(BananaBlock, "BananaBlock");
    GameRegistry.registerBlock(BananaOre, "BananaOre");
    GameRegistry.registerBlock(BananaStone, "BananaStone");
	}
}