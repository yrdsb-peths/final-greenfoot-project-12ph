import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HijauMobil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HijauMobil extends Actor
{
    /**
     * Act - do whatever the HijauMobil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public int batasRespawn(int start, int end)
    {
        int normal = Greenfoot.getRandomNumber(end-start);
        return start+normal;
    }
    public void act()
    {
        setLocation(getX(),getY()+6);
        if(isAtEdge())
        {
            setLocation(batasRespawn(80, 120),0);
        }
        
        if(isTouching(Ibulbu.class))
        {
            getWorld().stopped();
            MyWorld.hp.add(-1);
            if(MyWorld.hp.getValue()==0)
            {
                Greenfoot.setWorld(new GameOver());
            }
        }
        
        if(isTouching(Shield.class))
        {
            getWorld().addObject(new Blast(), getX(), getY());
            setLocation(batasRespawn(80,120), 0);
        }
    }
}
