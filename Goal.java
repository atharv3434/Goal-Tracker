public class Goal {
    private String title;
    private String description;
    private int progress; // Progress in percentage
    private boolean isCompleted;

    public Goal(String title, String description) {
        this.title = title;
        this.description = description;
        this.progress = 0;
        this.isCompleted = false;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getProgress() { return progress; }
    public boolean isCompleted() { return isCompleted; }

    public void updateProgress(int progress) {
        this.progress = progress;
        if (this.progress >= 100) {
            this.isCompleted = true;
        }
    }

    public void markCompleted() {
        this.isCompleted = true;
        this.progress = 100;
    }

    @Override
    public String toString() {
        return "🎯 Goal: " + title + " | 📌 Progress: " + progress + "% | " + (isCompleted ? "✅ Completed" : "⏳ In Progress");
    }
}
