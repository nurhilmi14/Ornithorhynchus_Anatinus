import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends StatBar
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //You can just delete the whole act method if you don't need to add anything
        super.act();
    }    
    
    public HealthBar(int max, int current)
    {
        //Creates a new stat bar with a green color, a width of 140 pixels, a height of 24 pixels,
        //the ROUND bar style, a max value and a current value.
        super(new Color(0, 255, 0), 140, 24, Style.ROUND, max, current);
        //Sets the update speed to 5.
        setSpeed(5);
    }
    
    public HealthBar(int max)
    {
        this(max, max);
    }
    
    public void updateColor()
    {
        if (getValue() <= getMax()/4)
        {
            setColor(Color.RED);
        }
        else if (getValue() < getMax()/2)
        {
            setColor(Color.YELLOW);
        }
        else
        {
            setColor(Color.GREEN);
        }
    }
}
