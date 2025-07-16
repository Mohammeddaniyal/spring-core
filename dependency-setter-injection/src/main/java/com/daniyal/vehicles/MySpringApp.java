package com.daniyal.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Car car= (Car) context.getBean("myVehicle", Car.class);
        System.out.println(car.getMileage());
        System.out.println(car.getDiscountMessage());
        System.out.println(car.getBrandName());
    }

}
