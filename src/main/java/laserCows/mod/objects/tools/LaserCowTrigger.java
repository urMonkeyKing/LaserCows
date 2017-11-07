package laserCows.mod.objects.tools;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import laserCows.mod.Main;
import laserCows.mod.entity.LaserCowEntity;
import laserCows.mod.objects.items.ItemBase;
import laserCows.mod.util.interfaces.IHasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LaserCowTrigger extends ItemBase implements IHasModel 
{

	public LaserCowTrigger(String name) 
	
	{
		super(name);
	    this.setMaxStackSize(1);
	    this.setMaxDamage(238);
	    this.setCreativeTab(Main.lasercowstab);
	    

	}

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand)
    {
        if (target instanceof EntityCow)
        {

        	LaserCowEntity lasercowentity = new LaserCowEntity(target.world);

            lasercowentity.setLocationAndAngles(target.posX, target.posY, target.posZ, target.rotationYaw, 0.0F);
        	
            target.world.spawnEntity(lasercowentity);
            
            //putting it here makes it so an actual laser cow does not spawn, just the south facing image
            //lasercowentity.setPositionAndRotation(target.posX, target.posY, target.posZ, target.rotationYaw, 0.0F);
        	playerIn.playSound(SoundEvents.ENTITY_COW_HURT, 1.0F, 1.0F);
        	
        	target.setDead();
        	//uncomment to make the stack size shrink
        	stack.shrink(1);
            
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
    	tooltip.add("Use on a cow to create a Laser Cow!");
    }

}
