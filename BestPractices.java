/**
 * This is a class to describe the programming practices and conventions that
 * should be used when programming for The Robo Lions 1261. It is the Lead Programmer's 
 * and the Webmaster's responsibility to keep up with and update this code as necessary,
 * and to enforce it amongst programmers.
 * 
 * @author Tejas Shah
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
/** 
* imports belong above the class declaration in this format
* Always scrutinize imports and make sure you are not importing unneccesary class or variables
* for example, I didn't import all of the logging classes (java.util.logging.*) because I only need two of them
*/

public class BestPractices { 
    // classes are always to start like this, with the open curly bracket on the same line as the class declaration
    
    // Next come the constant variables
    public final int FINAL_VAR = 3; // final variables are to be uppercase and use the keyword 'final' in their declaration
    public final int FINAL_INT = 2;
    public final int FINAL_NUM = 1;
    
    // blocks of final variables that are related to each other should be separated like so
    public final String TEAM_NAME = "Robo Lions";
    public final int TEAM_NUMBER = 1261;
    public final int YEAR_MADE = 2004;
    public final String COMPETITION = "First Robotics Competition";
    
    // then are the private variables; these ones are usually not final because they fluctuate, but are only used in this class
    // these guys use snake_case as variable names
    private int blue_banners = 8;
    private int deans_list_winners = 1;
    private int members = 40;
    
    //                                                          |
    // This is the logger,                                      |
    // our new System.out.println for debugging               \ | /  This 'BestPractices' should be named after your class
    //                                                          V
    private static final Logger LOGGER = Logger.getLogger(BestPractices.class.getName() );
    
    /** 
    * If a constructor is needed, it should always be the first method
    */
    public BestPractices() {} // if the constructor is blank, declare it like so to minimize wasted line space
    
    /**
     * Above each method should lie a block explaining its function
     * (ex. Doubles a given parameter)
     */
    public int sampleMethod(int parameter) {
        int return_value = parameter * 2; // all local variables (as well as parameters) in a function need to use snake_case
        return (return_value);
    }
    
    /**
     * Computes a side length of a triangle using the law of cosines
     * given the two other side lengths and the side length's angle
     */
    // function names follow camelCase: first word is lowercase, every word after that is upper case
    public double lawOfCosines(double side1, double side2, double angle) {
        double b = side1;
        double c = side2; // try to make parameters easy to understand and local variables easy to implement
        double A = angle;
        double a = Math.sqrt(
            Math.pow(b,2) +    // when coding out complex algorithms, separate out the math by making a new line with every + or - operation
            Math.pow(c,2) -
            (2 * b *c * Math.cos(A))
        );
        return (a);
    }
    
    // If you don't want to use a particular chunk of code, comment it out like so - DON'T DELETE IT - you may need it again later
    /**
    public static void unUsedFunction(double useless_for_now) {
        return(0/0);
    }
    */
    
    private int i = 0;  // THIS IS WRONG! NEVER DEFINE PRIVATE VARIABLES IN THE BODY! ALWAYS AT THE TOP!
    
    /**
     * Shows an example of how to implement the Logger, our new debugging friend
     */
    // functions can also be used to just store and execute certain chunks of code at certain times - not always input/output
    public void logExample() {
        String message = "Hi There!";
        LOGGER.info(message); // this is how we are going to debug - log variables we want to track rather than print them!
        // this prints the message in a separate, easy to track window!
    }
    
    /**
     * Disables all Logger messages from appearing on the console at all
     */
    public void disableLogger() {
        // the benefit of using Logger is that all error messages can easily and quickly be shut down, so that nothing prints!
        LOGGER.setLevel(Level.OFF); 
    }
    
    /**
     * Other things:
     * 
     * We generally don't encourage the use of 'for' or 'while' loops to solve complex problems
     * We also don't do raw input through Scanner or the rampant use of @Override except in Robot.java
     * Always use Switch/Case over a series of if statements
     * Make sure the code is clean and consise, 
     * Only use System.out.println until the SmartDashboard is up and running and only use it to know values; not debugging!
     * You are encouraged to add memes and puns as single-line comments just to break the monotony of programming! Don't go like over the top though. We draw the line at short stories.
     * 
     * Thank you for reading! - 1261 Programming
     */
} // the closing bracket of the class should be the only thing on the last line of every program