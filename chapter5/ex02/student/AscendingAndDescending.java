// Write your code here
/*
Write an application called AscendingAndDescending that asks a user to enter three integers. 
Display them in ascending and descending order.
*/

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Enter an integer...");
        n1 = keyboard.nextInt();        
        System.out.print("And another...");
        n2 = keyboard.nextInt();
        System.out.print("And just one more... ");
        n3 = keyboard.nextInt();
        
        //ascending order
        System.out.print("Ascending:");
        if (n1 >= n2 && n1 >= n3) {
            if (n2 > n3) {
                System.out.println(n1+" "+n2+" "+n3);
            }
            else if(n3>n2) {
                System.out.println(n1+" "+n3+" "+n2);
            }
        }
        if (n2 >= n1 && n2 >= n3) {
            if (n1 > n3) {
                System.out.println(n2+" "+n1+" "+n3);
            }
            else if(n3>n1) {
                System.out.println(n2+" "+n3+" "+n1);
            }
        }
        if (n3 >= n1 && n3 >= n2) {
            if (n2 > n1) {
                System.out.println(n3+" "+n2+" "+n1);
            }
            else if(n1>n2) {
                System.out.println(n3+" "+n1+" "+n2);
            }
        }
        //descending order
        System.out.print("Descending:");
        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println(n3+" "+n2+" "+n1);
            }
            else if(n3<n2) {
                System.out.println(n2+" "+n3+" "+n1);
            }
        }
        if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println(n3+" "+n1+" "+n2);
            }
            else if(n3<n1) {
                System.out.println(n1+" "+n3+" "+n2);
            }
        }
        if (n3 < n1 && n3 < n2) {
            if (n2 < n1) {
                System.out.println(n1+" "+n2+" "+n3);
            }
            else if(n1<n2) {
                System.out.println(n3+" "+n1+" "+n3);
            }
        }
    }
}
