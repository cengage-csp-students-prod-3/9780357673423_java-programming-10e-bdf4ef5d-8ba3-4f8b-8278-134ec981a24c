import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Prompt user for 10 integers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + " >> ");
            numbers[i] = input.nextInt();
        }

        // Call the five methods
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, 12);
        displayHigherThanAverage(numbers);
    }

    // (1) Display all integers
    public static void display(int[] array) {
        System.out.print("The numbers are ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // (2) Display all integers in reverse order
    public static void displayReverse(int[] array) {
        System.out.print("The numbers in reverse order are ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // (3) Display the sum of the integers
    public static void displaySum(int[] array) {
        int sum = 0;
        for (int val : array) {
            sum += val;
        }
        System.out.println("The sum of all numbers is " + sum);
    }

    // (4) Display values less than the limit (12)
    public static void displayLessThan(int[] array, int limit) {
        boolean found = false;
        for (int val : array) {
            if (val < limit) {
                System.out.print(val + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("No values are less than " + limit);
        } else {
            System.out.print("are less than the limit " + limit);
        }
        System.out.println();
    }

    // (5) Display values higher than the calculated average
    public static void displayHigherThanAverage(int[] array) {
        double sum = 0;
        for (int val : array) {
            sum += val;
        }
        double average = sum / array.length;
        System.out.println("The average is " + average);

        for (int val : array) {
            if (val > average) {
                System.out.print(val + " ");
            }
        }
        System.out.println("are greater than the average");
    }
}
