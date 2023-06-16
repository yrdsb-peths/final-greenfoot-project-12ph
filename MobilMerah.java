import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MobilMerah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MobilMerah extends Actor
{
    /**
     * Act - do whatever the MobilMerah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int merahRespawn=0;
    public void act()
    {
        setLocation(getX(), getY()+8);
        if(isAtEdge())
        {
            getImage().setTransparency(0);
        }
        
        if(getImage().getTransparency()==0 && isAtEdge())
        {
            merahRespawn++;
            if(merahRespawn==150)
            {
                setLocation(365,0);
                getImage().setTransparency(255);
                merahRespawn=0;
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
