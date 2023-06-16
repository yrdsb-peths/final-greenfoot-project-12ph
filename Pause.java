import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pause extends Actor
{

    /**
     * Act - do whatever the Pause wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pause()
    {
        GreenfootImage menu = getImage();
        int tinggi = (int) menu.getHeight()/5;
        int lebar = (int) menu.getWidth()/5;
        menu.scale(lebar,tinggi);
    }
    
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().stopped();
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Surrender());
        }
    }
}