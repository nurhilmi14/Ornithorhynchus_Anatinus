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
    int nyawa = 4;
    int nyawaWidth = 80;
    int nyawaHeight = 15;
    int pixelsPerNyawaPoint = (int)nyawaWidth/nyawa;
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
        setImage(new GreenfootImage(nyawaWidth + 2, nyawaHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, nyawaWidth + 1, nyawaHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, nyawa*pixelsPerNyawaPoint, nyawaHeight);
    }
    
    public void loseNyawa2()
    {
        nyawa--;
    }
}
