package _08_SolarSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import game_tools.Game;
import game_tools.GameControlScene;
/*
 * Background:
 * Our solar system has 8 planets that orbit around the sun:
 * Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, and Neptune
 * While each planet is spherical, they are different sizes, colors,
 * and distances from the sun.
 * 
 * Objective:
 * Create a planet object for each of the planets in our solar system and
 *   - make them distinct colors
 *   - place them in the correct relative distance from the sun.
 *   - make them the correct relative size.
 *   - make them orbit around the sun at the correct relative speed.
 * 
 * 1. In the Planet class:
 *    a. Add member variables for:
 *       - planet color
 *       - distance from sun
 *       - orbital period (how many days it takes the planet to circle the sun)
 *    b. Assign the member variables in the constructor
 * 
 * 2. In this class:
 *    a. Create Planet objects as member variables for each planet using the
 *       information for each planet below.
 *    b. Call each planet object's draw method inside this class' draw method.
 *
 * EXTRA: Add moons for each planet that has them!
 *
 *        |              | Average distance  | Days to orbit | Number of
 * Body   | Diameter (km)| from the sun (km) | around sun    | moons
 * -------+--------------+-------------------+---------------+-----------+
 * Sun    | 1,391,000    | 0                 | N/A           | N/A
 * Mercury| 4,879        | 57,900,000        | 88            | 0
 * Venus  | 12,104       | 108,200,000       | 224.7         | 0
 * Earth  | 12,756       | 149,600,000       | 365.2         | 1
 * Mars   | 6,792        | 227,900,000       | 687           | 2
 * Jupiter| 142,984      | 778,600,000       | 4,331         | 79
 * Saturn | 120,536      | 1,433,500,000     | 10,747        | 82
 * Uranus | 51,118       | 2,872,500,000     | 30,589        | 27
 * Neptune| 49,528       | 4,495,100,000     | 59,800        | 14
 * https://nssdc.gsfc.nasa.gov/planetary/factsheet/
 */




public class SolarSystem implements GameControlScene {
    static final int DISPLAY_WIDTH = 1000;
    static final int DISPLAY_HEIGHT = DISPLAY_WIDTH;
    static final int CENTER_X = DISPLAY_WIDTH / 2;
    static final int CENTER_Y = DISPLAY_HEIGHT / 2;
    static final int SUN_RADIUS_PIXELS = (1391 / 2) / 20;
    static final int SUN_DIAMETER_PIXELS = 2 * SUN_RADIUS_PIXELS;
    static final int MS_PER_DAY = 10;

    
    Planet mercury = new Planet(4879);
    Planet venus = new Planet(12104);
    Planet earth = new Planet(12756);
    Planet mars = new Planet(6792);
    Planet jupiter = new Planet(142984);
    Planet saturn = new Planet(120536);
    Planet uranus = new Planet(51118);
    Planet neptune = new Planet(49528);
    /*
     * Member variables
     */
    int sunX, sunY;
    Long startTimeMs = null;
    Game gameFrame = new Game("Solar System");
    
    Planet earth1 = new Planet(12);
    
    public SolarSystem() {
        gameFrame.setScene(this);
        gameFrame.start();
        gameFrame.setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
        
        /*
         * Add Earth's moon
         */
        earth.addMoon();
        
        sunX = CENTER_X - SUN_RADIUS_PIXELS;
        sunY = CENTER_Y - SUN_RADIUS_PIXELS;
        startTimeMs = System.currentTimeMillis();
    }

    int getDays() {
        if(startTimeMs != null) {
            return (int)((System.currentTimeMillis() - startTimeMs) / MS_PER_DAY);
        }
        
        return 0;
    }

    public void draw(Graphics g) {
        /*
         * Space
         */
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, DISPLAY_WIDTH, DISPLAY_HEIGHT);
        
        /*
         * Days
         */
        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", Font.PLAIN, 32));
        g.drawString("Days: " + getDays(), 0, 50);
        
        /*
         * Sun
         */
        g.setColor(Color.YELLOW);
        g.fillOval(sunX, sunY, SUN_DIAMETER_PIXELS, SUN_DIAMETER_PIXELS);
        
        int numDays = getDays();
        
        /*
         * Add planets here
         */
        
        mercury.draw(g, 88);
        venus.draw(g, 224);
        earth.draw(g, 365);
        mars.draw(g, 687);
        jupiter.draw(g,4331);
        saturn.draw(g, 10747);
        uranus.draw(g, 30589);
        neptune.draw(g, 59800);
    }
    
    public void keyPressed(KeyEvent e) {
        
    }
}
