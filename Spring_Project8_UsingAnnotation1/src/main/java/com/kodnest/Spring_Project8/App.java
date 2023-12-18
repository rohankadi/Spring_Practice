package com.kodnest.Spring_Project8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Driver driver1 = (Driver) ctx.getBean("dr1");
		System.out.println(driver1);

		Car car = (Car) ctx.getBean("car1");
		System.out.println(car);
	}
}
