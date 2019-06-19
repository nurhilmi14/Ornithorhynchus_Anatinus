import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peluru2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru2 extends Actor
{
    /**
     * Act - do whatever the Peluru2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Buaya.class))
        {
            removeTouching(Buaya.class);
        }
        setLocation(getX()-2,getY());
        if(getX()==0)
        {
            setLocation(0,getY());
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
            getWorld().addObject(new Ular(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(175));
            MyWorld.skor2++;
        }
        Actor buaya = getOneIntersectingObject(Buaya.class);
        if(buaya!=null)
        {
            getWorld().removeObject(buaya);
            getWorld().addObject(new Buaya(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(175));
            MyWorld.skor2++;
        }
        if(MyWorld.skor == 100)
        {
            getWorld().addObject(new Menang2(), 149, 88);
            Greenfoot.stop();
        }
    }
}
