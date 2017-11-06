package laserCows.mod.init;

import java.util.ArrayList;
import java.util.List;

import laserCows.mod.objects.armor.ArmorBase;
import laserCows.mod.objects.items.ItemBase;
import laserCows.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	//area for future different sound
	//new int[]{X, X, X, head}
	public static final ArmorMaterial ARMOR_REDSTONE = EnumHelper.addArmorMaterial("armor_redstone", Reference.MODID + ":redstone", 33, new int[]{0, 0, 0, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	//Items
	public static final Item LASER_COW = new ItemBase("laser_cow");
	
	//Armor
	public static final Item GLASSES_REDSTONE = new ArmorBase("glasses_redstone", ARMOR_REDSTONE,1,EntityEquipmentSlot.HEAD);
}
