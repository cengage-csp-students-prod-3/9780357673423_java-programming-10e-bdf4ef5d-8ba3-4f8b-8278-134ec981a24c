// Write your code here
import java.util.Scanner;

public class RetirementGoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Get User Input
        System.out.print("How many years until retirement? >> ");
        int years = input.nextInt();
        System.out.print("How much can you save annually? >> ");
        double annualSavings = input.nextDouble();

        // 2. Calculation without interest
        double totalWithoutInterest = annualSavings * years;

        // 3. Calculation with 4% interest
        double rate = 0.04;
        double totalWithInterest = 0;
        
        // Using a loop to simulate yearly compounding
        for (int i = 0; i < years; i++) {
            totalWithInterest = (totalWithInterest + annualSavings) * (1 + rate);
        }
        
        // Note: The example output shows slightly different math 
        // depending on if interest is applied at the start or end of the year.
        // If the formula above doesn't match exactly, try:
        // totalWithInterest = annualSavings * (Math.pow(1 + rate, years) - 1) / rate;

        // 4. Display Results
        System.out.println("If you save $" + (int)annualSavings + " for " + years + 
                           " years without interest, you will have $" + (int)totalWithoutInterest);
        System.out.println("If you save $" + (int)annualSavings + " for " + years + 
                           " years, with 4.0% interest, you will have $" + totalWithInterest);
    }
}
