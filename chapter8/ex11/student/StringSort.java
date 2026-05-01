// Write your program here
import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[15];
        int count = 0;
        String entry;

        // Collect up to 15 strings or until "zzz" is entered
        while (count < 15) {
            System.out.print("Enter a word or zzz to quit >> ");
            entry = input.nextLine();
            
            if (entry.equalsIgnoreCase("zzz")) {
                break;
            }
            
            words[count] = entry;
            count++;
        }

        // Create a new array containing only the entered values for sorting
        String[] enteredWords = new String[count];
        System.arraycopy(words, 0, enteredWords, 0, count);

        // Sort the strings in ascending order
        Arrays.sort(enteredWords);

        // Display the results
        System.out.println("Strings in order:");
        for (String word : enteredWords) {
            System.out.print(word + " ");
        }
    }
}
