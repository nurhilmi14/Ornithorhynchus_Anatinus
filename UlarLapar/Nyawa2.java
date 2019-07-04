import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Nyawa2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nyawa2 extends Actor
{
    int nyawa2 = 4;
    int nyawa2Width = 80;
    int nyawa2Height = 15;
    int pixelsPerNyawa2Point = (int)nyawa2Width/nyawa2;
    /**
     * Act - do whatever the Nyawa2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Nyawa2()
    {
        update();
    }
    
    public void act() 
    {
        // Add your action code here.
        update();
    }
    
    public void update()
    {
        setImage(new GreenfootImage(nyawa2Width + 2, nyawa2Height + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, nyawa2Width + 1, nyawa2Height + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, nyawa2*pixelsPerNyawa2Point, nyawa2Height);
    }
    
    public void loseNyawa2()
    {
        nyawa2--;
    }
}
