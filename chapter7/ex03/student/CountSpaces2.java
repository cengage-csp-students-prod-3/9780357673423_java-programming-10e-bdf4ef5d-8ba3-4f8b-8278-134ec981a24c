// Write your code here
import java.util.Scanner;

public class CountSpaces2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter an inspirational quote >> ");
        String quote = input.nextLine();
        
        int spaceCount = 0;

        // Count the spaces in the user-provided string
        for (int i = 0; i < quote.length(); i++) {
            if (quote.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        System.out.println("The number of spaces is " + spaceCount);
        
        input.close();
    }
}
