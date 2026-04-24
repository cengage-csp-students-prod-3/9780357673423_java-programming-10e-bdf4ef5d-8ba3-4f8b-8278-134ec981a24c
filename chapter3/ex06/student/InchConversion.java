// Write your code here
import java.util.Scanner;

public class InchConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inches;

        // Prompt user for input
        System.out.print("Enter inches >> ");
        inches = input.nextDouble();

        // Pass value to conversion methods
        convertToFeet(inches);
        convertToYards(inches);
    }

    // Method to convert inches to feet (12 inches = 1 foot)
    public static void convertToFeet(double inches) {
        final int INCHES_IN_FOOT = 12;
        double feet = inches / INCHES_IN_FOOT;
        System.out.println(inches + " inches is " + feet + " feet");
    }

    // Method to convert inches to yards (36 inches = 1 yard)
    public static void convertToYards(double inches) {
        final int INCHES_IN_YARD = 36;
        double yards = inches / INCHES_IN_YARD;
        System.out.println(inches + " inches is " + yards + " yards");
    }
}
