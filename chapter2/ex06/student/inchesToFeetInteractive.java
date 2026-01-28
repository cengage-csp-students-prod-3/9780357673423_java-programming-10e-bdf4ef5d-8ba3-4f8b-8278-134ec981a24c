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
    }
}

// tI = iI / f , +%tI
// f = 12i