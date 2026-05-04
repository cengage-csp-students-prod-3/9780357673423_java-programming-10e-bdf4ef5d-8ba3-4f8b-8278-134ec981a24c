// Write your code here
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[15];
        double entry;
        double total = 0;
        int count = 0;
        final int QUIT = 99999;
        final int MAX = 15;

        System.out.print("Enter a numeric value or " + QUIT + " to quit >> ");
        entry = input.nextDouble();

        while (entry != QUIT && count < MAX) {
            numbers[count] = entry;
            total += entry;
            count++;
            
            if (count < MAX) {
                System.out.print("Enter next numeric value or " + QUIT + " to quit >> ");
                entry = input.nextDouble();
            }
        }

        if (count == 0) {
            System.out.println("Error: No numbers were entered.");
        } else {
            double average = total / count;
            System.out.println("You entered " + count + " numbers and their average is " + average);
            
            for (int i = 0; i < count; i++) {
                double distance = numbers[i] - average;
                System.out.println(numbers[i] + " is " + distance + " away from the average");
            }
        }
    }
}
