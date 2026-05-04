import java.util.Scanner;

public class RetirementGoal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int years;
        double annualSavings;

        // Validate years until retirement
        System.out.print("How many years until retirement? >> ");
        years = input.nextInt();
        while (years <= 0) {
            System.out.println("Please enter a number greater than 0.");
            System.out.print("How many years until retirement? >> ");
            years = input.nextInt();
        }

        // Validate annual savings amount
        System.out.print("How much can you save annually? >> ");
        annualSavings = input.nextDouble();
        while (annualSavings <= 0) {
            System.out.println("Please enter a number greater than 0.");
            System.out.print("How much can you save annually? >> ");
            annualSavings = input.nextDouble();
        }

        // Calculate total (no interest)
        double totalSaved = years * annualSavings;

        // Display results
        System.out.printf("If you save $%.0f for %d years, you will have $%.0f\n", 
                          annualSavings, years, totalSaved);
    }
}
