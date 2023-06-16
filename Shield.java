import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shield extends Actor
{
    /**
     * Act - do whatever the Shield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int durasi=0; 
    
    
    public Shield()
    {
        GreenfootImage shield = getImage();
        int tinggi = (int) shield.getHeight()/1;
        int lebar = (int) shield.getWidth()/1;
        
        shield.scale(lebar,tinggi);
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
        durasi++;
        getWorld().stopped();
        getImage().setTransparency(100);
        
        if(durasi == 800)
        {
            getWorld().started();
            getWorld().removeObject(this);
        }
        
    }
}
