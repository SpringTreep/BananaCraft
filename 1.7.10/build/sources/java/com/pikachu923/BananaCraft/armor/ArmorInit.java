package com.pikachu923.BananaCraft.armor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorInit {
	public static ArmorMaterial ReinBananaArmor = EnumHelper.addArmorMaterial("ReinBananaArmor", 38, new int[] {3, 7, 5, 3}, 11);
	public static ArmorMaterial AwakenedBananaArmor = EnumHelper.addArmorMaterial("AwakenedBananaArmor", 39, new int[] {5, 10, 8, 5}, 22);
	
	//Tier 1
	public static Item BananaHelmet;
	public static Item BananaChestplate;
	public static Item BananaLeggings;
	public static Item BananaBoots;
	//Tier 2
	public static Item AwakenedBananaHelmet;
	public static Item AwakenedBananaChestplate;
	public static Item AwakenedBananaLeggings;
	public static Item AwakenedBananaBoots;

	public static void init() {
		//Tier 1
		GameRegistry.registerItem(BananaHelmet = new BananaArmor("BananaHelmet", ReinBananaArmor, "ReinBananaArmor", 0), "Banana_helmet"); //0 for helmet
		GameRegistry.registerItem(BananaChestplate = new BananaArmor("BananaChestplate", ReinBananaArmor, "ReinBananaArmor", 1), "Banana_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(BananaLeggings = new BananaArmor("BananaLeggings", ReinBananaArmor, "ReinBananaArmor", 2), "Banana_leggings"); // 2 for leggings
		GameRegistry.registerItem(BananaBoots = new BananaArmor("BananaBoots", ReinBananaArmor, "ReinBananaArmor", 3), "Banana_boots"); // 3 for boots
		//Tier 2
		GameRegistry.registerItem(AwakenedBananaHelmet = new AwakenedArmor("AwakenedBananaHelmet", AwakenedBananaArmor, "AwakenedBananaArmor", 0), "Awakened_Helmet");
		GameRegistry.registerItem(AwakenedBananaChestplate = new AwakenedArmor("AwakenedBananaChestplate", AwakenedBananaArmor, "AwakenedBananaArmor", 1), "Awakened_Chestplate");
		GameRegistry.registerItem(AwakenedBananaLeggings = new AwakenedArmor("AwakenedBananaLeggings", AwakenedBananaArmor, "AwakenedBananaArmor", 2), "Awakened_Leggings");
		GameRegistry.registerItem(AwakenedBananaBoots = new AwakenedArmor("AwakenedBananaBoots", AwakenedBananaArmor, "AwakenedBananaArmor", 3), "Awakened_Boots");
	}
}
