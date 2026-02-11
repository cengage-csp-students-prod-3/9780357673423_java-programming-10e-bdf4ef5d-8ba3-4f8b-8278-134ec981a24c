import java.util.Scanner;

public class ShadyRestRoom {

    public static void main(String[] args) {
        int getChoose;
        System.out.println("Menu:");
        System.out.println("(1) Queen bed");
        System.out.println("(2) King bed");
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
                System.out.println("You selected suite with a king bed and a pullout couch $165");
                break;
            default:
                System.out.println("You enter an invalid code $0");
        }
    }
}