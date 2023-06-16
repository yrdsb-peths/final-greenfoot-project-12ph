import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mp3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mp3 extends Actor
{
    /**
     * Act - do whatever the Mp3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mp3Respawn=0;
    public int batasRespawn(int start, int end)
    {
        
            int normal = Greenfoot.getRandomNumber(end-start);
            return normal+start;
    }
        
    public Mp3()
        {
            GreenfootImage player = getImage();
            int tinggi =(int) player.getHeight()/1;
            int lebar =(int) player.getWidth()/1;
            
            player.scale(lebar,tinggi);
        }
      
        public void act()
        {
           setLocation(getX(),getY()+6);
           
           if(isAtEdge())
           {
               getImage().setTransparency(0);
           }
           
           if(getImage().getTransparency()==0 && isAtEdge())
           {
               mp3Respawn++;
               if(mp3Respawn==1000)
               {
                   setLocation(batasRespawn(40, 360),0);
                   getImage().setTransparency(255);
                   mp3Respawn=0;
               }
           }
        
        
        if(MyWorld.respawnMp3.getValue()==1)
        {
            MyWorld.respawnMp3.add(-1);
            getImage().setTransparency(0);
            setLocation(0,600);
        }
    }
}
