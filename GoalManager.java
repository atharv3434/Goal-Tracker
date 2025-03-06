import java.util.*;

public class GoalManager {
    private List<Goal> goals;
    private Scanner sc;

    public GoalManager() {
        this.goals = FileHandler6.loadGoals();
        this.sc = new Scanner(System.in);
    }

    public void addGoal() {
        System.out.print("Enter goal title: ");
        String title = sc.nextLine();
        System.out.print("Enter goal description: ");
        String description = sc.nextLine();

        goals.add(new Goal(title, description));
        FileHandler6.saveGoals(goals);
        System.out.println("✅ Goal Added Successfully!");
    }

    public void viewGoals() {
        if (goals.isEmpty()) {
            System.out.println("📄 No active goals found.");
            return;
        }

        System.out.println("\n📌 Active Goals:");
        for (int i = 0; i < goals.size(); i++) {
            System.out.println((i + 1) + ". " + goals.get(i));
        }
    }

    public void updateGoal() {
        viewGoals();
        System.out.print("Enter goal number to update progress: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < goals.size()) {
            System.out.print("Enter progress (0-100%): ");
            int progress = sc.nextInt();
            sc.nextLine();

            goals.get(index).updateProgress(progress);
            FileHandler6.saveGoals(goals);
            System.out.println("✅ Goal Progress Updated!");
        } else {
            System.out.println("❌ Invalid goal number.");
        }
    }

    public void completeGoal() {
        viewGoals();
        System.out.print("Enter goal number to mark as completed: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < goals.size()) {
            goals.get(index).markCompleted();
            FileHandler6.saveGoals(goals);
            System.out.println("🎉 Goal Marked as Completed!");
        } else {
            System.out.println("❌ Invalid goal number.");
        }
    }

    public void deleteGoal() {
        viewGoals();
        System.out.print("Enter goal number to delete: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < goals.size()) {
            goals.remove(index);
            FileHandler6.saveGoals(goals);
            System.out.println("✅ Goal Deleted Successfully!");
        } else {
            System.out.println("❌ Invalid goal number.");
        }
    }
}
