package com.spring.StudentEnrollmentSystem;


public class CSIT implements Branch {
    private String name;
    private int rollNumber;

    public CSIT(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public void enroll() {
        System.out.println("Enrolled in CSIT: " + name + " (Roll No: " + rollNumber + ")");
    }
}
