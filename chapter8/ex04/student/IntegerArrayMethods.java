// Write your code here
import java.util.Scanner;

public class IntegerArrayMethods {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + " >> ");
            numbers[i] = input.nextInt();
        }

        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, 12);
        displayHigherThanAverage(numbers);
    }

    // (1) Display all integers
    public static void display(int[] arr) {
        System.out.print("The numbers are ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // (2) Display integers in reverse order
    public static void displayReverse(int[] arr) {
        System.out.print("The numbers in reverse order are ");
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // (3) Display the sum
    public static void displaySum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        System.out.println("The sum of all numbers is " + sum);
    }

    // (4) Display values less than the limit (12)
    public static void displayLessThan(int[] arr, int limit) {
        boolean found = false;
        for (int val : arr) {
            if (val < limit) {
                System.out.print(val + " ");
                found = true;
            }
        }
        if (!found) System.out.print("No values are less than " + limit);
        else System.out.print("are less than the limit " + limit);
        System.out.println();
    }

    // (5) Display values higher than average
    public static void displayHigherThanAverage(int[] arr) {
        double sum = 0;
        for (int val : arr) sum += val;
        double avg = sum / arr.length;
        
        System.out.println("The average is " + avg);
        for (int val : arr) {
            if (val > avg) System.out.print(val + " ");
        }
        System.out.println("are greater than the average");
    }
}
