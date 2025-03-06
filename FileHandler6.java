import java.io.*;
import java.util.*;

public class FileHandler6 {
    private static final String FILE_PATH = "goals.txt";

    public static void saveGoals(List<Goal> goals) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(goals);
        } catch (IOException e) {
            System.out.println("❌ Error saving goals.");
        }
    }

    public static List<Goal> loadGoals() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Goal>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
