// Write your code here
public class Team {
    private String school;
    private String sport;
    private String mascot;
    public final static String MOTTO = "Sportsmanship!";

    // Default constructor
    public Team() {}

    // Overloaded constructor
    public Team(String school, String sport, String mascot) {
        this.school = school;
        this.sport = sport;
        this.mascot = mascot;
    }

    // Get methods
    public String getSchool() { return school; }
    public String getSport() { return sport; }
    public String getMascot() { return mascot; }
}
