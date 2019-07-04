import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beruang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beruang extends Actor
{
    /**
     * Act - do whatever the Beruang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private MyWorld pelor;
    private int timer;
    
    public void addedToWorld(World Dunia)
    {
        pelor = (MyWorld)Dunia;
    }
    
    public void act() 
    {
        if (timer >0) timer--;
        
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-1);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+1,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-1,getY());
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+1);
        }
        if(timer == 0 && Greenfoot.isKeyDown("v"))
        {
            timer = 10;
            pelor.addObject(new Peluru(), getX(),getY());
        }
        if(Greenfoot.mouseClicked(null))
        {
            pelor.addObject(new Peluru(), getX(),getY());
        }
    }
}
