// Write your code here
import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sandwich mySandwich = new Sandwich();

        // Prompting for data
        System.out.print("Enter main sandwich ingredient >> ");
        String ingredient = input.nextLine();
        mySandwich.setMainIngredient(ingredient);

        System.out.print("Enter bread type >> ");
        String breadType = input.nextLine();
        mySandwich.setBread(breadType);

        System.out.print("Enter sandwich price >> ");
        double price = input.nextDouble();
        mySandwich.setPrice(price);

        // Displaying results
        System.out.println("You have ordered a " + mySandwich.getMainIngredient() + 
            " sandwich on " + mySandwich.getBread() + " bread, and the price is " + 
            mySandwich.getPrice());
            
        input.close();
    }
}
