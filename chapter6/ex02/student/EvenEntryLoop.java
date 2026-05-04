// Write your code here
import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumber;
        final int SENTINEL = 999;

        // Initial prompt
        System.out.print("Enter an even number or 999 to quit >> ");
        userNumber = input.nextInt();

        while (userNumber != SENTINEL) {
            if (userNumber % 2 == 0) {
                // If the number is even
                System.out.println("Good job!");
            } else {
                // If the number is odd (and not 999)
                System.out.println(userNumber + " is not an even number");
            }

            // Prompt again for the next loop iteration
            System.out.print("Enter an even number or 999 to quit >> ");
            userNumber = input.nextInt();
        }
        
        input.close();
    }
}
