// Write your code here
import java.util.Scanner;

public class PurchaseArray {
    public static void main(String[] args) {
        Purchase[] purchases = new Purchase[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < purchases.length; i++) {
            purchases[i] = new Purchase();
            int inv;
            double amount;

            // Validate Invoice Number (1000 - 8000)
            do {
                System.out.print("Enter invoice number >> ");
                inv = input.nextInt();
            } while (inv < 1000 || inv > 8000);
            
            // Validate Sale Amount (Non-negative)
            do {
                System.out.print("Enter sale amount >> ");
                amount = input.nextDouble();
            } while (amount < 0);

            purchases[i].setInvoiceNumber(inv);
            purchases[i].setSaleAmount(amount);
        }

        // Display Summary
        System.out.println("\nSummary of purchases:");
        for (Purchase p : purchases) {
            p.display();
        }
    }
}
