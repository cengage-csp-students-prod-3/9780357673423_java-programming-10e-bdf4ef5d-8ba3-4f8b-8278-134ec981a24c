// Write your code here
import java.util.Scanner;
/*
 VARIABLES
final double dozenEggPrice = 3.25
final double singleEggPrice = 0.45
int quantityEggs 
int dozen = 12
int totaloutOfDozen = qE % dZ
int totalDozen = quantityEggs / dozen
int totalDozenPrice = totalDozen * dozenEggPrice
int totaloutOfDozenPrice = outOfDozen * singleEggPrice
int totalPrice = totalDozenPrice + outOfDozenPrice

INPUT << number of eggs in the order

OUTPUT >> 
You ordered +quantityEggs+ eggs. That's +totalDozen+ dozen at +dozenEggPrice+ per dozen and +outOfDozen+ loose eggs 
at singleEggPrice cents each for a total of  
*/
public class Eggs {
    public static void main(String[] args) {
        final double dozenEggPrice = 3.25;
        final double singleEggPrice = 0.45;
        final int dozen = 12;
        int quantityEggs;
        Scanner inputEggs = new Scanner(System.in);
        System.out.print("Enter the quantity of eggs order << ");
        quantityEggs = inputEggs.nextInt();
        int totalDozen = quantityEggs / dozen;
        int totaloutOfDozen = quantityEggs % dozen;
        double totalDozenPrice = totalDozen * dozenEggPrice;
        double totaloutOfDozenPrice = totaloutOfDozen * singleEggPrice;
        double totalPrice = totalDozenPrice + totaloutOfDozenPrice;
        System.out.println("You ordered "+quantityEggs+" eggs. That's "+totalDozen+" dozen at $"+dozenEggPrice+ " per dozen and "+totaloutOfDozen+" loose eggs at $"+singleEggPrice+" cents each for a total of $"+totalPrice);
    }
}