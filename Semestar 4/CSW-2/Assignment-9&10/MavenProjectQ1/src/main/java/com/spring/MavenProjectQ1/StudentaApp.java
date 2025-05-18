package com.spring.MavenProjectQ1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentaApp {
	public static void main(String args[]) {
		ApplicationContext studentContext = new ClassPathXmlApplicationContext("beans.xml");
		Student st = (Student) studentContext.getBean("student1");
		st.display();
	}

}
