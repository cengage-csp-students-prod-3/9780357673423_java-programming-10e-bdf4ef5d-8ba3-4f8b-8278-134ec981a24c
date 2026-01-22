import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded;
        int totalGallons;
        Scanner getQuarts = new Scanner(System.in);
        System.out.print("Enter quarts needed >>");
        quartsNeeded = getQuarts.nextInt();
        totalGallons = quartsNeeded / QUARTS_IN_GALLON;
        System.out.println("A job that needs "+quartsNeeded+" quarts requires "+totalGallons+" gallons plus 1 quarts.");
   }
}