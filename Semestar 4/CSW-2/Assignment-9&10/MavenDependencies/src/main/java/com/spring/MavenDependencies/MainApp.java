package com.spring.MavenDependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	

	    public static void main(String[] args) {

	        @SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	        Student student = (Student) context.getBean("student");

	        student.display();
	    }
	}
