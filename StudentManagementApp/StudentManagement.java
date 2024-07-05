package StudentManagementApp;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    List<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student details) {
        studentList.add(details);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentManagement list = new StudentManagement();
        while (true) {
            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Display");
            System.out.println("4.Exit");


            String choice = in.nextLine();

            switch (choice) {

                case "1" :
                    System.out.println("Enter name");
                    String name = in.nextLine();
                    System.out.println("Enter Id");
                    String id = in.nextLine();

                    Student details = new Student(name, id);
                    list.addStudent(details);
                    break;

                case "2":
                    System.out.println("Enter Id");
                    String Id=in.nextLine();
                    for(Student var: list.studentList){
                        if((var.studentId).equals(Id)){
                            System.out.println(var.studentName);
                        }
                    }
                    break;

                case "3":
                    System.out.println(list.studentList);
                    break;

                case "4":
                    System.exit(0);

                default:
                    System.out.println("Kindly Enter Valid Details");

            }

        }

    }
}
