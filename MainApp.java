import java.util.*;
public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static StudentDAO dao = new StudentDAO();
    
    public static void main(String[] args) {
        System.out.println("=== STUDENT MANAGEMENT SYSTEM ===");
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: System.exit(0);
                default: System.out.println("Invalid!");
            }
        }
    }
    
    static void addStudent() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Course: ");
        String course = sc.nextLine();
        System.out.print("Semester: ");
        int sem = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        
        Student s = new Student(name, email, phone, course, sem, address);
        if (dao.addStudent(s)) {
            System.out.println("Student added!");
        } else {
            System.out.println("Error!");
        }
    }
    
    static void viewStudents() {
        List<Student> list = dao.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("No students!");
            return;
        }
        System.out.println("ID\tName\tEmail\tPhone\tCourse\tSem\tAddress");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}