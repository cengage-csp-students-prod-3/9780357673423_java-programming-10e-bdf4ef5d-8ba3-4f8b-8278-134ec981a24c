import java.util.Scanner;

public class NineInts {
    public static void main(String[] args) {
        // 1. Declare an array named 'numbers' to store nine integers
        int[] numbers = new int[9];
        Scanner input = new Scanner(System.in);

        // 2. Prompt user for input (do not hard-code)
        System.out.println("Please enter 9 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // 3. Display the integers from first to last
        System.out.println("\nIntegers from first to last:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // 4. Display the integers from last to first
        System.out.println("\nIntegers from last to first:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println(); // For a clean final line
    }
}
