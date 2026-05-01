// Write your code here
public class CountSpaces {
    public static void main(String[] args) {
        // Your favorite inspirational quote
        String quote = "The only way to do great work is to love what you do.";
        int spaceCount = 0;

        // Loop through the string to count spaces
        for (int i = 0; i < quote.length(); i++) {
            if (quote.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Quote: " + quote);
        System.out.println("The number of spaces is " + spaceCount);
    }
}
