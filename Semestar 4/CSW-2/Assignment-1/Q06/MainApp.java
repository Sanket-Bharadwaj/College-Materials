package Q06;

public class MainApp {
    public static void main(String[] args) {
        // Create College objects
        College college1 = new College("ABC University", "New York");
        College college2 = new College("XYZ College", "Los Angeles");

        // Create Student objects and enroll them in colleges
        Student student1 = new Student(101, "Alice", college1);
        Student student2 = new Student(102, "Bob", college2);

        // Display student information
        System.out.println("Student Information:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}