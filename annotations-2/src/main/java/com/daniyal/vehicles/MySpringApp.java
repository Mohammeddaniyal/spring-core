package com.daniyal.vehicles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Car vehicle=context.getBean("carr",Car.class);
        System.out.println(vehicle.getMileage());
        System.out.println(vehicle.getDiscountMessage());
        System.out.println(vehicle.getMrp());
    }
}
