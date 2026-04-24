// Write your code here
import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        String name;
        double gpa;
        Scanner input = new Scanner(System.in);

        // Prompt user for name
        System.out.print("Enter your name >> ");
        name = input.nextLine();

        // Prompt user for GPA
        System.out.print("Enter your gpa >> ");
        gpa = input.nextDouble();

        // Pass values to the computeDiscount method
        computeDiscount(name, gpa);
    }

    public static void computeDiscount(String name, double gpa) {
        // Calculate credit as 10 times the GPA
        double credit = gpa * 10;

        // Display descriptive message
        System.out.println(name + ", your GPA is " + gpa + ", so your credit is $" + credit);
    }
}
