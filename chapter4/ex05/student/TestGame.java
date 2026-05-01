// Write your code here
import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {
        // Part B: Testing Team creation
        Team t1 = setTeamData();
        Team t2 = setTeamData();
        
        // Part D: Testing Game instantiation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter game time >> ");
        String time = input.nextLine();

        Game myGame = new Game(t1, t2, time);
        displayGame(myGame);
    }

    public static Team setTeamData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter school name >> ");
        String school = input.nextLine();
        System.out.print("Enter sport >> ");
        String sport = input.nextLine();
        System.out.print("Enter mascot >> ");
        String mascot = input.nextLine();
        return new Team(school, sport, mascot);
    }

    public static void displayGame(Game g) {
        Team t1 = g.getTeam1();
        Team t2 = g.getTeam2();
        System.out.println("\nThe game between " + t1.getSchool() + " " + t1.getSport() + " " + t1.getMascot());
        System.out.println("and " + t2.getSchool() + " " + t2.getSport() + " " + t2.getMascot());
        System.out.println("takes place at " + g.getTime());
        System.out.println("Our motto is " + Team.MOTTO);
    }
}
