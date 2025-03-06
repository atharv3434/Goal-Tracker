import java.util.Scanner;

public class Main8 {
    private static GoalManager goalManager = new GoalManager();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎯 Welcome to Goal Tracker 🎯");

        while (true) {
            System.out.println("\n1. Add Goal");
            System.out.println("2. View Active Goals");
            System.out.println("3. Update Goal Progress");
            System.out.println("4. Mark Goal as Completed");
            System.out.println("5. Delete Goal");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    goalManager.addGoal();
                    break;
                case 2:
                    goalManager.viewGoals();
                    break;
                case 3:
                    goalManager.updateGoal();
                    break;
                case 4:
                    goalManager.completeGoal();
                    break;
                case 5:
                    goalManager.deleteGoal();
                    break;
                case 6:
                    System.out.println("Exiting... Stay focused on your goals! 🚀");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
