package com.pikachu923.BananaCraft.armor;

import com.pikachu923.BananaCraft.reference.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BananaArmor extends ItemArmor {

	public String textureName;

	public BananaArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalizedName);
	    this.setTextureName(Reference.RESOURCE_PREFIX + unlocalizedName);
	    this.setCreativeTab(Reference.CreativeTab);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Reference.RESOURCE_PREFIX + "textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

}
