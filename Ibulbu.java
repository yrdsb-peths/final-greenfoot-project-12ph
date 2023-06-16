import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ibulbu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ibulbu extends Actor
{
    /**
     * Act - do whatever the Ibulbu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int plusScore=0;
    
    public Ibulbu()
    {
        GreenfootImage emak = getImage();
        int tinggi = (int) emak.getHeight()/1;
        int lebar = (int) emak.getWidth()/1;
        emak.scale(lebar,tinggi);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-2);
        }
        
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+1);
        }
        
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-2, getY());
        }
        
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+2, getY());
        }
        
        if(getX() >= 365)
        {
            setLocation(365,getY());
        }
        
        if(getX() <= 35)
        {
             setLocation(35,getY());
        }
        
        if(getY() >= 500)
        {
            setLocation(getX(),500);
        }
        
        if(isTouching(Mp3.class))
        {
            MyWorld.respawnMp3.add(1);
            getWorld().addObject(new Shield(), getX(), getY());
        }
        
        
    }
}
