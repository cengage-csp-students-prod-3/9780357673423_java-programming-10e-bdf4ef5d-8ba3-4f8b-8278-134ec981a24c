// Write your code here
import java.util.Scanner;

public class JobPricing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jobDescription;
        double materialCost;
        double workHours;
        double travelHours;
        double totalPrice;

        // Prompt user for input
        System.out.print("Enter job description >> ");
        jobDescription = input.nextLine();

        System.out.print("Enter cost of materials >> ");
        materialCost = input.nextDouble();

        System.out.print("Enter hours on the job work >> ");
        workHours = input.nextDouble();

        System.out.print("Enter hours traveling >> ");
        travelHours = input.nextDouble();

        // Call the method to compute price
        totalPrice = computePrice(materialCost, workHours, travelHours);

        // Display results
        System.out.println("The price for " + jobDescription + " is $" + totalPrice);
        
        input.close();
    }

    // Method to calculate the total estimate
    public static double computePrice(double materials, double work, double travel) {
        final int WORK_RATE = 35;
        final int TRAVEL_RATE = 12;
        
        return materials + (work * WORK_RATE) + (travel * TRAVEL_RATE);
    }
}
