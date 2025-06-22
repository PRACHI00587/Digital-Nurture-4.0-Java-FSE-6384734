package Week1_DataStructuresAndAlgorithms.Extra.Ex_05_TaskManagementSystem.Code;

public class TaskList {
    Node head;

    // Add task at the end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // Search task by ID
    public Task searchTask(int id) {
        Node curr = head;
        while (curr != null) {
            if (curr.task.taskId == id) return curr.task;
            curr = curr.next;
        }
        return null;
    }

    // Delete task by ID
    public void deleteTask(int id) {
        if (head == null) return;

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("✅ Task deleted.");
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            if (curr.next.task.taskId == id) {
                curr.next = curr.next.next;
                System.out.println("✅ Task deleted.");
                return;
            }
            curr = curr.next;
        }

        System.out.println("❌ Task not found.");
    }

    // Traverse and list all tasks
    public void listTasks() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.task);
            curr = curr.next;
        }
    }
}

