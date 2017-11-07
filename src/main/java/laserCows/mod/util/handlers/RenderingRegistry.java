package laserCows.mod.util.handlers;

import laserCows.mod.Render.LaserCowRender;
import laserCows.mod.entity.LaserCowEntity;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderingRegistry 
{
	public static void registerEntityRenders() 
	{
		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(LaserCowEntity.class, new IRenderFactory<LaserCowEntity>() 
		{

			@Override
			public Render<? super LaserCowEntity> createRenderFor(RenderManager manager) 
			{
				// TODO Auto-generated method stub
				return new LaserCowRender(manager);
			}
			
		});
	}
}
