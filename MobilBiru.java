import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MobilBiru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MobilBiru extends Actor
{
    /**
     * Act - do whatever the MobilBiru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int biruRespawn=0;
    public void act()
    {
        setLocation(getX(), getY()+8);
        if(isAtEdge())
        {
            getImage().setTransparency(0);
        }
        
        if(getImage().getTransparency()==0 && isAtEdge())
        {
            biruRespawn++;
            if(biruRespawn==173)
            {
                setLocation(45, 0);
                getImage().setTransparency(255);
                biruRespawn=0;
            }
        }
        
        if(isTouching(Ibulbu.class))
        {
            MyWorld.hp.add(-1);
            if(MyWorld.hp.getValue()==0)
            {
               Greenfoot.setWorld(new GameOver());
            }
        }
        
        if(isTouching(Shield.class))
        {
            getWorld().addObject(new Blast(), getX(), getY());
            getImage().setTransparency(0);
            setLocation(0,600);
        }
    }
}
