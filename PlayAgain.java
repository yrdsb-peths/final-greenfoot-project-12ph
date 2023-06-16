import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgain extends Actor
{
    /**
     * Act - do whatever the PlayAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlayAgain()
    {
        GreenfootImage PlayAgain = getImage();
        int tinggi = (int) PlayAgain.getHeight()/2;
        int lebar = (int) PlayAgain.getWidth()/2;
        
        PlayAgain.scale(lebar,tinggi);
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
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
