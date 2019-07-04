import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru extends Actor
{
    /**
     * Act - do whatever the Peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Buaya.class))
        {
            removeTouching(Buaya.class);
        }
        setLocation(getX()+2,getY());
        if(getX()==299)
        {
            setLocation(299,getY());
            getWorld().removeObject(this);
            return;
        }
        
        tembakMusuh();
    }
    
    public boolean lihatUlar()
    {
        Actor ular = getOneIntersectingObject(Ular.class);
        return ular!=null;
    }
    
    public boolean lihatBuaya()
    {
        Actor buaya = getOneIntersectingObject(Buaya.class);
        return buaya!=null;
    }
    
    public void tembakMusuh()
    {
        Actor ular = getOneIntersectingObject(Ular.class);
        if(ular!=null)
        {
            getWorld().removeObject(ular);
            getWorld().addObject(new Ular(), 300+Greenfoot.getRandomNumber(50), Greenfoot.getRandomNumber(175));
            MyWorld.skor++;
        }
        Actor buaya = getOneIntersectingObject(Buaya.class);
        if(buaya!=null)
        {
            getWorld().removeObject(buaya);
            getWorld().addObject(new Buaya(), 300+Greenfoot.getRandomNumber(50), Greenfoot.getRandomNumber(175));
            MyWorld.skor++;
        }
        if(MyWorld.skor == 100)
        {
            getWorld().addObject(new Menang(), 149, 88);
            Greenfoot.stop();
        }
    }
}
