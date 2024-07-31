public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        
        taskList.addTask(1, "Task 1", "Incomplete");
        taskList.addTask(2, "Task 2", "Incomplete");
        taskList.addTask(3, "Task 3", "Complete");
        
        System.out.println("Initial Task List:");
        taskList.traverse();
        
        System.out.println("\nSearching for Task with ID 2:");
        Task task = taskList.searchTask(2);
        if (task != null) {
            System.out.println("Found Task - ID: " + task.taskId + ", Name: " + task.taskName + ", Status: " + task.status);
        } else {
            System.out.println("Task not found");
        }
        
        System.out.println("\nDeleting Task with ID 2:");
        if (taskList.deleteTask(2)) {
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found.");
        }
        
        System.out.println("\nTask List after Deletion:");
        taskList.traverse();
    }
}

