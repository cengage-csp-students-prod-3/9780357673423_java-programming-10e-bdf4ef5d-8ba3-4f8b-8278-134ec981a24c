// Write your code here
import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for dimensions
        System.out.print("Enter the room's length >> ");
        double length = input.nextDouble();
        
        System.out.print("Enter the room's width >> ");
        double width = input.nextDouble();
        
        System.out.print("Enter the room's height >> ");
        double height = input.nextDouble();

        // Pass values to computeArea and get the final price back
        double totalPrice = computeArea(length, width, height);

        // Display final price
        System.out.println("The price to paint the room is $" + totalPrice);
    }

    public static double computeArea(double length, double width, double height) {
        // Calculate wall area: 2 walls are (height * length) and 2 walls are (height * width)
        double area = 2 * height * (length + width);

        // Get gallons needed by calling computeGallons
        double gallonsNeeded = computeGallons(area);

        // Display number of gallons
        System.out.println("You will need " + gallonsNeeded + " gallons");

        // Compute price ($32 per gallon)
        double price = gallonsNeeded * 32.0;

        return price;
    }

    public static double computeGallons(double area) {
        // A gallon covers 350 square feet
        final double SQ_FT_PER_GALLON = 350.0;
        return area / SQ_FT_PER_GALLON;
    }
}
