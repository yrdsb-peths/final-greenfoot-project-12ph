import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        PlayAgain playAgain = new PlayAgain();
        addObject(playAgain, 100, 400);
        showText("YOUR SCORE:" +MyWorld.score.getValue(), getWidth()/2, getHeight()/2);
        playAgain.setLocation(234,207);
        playAgain.setLocation(161,215);
        playAgain.setLocation(245,204);
        playAgain.setLocation(216,188);
        playAgain.setLocation(178,170);
    }
}
