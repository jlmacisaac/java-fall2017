
/**
 * This program will calculate volume of water in ice cube tray
 * using formula v=4/3 Pi r^3
 * @JaneMacIsaac
 * @DueOctober62017
 */

import java.util.Scanner;

public class IceCube
{
    public static void main (String[]args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println ("Filling an Ice Cube Tray...");
      System.out.println();
      
      System.out.print ("How many ice cubes across?    ");
      double across = sc.nextDouble();
      sc.nextLine();
      
      System.out.print ("How many ice cubes down?      ");
      double down = sc.nextDouble();
      sc.nextLine();
            
      double totalcubes = across * down;
      
      System.out.print ("What is the diameter of each cube (cm)?     ");
      double diameter = sc.nextDouble();
      
      double radius = diameter/2;
      double cubevol = (4/3) * Math.PI * Math.pow(radius,3);
      double totalvol = (cubevol/1000) * totalcubes;
      System.out.printf ("You will need %3.2f litres of water." , totalvol);
      
                           
      
    }
}
 
