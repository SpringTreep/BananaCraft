package CreativeTab;

import com.pikachu923.BananaCraft.init.ModItems;
import com.pikachu923.BananaCraft.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BananaTab {
public static final CreativeTabs BananaTab = new CreativeTabs(Reference.MOD_ID){
	@Override
	public Item getTabIconItem(){
		return ModItems.Banana;
	}
	public String getTranslatedTabLable(){
		return "BananaCraft";
	}
};
}
