import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ludzik ludzik = new Ludzik();
        addObject(ludzik,131,85);
        Ludzik ludzik2 = new Ludzik();
        addObject(ludzik2,226,245);
        Ludzik ludzik3 = new Ludzik();
        addObject(ludzik3,473,135);
        ludzik2.setLocation(260,664);
        ludzik3.setLocation(459,538);
        ludzik.setLocation(141,455);
        ludzik.setLocation(136,556);
        ludzik2.setLocation(311,662);
        ludzik3.setLocation(497,572);
        aligator aligator = new aligator();
        addObject(aligator,196,340);
        aligator aligator2 = new aligator();
        addObject(aligator2,532,684);
        aligator aligator3 = new aligator();
        addObject(aligator3,839,523);
        potworek potworek = new potworek();
        addObject(potworek,197,196);
    }
}
