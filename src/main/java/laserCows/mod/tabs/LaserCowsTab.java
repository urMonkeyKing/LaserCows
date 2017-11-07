package laserCows.mod.tabs;

import laserCows.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LaserCowsTab extends CreativeTabs 
{
	public LaserCowsTab(String label) 
	{
		super("lasercowstab");
		this.setBackgroundImageName("lasercows.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.LASER_COW_TRIGGER);
	}
	
}
