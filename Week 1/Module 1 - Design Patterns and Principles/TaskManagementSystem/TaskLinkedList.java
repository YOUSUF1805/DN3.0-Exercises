public class TaskLinkedList {
    private Task head;

    public TaskLinkedList() {
        this.head = null;
    }

    public void addTask(int taskId, String taskName, String status) {
        Task newTask = new Task(taskId, taskName, status);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    public Task searchTask(int taskId) {
        Task current = head;
        while (current != null) {
            if (current.taskId == taskId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public boolean deleteTask(int taskId) {
        Task current = head;
        Task previous = null;

        if (current != null && current.taskId == taskId) {
            head = current.next;
            return true;
        }

        while (current != null && current.taskId != taskId) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        previous.next = current.next;
        return true;
    }

    public void traverse() {
        Task current = head;
        while (current != null) {
            System.out.println("Task ID: " + current.taskId + ", Task Name: " + current.taskName + ", Status: " + current.status);
            current = current.next;
        }
    }
}
