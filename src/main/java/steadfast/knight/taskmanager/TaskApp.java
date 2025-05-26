package steadfast.knight.taskmanager;

import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("\n1. Add task\n2. List tasks\n3. Complete task\n4. Delete task\n5. Exit");
            input = scanner.nextLine();
            System.out.println();

            switch (input) {
                case "1":
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();
                    manager.addTask(desc);
                    break;
                case "2":
                    var tasks = manager.getTasks();
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ": " + tasks.get(i));
                    }
                    break;
                case "3":
                    System.out.print("Enter task number to complete: ");
                    int comp = Integer.parseInt(scanner.nextLine());
                    manager.markTaskCompleted(comp);
                    break;
                case "4":
                    System.out.print("Enter task number to delete: ");
                    int del = Integer.parseInt(scanner.nextLine());
                    manager.deleteTask(del);
                    break;
                case "5":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
