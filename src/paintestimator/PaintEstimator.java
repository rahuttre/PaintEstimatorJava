/*
 * Name: Ryan Hutton
 * Assignment: 2.20 ZyBooks Lab "Painting a Wall"
 * Course: IT 145 - Foundations in Application Development
 * Institution: Southern New Hampshire University
 * Date: 13 March 2019
 */

//package paintestimator;
import java.util.Scanner;
import java.lang.Math;  

public class PaintEstimator {
    public static void main(String[] args) {
        
      Scanner scnr = new Scanner(System.in);
      double wallHeight = 0.0;
      double wallWidth = 0.0;
      double wallArea = 0.0;
      double gallonsPaintNeeded = 0.0;
      int cansNeeded = 0;
      
      final double squareFeetPerGallons = 350.0;
      final double gallonsPerCan = 1.0;
      
      System.out.println("Enter wall height (feet): ");
      wallHeight = scnr.nextDouble();
      
      //Changed wallHeight to wallWidth. This was a logic error.
      System.out.println("Enter wall width (feet): ");
      wallWidth = scnr.nextDouble();
      
      // Calculate and output wall area
      wallArea = wallHeight * wallWidth;
      System.out.println("Wall area: " + wallArea + " square feet");
      
      // Calculate and output the amount of paint in gallons needed to paint the wall
      // Corrected gallonspaintneeded to gallonsPaintNeeded -> this was a syntax error
      gallonsPaintNeeded = wallArea / squareFeetPerGallons;
      System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
      
      // Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
      // Added the round methon from java.lang.Math to round up.  Each variable must be converted to an int.
      cansNeeded = (int) Math.round(gallonsPaintNeeded) / (int) Math.round(gallonsPerCan);  //Hint: this line is missing two operations
      System.out.println("Cans needed: " + cansNeeded + " can(s)");  

      //return;
   }
}