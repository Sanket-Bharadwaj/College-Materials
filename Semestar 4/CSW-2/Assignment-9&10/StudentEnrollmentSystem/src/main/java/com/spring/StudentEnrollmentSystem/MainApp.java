package com.spring.StudentEnrollmentSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Branch cseBranch = (Branch) context.getBean("cseBranch");
        Branch csitBranch = (Branch) context.getBean("csitBranch");

        cseBranch.enroll();
        csitBranch.enroll();
    }
}
