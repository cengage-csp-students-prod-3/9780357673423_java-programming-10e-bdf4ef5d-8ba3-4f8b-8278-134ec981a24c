// Write your code here
/*
double mealAdultPrice = 7
double mealChildPrice = 4
int adultMeals 
int childMeals
double totalAdultMeals = mealAdultPrice * adultMeals
double totalChildMeals = mealChildPrice * childMeals
double totalOrder = totalAdultMeals + totalChildMeals
*/

import java.util.Scanner;

public class ChiliToGo {

    public static void main(String[] args) {
        final double mealAdultPrice = 7;
        final double mealChildPrice = 4;
        int adultMeals;
        int childMeals;
        double totalAdultMeals;
        double totalChildMeals;
        double totalOrder;
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
    }
}