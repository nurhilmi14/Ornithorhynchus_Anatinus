import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Nyawa2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nyawa extends Actor
{
    int nyawa1 = 4;
    int nyawa1Width = 80;
    int nyawa1Height = 15;
    int pixelsPerNyawa1Point = (int)nyawa1Width/nyawa1;
    /**
     * Act - do whatever the Nyawa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Nyawa()
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
        setImage(new GreenfootImage(nyawa1Width + 2, nyawa1Height + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, nyawa1Width + 1, nyawa1Height + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, nyawa1*pixelsPerNyawa1Point, nyawa1Height);
    }
    
    public void loseNyawa1()
    {
        nyawa1--;
    }
}
