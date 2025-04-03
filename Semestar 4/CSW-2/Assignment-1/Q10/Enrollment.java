package Q10;

import java.util.ArrayList;

public class Enrollment implements EnrollmentSystem {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    // Constructor
    public Enrollment() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    // Method to enroll a student in a course
    @Override
    public void enrollStudent(Student student, Course course) {
        student.addCourse(course);
        if (!students.contains(student)) {
            students.add(student);
        }
        System.out.println(student.getName() + " has been enrolled in " + course.getCourseName());
    }

    // Method to drop a student from a course
    @Override
    public void dropStudent(Student student, Course course) {
        student.removeCourse(course);
        System.out.println(student.getName() + " has dropped " + course.getCourseName());
    }

    // Method to display enrollment details
    @Override
    public void displayEnrollmentDetails() {
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + " (ID: " + student.getStudentId() + ")");
            System.out.println("Enrolled Courses:");
            for (Course course : student.getEnrolledCourses()) {
                System.out.println(" - " + course.getCourseName() + " (" + course.getCourseCode() + ")");
            }
            System.out.println();
        }
    }
}