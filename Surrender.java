import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Surrender here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Surrender extends World
{

    /**
     * Constructor for objects of class Surrender.
     * 
     */
    public Surrender()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Exit exit = new Exit();
        addObject(exit, 200, 200);
        showText("YOUR SCORE:"+MyWorld.score.getValue(), getWidth()/2, getHeight()/2);
        exit.setLocation(197,141);
        exit.setLocation(198,149);
        exit.setLocation(242,430); 
        exit.setLocation(255,386);
        exit.setLocation(256,386);
        exit.setLocation(239,213);
        exit.setLocation(209,160);
    }
}
