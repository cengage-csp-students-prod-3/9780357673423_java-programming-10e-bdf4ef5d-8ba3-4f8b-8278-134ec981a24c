// Write your code here
import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initial populations in millions
        double mexicoPop = 128.0;
        double usPop = 323.0;
        int years = 0;

        // Get user input for rates
        System.out.println("Enter the percent annual increase for Mexico population");
        System.out.println("Enter as a decimal.");
        System.out.println("For example, 0.5% is entered as 0.005");
        System.out.print("Enter the value >> ");
        double mexicoRate = input.nextDouble();

        System.out.println("Enter the percent annual decrease for U.S. population");
        System.out.println("Enter as a decimal.");
        System.out.println("For example, 0.5% is entered as 0.005");
        System.out.print("Enter the value >> ");
        double usRate = input.nextDouble();

        System.out.println("\nMexico population\tU.S. Population");

        // Loop until Mexico exceeds the U.S.
        while (mexicoPop <= usPop) {
            years++;
            
            // Calculate new populations
            mexicoPop += (mexicoPop * mexicoRate);
            usPop -= (usPop * usRate);

            // Display yearly progress
            System.out.println(years + " " + mexicoPop + " million\t" + usPop + " million");
        }

        // Final summary
        System.out.println("\nThe population of Mexico will exceed the U.S. population in " + years + " years");
        System.out.println("The population of Mexico will be " + mexicoPop + " million");
        System.out.println("and the population of the U.S. will be " + usPop + " million");
        
        input.close();
    }
}
