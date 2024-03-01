import java.util.ArrayList;
import java.util.List;
class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudentsInfo() {
        System.out.println("All Students Information:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
    }
}