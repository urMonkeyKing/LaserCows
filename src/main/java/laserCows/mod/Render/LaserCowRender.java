package laserCows.mod.Render;

import javax.annotation.Nonnull;

import laserCows.mod.entity.LaserCowEntity;
import laserCows.mod.model.LaserCowModel;
import laserCows.mod.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class LaserCowRender extends RenderLiving<LaserCowEntity>
{
	
	private static final ResourceLocation laserCowTexture = new ResourceLocation(Reference.MODID+":textures/entity/laser_cow_texture.png");
	//protected ResourceLocation laserCowTexture;
	
	public LaserCowRender(RenderManager rendermanagerIn)
	{

		super(rendermanagerIn, new LaserCowModel(), 0.5F);

	}
	
	protected ResourceLocation getEntityTexture(LaserCowEntity entity) {
		// TODO Auto-generated method stub
		return laserCowTexture;
	}
	
}
