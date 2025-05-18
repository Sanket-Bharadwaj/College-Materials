package com.spring.MavenProjectQ3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Transport {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Vehicle car = (Vehicle) context.getBean("car");
		car.stop();
		car.start();
		
		Vehicle bike = (Vehicle) context.getBean("bike");
		bike.stop();
		bike.start();
		
	}
	

}
