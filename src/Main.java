// End term
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        System.out.println("Enter the number of students to add:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student type (1 for Undergraduate, 2 for Graduate):");
            int studentType = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter student name:");
            String name = scanner.nextLine();

            System.out.println("Enter student age:");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (studentType == 1) {
                System.out.println("Enter student major:");
                String major = scanner.nextLine();
                manager.addStudent(new UndergraduateStudent(name, age, major));
            } else if (studentType == 2) {
                System.out.println("Enter student research topic:");
                String researchTopic = scanner.nextLine();
                manager.addStudent(new GraduateStudent(name, age, researchTopic));
            } else {
                System.out.println("Invalid student type. Skipping this student.");
            }
        }
        manager.displayAllStudentsInfo();
        scanner.close();
    }
}