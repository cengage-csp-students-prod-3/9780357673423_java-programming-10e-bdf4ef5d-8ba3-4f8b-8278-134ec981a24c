import java.util.Scanner;

public class MileConversions {
    public static void main(String[] args) {
        final int inches = 63360;
        final int feets = 5280;
        final int yards = 1760;
        System.out.print("Enter miles >>");
        Scanner getMiles = new Scanner(System.in);
        int miles = getMiles.nextInt();
        int iTm = inches * miles;
        int fTm = feets * miles;
        int yTm = yards * miles;
        System.out.println(miles+" miles are "+iTm+" inches, "+fTm+" feets and "+yTm+" yards");
    }
}
