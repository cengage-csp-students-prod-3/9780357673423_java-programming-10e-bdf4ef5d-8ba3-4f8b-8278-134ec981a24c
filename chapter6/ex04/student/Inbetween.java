// Write your code here
import java.util.Scanner;

public class Inbetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer >> ");
        int num1 = input.nextInt();
        System.out.print("Enter another integer >> ");
        int num2 = input.nextInt();

        // Determine which number is smaller and which is larger
        int low = Math.min(num1, num2);
        int high = Math.max(num1, num2);

        // Check if there are any integers between them
        if (high - low <= 1) {
            System.out.println("There are no integers between " + num1 + " and " + num2);
        } else {
            System.out.print("The numbers between " + num1 + " and " + num2 + " include: ");
            
            // Loop from the next number after the low to the one before the high
            for (int i = low + 1; i < high; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); // New line for clean output
        }
    }
}
