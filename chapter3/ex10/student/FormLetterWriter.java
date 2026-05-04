// Write your code here
import java.util.Scanner;

public class FormLetterWriter {

    // Overloaded method with one parameter
    public static void displaySalutation(String firstName) {
        System.out.println("Dear " + firstName + ",");
        displayLetterBody();
    }

    // Overloaded method with two parameters
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        displayLetterBody();
    }

    // Helper method to display the rest of the letter
    public static void displayLetterBody() {
        System.out.println("   Thank you for your recent order.\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first name >> ");
        String first = input.nextLine();
        System.out.print("Enter last name >> ");
        String last = input.nextLine();
        System.out.println();

        // Test the first overloaded method
        displaySalutation(first);

        // Test the second overloaded method
        displaySalutation(first, last);
    }
}
