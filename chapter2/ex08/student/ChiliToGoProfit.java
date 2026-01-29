// Write your code here
/*
double mealAdultProduce
double mealChildProduce
int adultMeals
int childMeals
double adultProfitOrder = (mealAdultPrice - mealAdultProduce) *adultMeals
double childProfitOrder = (mealChildPrice - mealChildProduce) *childMeals
double totalProfit = adultProfitOrder + childProfitOrder
*/
import java.util.Scanner;

public class ChiliToGoProfit {

    public static void main(String[] args) {
        final double mealAdultPrice = 7;
        final double mealChildPrice = 4;
        final double mealAdultProduce = 4.35;
        final double mealChildProduce = 3.10;
        int adultMeals;
        int childMeals;
        double totalAdultMeals;
        double totalChildMeals;
        double totalOrder;
        double adultProfitOrder;
        double childProfitOrder;
        double totalProfit;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of adult meals ordered >>");
        adultMeals = keyboard.nextInt();
        System.out.print("Enter number of child meals ordered >>");
        childMeals = keyboard.nextInt();
        totalAdultMeals = mealAdultPrice * adultMeals;
        totalChildMeals = mealChildPrice * childMeals;
        totalOrder = totalAdultMeals + totalChildMeals;
        System.out.println(adultMeals+" adult meals were ordered at "+mealAdultPrice+ "each");
        System.out.println("        Total is "+totalAdultMeals);
        System.out.println(childMeals+" adult meals were ordered at "+mealChildPrice+ "each");
        System.out.println("        Total is "+totalChildMeals);
        System.out.println("Grand total for all meals is $"+totalOrder);
        System.out.println("Profits");
        adultProfitOrder = (mealAdultPrice - mealAdultProduce) * adultMeals;
        System.out.println("        Adult profit is $"+adultProfitOrder);
        childProfitOrder = (mealChildPrice - mealChildProduce) * childMeals;
        System.out.println("        Child profit is $"+childProfitOrder);
        totalProfit = adultProfitOrder + childProfitOrder;
        System.out.println("Total profit is $"+totalProfit);
    }
    
}