// Write your code here
public class CountByFives {
    public static void main(String[] args) {
        final int START = 5;
        final int STOP = 500;
        final int NEW_LINE_MULTIPLE = 50;

        for (int i = START; i <= STOP; i += 5) {
            System.out.print(i + " ");
            if (i % NEW_LINE_MULTIPLE == 0) {
                System.out.println();
            }
        }
    }
}
