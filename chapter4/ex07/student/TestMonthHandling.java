// Write your code here
import java.time.LocalDate;
import java.util.Scanner;

public class TestMonthHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- First Date Input ---
        System.out.print("Enter month >> ");
        int month1 = input.nextInt();
        System.out.print("Enter day >> ");
        int day1 = input.nextInt();
        System.out.print("Enter year >> ");
        int year1 = input.nextInt();
        LocalDate date1 = LocalDate.of(year1, month1, day1);

        // --- Second Date Input ---
        System.out.print("Enter month >> ");
        int month2 = input.nextInt();
        System.out.print("Enter day >> ");
        int day2 = input.nextInt();
        System.out.print("Enter year >> ");
        int year2 = input.nextInt();
        LocalDate date2 = LocalDate.of(year2, month2, day2);

        // --- Output Calculations ---
        System.out.println("First date " + date1);
        System.out.println("Second date " + date1.plusMonths(1));
        System.out.println("Third date " + date1.plusMonths(2));
        System.out.println("Fourth date " + date1.plusMonths(3));

        System.out.println("First date " + date2);
        System.out.println("Second date " + date2.plusMonths(1));
        System.out.println("Third date " + date2.plusMonths(2));
        System.out.println("Fourth date " + date2.plusMonths(3));
    }
}
