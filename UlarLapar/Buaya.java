import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buaya here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buaya extends Actor
{
    /**
     * Act - do whatever the Buaya wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+1,getY());
        if(getX()==299)
        {
            setLocation(0,getY());
        }
        Actor beruang = getOneIntersectingObject(Beruang.class);
        Actor unta = getOneIntersectingObject(Unta.class);
            if(beruang!=null)
        {
            getWorld().removeObject(beruang);
            getWorld().addObject(new Kalah(), 149, 88);
            Greenfoot.stop();
        }
        if(unta!=null)
        {
            getWorld().removeObject(unta);
            getWorld().addObject(new Kalah2(), 149, 88);
            Greenfoot.stop();
        }
        Actor peluru = getOneIntersectingObject(Peluru.class);
        if(peluru!=null)
        {
            getWorld().removeObject(peluru);
        }
        Actor peluru2 = getOneIntersectingObject(Peluru2.class);
        if(peluru2!=null)
        {
            getWorld().removeObject(peluru2);
        }
    }
    
}