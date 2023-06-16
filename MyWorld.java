import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter respawnMp3 = new Counter("Hp Shield:");
    static Counter score = new Counter("Score: ");
    static Counter hp = new Counter("Hp:");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Putih putih = new Putih();
        addObject(putih,200,0);
        Putih putih2 = new Putih();
        addObject(putih2,200,150);
        Putih putih3 = new Putih();
        addObject(putih3,200,300);
        Putih putih4 = new Putih();
        addObject(putih4,200,450);
        Putih putih5 = new Putih();
        addObject(putih5,200,600);

        Kuning kuning = new Kuning();
        addObject(kuning,13,51);
        Kuning kuning2 = new Kuning();
        addObject(kuning2,13,151);
        Kuning kuning3 = new Kuning();
        addObject(kuning3,13,251);
        Kuning kuning4 = new Kuning();
        addObject(kuning4,13,351);
        Kuning kuning5 = new Kuning();
        addObject(kuning5,13,451);
        Kuning kuning6 = new Kuning();
        addObject(kuning6,13,551);
        Kuning kuning7 = new Kuning();
        addObject(kuning7,387,52);
        Kuning kuning8 = new Kuning();
        addObject(kuning8,387,152);
        Kuning kuning9 = new Kuning();
        addObject(kuning9,387,252);
        Kuning kuning10 = new Kuning();
        addObject(kuning10,387,352);
        Kuning kuning11 = new Kuning();
        addObject(kuning11,387,452);
        Kuning kuning12 = new Kuning();
        addObject(kuning12,387,552);

        addObject(score, 45 ,15);
        score.setValue(0);

        hp.setValue(1);
        respawnMp3.setValue(0);
        Ibulbu ibulbu = new Ibulbu();
        addObject(ibulbu,200,531);
        BiruMobil biruMobil = new BiruMobil();
        addObject(biruMobil,259,153);
        HijauMobil hijauMobil = new HijauMobil();
        addObject(hijauMobil,328,118);
        MerahMobil merahMobil = new MerahMobil();
        addObject(merahMobil,308,268);
        MobilHijau mobilHijau = new MobilHijau();
        addObject(mobilHijau,68,109);
        MobilBiru mobilBiru = new MobilBiru();
        addObject(mobilBiru,135,229);
        mobilBiru.setLocation(73,258);
        MobilMerah mobilMerah = new MobilMerah();
        addObject(mobilMerah,138,184);
        hijauMobil.setLocation(347,153);
        Mp3 mp3 = new Mp3();
        addObject(mp3,277,580);
        mp3.setLocation(245,354);
        mp3.setLocation(152,261);
        mp3.setLocation(121,321);
        mp3.setLocation(207,215);
        mp3.setLocation(196,76);
        Pause pause = new Pause();
        addObject(pause,295,100);
        pause.setLocation(372,41);
        kuning7.setLocation(379,28);
        kuning7.setLocation(310,76);
        kuning7.setLocation(384,66);
        pause.setLocation(364,48);
        pause.setLocation(333,61);
        kuning7.setLocation(384,48);
        pause.setLocation(362,25);
        kuning7.setLocation(390,81);
        removeObject(pause);
        kuning7.setLocation(389,32);
        kuning7.setLocation(380,76);
        kuning7.setLocation(390,27);
        kuning7.setLocation(280,448);
        kuning7.setLocation(382,42);
        kuning7.setLocation(390,52);
        Pause pause2 = new Pause();
        addObject(pause2,298,98);
        pause2.setLocation(374,49);
        pause2.setLocation(353,42);
    }
}
