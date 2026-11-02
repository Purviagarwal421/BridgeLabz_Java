package LinkedList.Circular;

import java.util.Scanner;
/*
Problem Statement: Create a task scheduler using a circular linked list. Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date. Implement the following functionalities:
Add a task at the beginning, end, or at a specific position in the circular list.
Remove a task by Task ID.
View the current task and move to the next task in the circular list.
Display all tasks in the list starting from the head node.
Search for a task by Priority.

 */


class Task{
    protected int taskId;
    protected String task;
    protected String name;
    protected int dueDate;
    protected int  priority;

    public Task(int taskId, String task, String name, int dueDate, int priority) {
        this.taskId = taskId;
        this.task = task;
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
    }
    public void showDetails(){
        System.out.println("Task ID: " + taskId);
        System.out.println("Task: " + task);
        System.out.println("Name: " + name);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Priority: " + priority);
        System.out.println("--------------------");
    }
}
class Node{
    Task task;
    Node next;
    Node prev;
    Node(int taskId, String task, String name, int dueDate, int  priority){
        this.task=new Task(taskId,task, name,dueDate,priority);
        this.next=null;
        this.prev=null;
    }
}
public class TaskScheduler {
    private Node head=null;
    private Node tail=null;
    private Node currentTask=null;

    public void insertAtBegin(int taskId, String task, String name, int dueDate, int  priority){
        Node node=new Node(taskId,task, name,dueDate,priority);
        if( head==null){
            head=node;
            tail=node;
            currentTask=node;
            return;
        }
        node.next=head;
        node.prev=tail;
        head.prev=node;
        tail.next=head;
        head=node;

    }
    public void insertAtEnd(int taskId, String task, String name, int dueDate, int priority){
        Node node=new Node(taskId,task, name,dueDate,priority);
        if(head==null){
            head=node;
            tail=node;
            currentTask=node;
            return;
        }
        node.prev=tail;
        node.next=head;

        tail.next=node;
        head.prev=node;

        tail=node;
    }
    public  void insertAtPosition(int taskId, String task, String name, int dueDate,int  priority,int position){
        if(position<0){
            System.out.println("Invalid position");
            return;
        }
        Node node=new Node(taskId,task, name,dueDate,priority);
        if(position == 0){
            insertAtBegin(taskId,task, name,dueDate,priority);
            return;
        }
        if (head == null) {
            System.out.println("Invalid position");
            return ;
        }
        Node currentNode=head;
        int index=0;
        while (index < position - 1 && currentNode.next != head) {
            currentNode = currentNode.next;
            index++;
        }
        if(index!=position-1){
            System.out.println("Invalid index");
            return;
        }
        if(currentNode==tail){
            insertAtEnd(taskId,task, name,dueDate,priority);
            return;
        }
        node.next=currentNode.next;
        currentNode.next.prev=node;
        currentNode.next=node;
        node.prev=currentNode;
    }
    public void removeByTaskId(int taskId){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        // cas1 : at beginning
        if(head==tail && (head.task.taskId==taskId)){
            head=null;
            tail=null;
            currentTask=null;
            return;
        }
        if(head.task.taskId==taskId){
            if (currentTask == head) {
                currentTask = head.next;
            }
            tail.next=head.next;
            head.next.prev=tail;
            head=head.next;
            return;
        }
        // case 2: at end
        if(tail.task.taskId==taskId){
            if (currentTask == tail) {
                currentTask = tail.prev;
            }
            Node prevNode=tail.prev;
            prevNode.next=head;
            head.prev=prevNode;
            tail=prevNode;
            return;
        }
        //case 3: in between
        Node currentNode=head.next;
        while(currentNode!=head){
            if(currentNode.task.taskId==taskId){
                if (currentTask == currentNode) {
                    currentTask = currentNode.next;
                }
                currentNode.prev.next=currentNode.next;
                currentNode.next.prev=currentNode.prev;
                return;
            }
            currentNode=currentNode.next;
        }
        System.out.println("Task ID not found");

    }
    public void viewCurrentTask() {
        if (currentTask == null) {
            System.out.println("No tasks available");
            return;
        }

        currentTask.task.showDetails();
    }
    public void moveToNextTask() {
        if (currentTask == null) {
            System.out.println("No tasks available");
            return;
        }
        currentTask = currentTask.next;
        currentTask.task.showDetails();
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node currentNode = head;

        do {
            currentNode.task.showDetails();
            currentNode = currentNode.next;
        } while (currentNode != head);
    }
    public void searchByPriority(int priority){
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }
        Node currentNode = head;
        boolean found = false;
        do {
            if (currentNode.task.priority == priority) {
                currentNode.task.showDetails();
                found = true;
                break;
            }
            currentNode = currentNode.next;
        } while (currentNode != head);
        if (!found) {
            System.out.println("No task found with priority: " + priority);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        int choice;

        do {
            System.out.println("\n===== TASK SCHEDULER =====");
            System.out.println("1. Insert Task at Beginning");
            System.out.println("2. Insert Task at End");
            System.out.println("3. Insert Task at Specific Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task");
            System.out.println("6. Move to Next Task");
            System.out.println("7. Display All Tasks");
            System.out.println("8. Search Task by Priority");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Task ID: ");
                    int taskId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Description: ");
                    String task = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Due Date (YYYYMMDD): ");
                    int dueDate = sc.nextInt();

                    System.out.print("Enter Priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();

                    if (choice == 1) {
                        scheduler.insertAtBegin(
                                taskId, task, name, dueDate, priority);
                    } else if (choice == 2) {
                        scheduler.insertAtEnd(
                                taskId, task, name, dueDate, priority);
                    } else {
                        System.out.print("Enter Position (0-based): ");
                        int position = sc.nextInt();
                        sc.nextLine();

                        scheduler.insertAtPosition(
                                taskId, task, name, dueDate, priority, position);
                    }
                    break;

                case 4:
                    System.out.print("Enter Task ID to remove: ");
                    int removeId = sc.nextInt();
                    sc.nextLine();

                    scheduler.removeByTaskId(removeId);
                    break;

                case 5:
                    scheduler.viewCurrentTask();
                    break;

                case 6:
                    scheduler.moveToNextTask();
                    break;

                case 7:
                    scheduler.displayTasks();
                    break;

                case 8:
                    System.out.print("Enter Priority to search: ");
                    int searchPriority = sc.nextInt();
                    sc.nextLine();

                    scheduler.searchByPriority(searchPriority);
                    break;

                case 0:
                    System.out.println("Exiting Task Scheduler...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

}







