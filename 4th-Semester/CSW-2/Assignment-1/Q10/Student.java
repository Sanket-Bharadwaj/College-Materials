package Q10;

import java.util.ArrayList;

public class Student {
    private String name;
    private String studentId;
    private ArrayList<Course> enrolledCourses;

    // Constructor
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    // Method to add a course
    public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    // Method to remove a course
    public void removeCourse(Course course) {
        enrolledCourses.remove(course);
    }
}