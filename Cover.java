import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cover extends World
{

    /**
     * Constructor for objects of class Cover.
     * 
     */
    public Cover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 300, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Play play = new Play();
        addObject(play,295,156);
        play.setLocation(284,173);
        play.setLocation(279,172);
    }
}
