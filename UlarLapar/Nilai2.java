import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nilai2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nilai2 extends Actor
{
    /**
     * Act - do whatever the Nilai2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Skor Unta : " + MyWorld.skor2, 30, Color.BLACK, Color.YELLOW));
    }    
}
