/*
Add a prompt to the ShadyRestRoom application to ask the user to specify a 
(1) lake view or a (2) park view, but ask that question only if the bed size 
entry is valid. Add $15 to the price of any room with a lake view. If the view 
value is invalid, display an appropriate message and assume that the price is 
for a room with a lake view. 
*/

import java.util.Scanner;

public class ShadyRestRoom2 {
    public static void main(String[] args) {
        int getChoose;
        int getView;
        final int queen = 125;
        final int king = 139;
        final int kingCouch = 165;
        System.out.println("Menu:");
        System.out.println("(1) Queen bed");
        System.out.println("(2) King bed");
        System.out.println("(3) Suite with a king bed and pull-out couch");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Selection (1, 2, or 3) >> ");
        getChoose = keyboard.nextInt();
        System.out.println("Please choose a view:");
        System.out.println("(1) a lake");
        System.out.println("(2) a park");
        System.out.println("Enter Selection (1 or 2) >> ");
        getView= keyboard.nextInt(); 
             
        switch (getChoose) {
            case 1:
                if (getView == 1) {
                    System.out.println("You selected Queen bed with a lake view $"+(140+15));                
                } else if (getView == 2) {
                    System.out.println("You selected Queen bed with a park view $125");
                } else {
                    System.out.println("Invalid entry view $"+(140+15));
                }
                break;
            case 2:
                if (getView == 1) {
                    System.out.println("You selected King bed with a lake view $"+(139+15));                
                } else if (getView == 2) {
                    System.out.println("You selected King bed with a park view $"+(139));
                } else {
                    System.out.println("Invalid entry view $"+(139+15));
                }                
                break;
            case 3:
                if (getView == 1) {
                    System.out.println("You selected King bed and a pullout couch with a lake view $"+(156+15));                
                } else if (getView == 2) {
                    System.out.println("You selected King and a  pullout couch bed with a park view $"+165);
                } else {
                    System.out.println("Invalid entry view $"+(156+15));
                }
                break;
            default:
                System.out.println("You enter an invalid code $0");
        }
    }
}
