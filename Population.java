
/**
 * Population growth rate calculator based on user inputs of current population, beginning population and units 
 * time between.
 * 
 * Formula r(rate)=(log(P/Po))/t(time)
 * 
 * @Jane MacIsaac 0078864 
 * @06 October 2017
 */

import java.util.Scanner;

public class Population
{    
    public static void main (String[]args)
    {
        Scanner in = new Scanner (System.in);
        System.out.print ("What was the starting population?    ");
        double startpop = in.nextDouble();
        
        System.out.print ("What was the final population?       ");
        double finalpop = in.nextDouble();
        
        System.out.print ("Time between measurements:           ");
        double time = in.nextDouble();
        
        double rate = (Math.log(finalpop/startpop))/time;
        System.out.printf ("The rate of growth is:  %8.2f%%", rate*100);
        
    }
    
}
