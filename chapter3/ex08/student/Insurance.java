// Write your code here
import java.util.Scanner;

public class Insurance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for current year and birth year
        System.out.print("Enter the current year >> ");
        int currentYear = input.nextInt();
        
        System.out.print("Enter the birth year >> ");
        int birthYear = input.nextInt();

        // Call the method and store the result
        int premium = calculatePremium(currentYear, birthYear);

        // Display the result
        System.out.println("The premium is $" + premium);
    }

    /**
     * Calculates insurance premium based on the decade of the customer's age.
     * Logic: ((Age Decade) + 15) * 20
     */
    public static int calculatePremium(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        
        // Calculate the decade (e.g., 34 becomes 3)
        int decade = age / 10;
        
        // Apply the formula provided in the prompt
        int premium = (decade + 15) * 20;
        
        return premium;
    }
}
