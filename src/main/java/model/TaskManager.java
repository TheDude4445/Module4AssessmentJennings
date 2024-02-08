package model;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static List<Task> tasks = new ArrayList<>();

    // Add a task to the list
    public static void addTask(Task task) {
        tasks.add(task);
    }

    // Get the list of tasks
    public static List<Task> getAllTasks() {
        return tasks;
    }
}
