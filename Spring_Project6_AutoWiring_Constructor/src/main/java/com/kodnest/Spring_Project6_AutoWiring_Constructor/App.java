package com.kodnest.Spring_Project6_AutoWiring_Constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
		Mobile mobile1 = (Mobile) cxt.getBean("mob");
		System.out.println(mobile1);

		Person p = (Person) cxt.getBean("person1");
		System.out.println(p);
    }
}
