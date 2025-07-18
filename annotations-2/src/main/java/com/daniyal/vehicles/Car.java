package com.daniyal.vehicles;

import org.springframework.beans.factory.annotation.Value;

public class Car implements Vehicle{
    private DiscountService discountService;
    @Value("${car.mrp}")
    private int mrp;
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

    public int getMrp() {
        return mrp;
    }
}
