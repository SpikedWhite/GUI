import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UIMainWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        testActors();
    }
    
    /**
     * testActors adds a new  button object a new Menu object a new Label and a new TextBox into the world 
     * @param there are no parameters
     * @return nothing is returned
     */
    private void testActors()
    {
        addObject( new Button(24, "button-blue.png", "button-green.png", "Button"), 180, 150);
        addObject( new Menu("File", "New\nOpen\nSave\nClose\nExit", 24, Color.BLACK, Color.WHITE, Color.BLUE, Color.RED, new FileCommands()), 450, 150);
        addObject( new Label("something", 24), 450, 210);
        addObject( new TextBox("Text box", 24, true, Color.GREEN, Color.BLUE), 180, 210 );
        
    }
}
