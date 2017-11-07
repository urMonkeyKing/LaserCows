package laserCows.mod.util.handlers;

import laserCows.mod.Main;
import laserCows.mod.Render.LaserCowRender;
import laserCows.mod.entity.LaserCowEntity;
import laserCows.mod.util.Reference;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class EntitiesRegistry 
{
	public static void registerEntities() 
	{
		//bob to Laser
		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID+ ":Laser Cow"), LaserCowEntity.class, "Laser Cow", 1, Main.instance, 64, 3, true, 0x996600, 0x00ff00);	
		//net.minecraftforge.fml.common.registry.EntitiesRegistry.registerEntityRenderingHandler(LaserCowEntity.class, new IRenderFactory<LaserCowEntity>() 
		//{

		//	@Override
		//	public Render<? super LaserCowEntity> createRenderFor(RenderManager manager) 
		//	{
		//		// TODO Auto-generated method stub
		//		return new LaserCowRender(manager);
		//	}
			
		//});
	}
}
