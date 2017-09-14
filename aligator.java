import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aligator extends Actor
{
    int kierunek = -4;
    /**
     * Act - do whatever the aligator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(kierunek);
        if(isAtEdge())kierunek=kierunek*(-1);
    }    
}
