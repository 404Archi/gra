import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class potworek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class potworek extends Actor
{
    private void klawisze()
    {
        if(Greenfoot.isKeyDown("right"))move(1);
        if(Greenfoot.isKeyDown("left"))move(-1);
        if(Greenfoot.isKeyDown("up"))
        {
            turn(-90);
            move(1);
            turn(90);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            turn(90);
            move(1);
            turn(-90);
        }   
    }

    private void zjadanie()
    {
        if(isTouching(Ludzik.class))
            removeTouching (Ludzik.class);
    }

    /**
     * Act - do whatever the potworek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        klawisze();
        zjadanie();

    }    
}
