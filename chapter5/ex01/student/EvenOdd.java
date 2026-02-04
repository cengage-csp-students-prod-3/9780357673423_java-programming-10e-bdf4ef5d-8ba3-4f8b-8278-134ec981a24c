// Write your code here 
/*
ANALYSIS
    given an integer, display a statement that indicates whether the integer is even or odd.
DESIGN
    INPUT
        int getNumber
    LOGIC
        if getNumber%2=0 
            print(getNumber " is even")
        else
            print("is odd")
*/

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        int getNumber;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number >> ");
        getNumber = keyboard.nextInt();
        isEven(getNumber);
    }
    public static int isEven(int getNumber){
        if ((getNumber%2) == 0) 
            System.out.println(getNumber+" is even.");
        else
            System.out.println(getNumber+" is odd.");
        return getNumber;
    }
}