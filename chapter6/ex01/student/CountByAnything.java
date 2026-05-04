// Write your code here
import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        final int START = 5;
        final int STOP = 500;
        final int ITEMS_PER_LINE = 10;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to count by >> ");
        int step = input.nextInt();

        int count = 0;
        for (int i = START; i <= STOP; i += step) {
            System.out.print(i + " ");
            count++;
            
            // Start a new line after every 10 values
            if (count % ITEMS_PER_LINE == 0) {
                System.out.println();
            }
        }
    }
}
