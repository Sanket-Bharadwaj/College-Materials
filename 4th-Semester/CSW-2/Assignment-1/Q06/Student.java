package Q06;

public class Student {
    private int studentId;
    private String studentName;
    private College college; // Reference to a College object

    // Constructor
    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    // Method to display student and college information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled College: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
        System.out.println();
    }
}