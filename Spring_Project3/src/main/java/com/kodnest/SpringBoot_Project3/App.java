package com.kodnest.SpringBoot_Project3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxc = new ClassPathXmlApplicationContext("config.xml");
		Employee e = (Employee) cxc.getBean("emp");
		System.out.println(e);
	}
}
