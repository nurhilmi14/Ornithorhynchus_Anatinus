import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nilai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nilai extends Actor
{
    /**
     * Act - do whatever the Nilai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Player 1 : " + MyWorld.skor, 30, Color.BLACK, Color.YELLOW));
    }    
}
