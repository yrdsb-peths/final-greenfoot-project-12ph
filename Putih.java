import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Putih here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Putih extends Actor
{
    /**
     * Act - do whatever the Putih wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().started();
        setLocation(getX(), getY() +5);
        if(getY() >= getWorld().getHeight()-1)
        setLocation(getX(),0);
    }
}
