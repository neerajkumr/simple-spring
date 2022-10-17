package com.neeraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Car c=(Car) con.getBean("car");
        System.out.println(c);
        
    }
}
