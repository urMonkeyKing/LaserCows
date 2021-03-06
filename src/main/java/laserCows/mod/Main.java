package laserCows.mod;

import laserCows.mod.proxy.CommonProxy;
import laserCows.mod.tabs.LaserCowsTab;
import laserCows.mod.util.Reference;
import laserCows.mod.util.handlers.EntitiesRegistry;
import laserCows.mod.util.handlers.RenderingRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs lasercowstab = new LaserCowsTab("lasercowstab");
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{
		RenderingRegistry.registerEntityRenders();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		EntitiesRegistry.registerEntities();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
	}
	
	
	
}
