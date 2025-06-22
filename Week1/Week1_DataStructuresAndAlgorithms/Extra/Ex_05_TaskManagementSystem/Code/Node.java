package Week1_DataStructuresAndAlgorithms.Extra.Ex_05_TaskManagementSystem.Code;

public class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

