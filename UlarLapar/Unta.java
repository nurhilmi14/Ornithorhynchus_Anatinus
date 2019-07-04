import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Unta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unta extends Pesawat
{
    boolean touchingBuaya = false;
    boolean touchingUlar = false;
    /**
     * Act - do whatever the Unta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *
     */
       public Unta(){
    getImage().scale(getImage().getWidth()*2,getImage().getHeight()*2);
    }
    private MyWorld pelor;
    int timer;
    
    public void addedToWorld(World Dunia)
    {
        pelor = (MyWorld)Dunia;
    }
    
    public void act() 
    {
        if (timer >0) timer--;
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
            timer = 10;
            pelor.addObject(new Peluru2(), getX(),getY());
        }
        hitBuaya();
        hitUlar();
    }
    
    public void hitBuaya()
    {
        Actor buaya = getOneIntersectingObject(Buaya.class);
        if(buaya != null)
        {
            World world = getWorld();
            MyWorld myworld = (MyWorld)world;
            Nyawa nyawa01 = myworld.getNyawa01();
            if(touchingBuaya == false)
            {
                nyawa01.loseNyawa1();
                touchingBuaya = true;
                if(nyawa01.nyawa1 == 0)
                {
                    Kalah kalah = new Kalah();
                    getWorld().addObject(kalah, world.getWidth()/2, world.getHeight()/2);
                    getWorld().removeObject(this);
                    Greenfoot.stop();
                }
            }
        } else {
            touchingBuaya = false;
        }
        
    }
    
    public void hitUlar()
    {
        Actor ular = getOneIntersectingObject(Ular.class);
        if(ular != null)
        {
            World world = getWorld();
            MyWorld myworld = (MyWorld)world;
            Nyawa nyawa01 = myworld.getNyawa01();
            if(touchingUlar == false)
            {
                nyawa01.loseNyawa1();
                touchingUlar = true;
                if(nyawa01.nyawa1 == 0)
                {
                    Kalah kalah = new Kalah();
                    getWorld().addObject(kalah, world.getWidth()/2, world.getHeight()/2);
                    getWorld().removeObject(this);
                    Greenfoot.stop();
                }
            }
        } else {
            touchingUlar = false;
        }
    }
}
