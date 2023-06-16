import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BiruMobil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BiruMobil extends Actor
{
    /**
     * Act - do whatever the BiruMobil wants to do. This method is called whenever
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
            setLocation(batasRespawn(180,250),0);
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
            setLocation(batasRespawn(180,250),0);
        }
    }
}
