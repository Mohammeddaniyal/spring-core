package com.daniyal.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// here in this case without annotation value
// the bean id for the class will be default to Car --> car
@Component
public class Car implements Vehicle{
private DiscountService discountService;
// constructor injection via @Autowired
    Car(@Autowired DiscountService discountService)
    {
        this.discountService=discountService;
    }
    @Override
    public String getMileage() {
        return "30kmpl";
    }

    public String getDiscountMessage() {
        return "Car : "+this.discountService.getDiscountMessage();
    }
}
