package Q10;

public class MainEnrollApp {
    public static void main(String[] args) {
        // Create instances of Enrollment, Student, and Course
        Enrollment enrollmentSystem = new Enrollment();

        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        Course course1 = new Course("Mathematics", "MATH101");
        Course course2 = new Course("Physics", "PHYS101");

        // Enroll students in courses
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student1, course2);
        enrollmentSystem.enrollStudent(student2, course1);

        // Display enrollment details
        enrollmentSystem.displayEnrollmentDetails();

        // Drop a student from a course
        enrollmentSystem.dropStudent(student1, course1);

        // Display enrollment details again
        enrollmentSystem.displayEnrollmentDetails();
    }
}