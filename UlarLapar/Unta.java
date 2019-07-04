import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Unta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unta extends Actor
{
    /**
     * Act - do whatever the Unta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *
     */
       public Unta(){
    getImage().scale(getImage().getWidth()*2,getImage().getHeight()*2);
    }
    private MyWorld pelor;
    
    public void addedToWorld(World Dunia)
    {
        pelor = (MyWorld)Dunia;
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-1);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+1,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-1,getY());
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+1);
        }
        if(Greenfoot.isKeyDown("."))
        {
            pelor.addObject(new Peluru2(), getX(),getY());
            
        }
    }   
}
