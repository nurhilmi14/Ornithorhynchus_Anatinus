import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ular extends Musuh
{
    
    /**
     * Act - do whatever the Ular wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ular(){
    getImage().scale(getImage().getWidth()*6/8,getImage().getHeight()*3/4);
    }
    public void act() 
    {
        setLocation(getX()-1,getY());
        if(getX()==1)
        {
            setLocation(299,getY());
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
