package com.kodnest.Spring_Boot2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// giving control to spring to create an object
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("config.xml");
		//getting bean based on 'id' and making down-casting(Laptop) and storing in Laptop
		Laptop laptop1 = (Laptop) cpx.getBean("lap1");
		Laptop laptop2 = (Laptop) cpx.getBean("lap2");
		Laptop laptop3 = (Laptop) cpx.getBean("lap3");
		
		System.out.println(laptop1);
		System.out.println(laptop2);
		System.out.println(laptop3);
	}
}
