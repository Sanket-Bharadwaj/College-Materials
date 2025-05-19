package com.spring.StudentEnrollmentSystem;


public class CSE implements Branch {
    private String name;
    private int rollNumber;

    public CSE(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public void enroll() {
        System.out.println("Enrolled in CSE: " + name + " (Roll No: " + rollNumber + ")");
    }
}
