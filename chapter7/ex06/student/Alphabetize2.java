// Write your code here
import java.util.Scanner;
import java.util.Arrays;

public class Alphabetize2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string >> ");
        String str1 = input.nextLine();
        System.out.print("Enter second string >> ");
        String str2 = input.nextLine();
        System.out.print("Enter third string >> ");
        String str3 = input.nextLine();

        // Store strings in an array for easy sorting
        String[] words = {str1, str2, str3};

        // Sort using a case-insensitive comparator
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        // Display the sorted results
        System.out.println(words[0] + " " + words[1] + " " + words[2]);
    }
}
