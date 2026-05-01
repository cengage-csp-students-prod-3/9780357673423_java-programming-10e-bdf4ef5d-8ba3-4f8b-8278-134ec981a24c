import java.util.Scanner;
import java.time.LocalDate;

public class TestFitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter activity >> ");
        String activity = input.nextLine();
        
        System.out.print("Enter minutes spent " + activity + " >> ");
        int minutes = input.nextInt();
        
        System.out.print("Enter month >> ");
        int month = input.nextInt();
        
        System.out.print("Enter day >> ");
        int day = input.nextInt();
        
        System.out.print("Enter year >> ");
        int year = input.nextInt();

        // Create objects
        LocalDate userDate = LocalDate.of(year, month, day);
        FitnessTracker userTracker = new FitnessTracker(activity, minutes, userDate);
        FitnessTracker defaultTracker = new FitnessTracker();

        // Display results
        System.out.println("\nActivity log:");
        display(userTracker);
        display(defaultTracker);
    }

    public static void display(FitnessTracker tracker) {
        System.out.println(tracker.getActivity() + " " + tracker.getMinutes() + 
                           " minutes on " + tracker.getDate());
    }
}
