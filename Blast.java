import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blast extends Actor
{
    /**
     * Act - do whatever the Blast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Blast()
    {
        GreenfootImage image = getImage();
        image.scale(50, 50);
    }
    
    int durasi=0;
    public void act()
    {
        durasi++;
        
        if(durasi >7)
        {
           getWorld().removeObject(this); 
        }
    }
}
