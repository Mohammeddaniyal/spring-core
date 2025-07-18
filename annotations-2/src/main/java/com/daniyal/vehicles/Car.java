package com.daniyal.vehicles;

import org.springframework.stereotype.Component;


public class Car implements Vehicle{
    private DiscountService discountService;

    public Car(DiscountService discountService) {
        this.discountService = discountService;
    }

    @Override
    public String getMileage() {
        return "30kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return "Car : "+this.discountService.getDiscountMessage();
    }
}
