import java.util.Scanner;

public class inchesToFeetInteractive {
    public static void main(String[] args) {
        final int FEET = 12;
        int inches;
        Scanner getInches = new Scanner(System.in);
        System.out.print("Enter inches >>");
        inches = getInches.nextInt();
        int totalFeets = inches/FEET;
        int totalInches = inches%FEET;
        System.out.println(inches+" inches is "+totalFeets+" feet and "+totalInches+" inches");
        Scanner getMiles = new Scanner(System.in);
        System.out.print("Enter miles >>");
        int miles = getMiles.nextInt();
        MileConversions(miles);
    }
    public static int MileConversions(int miles) {
        final int inches = 63360;
        final int feets = 5280;
        final int yards = 1760;
        int iTm = inches * miles;
        int fTm = feets * miles;
        int yTm = yards * miles;
        System.out.println(miles+" miles are "+iTm+" inches, "+fTm+" feets, and "+yTm+" yards");
        return miles;
    }
}

