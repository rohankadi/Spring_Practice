package com.kodnest.Spring_Project4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext cxc = new ClassPathXmlApplicationContext("config.xml");
		Trainer tr1 = (Trainer)cxc.getBean("trainer1");
		System.out.println(tr1);
		
		Trainer tr2 = (Trainer)cxc.getBean("trainer2");
		System.out.println(tr2);
		
		KodNestClasses kd = (KodNestClasses)cxc.getBean("kodnestclass1");
		System.out.println(kd);
	}
}
