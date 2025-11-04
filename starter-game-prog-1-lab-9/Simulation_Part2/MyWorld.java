import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    public MyWorld()
    {    
        super(1024, 768, 1, false); 

        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; // seems to be the default
        prepare();
    }

    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Target target = new Target();
        addObject(target,539,80);
        Target target2 = new Target();
        addObject(target2,610,194);
        Target target3 = new Target();
        addObject(target3,626,348);
        Target target4 = new Target();
        addObject(target4,602,518);
        Cannon cannon = new Cannon();
        addObject(cannon,87,314);
    }
}
