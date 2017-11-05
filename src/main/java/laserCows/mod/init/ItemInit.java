package laserCows.mod.init;

import java.util.ArrayList;
import java.util.List;

import laserCows.mod.objects.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item LASER_COW = new ItemBase("laser_cow");
	
}
