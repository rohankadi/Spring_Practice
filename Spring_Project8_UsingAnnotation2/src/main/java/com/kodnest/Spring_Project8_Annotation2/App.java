package com.kodnest.Spring_Project8_Annotation2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Driver driver1 = (Driver)ctx.getBean("dr1");
        System.out.println(driver1);
        
        Driver driver2 = (Driver)ctx.getBean("dr2");
        System.out.println(driver2);
        
        Driver driver3 = (Driver)ctx.getBean("dr3");
        System.out.println(driver3);
        
        System.out.println("************************");
        
        Car car = (Car)ctx.getBean("car1");
        System.out.println(car);
    }
}
