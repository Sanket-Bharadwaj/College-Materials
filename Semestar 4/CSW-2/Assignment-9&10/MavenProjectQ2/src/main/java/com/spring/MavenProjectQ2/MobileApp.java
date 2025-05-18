package com.spring.MavenProjectQ2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SIM AirSim = (SIM) context.getBean("air");
		SIM VodaSim = (SIM) context.getBean("voda");
		AirSim.calling();
		AirSim.data();
		VodaSim.calling();
		VodaSim.data();	
	}

}
