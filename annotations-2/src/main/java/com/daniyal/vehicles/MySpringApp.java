package com.daniyal.vehicles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Vehicle vehicle=context.getBean("car",Vehicle.class);
        System.out.println(vehicle.getMileage());
    }
}
