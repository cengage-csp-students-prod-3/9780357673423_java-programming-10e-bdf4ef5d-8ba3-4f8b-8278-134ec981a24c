// Write your code here
public class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private double tax;

    // Set method for invoice number
    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    // Set method for sale amount; calculates 5% tax automatically
    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
        this.tax = saleAmount * 0.05;
    }

    // Method to display purchase details
    public void display() {
        System.out.println("Invoice #" + invoiceNumber + 
            "  Amount of sale: $" + saleAmount + "  Tax: $" + tax);
    }
}
