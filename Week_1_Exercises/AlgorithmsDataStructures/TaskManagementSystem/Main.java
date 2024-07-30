public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task task1 = new Task("1", "Task 1", "Pending");
        Task task2 = new Task("2", "Task 2", "Completed");

        taskManager.addTask(task1);
        taskManager.addTask(task2);

        System.out.println("Tasks:");
        taskManager.traverseTasks();

        System.out.println("Searching for Task 1:");
        Task foundTask = taskManager.searchTask("1");
        if (foundTask != null) {
            System.out.println(foundTask);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("Deleting Task 1:");
        taskManager.deleteTask("1");
        taskManager.traverseTasks();
    }
}
