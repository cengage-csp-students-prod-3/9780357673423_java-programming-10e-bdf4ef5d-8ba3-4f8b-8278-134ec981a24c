// Write your code here
import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("oil change\ntire rotation\nbattery check\nbrake inspection");
        System.out.print("Enter selection >> ");
        String selection = input.nextLine();

        int price = 0;
        if (selection.equals("oil change")) price = 25;
        else if (selection.equals("tire rotation")) price = 22;
        else if (selection.equals("battery check")) price = 15;
        else if (selection.equals("brake inspection")) price = 5;

        if (price != 0) {
            System.out.println(selection + " price is $" + price);
        } else {
            System.out.println("Invalid item entered.");
        }
    }
}
