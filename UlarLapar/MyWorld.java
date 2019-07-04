import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int skor;
    public static int skor2;
    public static int musuh;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 175,3 );
        
        prepare();
        TampilBeruang(0);
        TampilUnta(1);
        TampilUlar(5);
        TampilBuaya(5);
        addObject(new Nilai(),260,20);
        addObject(new Nilai2(),260,40);
        skor=0;
        skor2=0;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Beruang beruang = new Beruang();
        addObject(beruang,42,28);
        Buaya buaya = new Buaya();
        addObject(buaya,91,59);
        Ular ular = new Ular();
        addObject(ular,118,41);
        Unta unta = new Unta();
        addObject(unta,42,28);
        buaya.setLocation(79,74);
        ular.setLocation(123,52);
        removeObject(ular);
        removeObject(buaya);
        removeObject(beruang);
        removeObject(unta);
        
    }
    
    public void TampilUlar(int banyak)
    {
        for (int i=0; i<banyak; i++)
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Ular(), x,y);
        }
    }
    
    public void TampilBuaya(int banyak)
    {
        for (int i=0; i<banyak; i++)
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Buaya(), x,y);
        }
    }
    
    public void TampilBeruang(int banyak)
    {
        for (int i=200; i<banyak; i++)
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Beruang(), x,y);
        }
    }
    
    public void TampilUnta(int banyak)
    {
        for (int i=0; i<banyak; i++)
        {
            int x = 20;
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Unta(), x,y);
        }
    }
}
