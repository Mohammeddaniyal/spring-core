package com.daniyal.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Vehicle vehicle1=context.getBean("car",Vehicle.class);
        Vehicle vehicle2=context.getBean("MyDearBus", Vehicle.class);
        Vehicle vehicle3=context.getBean("THAR", Vehicle.class);
        System.out.println(vehicle1.getMileage());
        System.out.println(vehicle1.getDiscountMessage());
        System.out.println(vehicle2.getMileage());
        System.out.println(vehicle2.getDiscountMessage());
        System.out.println(vehicle3.getMileage());
        System.out.println(vehicle3.getDiscountMessage());
    }
}