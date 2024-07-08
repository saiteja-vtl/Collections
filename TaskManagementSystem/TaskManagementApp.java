package TaskManagementSystem;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskManagementApp {
    List<Task> taskList;

    public TaskManagementApp() {
        this.taskList = new LinkedList<>();
    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public void removeTask(String taskName){
        for(Task task:taskList){
            if (task.getTaskName().equals(taskName)){
                taskList.remove(task);
            }
        }
    }

    public void displayTasks(){
        for(Task task:taskList){
            System.out.println(task);
        }
    }

    public void moveTaskToTop(String taskName){
        for(Task task:taskList){
            if (task.getTaskName().equals(taskName)){
                taskList.add(0,task);
            }
        }
    }

    public static void main(String[] args) {
        TaskManagementApp taskManage= new TaskManagementApp();
        Scanner in=new Scanner(System.in);

        while (true) {
            System.out.println("Task Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Move Task to Top");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();
            in.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = in.nextLine();
                    System.out.print("Enter description: ");
                    String description = in.nextLine();
                    Task newTask = new Task(name, description);
                    taskManage.addTask(newTask);
                    break;

                case 2:
                    System.out.print("Enter task name to remove: ");
                    String removeName = in.nextLine();
                    taskManage.removeTask(removeName);
                    break;

                case 3:
                    taskManage.displayTasks();
                    break;

                case 4:
                    System.out.print("Enter task name to move to top: ");
                    String moveName = in.nextLine();
                    taskManage.moveTaskToTop(moveName);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    in.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


}

