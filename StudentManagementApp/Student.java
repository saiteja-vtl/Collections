package StudentManagementApp;

public class Student {

    String studentId;
    String studentName;

    public Student(String studentName,String studentId) {
        this.studentId = studentId;
        this.studentName=studentName;
    }

    public String getStudentId(String studentId) {
        return studentId;
    }


    public String getStudentName() {
        return studentName;
    }


    @Override
    public String toString(){
        return "Name: "+studentName+", "+"Id: "+studentId;
    }



}
