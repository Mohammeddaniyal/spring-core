package com.daniyal.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Vehicle car1 = context.getBean("car", Vehicle.class);
        Vehicle bus1 = context.getBean("MyDearBus", Vehicle.class);
        Vehicle car2 = context.getBean("car", Vehicle.class);
        Vehicle bus2 = context.getBean("MyDearBus", Vehicle.class);
        System.out.println("Bean Scope Default Singleton for Car so both beans are of same address "+(car1==car2));
        System.out.println("Bean Scope Prototype for Bus so both beans are of same address "+(bus1==bus2));

    }
}