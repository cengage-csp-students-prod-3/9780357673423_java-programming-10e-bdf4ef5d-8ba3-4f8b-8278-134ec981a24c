// Write your code here
import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("oil change\ntire rotation\nbattery check\nbrake inspection");
        System.out.print("Enter selection >> ");
        String selection = input.nextLine();

        // Safety check to ensure the string has at least 3 characters
        String prefix = selection.length() >= 3 ? selection.substring(0, 3) : "";
        int price = 0;
        String fullServiceName = "";

        if (prefix.equals("oil")) {
            price = 25;
            fullServiceName = "oil change";
        } else if (prefix.equals("tir")) {
            price = 22;
            fullServiceName = "tire rotation";
        } else if (prefix.equals("bat")) {
            price = 15;
            fullServiceName = "battery check";
        } else if (prefix.equals("bra")) {
            price = 5;
            fullServiceName = "brake inspection";
        }

        if (price != 0) {
            System.out.println(fullServiceName + " price is $" + price);
        } else {
            System.out.println("Invalid item entered.");
        }
    }
}
