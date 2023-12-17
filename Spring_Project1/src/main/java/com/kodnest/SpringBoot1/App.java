package com.kodnest.SpringBoot1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
      Student student = (Student)ctx.getBean("st");
      System.out.println(student);
     
    }
}
