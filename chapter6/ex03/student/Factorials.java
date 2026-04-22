// Write your code here
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit;

        // Prompt user for input
        System.out.print("Enter a number to compute factorial >> ");
        limit = input.nextInt();

        // Loop from 1 to the user-entered limit
        for (int i = 1; i <= limit; i++) {
            int factorial = 1;
            
            // Calculate factorial for the current number 'i'
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            
            System.out.println("The factorial of " + i + " is " + factorial);
        }
    }
}
