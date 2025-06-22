package Week1_DataStructuresAndAlgorithms.Extra.Ex_05_TaskManagementSystem.Code;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask(new Task(101, "Design Database", "Pending"));
        taskList.addTask(new Task(102, "Develop API", "In Progress"));
        taskList.addTask(new Task(103, "Write Docs", "Pending"));

        System.out.println("📋 All Tasks:");
        taskList.listTasks();

        System.out.println("\n🔍 Searching for Task ID 102:");
        Task t = taskList.searchTask(102);
        System.out.println(t != null ? t : "Task not found");

        System.out.println("\n❌ Deleting Task ID 102:");
        taskList.deleteTask(102);

        System.out.println("\n📋 Updated Task List:");
        taskList.listTasks();
    }
}

