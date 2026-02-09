// Write your code here

/*
 the program determines the price of a room. Ask the user to choose 1 for a queen bed, 
 2 for a king, or 3 for a king and a pullout couch. The output echoes the input and displays 
 the price of the room: $125 for queen, $139 for king, and $165 for a suite with a king bed 
 and a pullout couch. If the user enters an invalid code, display an appropriate message 
 and set the price to 0.
*ask for one of thes eoptions
(1) Queen bed
(2) King bed
(3) Suite with a king bed and pull-out couch

    input 
Enter Selection (1, 2, or 3

    output
The output echoes the input and displays the price of the room: $125 for queen, $139 for king, 
and $165 for a suite with a king bed and a pullout couch. 
*If the user enters an invalid code, display please choose a valid caode of purshase; total order $0.
*/

import java.util.Scanner;

public class ShadyRestRoom2 {

    public static void main(String[] args) {
        int getChoose;
        System.out.println("Menu:");
        System.out.println("(1) Queen bed");
        System.out.println("(2) king bed");
        System.out.println("(3) Suite with a king bed and pull-out couch");    
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Selection (1, 2, or 3) >> ");    
        getChoose = keyboard.nextInt();
        switch (getChoose) {
            case 1: 
                System.out.println("You selected Queen bed $125");                
                break;
            case 2:
                System.out.println("You selected King bed $139");                
                break;
            case 3:
                System.out.println("You selected king bed and pull-out couch $165");  
                break;                              
            default:
                System.out.println("please choose a valid caode of purshase; your order balance is $0.");
                break;
        }
    }
}