package block;

import com.pikachu923.BananaCraft.reference.Reference;

import CreativeTab.BananaTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockWrapper extends Block
{

	public BlockWrapper(Material material){
		super(material);
		this.setCreativeTab(BananaTab.BananaTab);
	}
	
	public BlockWrapper(){
		this(Material.rock);
		this.setCreativeTab(BananaTab.BananaTab);
	}

	    @Override
	    public String getUnlocalizedName()
	    {
	        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	    }

	    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	    {
	        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    }
}
