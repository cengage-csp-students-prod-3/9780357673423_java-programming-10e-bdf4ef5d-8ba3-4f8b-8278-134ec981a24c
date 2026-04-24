// Write your code here
import java.util.Scanner;

public class NumbersDemo {

    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer >> ");
        num1 = input.nextInt();
        System.out.print("Enter another integer >> ");
        num2 = input.nextInt();

        // Process first number
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        // Process second number
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }

    public static void displayTwiceTheNumber(int n) {
        int result = n * 2;
        System.out.println(n + " times 2 is " + result);
    }

    public static void displayNumberPlusFive(int n) {
        int result = n + 5;
        System.out.println(n + " plus 5 is " + result);
    }

    public static void displayNumberSquared(int n) {
        int result = n * n;
        System.out.println(n + " squared is " + result);
    }
}
