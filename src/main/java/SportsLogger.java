import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SportsLogger {

    // Inner class to represent a sport activity
    static class Activity {
        String sportName;
        int duration; // in minutes
        String day;

        Activity(String sportName, int duration, String day) {
            this.sportName = sportName;
            this.duration = duration;
            this.day = day;
        }

        @Override
        public String toString() {
            return "Sport: " + sportName + ", Duration: " + duration + " mins, Day: " + day;
        }
    }

    public List<Activity> activities;

    public SportsLogger() {
        activities = new ArrayList<>();
    }

    // Method to log a new sport activity
    public void logActivity(String sportName, int duration, String day) {
        Activity newActivity = new Activity(sportName, duration, day);
        activities.add(newActivity);
        System.out.println("Activity logged: " + newActivity);
    }

    // Method to view all logged activities
    public void viewActivities() {
        if (activities.isEmpty()) {
            System.out.println("No activities logged yet.");
        } else {
            System.out.println("Logged activities:");
            for (Activity activity : activities) {
                System.out.println(activity);
            }
        }
    }

    // Method to calculate total time spent on sports for the week
    public int calculateTotalTime() {
        int totalTime = 0;
        for (Activity activity : activities) {
            totalTime += activity.duration;
        }
        return totalTime;
    }

    // Main menu to interact with the application
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Sports Activity Logger ---");
            System.out.println("1. Log a new activity");
            System.out.println("2. View all activities");
            System.out.println("3. Calculate total time spent on sports this week");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter sport name: ");
                    String sportName = scanner.nextLine();
                    System.out.print("Enter duration in minutes: ");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter day of the week (e.g., Monday): ");
                    String day = scanner.nextLine();
                    logActivity(sportName, duration, day);
                    break;
                case 2:
                    viewActivities();
                    break;
                case 3:
                    int totalTime = calculateTotalTime();
                    System.out.println("Total time spent on sports this week: " + totalTime + " minutes");
                    break;
                case 4:
                    System.out.println("Exiting application...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        SportsLogger logger = new SportsLogger();
        logger.menu();
    }
}
