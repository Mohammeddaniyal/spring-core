package com.daniyal.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Vehicle vehicle1=context.getBean("myVehicle", Vehicle.class);
        Vehicle vehicle2=context.getBean("myVehicle", Vehicle.class);
        System.out.println(vehicle1==vehicle2);
    }

}
