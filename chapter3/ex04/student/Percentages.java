import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;

        // Prompt user for values
        System.out.print("Enter a double >> ");
        num1 = input.nextDouble();
        System.out.print("Enter another double >> ");
        num2 = input.nextDouble();

        // First call: num1 as percentage of num2
        computePercent(num1, num2);

        // Second call: num2 as percentage of num1
        computePercent(num2, num1);
    }

    public static void computePercent(double x, double y) {
        double percentage = (x / y) * 100;
        System.out.println(x + " is " + percentage + " percent of " + y);
    }
}
