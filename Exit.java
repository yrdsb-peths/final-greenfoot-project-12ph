import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Exit()
    {
        GreenfootImage emak = getImage();
        int tinggi = (int) emak.getHeight()/4;
        int lebar = (int) emak.getWidth()/4;
        emak.scale(lebar,tinggi);
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
            Greenfoot.setWorld(new Cover());
        }
    }
}
