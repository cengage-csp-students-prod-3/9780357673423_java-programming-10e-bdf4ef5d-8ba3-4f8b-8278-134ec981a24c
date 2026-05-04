public class NineInts {
    public static void main(String[] args) {
        // Initialize an array named numbers with nine integers
        int[] numbers = {10, 15, 19, 23, 26, 29, 31, 34, 38};

        // Display the integers from first to last
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        // Print a new line for the next set
        System.out.println();

        // Display the integers from last to first
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println();
    }
}
